import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 중첩 리스트 생성
        List<List<Integer>> nestedList = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        // flatMap을 사용하여 중첩된 리스트를 단일 스트림으로 변환
        List<Integer> flatList = nestedList.stream()
            .flatMap(List::stream) // 중첩 리스트를 단일 스트림으로 평면화
            .collect(Collectors.toList());

        System.out.println(flatList); // 출력: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
