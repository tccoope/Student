import java.io.*;
import java.util.Scanner;

public class StudentDriver
{
    public static void main(String[] args) throws IOException
    {
        Scanner file=new Scanner(new File("students"));

        file.useDelimiter("\t");

        String[] tmp=new String[5];

        Student[][] students=new Student[5][5];

        for(int i=0;file.hasNext();i++)
            tmp[i]=file.nextLine();

        for(int row=0; row<students.length; row++)
            for(int col=0; col<students[row].length; col++)
                students[row][col]=tmp[row].toString().split("\t");
    }
}