class Solution {
    public String longestPalindrome(String s) {
        int ans=0;
        String substr="";
        int len=s.length();
        while(len>=0)
        {
            for(int i=0,j=len; j<=s.length(); i++,j++)
            {
                if(isPalindrome(s.substring(i,j).toCharArray()))
                    return s.substring(i,j);
            }
            len--;
        }
        return substr;
    }
    
    public boolean isPalindrome(char[] str)
    {
        for(int i=0, j=str.length-1;i<j; i++,j--)
        {
            if(str[i]!=str[j])
                return false;
        }
        return true;
    }
}
