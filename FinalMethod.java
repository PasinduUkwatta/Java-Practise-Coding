class FinalMethod {
    final void run() {
        System.out.println("System is running smoothly");


    }

    public static void main(String[] args)
    {
        //final methods cannot be override
        //final variables cannot be reassign
        //final class cannot be extend
        FinalMethod f = new FinalMethod();
        f.run();

        final int x = 10;
        System.out.println(x);

    }
}
