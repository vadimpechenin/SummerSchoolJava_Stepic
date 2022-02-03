/*
Два друга
Необходимо спроектировать класс Friend с полями:

String myName

Friend myFriend

И методом:

letsBeFriends с одним параметром - передаваемым другом, который присваивает полю  myFriend ссылку на переданного друга.
*/

public class Friend {
    public String myName;
    public Friend myFriend;

    public void letsBeFriends(Friend friend){
        this.myFriend = friend;
    }
}
