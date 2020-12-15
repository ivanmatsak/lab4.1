package by.bnty.fitr.poit.matsak.javalabs.lab6.model;

public class IndividualTask {

    public static int findMultOfEvens(int[] args){
        int mul=1;
        for(int arg : args){
            if(arg%2==0){
                mul*=arg;
            }
        }
        return mul;
    }
    public static int findSumBetweenNulls(int[] args, int f, int l){
        int sum=0;
        for (int i = f; i <l ; i++) {
            sum+=args[i];
        }
        return sum;
    }
    public static int findFirstNull(int[] args){
        for (int i = 0; i < args.length; i++) {
            if(args[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static int findLastNull(int[] args){
        int ind=-1;
        for (int i = 0; i < args.length; i++) {
            if(args[i]==0){
                ind=i;
            }
        }
        return ind;
    }
}
