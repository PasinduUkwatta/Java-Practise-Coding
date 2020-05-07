public class Animal {
    String name;
    int weight;
    String colour;
    static int noOfLegs = 4;

    Animal(String name,int weight,String colour){
        this.name =name;
        this.weight =weight;
        this.colour =colour;

    }

    public void eat(){
        System.out.println("name of the animal is :"+name);
        System.out.println("weight of the animal is :"+weight);
        System.out.println("colur of the animal is :"+colour);
        System.out.println("no of legs of the animal is :"+noOfLegs);
        System.out.println(name+" is eating");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Animal a1 =new Animal("lion",50,"yellow");
        Animal a2 =new Animal("dog",20,"black");
        Animal a3 =new Animal("cat",10,"white");

        a1.eat();
        a2.eat();
        a3.eat();
    }
}
