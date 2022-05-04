/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-15 21:26:03
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
package com.experiment04.service;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {
    public List<Student> addStudent(Student student) {
        List<Student> Stus = DatabaseUtils.getStudents();
        Stus.add(student);
        return Stus;
    }

    public List<Student> listStudentsByYear(int year) {
        return DatabaseUtils.getStudents().stream().
                filter(student -> student.getYear() == year).
                collect(Collectors.toList());
    }

    public List<String> listStudentsNames(int year, Student.Sex sex) {
        return DatabaseUtils.getStudents().stream().
                filter(student -> student.getYear() == year && student.getSex() == sex).
                map(Student::getName).
                collect(Collectors.toList());
    }

    public Map<Student.Sex, List<Student>> mapStudentsBySex() {
        return DatabaseUtils.getStudents().stream().
                collect(Collectors.groupingBy(Student::getSex));
    }

    public boolean removeStudent(int id) {
        List<Student> Stus = DatabaseUtils.getStudents();
        Stus.removeIf(student -> student.getId() == id);
        return true;
    }
}
