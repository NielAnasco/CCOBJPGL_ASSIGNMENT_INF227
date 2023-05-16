public class App {
    public static void main(String[] args) throws Exception {

        Maltipoo myPet = new Maltipoo();
       
        myPet.bark();
        System.out.println("My dog eyes are a stunning " + myPet.eyeColor +" color.");
        System.out.println("My dog is " + myPet.height + " tall and weighs " + myPet.weight +".");
        System.out.println("My dog traits are " + myPet.characteristic +".");

    }
}
