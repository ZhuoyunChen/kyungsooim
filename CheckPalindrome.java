public class CheckPalindrome {
    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) == str.charAt(j))
               return true;
                // return false;
                    //i++;
                    //j++;

        }
        //return true;
        return false;

    }
    public static void main(String[] args){
        String str = "Yes";
        if(isPalindrome(str))
            System.out.println("Yes, it is Palindrome.");
        else
            System.out.println("No, it is not Palindrome.");
    }
}
