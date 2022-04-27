import java.io.*;

/**
 * Использование объекта класса File для вывода названий всех файлов, находящихся в текущем каталоге и его подкаталогах
 * Объект File может указывать на каталог (узнать это можно путем вызова метода isDirectory)
 * Метод list возвращает список имен (массив String), содержащихся в нем файлов (Если File не указывает на каталог -
 * будет возвращен null)
 */
public class FileDemo {

    public static void findFiles(File file, FileFilter filter, PrintStream output) throws IOException{
        if (file.isDirectory()){
            File[] list = file.listFiles();
            for (int i = list.length; --i>=0;) {
                findFiles(list[i], filter, output);
            }
            }else{
                if (filter.accept(file))
                    output.println("\t" + file.getCanonicalPath());
            }
    }

    public static void main(String[] args){
        class NameFilter implements FileFilter{
            private String mask;
            NameFilter(String mask){
                this.mask = mask;
            }
            public boolean accept(File file){
                return (file.getName().indexOf(mask)!=-1)?true:false;
            }
        }
        File pathFile = new File(".");
        //String filterString = ".java";
        String filterString = ".tif";
        try{
            FileFilter filter = new NameFilter(filterString);
            findFiles(pathFile, filter, System.out);

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("work finished");
    }

}
