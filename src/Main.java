
public class Main {

    public static String longestPalindromicSubstring(String word){
        String result = "";
        int maxLength = Integer.MIN_VALUE;
        for (int iterator1 = 0 ; iterator1 < word.length() ; iterator1++){
            for (int iterator2 = iterator1 + 1 ; iterator2 < word.length() ; iterator2++){
                if (word.charAt(iterator1) == word.charAt(iterator2) && (palindromeOrNot(word.substring(iterator1, iterator2+1)))){
                    int length = word.substring(iterator1, iterator2 + 1).length();
                    if (length > maxLength){
                        maxLength = length;
                        result = word.substring(iterator1,iterator2 + 1);
                    }
                }
            }
        }
        return result;
    }

    public static boolean palindromeOrNot(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        return (stringBuilder.reverse().toString().equals(word)) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("abba"));
    }
}