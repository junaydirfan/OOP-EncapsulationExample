public class studentEncapsulated {
    private String name;
    private int[] result=new int[5];

    public studentEncapsulated(){
        name=" ";
        for(int i=0;i<result.length;i++){
            result[i]=0;
        }
    }
    public studentEncapsulated(String n){
        name=n;
        for(int i=0;i<result.length;i++){
            result[i]=0;
        }
    }
    public studentEncapsulated(String n, int[] r){
        name=n;
        for(int i=0;i<result.length;i++){
            if(r[i]<0 || r[i]>100)
                result[i]=0;
            else
                result[i]=r[i];
        }
    }
    public void setName(String n){
        name=n;
    }
    public void setResult(int[] r){
        for(int i=0;i<result.length;i++){
            if(r[i]<0 || r[i]>100);
            else
                result[i]=r[i];
        }
    }
    public String getName(){
        return name;
    }
    public int[] getResult(){
        return result;
    }
    public double average(){
        double avg=0;
        for(int i=0;i<result.length;i++){
            avg+=result[i];
        }
        avg/=result.length;
        return avg;
    }

}
