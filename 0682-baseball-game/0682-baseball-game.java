class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer>s=new Stack<>();
        
        //String ope = operations[i];
        for(int i=0;i<operations.length;i++){
            String ope = operations[i];
            if(ope.equals("+")){
                int top=s.pop();
                int newtop=top+s.peek();
                s.push(top);
                s.push(newtop);
            }else if(ope.equals("D")){
                s.push(2*s.peek());
            }else if(ope.equals("C")){
                s.pop();
            }else{
                s.push(Integer.valueOf(ope));
            }
        }
        int ans=0;
        while(!s.isEmpty()){
            ans=ans+s.pop();
        }
       // System.out.print(ans);
        return ans;
        
    
    }
}