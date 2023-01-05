package com.company;

import java.util.*;
import java.util.Iterator;


class Arr {


    public static void main(String[] args)
    {

        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(2);
        list1.add(4);
        list1.add(6);


        List<Integer> list2 = new ArrayList<Integer>();


        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(7);


        System.out.print("List1 contents: ");


        Iterator iterator = list1.iterator();

        while (iterator.hasNext()) {


            System.out.print(iterator.next() + " ");
        }


        System.out.println();


        System.out.print("List2 contents: ");
        iterator = list2.iterator();


        while (iterator.hasNext()) {


            System.out.print(iterator.next() + " ");
        }

        int i = 0;
        int j = 0;


        List<Integer> merged_list
                = new ArrayList<Integer>();


        while (i < list1.size() && j < list2.size()) {

            merged_list.add(list2.get(j));


            merged_list.add(list1.get(i));


            i++;
            j++;
        }


        while (i < list1.size()) {


            merged_list.add(list1.get(i));
            i++;
        }


        while (j < list2.size()) {


            merged_list.add(list2.get(j));
            j++;
        }


        System.out.println();


        System.out.print("Merged List contents: ");


        iterator = merged_list.iterator();


        while (iterator.hasNext()) {


            System.out.print(iterator.next() + " ");
        }
    }
}
