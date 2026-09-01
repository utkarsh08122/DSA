

class hIndex {
    public int hIndex(int[] citations) {

        int n =citations.length;
        for(int i=0 ; i<citations.length ; i++){
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