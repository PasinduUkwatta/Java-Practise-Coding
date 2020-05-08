interface Phone1 {
    void answerCall();
}

class Nokia implements Phone1{
    public void answerCall(){
        System.out.println("call answer by the nokia phone");
    }
}

class Samsung implements Phone1{
    public void answerCall(){
        System.out.println("call answer by the Samsung phone");
    }
}

class PhoneImpl{
    public static void main(String[] args) {
        Phone1 s = new Samsung();
        Phone1 n = new Nokia();
        s.answerCall();
        n.answerCall();
    }
}