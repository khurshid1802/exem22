import model.Group;
import model.Student;
import service.GroupService;
import service.MentorService;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
    static StudentService studentService = new StudentService();
    static GroupService groupService = new GroupService();
    static MentorService mentorService = new MentorService();

    public static void main(String[] args) {


        Group group1 = groupService.addGroup(new Group(".B31"));
        Group group2 = groupService.addGroup(new Group(".G42"));
        Group group3 = groupService.addGroup(new Group(".B30"));
        Group group4 = groupService.addGroup(new Group(".B32"));

        System.out.println();

        mentorService.addMentor(new Student(".Axror Mamasaidov",null,true));
        mentorService.addMentor(new Student(".Abdusobur Xalimov",null,true));
        mentorService.addMentor(new Student(".Bobur Alimov",null,true));
        mentorService.addMentor(new Student(".Javohir Elmurodov",null,true));

        studentService.addStudent(new Student(".Asadulla Normengliyev       ",group1.getId(), false));
        studentService.addStudent(new Student(".Aziz Saparniyazov           ",group1.getId(), false));
        studentService.addStudent(new Student(".Azizakhon Erkinbaeva        ",group1.getId(), false));
        studentService.addStudent(new Student(".Bobur Burxanov              ",group1.getId(), false));
        studentService.addStudent(new Student(".Davron Ergashev             ",group1.getId(), false));
        studentService.addStudent(new Student(".Davron Maxmarajabov         ",group1.getId(), false));
        studentService.addStudent(new Student(".Dostonbek Qurolboyev        ",group1.getId(), false));
        studentService.addStudent(new Student(".Iskandar Sabriev            ",group1.getId(), false));
        studentService.addStudent(new Student(".Jahongir Yusupov            ",group1.getId(), false));
        studentService.addStudent(new Student(".Jakhongir Abdurakhmonov     ",group1.getId(), false));
        studentService.addStudent(new Student(".Jaloliddin Majidov          ",group1.getId(), false));
        studentService.addStudent(new Student(".Jamoliddin Saidrasulov      ",group1.getId(), false));
        studentService.addStudent(new Student(".Madida Usmonqulova          ",group1.getId(), false));
        studentService.addStudent(new Student(".MirzaAhmad Sodiqov          ",group1.getId(), false));
        studentService.addStudent(new Student(".Muhammadamin Erkinboyev     ",group1.getId(), false));
        studentService.addStudent(new Student(".Nodirbek Usmonov            ",group1.getId(), false));
        studentService.addStudent(new Student(".Raximov Abdulaziz           ",group1.getId(), false));
        studentService.addStudent(new Student(".Sardor Norboyev             ",group1.getId(), false));
        studentService.addStudent(new Student(".Shodiyor Axmadqulov         ",group1.getId(), false));
        studentService.addStudent(new Student(".Ulug'bek Berdiyev           ",group1.getId(), false));
        studentService.addStudent(new Student(".Xurshid Eshonqulov          ",group1.getId(), false));
        studentService.addStudent(new Student(".Zarif Boboniyozov           ",group1.getId(), false));
        studentService.addStudent(new Student(".Zilola Bazarova             ",group1.getId(), false));
        studentService.addStudent(new Student(".Zuhriddin Abdumo'minov      ",group1.getId(), false));

        studentService.addStudent(new Student(".Akmalbek najimov          ",group2.getId(),false));
        studentService.addStudent(new Student(".Azamjon Tursunov          ",group2.getId(),false));
        studentService.addStudent(new Student(".Behzod Jaloliddinov       ",group2.getId(),false));
        studentService.addStudent(new Student(".Elbek Ergashev            ",group2.getId(),false));
        studentService.addStudent(new Student(".Fazliddin Sotimov         ",group2.getId(),false));
        studentService.addStudent(new Student(".Ismoil O'tkirov           ",group2.getId(),false));
        studentService.addStudent(new Student(".Jahongir Xudoyorov        ",group2.getId(),false));
        studentService.addStudent(new Student(".Jovohir Bekjonov          ",group2.getId(),false));
        studentService.addStudent(new Student(".Muhammadali Akbarov       ",group2.getId(),false));
        studentService.addStudent(new Student(".Muhammadqodir Shoymardonov",group2.getId(),false));
        studentService.addStudent(new Student(".Muxiddin Zaripov          ",group2.getId(),false));
        studentService.addStudent(new Student(".Otabek Odilov             ",group2.getId(),false));
        studentService.addStudent(new Student(".Oyatillo Karimov          ",group2.getId(),false));
        studentService.addStudent(new Student(".Ozodbek sobirov           ",group2.getId(),false));
        studentService.addStudent(new Student(".Ozodbek Umaraliyev        ",group2.getId(),false));
        studentService.addStudent(new Student(".Sardor Elmurodov          ",group2.getId(),false));
        studentService.addStudent(new Student(".Shahriddin Sobirov        ",group2.getId(),false));
        studentService.addStudent(new Student(".Sherzod Nurboyev          ",group2.getId(),false));
        studentService.addStudent(new Student(".Xojiakbar Turg'unov       ",group2.getId(),false));
        studentService.addStudent(new Student(".Yusuf Bo'riyev            ",group2.getId(),false));
        studentService.addStudent(new Student(".Zohid Hamdamov            ",group2.getId(),false));

        studentService.addStudent(new Student(".Aziz Ismailov       ",group3.getId(),false));
        studentService.addStudent(new Student(".Behzod Farhodov     ",group3.getId(),false));
        studentService.addStudent(new Student(".Sardor Norboyev     ",group3.getId(),false));
        studentService.addStudent(new Student(".Abdulaziz Xudoyqulov",group3.getId(),false));
        studentService.addStudent(new Student(".Sohib Norboyev      ",group3.getId(),false));
        studentService.addStudent(new Student(".Javohir Sharipov    ",group3.getId(),false));
        studentService.addStudent(new Student(".Jamshid Elmurodov   ",group3.getId(),false));
        studentService.addStudent(new Student(".Madiyor Negov       ",group3.getId(),false));
        studentService.addStudent(new Student(".Saidali Shamsiyev   ",group3.getId(),false));
        studentService.addStudent(new Student(".Diyorbek Rahimov    ",group3.getId(),false));
        studentService.addStudent(new Student(".Jamshid Karimov     ",group3.getId(),false));

        studentService.addStudent(new Student(".Abbosbek Ibrohimov         ",group4.getId(),false));
        studentService.addStudent(new Student(".Ahmedullayev Muhammadjon   ",group4.getId(),false));
        studentService.addStudent(new Student(".Dilmuhammad Jumaqo'ziyev   ",group4.getId(),false));
        studentService.addStudent(new Student(".Husan Karimqulov           ",group4.getId(),false));
        studentService.addStudent(new Student(".Izzat Mo'minjonov          ",group4.getId(),false));
        studentService.addStudent(new Student(".Mutaallib Ubaydullayev     ",group4.getId(),false));
        studentService.addStudent(new Student(".O'ralbek Dadaliyev         ",group4.getId(),false));
        studentService.addStudent(new Student(".Qodirov Shohjaxon          ",group4.getId(),false));
        studentService.addStudent(new Student(".Umurov Firdavs             ",group4.getId(),false));
        studentService.addStudent(new Student(".Xolmamatova Lobar          ",group4.getId(),false));
        studentService.addStudent(new Student(".Xushnudbek Yo'ldoshov      ",group4.getId(),false));
        studentService.addStudent(new Student(".Ziyoviddin Muhiddinxo'jayev",group4.getId(),false));
        studentService.addStudent(new Student(".Zoir Teshaboyev            ",group4.getId(),false));


        int stepCode = 100;
        while (stepCode != 0){
            List<Group> allGroupList = groupService.getAllGroupList();
            int i = 1;
            for (Group group : allGroupList) {
                System.out.println(i++ + group.getName());
            }
            System.out.println("Choice group: ");
            int choice = scannerInt.nextInt()-1;
            Group group = allGroupList.get(choice);

            List<Student> allMentorList = mentorService.getAllMentorList();
            int j = 1;
            for (Student mentor : allMentorList){
                System.out.println(j++ + mentor.getFullName());
            }
            System.out.println("Choice mentor: ");
            int choice1 = scannerInt.nextInt()-1;
            Student mentor = allMentorList.get(choice1);


            List<Student> allStudentList = studentService.ListStudentsOfGroup(group.getId());
            mentorService.examMixedTheoryStudents(allStudentList,mentor);
            mentorService.examProjectPracticeStudents(allStudentList, mentor);
            mentorService.examballInStudy(allStudentList,mentor);
            mentorService.examoverallScore(allStudentList, mentor);
            int k = 1;
            for (Student student : allStudentList){
                System.out.println(k++ + student.getFullName() + "   BallOfTheory - " + student.getBallOfTheory() + "   BallOfPractice - " + student.getBallOfPractice() + "   BallInStudy - " + student.getBallInStudy() + "   OverallScore - " + student.getOverallScore());
            }

        }

    }
}