package ssission13.part1;

import ssission13.Course;
import ssission13.Gender;
import ssission13.Student;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {


    static Student[] students = new Student[]
            {
                    Student.of("Ahmad", 20, Gender.MALE, true, Course.CHEMISTRY, Course.JAVA),
                    Student.of("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
                    Student.of("ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
                    Student.of("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
                    Student.of("DANA", 40, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
                    Student.of("RUBA", 22, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)

            };


    public static void main(String[] args) {


        Stream
                .of(students)
                .map(s -> s.getAge())
                .forEach(System.out::println);

        Map<String, List<Student>> ageGroups = Arrays.stream(students)
                .collect(Collectors.groupingBy(s -> s.getAge() < 20 ? "< 20" : ">= 20"));

        ageGroups.forEach((k, v) -> {
            System.out.println("Age group: " + k);
            v.forEach(System.out::println);
            System.out.println();
        });


        List<Student> studentList = Arrays.stream(students)
                .collect(Collectors.toList());




        
        Map<Gender, List<Student>> studentsByGender =
                Arrays.stream(students).collect(Collectors
                        .groupingBy(Student::getGender));


        Map<Course, List<Student>> studentsByCourse =
                Arrays.stream(students)
                        .flatMap(student -> student.getCourse().stream()
                                .map(course -> new AbstractMap
                                        .SimpleEntry<>(course, student)))
                        .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors
                                .mapping(Map.Entry::getValue, Collectors.toList())));

        System.out.println(studentsByCourse);



    }
}












