import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] b = new int [n];
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        int [] prefix = new int[n];
        
        
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        
        prefix[0]=b[0];
        int sum=0;
        
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+b[i];
        }
        
        
        if(l==0) System.out.println(prefix[r]);
        else System.out.println(prefix[r]-prefix[l-1]);
    }
}



int sum = 0;
for (int i = l; i <= r; i++) {
    sum += b[i];
}
