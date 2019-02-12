package com.iboruk.qalight;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList {
    Logger logger = Logger.getLogger("WorkWithList");

    //public static void myList ()

//    {
//        List<String> ourList = new ArrayList();
//        ourList.add("test");
//        System.out.println(ourList);
//        ourList.add("test1");
//        System.out.println(ourList);
//        System.out.println(ourList.get(1));
//        System.out.println("Size = " + ourList.size());
//        for (String element : ourList) {
//            System.out.println(element);
//        }
//        List<List<String>> ourListList = new ArrayList<>();
//        System.out.println(ourListList);
//
//        ourListList.add(new ArrayList<>());
//        System.out.println(ourListList);
//        ourListList.add(new ArrayList<>());
//        System.out.println(ourListList);
//        ourListList.get(1).add("test");
//        System.out.println(ourListList);
//        ourListList.get(1).add("test1");
//        System.out.println(ourListList);
//        ourListList.get(1).remove(0);
//        System.out.println(ourListList);
//        List<String> lineList = new ArrayList<>();
//        lineList.add("element1");
//        lineList.add("element2");
//
//        ourListList.add(new ArrayList<>());
//        ourListList.get(2).addAll(lineList);
//
//        вместо верхних 2 - х строк можно вставить сразу в конец, а не создавать лист и в него вставлять
//
//        закоментировал просто чтоб не выводило много в консоль
//
//        ourListList.add(lineList); // add НЕ ДОБАВЛЯЕТ ЗНАЧЕНИЯ, А ССЫЛКУ НА lineList
//        System.out.println(ourListList);
//        ourListList.get(1).addAll(0, lineList); // в лист №1 добавили сразу весь lineList на позицию 0, но addAll ДОБАВИЛИ ЗНАЧЕНИЯ
//        System.out.println(ourListList);
//        //ourListList.add(new ArrayList<>());
//        lineList.add("element3");
//        ourListList.add(lineList);
//
//        for (List<String> line : ourListList
//                ) {
//            System.out.println(line);
//        }
//        System.out.println(ourListList.get(1));
//
//
//        Map<String, Integer> ourMap = new HashMap<>();
//        ourMap.put("login", 23);
//        System.out.println(ourMap);
//        ourMap.put("pass", 555);
//        System.out.println(ourMap);
//        //сортировка по хэшключам в HashMap
//    }


    public void addNewList(List<List<String>> tempList) {
        tempList.add(new ArrayList<>());
        printListList(tempList);
    }


    public List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> tempList) {
        try {
            tempList.get(numberOfList).add(value);
            printListList(tempList);
        } catch (IndexOutOfBoundsException e) {
            logger.error("There is no element with N" + numberOfList
                    + System.lineSeparator()
                    + "Please enter value up till " + (tempList.size() - 1));
        }
        return tempList;
    }

    private void printListList(List<List<String>> tempList) {
        System.out.println("--------");
        for (List<String> line : tempList) {
            System.out.println(line);
        }
    }
}
