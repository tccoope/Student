import java.io.*;
import java.util.Scanner;

public class StudentDriver
{
    public static void main(String[] args) throws IOException
    {
        Scanner file= new Scanner(new File("students.txt"));

        Student[][] students = new Student[5][5];

        file.useDelimiter("\t");

        for (int row=0; row<students.length; row++)
            for(int col=0; col<students[row].length; col++)
                students[row][col]=file.next();

        System.out.println(students);
    }
}