package codewars;

/*
Complete the solution so that it returns true if the first argument(string)
passed in ends with the 2nd argument (also a string).
 */

public class stringEndsWith {
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }


    public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));
        System.out.println(solution("abc", "a"));
    }
}
