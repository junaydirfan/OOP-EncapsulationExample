public class university {
    private String uniName;
    private String location;
    private String[] departments=new String[20];

    public university(){
        uniName="";
        location="";
        for(int i=0;i<5;i++)
            departments[i]="";
    }
    public university(String u, String l, String[] d){
        uniName=u;
        location=l;
        for(int i=0;i<d.length;i++)
            departments[i]=d[i];
        for(int i=0;i<departments.length;i++){
            if(departments[i]!=null)
                continue;
            else
                departments[i]=null;
        }
    }
    public void setUniName(String u){
        uniName=u;
    }
    public void setLocation(String l){
        location=l;
    }
    public void setDepartments(String[] d){
        for(int i=0;i<d.length;i++)
            departments[i]=d[i];
        for(int i=0;i<departments.length;i++){
            if(departments[i]!=null)
                continue;
            else
                departments[i]=null;
        }
    }
    public String getUniName(){
        return uniName;
    }
    public String getLocation(){
        return location;
    }
    public String[] getDepartments(){
        return departments;
    }
    public void display(){
        System.out.println("University Name: "+uniName);
        System.out.println("Location: "+location);
        System.out.println("Departments:");
        for(int i=0;i<departments.length;i++){
            if(departments[i]==null)
                continue;
            else
                System.out.println((i+1)+". "+departments[i]);
        }
    }
    public void addADepartment(String deptName){
        for(int i=0;i<departments.length;i++){
            if(departments[i]==null){
                departments[i]=deptName;
                break;
            }
            else{
                continue;
            }
        }
    }
    public boolean checkLocation(String key){
        boolean ifFound=false;
        for(int i=0;i<departments.length;i++){
            if(departments[i].equals(key)){
                ifFound=true;
                break;
            }
        }
        return ifFound;
    }

}
