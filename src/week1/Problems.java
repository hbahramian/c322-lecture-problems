package week1;

public class Problems {

    public static int[] problem1(int[] numbers, int target) {
        int[] indices = {-1, -1};
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        return indices;
    }

    public static boolean isPalindrome(int x) {
        boolean result = true;
        if(x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        int n = s.length();
        for(int i = 0; i < n / 2; i++) {
            System.out.println(s.charAt(i));
            if(s.charAt(i) != s.charAt(n - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static String longestCommonPrefix(String[] strings) {
        String answer = "";
        String s = strings[0];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isCommon = true;
            for(int j = 1; j < strings.length; j++) {

                if((i > strings[j].length() - 1) ||  (strings[j].charAt(i) != c)) {
                    isCommon = false;
                    break;
                }
            }
            if(isCommon) {
                answer += c;
            } else break;
        }

        return answer;
    }
}
