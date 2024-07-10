package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentService {
    private static List<Student> students = new ArrayList<>();

    public Student addStudent(Student student){
        students.add(student);
        return student;
    }

    public List<Student> ListStudentsOfGroup(UUID groupId){
        List<Student> studentList = new ArrayList<>();
        for (Student student:students){
            if (student.getGroupId().equals(groupId)){
                studentList.add(student);
            }
        }
        return studentList;
    }

    public List<Student> getAllStudentList(){ return students;}

    public void overallScore(List<Student> students){
        for (Student student : students){
            student.setOverallScore(student.getBallOfPractice() + student.getBallInStudy() + student.getBallOfTheory());
            if (student.getOverallScore() > 60){
                student.setPassed(true);
            }
        }
    }

}
