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

    private static void updateContact(){
        System.out.println("Enter exisiting conatct ..");
        String name =scanner.nextLine();
       Contact exisitingContactRecord= mobilePhone.queryContact(name);
       if(exisitingContactRecord==null){
           System.out.println("Contact not Found");
           return;
       }
        System.out.println("Enter new conatct Name :");
       String newName =scanner.nextLine();
        System.out.println("Enter New contact number :");
        String newNumber =scanner.nextLine();
        Contact newContact =Contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(exisitingContactRecord,newContact)){
            System.out.println("Sucessfully updated record");
        }else {
            System.out.println("Error in update");
        }

    }


private static void removeContact(){
    System.out.println("Enter exisiting name:");
    String name =scanner.nextLine();
    Contact exisitingContactRecord =mobilePhone.queryContact(name);
    if(exisitingContactRecord==null){
        System.out.println("Conatct not found");
        return;
    }

   if( mobilePhone.removeContact(exisitingContactRecord)){
       System.out.println("Sucesfully deleted");
   }else {
       System.out.println("Error deleting contact");
   }
}

    private static void queryContact(){
        System.out.println("Enter exisiting name:");
        String name =scanner.nextLine();
        Contact exisitingContactRecord =mobilePhone.queryContact(name);
        if(exisitingContactRecord==null){
            System.out.println("Conatct not found");
            return;
        }
        System.out.println("Name :"+exisitingContactRecord.getName() + " phone number " +exisitingContactRecord.getPhoneNumber());

        if( mobilePhone.removeContact(exisitingContactRecord)){
            System.out.println("Sucesfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
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
