class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int SR=0;
        int SC=0;
        int ER=matrix.length-1;
        int EC=matrix[0].length-1;
        while(SR<=ER&&SC<=EC){
        for(int j=SC;j<=EC;j++){
            list.add(matrix[SR][j]);
        }
        for(int i=SR+1;i<=ER;i++){
          list.add(matrix[i][EC]);
        }
        for(int j=EC-1;j>=SC;j--){
         
            if(SR==ER){
                break;
            }
             list.add(matrix[ER][j]);
        }
        for(int i=ER-1;i>=SR+1;i--){
          
            if(SC==EC){
                break;
            }
             list.add(matrix[i][SC]);
        }
        SC++;
        SR++;
        EC--;
        ER--;
    }
    
        return list;
    
}
}