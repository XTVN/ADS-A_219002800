import java.lang.*;
class Rextester
{  
    static boolean isAlphaNum(char c)
    {
        if( (48<=c && c<=57) || (65<=c && c<=90) || (97<=c && c<=122)) 
            return true;
        else
            return false;
    }
    
    static char lowerCase(char c)
    {
        if(65<=c && c<=90)
            return (char)(c+32);
        else 
            return c;
    }
    
    public static boolean isPalindrome(String s) 
    {
       int begin=0,end=s.length()-1;
        
        while(begin<end)
        {
            while(begin<end && !isAlphaNum(s.charAt(begin))) begin++;
            while(begin<end && !isAlphaNum(s.charAt(end))) end--;
           
            if(lowerCase(s.charAt(begin))!=lowerCase(s.charAt(end)))  
                return false; 
            
            begin++;
            end--;
        }
        
        return true;
        
    }
    
    public static void main(String args[])
    {
       String s="A man, a plan, a canal: Panama";
       System.out.println(isPalindrome(s));   
    }
}
