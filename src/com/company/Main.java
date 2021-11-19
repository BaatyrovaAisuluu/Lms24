package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //        0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана
//        LinkedListти толтурунуз.
//                Overload методдорду тузунуз, алар сортировка болгон
//        элементтерди кайтарсын. Башында 0дор жана аягында 1лер.


        Random random=new Random();
        int[] massif=new int[10];
        for (int i = 0; i <massif.length; i++) {
            int rn= random.nextInt(2);
            massif[i]=rn;
            System.out.println(" биринчи "+massif[i]);

        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <10; i++) {
            int rn= random.nextInt(2);
            arrayList.add(rn);
            System.out.println(" экинчи "+arrayList.get(i));
        }
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int rn= random.nextInt(2);
            linkedList.add(rn);
            System.out.println(" учунчу "+linkedList.get(i));
        }





        method(massif);
        method(arrayList);
        method(linkedList);
    }

    public static void method(int[] massif){
        Arrays.sort(massif);
        System.out.println(Arrays.toString(massif));
    }
    public static void method(ArrayList<Integer>arrayList){
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    public static void method(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}

    
