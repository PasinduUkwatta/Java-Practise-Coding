public class ParentPolymophisum {
    void payBill(){
        System.out.println("pay the bill");
    }

}

class Child extends ParentPolymophisum{
    @Override
    void payBill() {
        System.out.println("pay the bill and give a tip");
    }

    public static void main(String[] args) {
        ParentPolymophisum p1 = new ParentPolymophisum();
        ParentPolymophisum p2 = new Child();
        Child c1 =new Child();

        //in this parent method is calling
        p1.payBill();

        /*in this we making hte child object with having the parent referrence
        so when compiler check for the parent method
        runtime run the child class method
        in this pholymorphisum is used
        */
        p2.payBill();

        /*
        *in this child class will run its method ,it is a overridden method
        **/
        c1.payBill();


    }
}
