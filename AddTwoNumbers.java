public class AddTwoNumbers {
    public int add(int a, int b){
         int sum = a+b;
        return sum;
    }



    public static void main(String[] args){

        //we need to create a object of the class to call to the instance method
        // so we created a object from the class
        AddTwoNumbers ad = new AddTwoNumbers();
        int sum=ad.add(15,20);
        System.out.println(sum);



    }
}
