package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Pearth");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Darwin");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        visit(placesToVisit);
    }

        private static void printList(LinkedList<String> linkedList){

            Iterator<String> i =linkedList.iterator();
            while (i.hasNext()){
                System.out.println("Now visiting :"+i.next());
                System.out.println("=================");

            }

        }

        private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
            ListIterator<String> stringListIterator =linkedList.listIterator();
            while (stringListIterator.hasNext()){
                int comparison =stringListIterator.next().compareTo(newCity);
                if(comparison==0){
                    System.out.println(newCity +" is already included .");
                    return false;
                }else if(comparison>0){
                    stringListIterator.previous();
                    stringListIterator.add(newCity);
                    return true;
                }else if(comparison<0){

                }
            }
            stringListIterator.add(newCity);
            return true;
        }

        private static void visit(LinkedList cities){
            Scanner scanner =new Scanner(System.in);
            boolean quit =false;
            boolean goingForward =true;
            ListIterator<String> listIterator =cities.listIterator();

            if(cities.isEmpty()){
                System.out.println("No cities in itenery");
return;
            }else {
                System.out.println("Now visiting "+listIterator.next());
                printMenu();
            }

            while (!quit){
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action){
                    case 0:
                        System.out.println("Holiday vacation over");
                        quit =true;
                        break;

                    case 1:
                        if(!goingForward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            goingForward=true;
                            System.out.println("Now visting :"+listIterator.next());
                        }else {
                            System.out.println("raeched the end of the list");
                            goingForward =false;
                        };
                        break;

                    case 2:
                        if(goingForward){
                            if(listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            goingForward=false;
                        }
                        if(listIterator.hasPrevious()){
                            System.out.println("Now visiting  "+listIterator.previous());
                        }else {
                            System.out.println("We are at the start of the list");
                            goingForward=true;
                        }
                        break;

                    case 3:
                        printMenu();
                        break;

                }
            }
        }
 private static void printMenu(){
     System.out.println("Availble actions :\npress");
     System.out.println("0 -quit\n"+
             "1 -next city\n"+
             "2 -previous city\n"+
             "3 -print menu");
 }

}
