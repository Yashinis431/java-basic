import java.util.*;
class dsa_linked_list{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> friends=new LinkedList<String>();
        friends.add("Jp");
        friends.add("Abiya");
        friends.add("Yashini");
        System.out.println(friends);
        System.out.println(friends.getFirst());
        System.out.println(friends.getLast());
        friends.addFirst("yash");
        friends.addLast("vijay");
        System.out.println(friends);
        System.out.println(friends.removeFirst());
        System.out.println(friends);
        System.out.println(friends.removeLast());
        System.out.println(friends);
    }
}