import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        int n = sc.nextInt();
        
        int k = sc.nextInt();
        
        int a[] = new int [n];
        
        for(int i=0;i<n;i++){
            
           a[i]=sc.nextInt();
            
        }
        
        
        int count=0;
        
        for(int i=0 ; i<n;i++){
            for(int j=i+1 ; j<n && (j-i)<=k ;j++){
                
                if(a[i]==a[j]) count++;
                
            }
        }
        
        System.out.print(count);
    }
}



import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        int n = sc.nextInt();
        
        int k = sc.nextInt();
        
        int a[] = new int [n];
        
        for(int i=0;i<n;i++){
            
           a[i]=sc.nextInt();
            
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
               if (i - map.get(a[i]) <= k) {
                 found = true;
                 break;
               }
            }
        map.put(a[i], i);
       }

      System.out.print(found);
      
    }
}
