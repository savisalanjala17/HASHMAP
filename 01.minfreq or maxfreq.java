import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = sc.nextInt();
        int maxxkey = 0;
        int minnkey =  0;
        
        int maxxfreq = Integer.MIN_VALUE;
        int minnfreq =  Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            int a = sc.nextInt();
            
            h.put(a,h.getOrDefault(a,0)+1);
            
        }
        
        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
    int freq = entry.getValue();
    int ch = entry.getKey();

            
            if(freq>maxxfreq){
                maxxfreq=freq;
                maxxkey=ch;
            }
            
            if(freq<minnfreq){
                minnfreq=freq;
                minnkey=ch;
            }
        
        }
        
        System.out.print(maxxkey+"   "+minnkey);
    }
}






import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxKey = arr[0];
        int minKey = arr[0];

        int maxFreq = 0;
        int minFreq = n;

        for (int i = 0; i < n; i++) {
            int count = 0;

            // count frequency of arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                maxKey = arr[i];
            }

            if (count < minFreq) {
                minFreq = count;
                minKey = arr[i];
            }
        }

        System.out.println(maxKey + " " + minKey);
    }
}

