
import java.util.Arrays;
class hIndex1 {
    public int hIndex1(int[] citations) {
        Arrays.sort(citations);

        int n =citations.length;
        for(int i=0 ; i< citations.length ; i++){
            if(citations[i] < n - i){
                continue;
            }
            if(citations[i] >= n - i){
                return n-i;
            }
        }
        return 0;
    }
}