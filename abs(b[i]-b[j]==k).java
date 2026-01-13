import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] b = new int [n];
        int k = sc.nextInt();
        
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int x : b) {
           
            if (map.containsKey(x + k)) {
                count += map.get(x + k);
            }

            if (k != 0 && map.containsKey(x - k)) {
                count += map.get(x - k);
            }

            
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(count);
    }
}


int count = 0;
for(int i = 0; i < n; i++){
    for(int j = i + 1; j < n; j++){
        if(Math.abs(b[i] - b[j]) == k)
            count++;
    }
}
