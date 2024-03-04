package innovaStudyGroup.localVariableTypeInference;
import java.util.ArrayList;
import java.util.List;

public class VariableTypeInferenceDemo {

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();

        var list = new ArrayList<String>(); // Type inferred to ArrayList<String>
        var stream = list.stream(); // Type inferred to Stream<String>

        var numbers = List.of(1, 2, 3);
        for (var number : numbers) {
            System.out.println(number); // 'number' is inferred as Integer
        }
    }
}
