
import java.util.Arrays;
import java.util.List;

public class Student {


    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public static String getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    private static String name;
        private static List<Double> grades;
        private String specialty;

        public static double getAverageGrade() {
            Double sum = grades.stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();
            double res = sum/grades.size();
            return res;
        }

}
//    1 Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
//    Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5,
//    отсортированных по убыванию среднего балла.
//    В решении не использовать циклы! Только StreamAPI

