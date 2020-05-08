public class Test1 {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.setPhoneNo("071-1134022");
        System.out.println(p.getPhoneNo());
    }
}

class Phone{
    private String phoneNo;


    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

