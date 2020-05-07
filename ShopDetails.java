public class ShopDetails {

    //passing the values when initalizing the objects
    ShopDetails(){
        String itemName = "rice";
        int itemPrice = 100;
        int itemQuentity = 5;

        System.out.println("Item Name is :"+itemName);
        System.out.println("Item price is :"+itemPrice);
        System.out.println("Item quentity is :"+itemQuentity);

    }


    ShopDetails(String itemName,int itemPrice,int itemQuentity){


        System.out.println("Item Name is :"+itemName);
        System.out.println("Item price is :"+itemPrice);
        System.out.println("Item quentity is :"+itemQuentity);

    }

    public static void main(String[] args) {
        ShopDetails s1 =new ShopDetails();
        ShopDetails s2 =new ShopDetails("Suger",50,4);

    }


}
