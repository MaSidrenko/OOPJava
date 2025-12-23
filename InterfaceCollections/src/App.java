
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        // List<String> names = List.of("Anna", "Boris", "Elena", "Alina", "Elena");
        // List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        // System.out.println(evens);
        // List<String> aNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        // System.out.println(aNames);
        // List<Integer> length = names.stream().map(name -> name.length()).collect(Collectors.toList());
        // System.out.println(length);
        // List<String> toUpper = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        // System.out.println(toUpper);
        // List<Integer> LenA = names.stream().filter(name -> name.startsWith("A")).map(String::length).collect(Collectors.toList());
        // System.out.println(LenA);
        // List<String> unique = names.stream().distinct().collect(Collectors.toList());
        // System.out.println(unique);
        // List<User> users = List.of(
        //         new User("Alisa", "alice@gmail.com"),
        //         new User("Bob", "bob@gmail.com"),
        //         new User("Eva", "eva@gmail.com"),
        //         new User("Alisa2", "alice@gmail.com"),
        //         new User("Gleb", "gleb@gmail.com")
        // );
        // List<User> u = users.stream().distinct().collect(Collectors.toList());
        // System.out.println(u);
        // List<String> n = names.stream().skip(2).limit(3).collect(Collectors.toList());
        // System.out.println(n);
        // names.stream()
        // .filter(name -> name.startsWith("A")).peek(name -> System.out.println(name)).map(name -> name.toUpperCase())
        // .forEach(name -> System.out.println(name));
        // List<String> userList = users
        // .stream()
        // .filter(user -> user.getAge() >= 18)
        // .map(User::getName)
        // .collect(Collectors.toList());
        // Stream<String> stream = names.stream();
        // int [] nam = {1, 2 ,3 ,4,5,6,7};
        // IntStream intStream = Arrays.stream(nam);
        // List<Integer> nums = List.of(1,2,3,4,5,6);
        // List<Integer> evNumMtwo = nums.stream().filter(num -> num % 2 == 0).map(num -> num * 2).collect(Collectors.toList());
        // System.out.println(evNumMtwo);
        // List<String> words = List.of("java", "python", "go", "java", "rust", "go");
        // List<String> sortedWords = words.stream().distinct().filter(word -> word.length() > 3).sorted().collect(Collectors.toList());
        // System.out.println(sortedWords);
        List<User> users = List.of(
                new User("Bob", 17),
                new User("Mila", 22),
                new User("Ilya", 31),
                new User("Anna", 17)
        );
        Map<Integer, List<User>> ageWithName = users.stream().collect(Collectors.groupingBy(User::age, Collectors.toList()));
        ageWithName.entrySet().stream().max(Comparator.comparingInt(entry -> entry.getValue().size())).ifPresent(maxEntry -> {
            System.out.println("Age group with most users: " + maxEntry.getKey());
            System.out.println("Users in this age group: " + maxEntry.getValue());
        }
        );
    }
}
