package com.oops.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student kannaujia = new Student(19, 92.8f);
        Student abhi = new Student(25, 91.66f);
        Student pratham = new Student(52, 81.34f);
        Student raj = new Student(38, 82.52f);
        Student saksham = new Student(26, 86.45f);

        Student[] list = {kannaujia, abhi, pratham, raj, saksham};
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks); // sort in ascending order
////                return -(int)(o1.marks - o2.marks); // sort in descending order
//            }
//        });

        // Better way to do: Use lambda functions
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

//        if (kannaujia.compareTo(abhi) < 0) {
//            System.out.println(kannaujia.compareTo(abhi));
//            System.out.println("Kunal has more marks");
//        }
    }
}
