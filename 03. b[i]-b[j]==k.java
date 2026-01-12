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
        
        HashMap<Integer , Integer> h = new HashMap<>();
        
        int count=0;
        
        for(int i=0;i<n;i++){
           int compliment = k+a[i];
           
           if(h.containsKey(compliment)) {
               count++;
               h.put(a[i],h.getOrDefault(a[i],0)+1);}
           
           h.put(a[i],1);
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
        
        
        
        int count=0;
        
        for(int i=0 ; i<n ; i++){
           for(int j=i+1 ;j<n ;j++){
           
           if(a[i]-a[j]==k) count++;
           
          
        }
        }
        System.out.print(count);
    }
}
