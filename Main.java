package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    private static MobilePhone mobilePhone =new MobilePhone("0711134022");


    public static void main(String[] args) {
	// write your code here

        boolean quit =false;
        startPhone();
        printActions();
        while (!quit){

            System.out.println("\n Enter Action :()");
            int action =scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\n Shutting down");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;



            }
        }
    }

  private static void addNewContact(){
      System.out.println("Enter New Name :");
      String name =scanner.nextLine();
      System.out.println("Enter Phone Number :");
      String phone =scanner.nextLine();
      Contact newContact =Contact.createContact(name,phone);

      if(mobilePhone.addNewContact(newContact)){
          System.out.println("New contact added  :"+name +"  phone :" +phone);
      }else {
          System.out.println("Cannot add the details");
      }
  }

    private static void startPhone(){
        System.out.println("Phone is starting ..");
    }



    private static void printActions(){
        System.out.println("\n Available Actions :\npress");
        System.out.println("0 -shutdown\n"+
                "1 -print contacts\n"+
                "2 -add new contact\n"+
                "3 -update exisiting contact\n"+
                "4 -remove exisiting contact\n"+
                "5 -query exisiting conatct\n"+
                "6 -list of availabel actions");

        System.out.println("Choose your action :");

    }

}
