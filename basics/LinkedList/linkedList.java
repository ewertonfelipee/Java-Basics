package basics.LinkedList;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Red");
        list.add("Cat");
        list.add("Table");
        list.add("HeadPhone");

        for(String s: list){
            System.out.println(s);
        }
    }
}
