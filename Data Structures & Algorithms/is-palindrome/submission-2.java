class Solution {
    public boolean isPalindrome(String s) {
       String ch=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       for(int i=0;i<ch.length();i++){
        for(int j=ch.length()-1-i;j>=0;j--){
            if(ch.charAt(i)!=ch.charAt(j)){
                return false;
            }
            break;
        }
       }
       return true;

    }
}