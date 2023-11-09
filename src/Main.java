import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Ivan", Arrays.asList(5.0, 3.0, 2.0, 4.0), "Физика"));
        list.add(new Student("Gan", Arrays.asList(4.0, 3.0, 5.0, 4.0), "Информатика"));
        list.add(new Student("Jon", Arrays.asList(3.0, 3.0, 2.0, 4.0), "Информатика"));
        list.add(new Student("Tin", Arrays.asList(5.0, 3.0, 5.0, 4.0), "Информатика"));
        list.add(new Student("Flip", Arrays.asList(4.0, 3.0, 1.0, 5.0), "Физика"));
        list.add(new Student("Join", Arrays.asList(5.0, 4.0, 5.0, 3.0), "Информатика"));
        list.add(new Student("Full", Arrays.asList(4.0, 3.0, 5.0, 5.0), "Информатика"));
        list.add(new Student("Idi", Arrays.asList(3.0, 3.0, 3.0, 4.0), "Информатика"));
        list.add(new Student("Ifan", Arrays.asList(5.0, 3.0, 2.0, 3.0), "Физика"));
        list.add(new Student("Flag", Arrays.asList(5.0, 5.0, 5.0, 4.0), "Информатика"));
        list.add(new Student("Kik", Arrays.asList(5.0, 3.0, 5.0, 2.0), "Физика"));


        list = list.stream()
                .filter(student -> "Информатика".equals(student.getSpecialty()))
                .collect(Collectors.toList());
        list = list.stream()
                .sorted((student1, student2) -> Double.compare(student2.getAverageGrade(),
                        student1.getAverageGrade()))
                .collect(Collectors.toList());
        List result = list.stream()
                .limit(5)
                .collect(Collectors.toList());

        list = list.stream()
                .filter(student -> "Информатика".equals(student.getSpecialty()))
                .sorted((student1, student2)-> Double.compare(student2.getAverageGrade(),
                        student1.getAverageGrade()))
                .limit(5)
                .collect(Collectors.toList());
        for (Student student: list) {
            System.out.println( "Имя:" + Student.getName() + "   Средняя оценка:" + Student.getAverageGrade());
        }

    }
}  //"Информатика"