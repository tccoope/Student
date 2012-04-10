
public class Student
{
    private String name;
    private int testSum = 0, average, id, score1, score2, score3;
    Student[][] students;

    public Student(String studName, int studID, int testScore1, int testScore2, int testScore3){
        name=studName;
        studID=id;
        testScore1=score1;
        testScore2=score2;
        testScore3=score3;
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

    public String toString(){
        String print="";

        print+="Name\tID\t1\t2\t3\n";
        print+=name + "\t" + id + "\t" + score1 + "\t" + score2 + "\t" + score3 + "\n";

        return print;
    }
}