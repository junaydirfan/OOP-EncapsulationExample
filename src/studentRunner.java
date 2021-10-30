public class studentRunner {
    public static void main(String[] args) {
        int[] results={50,60,70,80,90};
        studentEncapsulated s1=new studentEncapsulated();
        studentEncapsulated s2=new studentEncapsulated("Ali",results);

        double avg1=s1.average();
        double avg2=s2.average();

        if(avg1>avg2){
            System.out.println("Student 1 Average is better");
        }
        else if(avg2>avg1){
            System.out.println("Student 2 Average is better");
        }
        else
            System.out.println("Both Students Averages are same");

        studentEncapsulated s3=new studentEncapsulated(s1.getName(),s2.getResult());
    }
}
