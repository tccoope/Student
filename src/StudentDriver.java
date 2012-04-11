import java.io.*;
import java.util.Scanner;

public class StudentDriver
{
    public static void main(String[] args) throws IOException
    {
        Student[] students;
        students=new Student[5];

        Scanner file=new Scanner(new File("students.txt"));

        for (int i=0; i<5; i++){
            students[i]= new Student();
            students[i].readStudent(file);
        }

        System.out.print("Name\tID\t1\t2\t3\tAverage\n");
        for(Student student : students){
            System.out.print(student + "\t");
            System.out.print(student.average());
            System.out.println();
        }
    }
}