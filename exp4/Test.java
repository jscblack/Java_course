package com.experiment04;


import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentService;
import com.experiment04.service.StudentServiceImpl;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        StudentService studentService=new StudentServiceImpl();
        List<Student>students;
        System.out.println("-------------------------------");
        students=studentService.addStudent(new Student(201907, Student.Sex.MALE, "大帅比", 2019));
        students.forEach(student -> System.out.println(student.getId()+" "+student.getSex()+" "+student.getName()+" "+student.getYear()));

        System.out.println("-------------------------------");
        students=studentService.listStudentsByYear(2019);
        students.forEach(student -> System.out.println(student.getId()+" "+student.getSex()+" "+student.getName()+" "+student.getYear()));

        System.out.println("-------------------------------");
        List<String>studentss=studentService.listStudentsNames(2012,Student.Sex.MALE);
        studentss.forEach(string -> System.out.println(string));

        System.out.println("-------------------------------");
        Map<Student.Sex, List<Student>>mapStudentsBySex= studentService.mapStudentsBySex();
        mapStudentsBySex.get(Student.Sex.FEMALE).forEach(student -> System.out.println(student.getId()+" "+student.getSex()+" "+student.getName()+" "+student.getYear()));
        mapStudentsBySex.get(Student.Sex.FEMALE).forEach(student -> System.out.println(student.getId()+" "+student.getSex()+" "+student.getName()+" "+student.getYear()));

        System.out.println("-------------------------------");
        studentService.removeStudent(201907);
        students=DatabaseUtils.getStudents();
        students.forEach(student -> System.out.println(student.getId()+" "+student.getSex()+" "+student.getName()+" "+student.getYear()));

    }
}
