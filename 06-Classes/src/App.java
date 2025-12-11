
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        // List<IPlayable> play = new ArrayList<>();
        // play.add(new MusicPlay());
        // play.add(new VideoPlayer());

        // for (IPlayable p : play) {
        //     p.play();
        // }

        List<IValidator> valid = new ArrayList<>();

        valid.add(new PasswordValidator());
        valid.add(new EmailValidator());
        System.out.println(valid.get(0).isValid("1234567"));
        System.out.println(valid.get(0).isValid("123456789"));
        System.out.println(valid.get(1).isValid("MaSidorenko@gmail.com"));
        System.out.println(valid.get(1).isValid("MaSidorenko2gmail.com"));
    }
}
