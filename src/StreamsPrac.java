

import java.util.Optional;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created 7/11/2019 2:55 PM
 *
 * @author Rohit Rawani
 */
public class StreamsPrac {

  public static void main(String[] args) {
    Random rand = new Random();
    IntStream st = rand.ints(3);
    st.forEach(System.out::println);

    Stream<String> streamOfString = Pattern.compile(",").splitAsStream("a,b,c");
    streamOfString.forEach(System.out::println);

    Stream<String> stream =
        Stream.of("a", "b", "c").skip(1).filter(element -> element.contains("c"));
    Optional<String> anyElement = stream.findAny();
    System.out.println(anyElement);
//    Optional<String> firstElement = stream.findFirst();

  }
}
