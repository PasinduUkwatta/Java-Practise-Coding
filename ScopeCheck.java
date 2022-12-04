public class ScopeCheck {
    public int publicVar =0;
    private int privateVar =1;

    public ScopeCheck(){
        System.out.printf("Scope check created, public var = " +publicVar + " : private var ="+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar =2;
        for(int i=0;i<10;i++){
            System.out.println(i+1 +" times two is " +(i+1)*privateVar);
        }
    }
}
