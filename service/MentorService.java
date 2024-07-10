package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MentorService {
    private final List<Student> mentors = new ArrayList<>();

    public Student addMentor(Student student){
        mentors.add(student);
        return student;
    }

    public List<Student> getAllMentorList(){return mentors;}

    Random random = new Random();

    public void examMixedTheoryStudents(List<Student> students, Student mentor){
        for (Student student : students){
            student.setBallOfTheory(random.nextInt(21) + 20);
        }
    }

    public void examProjectPracticeStudents(List<Student> students, Student mentor){
        for (Student student : students){
            student.setBallOfPractice(random.nextInt(31) + 20);
        }
    }

    public void examballInStudy(List<Student> students, Student mentor){
        for (Student student : students){
            student.setBallInStudy(random.nextInt(10) +1);
        }
    }

    public void examoverallScore(List<Student> students, Student mentor){
        for (Student student : students){
            student.setOverallScore(student.getBallOfPractice() + student.getBallOfTheory() + student.getBallInStudy());
        }
    }

}
