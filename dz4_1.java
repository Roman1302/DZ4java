// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Scanner;

public class dz4_1 {
    public static void main(String[] args) {
        LinkedList<String> linkedli = new LinkedList<String>();

        System.out.print("Введите первое значение: ");
        Scanner a1 = new Scanner(System.in);
        String a = a1.next();
        linkedli.add(a);

        System.out.print("Введите второе значение: ");
        Scanner b1 = new Scanner(System.in);
        String b = b1.next();
        linkedli.add(b);

        System.out.print("Введите третье значение: ");
        Scanner c1 = new Scanner(System.in);
        String c = c1.next();
        linkedli.add(c);
        System.out.print("Начальный список: " + linkedli + "\n");
        linkedli = reverseLinkedList(linkedli);
        System.out.print("Конечный список: " + linkedli + '\n');
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            revLinkedList.add(llist.get(i));
        }

        return revLinkedList;
    }
}