public class tuckShop {
    private String owner;
    private String[] foodItems=new String[100];
    private double[] price=new double[100];
    private int[] quantity=new int[100];

    public tuckShop(){
        owner="";
        for(int i=0;i<foodItems.length;i++)
            foodItems[i]="";
        for(int i=0;i<price.length;i++)
            price[i]=0;
        for(int i=0;i<quantity.length;i++)
            quantity[i]=0;
    }
    public tuckShop(String o, String[] f, double[] p, int[] q){
        owner=o;
        for(int i=0;i<f.length;i++)
            foodItems[i]=f[i];
        for(int i=0;i<p.length;i++)
            price[i]=p[i];
        for(int i=0;i<q.length;i++)
            quantity[i]=q[i];
    }
    public void setOwner(String o){
        owner=o;
    }
    public String getOwner() {
        return owner;
    }
    public void display(){
        System.out.println("Owner: "+owner);
        for(int i=0;i<foodItems.length;i++){
            if(foodItems[i]!=null)
                System.out.println("Food Item: "+foodItems[i]+"\tPrice: "+price[i]+"\tQuantity: "+quantity[i]);
        }
    }
    public void addFoodItem(String f, double p, int q){
        for(int i=0;i<foodItems.length;i++){
            if(foodItems[i]==null){
                foodItems[i]=f;
                price[i]=p;
                quantity[i]=q;
                break;
            }
        }
    }
    public void buy(String f){
        for(int i=0;i<foodItems.length;i++){
            if(foodItems[i].equals(f)){
                if(quantity[i]>=1)
                    quantity[i]--;
            }
        }
    }
}
