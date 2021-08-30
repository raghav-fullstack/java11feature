import java.util.stream.Collectors;

public class StringUpdates {
    public static void main(String[] args) {

        String str = " ";
        System.out.println(str.isBlank());

        str = "I\nam\ncreator\nof\nmy\nowndestiny.";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));

        char c = '\u2000';
        str+=c;

        // String.strip() is equivalent to String.trim() with unicode support
        System.out.println("with trailing space"+str);
        System.out.println(str);
        System.out.println(str.strip());

        System.out.println("00".repeat(100));

    }
}
