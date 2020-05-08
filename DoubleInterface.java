public interface DoubleInterface {
    void run();
    void eat();
}

interface Employee{
    void work();
}

class EmployeeWork implements DoubleInterface,Employee{

    //in this class both interfaces methods must be implemnted
    @Override
    public void eat() {
        System.out.println("Employee is eating");

    }

    @Override
    public void run() {
        System.out.println("Employee is running");
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }
}

class EmpImpl{
    public static void main(String[] args) {
        DoubleInterface d1 =new EmployeeWork();
        DoubleInterface d2 =new EmployeeWork();
        Employee e =new EmployeeWork();

        e.work();
        d1.eat();
        d2.run();
    }
}
