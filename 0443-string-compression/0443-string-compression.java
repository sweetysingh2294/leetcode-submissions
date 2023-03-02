class Solution {
    public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1){
                 char[] s=Integer.toString(count).toCharArray();
                 for(int i=0;i<s.length;i++){
                 char c=s[i];
                 chars[indexAns++]=c;
                 }

}
        }
        return indexAns;                
    }
}
            