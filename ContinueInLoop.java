public class ContinueInLoop {
    public static void main(String[]args){

        //in this loop when i = 5 , the loop continue
        //so in that line 5 is not printing in the screen

        for (int i = 0;i<=10;i++){
            if (i==5){
              continue;
            }
            System.out.println(i);
        }
    }
}

/*

this is the output cod we get , 5 is not printing

0
1
2
3
4
6
7
8
9
10

Process finished with exit code 0

*/