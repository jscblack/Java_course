package com.experiment05;

import com.experiment05.entity.*;
import com.experiment05.resource.DatabaseUtils;

import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
         System.out.println(getCourseName(DatabaseUtils.getStudents(),8888));
         printCollegeName(DatabaseUtils.getStudents(), 201001, 1002);
    }

    /**
     * 基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * @param student
     * @param sNumber
     * @return
     */
    private static String  getCourseName(List<Student> student, int sNumber) {
        Optional<Student>res=student.stream().filter(student1 -> student1.getNumber()==sNumber).findAny();
        if(res.isPresent()) {
            return res.get().getTeacher().getCollege().getName();
        }
        return "未知学院";
    }

    /**
     * 实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * @param students
     * @param sNumber
     * @param tNumber
     */
    private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {
        Optional<Student>res=students.stream().filter(student1 -> student1.getNumber()==sNumber && student1.getTeacher().getNumber()==tNumber).findAny();
        if(res.isPresent()) {
            System.out.println(res.get().getTeacher().getCollege().getName());
        }
        else{
            System.out.println("未知学院");
        }

    }
}
