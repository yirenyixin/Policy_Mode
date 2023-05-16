package com.example.policy_mode;

public class text{
    public static void main(String arg[]){
        int index=1;//vip
        double a[]={100,200,300,400,500,600};
        int b[]={0,1,0,1,0,1};//1为日用品
        getTotal(index,a,b);

        index=0;
        double c[]={100,200,300,400,500,600};
        int d[]={0,1,0,1,0,1};//1为日用品
        getTotal(index,c,d);
    }

    private static void getTotal(int index, double[] a, int[] b) {
        double all=0;
        Istrategy istrategy=new Strategy();
        for(int i=0;i<a.length;i++){
            if(a[i]==1)a[i]=istrategy.Strategy03(a[i]);
            all+=a[i];
        }
        if(all>500)all=istrategy.Strategy01(all);
        if(index==1){
            all=istrategy.Strategy02(all);
            System.out.println("vip客户，消费总价为："+all);
        }
        else System.out.println("普通客户，消费总价为："+all);
    }
}
