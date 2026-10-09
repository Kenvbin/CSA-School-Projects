public class Student {
    private String name;
    private int test1;
    private int test2;
    private int test3;

    public Student() {
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }

    public Student(String nm, int t1, int t2, int t3){
        name = nm;
        test1 = t1;
        test2 = t2;
        test3 = t3;
    }

    public Student (Student s){
        name = s.name;
        test1 = s.test1;
        test2 = s.test2;
        test3 = s.test3;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setScore(int i, int score) {
        if (i == 1)
            test1 = score;
        else if (i == 2)
            test2 = score;
        else
            test3 = score;
    }

    public int getScore(int i) {
        if (i == 1)
            return test1;
        else if (i == 2)
            return test2;
        else
            return test3;
    }

    public int getAverage() {
        int average = (int) Math.round((test1 + test2 + test3) / 3.0);
        return average;
    }

    public int getMin(){
        return (int) Math.min(Math.min(test1, test2), test3);
    }

    public int getHighScore() {
        int highScore = test1;
        if (test2 > highScore)
            highScore = test2;
        if (test3 > highScore)
            highScore = test3;
        return highScore;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Test 1: " + test1 + "\n" +
                "Test 2: " + test2 + "\n" +
                "Test 3: " + test3 + "\n" +
                "Average: " + getAverage() + "\n" +
                "Min Score: " + getMin();
    }
}