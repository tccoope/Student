import java.util.Scanner;

public class Student
{
    private String name;
    private int testSum = 0, average, id, score1, score2, score3;

    public void readStudent(Scanner fileScan){
        name=fileScan.next();
        id=fileScan.nextInt();
        score1=fileScan.nextInt();
        score2=fileScan.nextInt();
        score3=fileScan.nextInt();
    }

    public void setScore(int testNum, int testScore){
        if(testNum==1)
            score1=testScore;
        else if(testNum==2)
            score2=testScore;
        else
            score3=testScore;
    }

    public int getScore(int testNum){
        int score=0;
        if (testNum==1)
            score=score1;
        else if (testNum==2)
            score=score2;
        else if (testNum==3)
            score=score3;

        return score;
    }

    public int average(){
        average=(score1+score2+score3)/3;

        return average;
    }
    public String toString(){
        String print="";

        print+=name + "\t" + id + "\t" + score1 + "\t" + score2 + "\t" + score3;

        return print;
    }
}