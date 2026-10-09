public class App {
    public static void main(String[] args) throws Exception {
        Student s1, s2, s3;
        s1 = new Student();
        s2 = new Student("Mani",70,80,90);
        s3 = new Student(s2);


        s1.setName("Kevin");
        s1.setScore(1, 90);
        s1.setScore(2, 82);
        s1.setScore(3,67);

        s3.setName("Matthew");
        s3.setScore(1,75);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
