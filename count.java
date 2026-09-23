import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            int currentFreq = frequencyMap.getOrDefault(nums[i], 0) + 1;
            frequencyMap.put(nums[i], currentFreq);
            
            if (currentFreq > maxFrequency) {
                maxFrequency = currentFreq;
            }
        }
        
        int totalCount = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == maxFrequency) {
                totalCount += freq;
            }
        }
        
        // Print final result
        System.out.println(totalCount);
        
        sc.close();
    }
}