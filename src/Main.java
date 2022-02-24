import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "1", "один");
        System.out.println(stream.count()); //количество элементов

        Stream<String> minStream = Stream.of("one", "1", "один");
        Optional<String> min = minStream.min(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                    return o1.charAt(0) - o2.charAt(0);
            }
        });
        min.ifPresent(System.out::println); //выводим по первому минимальному символу

        Stream<String> maxStream = Stream.of("one", "1", "один");
        Optional<String> max = maxStream.max(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        max.ifPresent(System.out::println); //по максимальной длине строки

        Stream<String> sortStream = Stream.of("one", "1", "один");
        sortStream.sorted().forEach(System.out::println); //сортировка

    }
}
