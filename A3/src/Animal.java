//Animal class
class Animal{
    public int age;
    public String gender;

    //isMammal() method 
    public void isMammal(){
        System.out.println("This is a public method isMammal() from class Animal");
    } 

    //mate() method
    public void mate(){
        System.out.println("This is a public method mate() from class Animal");
    }
    
    //Main method
    public static void main(String[] args){
        //myAnimal object 
        Animal myAnimal = new Animal();
        //Call public methods 
        myAnimal.isMammal();
        myAnimal.mate();

        //myFish object
        Fish myFish = new Fish();
        //myZebra object
        Zebra myZebra = new Zebra();
        //Call public methods
        myZebra.run();
    }
}

//Fish subclass 
class Fish extends Animal{
    private int sizeInFeet; 

    //canEat() method
    private void canEat(){
        System.out.println("This is a private method canEat() from subclass Fish");
    }
}
//Zebra subclass 
class Zebra extends Animal{
    public boolean is_wild;

    //run() method
    public void run(){
        System.out.println("This is a public method run() from subclass Zebra");
    }
}