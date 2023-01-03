package day22;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAssignment {
    public static void main(String[] args) {

      //Stream<String> strStream = Stream.of("A", "B", "c");
      Stream<String> builderStream =Stream.<String>builder().add("A").add("B").add("C").build();
      List<String> builder =builderStream.collect(Collectors.toList());
      System.out.println(builder);

    }
}
