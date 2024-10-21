package level4;

import java.util.HashMap;
import java.util.Map;

public class level4_3 {
    public static void main(String[] args){
        int[] num = new int[50];
        int temp;
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0;i<50;i++){
            num[i] = (int)(Math.random()*100) + 1;
        }
        for(int i=0;i<50;i++){
            countMap.put(num[i], countMap.getOrDefault(num[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "次");
        }
        System.out.println("时锐nb23物联网1班");
    }
}
