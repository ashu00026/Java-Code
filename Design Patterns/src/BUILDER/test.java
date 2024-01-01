package BUILDER;
class Solution{
    int solution(int [] a, int x){
        int N=a.length;
        if(N==0){
            return -1;
        }
        int l=0;
        int r=N-1;
        while(l<r){
            int m=(l+r)/2;
            if(a[m]>x){
                r=m;
            }else{
                l=m;
            }
        }
        if(a[l]==x){
            System.out.println(a[l]);
            return l;
        }
        return -1;
    }
}


public class test {
    public static void main(String[] args) {
        int []array=new int[]{1,2,5,9,9};
        Solution s= new Solution();
        s.solution(array,2);
        System.out.println("j");

    }
}
