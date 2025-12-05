public class App {
    public static void main(String[] args) {
        // Transport[] transports = new Transport[3];
        // transports[0] = new Car();
        // transports[1] = new Boat();
        // transports[2] = new Transport();

        // for(int i = 0; i < transports.length; i++)
        // {
        //     transports[i].move();
        // }
        Animal[] animal = new Animal[2];
        animal[0] = new Cat("Barsik");
        animal[1] = new Dog("Niki");

        for(int i = 0; i < animal.length; i++)
        {
            animal[i].Info();
            animal[i].Sound();
        }
    }
}