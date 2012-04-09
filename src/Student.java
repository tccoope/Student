
public class Student
{
    private String firstName;
    private int testSum = 0, average;
    private int Scores[] = new int[3];

    public Student(String fName)
    {
        firstName = fName;
        for (int i = 0; i < Scores.length; i++)
        {
            Scores[i] = 0;
        }
    }

    public void setTestScore(int testNumber, int testScore)
    {
        Scores[testNumber] = testScore;
    }

    public int getTestScore(int testNumber)
    {
        return Scores[testNumber];
    }

    public int average()
    {
        for (int i = 0; i < Scores.length; i++)
        {
            testSum += Scores[i];
        }
        average = testSum / Scores.length;

        return average;
    }

    public String toString()
    {
        String result = firstName + "\n";

        for (int score : Scores)
        {
            int i = 1;
            result += "Test " + i + ": " + score + "\n";
            i++;
        }

        result += "\nAverage Score: " + this.average();

        return result;
    }
}