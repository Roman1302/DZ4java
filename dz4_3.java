// Написать метод, который принимает массив элементов, 
// помещает их в стэк и выводит на консоль содержимое стэка

import java.util.Stack;

public class dz4_3 {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();

        stackOfCards.push("Рома");
        stackOfCards.push("Маша");
        stackOfCards.push("Миша");
        stackOfCards.push("Саша");

        System.out.println("Stack => " + stackOfCards);
        System.out.println();

    }
}
