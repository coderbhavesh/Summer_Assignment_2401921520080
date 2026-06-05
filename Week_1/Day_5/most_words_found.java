class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;

        for(String str:sentences){
            String arr[]=str.split(" ");
            int wordCount=arr.length;
            
            max=Math.max(max,wordCount);
        }
        return max;
        
    }
}