public class tuckShopRunner {
    public static void main(String[] args) {
        String[] n={"a","b","c"};
        double[] p={10,20,30};
        int[] q={5,10,2};

        tuckShop t1=new tuckShop();
        tuckShop t2=new tuckShop("Ali",n,p,q);
        t2.addFoodItem("d",40,6);
        t2.buy("d");
    }
}
