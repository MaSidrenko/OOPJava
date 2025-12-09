
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args)  {
        // List<ZooAnimal> Animals = new ArrayList<>();
        // Animals.add(new Elephant());
        // Animals.add(new Monkey());
        // for(ZooAnimal Animal : Animals)
        // {
        //     Animal.makeSound();
        // }

        List<Notification> Notif = new ArrayList<>();
        Notif.add(new EmailNotification("Maxim", "Maxim@gmail.com"));
        Notif.add(new PushNotification("Vlad", 10));

        for(Notification n : Notif)
        {
            n.send();
            n.printInfo();
        }
    }
}
