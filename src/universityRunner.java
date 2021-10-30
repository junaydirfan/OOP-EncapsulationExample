public class universityRunner {
    public static void main(String[] args) {
        String[] dept={"CS","Bioinformatics","SE","Physics"};
        university u1=new university();
        u1.setUniName("COMSATS");
        u1.setLocation("Islamabad");
        u1.setDepartments(dept);
        u1.addADepartment("Electrical");
        u1.display();

        String[] depts={"A","B","C","D","E","F"};
        university u2=new university("Montoba","Toronto",depts);
        String[] depts2=u2.getDepartments();
    }
}
