import static java.lang.Math.max;

public class DollsCollector {
    public static int ans=0;

    public static int findMaxDolls(int[] A, int k, int m) {
        int n=A.length;
        int temp=0;
        int val=A[k];
        A[k]=0;
        solve(k,ans,A,m,temp);
        return ans+val;
    }
    public static void solve(int k, int ans, int[] a, int m, int temp){
        // cout << "pos : " << k << " steps : " << m << " temp : " << temp << endl;
        if(m==0){
            // cout << " after all steps : " << temp << endl;
            ans=max(temp,ans);
            temp=0;
            return;
        }
        if(k-1>=0){
            int val=a[k-1];
            a[k-1]=0;
            solve(k-1,ans,a,m-1,temp+val);
            a[k-1]=val;
        }
        if(k+1<a.length){
            int val=a[k+1];
            a[k+1]=0;
            solve(k+1,ans,a,m-1,temp+val);
            a[k+1]=val;
        }
    }
    public static void main(String[] args) {
        int[] dolls = {2,3,7,5,1,3,9};
        int k = 4;
        int m = 6;
        int maxDolls = findMaxDolls( dolls,k, m);
        System.out.println("Max dolls collected: " + maxDolls);
    }
}

