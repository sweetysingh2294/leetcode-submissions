class Solution {
    public boolean isValid(String s) {
        Stack<Character>p=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                p.push(ch);
            }else{
                if(p.isEmpty()){
                    return false;
                }
                if((p.peek()=='('&&ch==')')||(p.peek()=='['&&ch==']')||(p.peek()=='{'&&ch=='}')){
                    p.pop();
                }else{
                    return false;
                }
            }
        }
        if(p.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}