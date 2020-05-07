public class StaticVariables {
    String name;
    int age;
    static  String university = "University of Moratuwa";

    StaticVariables(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println("the name of the student is :"+name);
        System.out.println("the age of the student is :"+age);
        System.out.println("the university of the student is :"+university);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        StaticVariables s1 = new StaticVariables("sunil",24);
        StaticVariables s2 = new StaticVariables("kamal",35);
        StaticVariables s3 = new StaticVariables("nimal",28);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
