package ARRAYS;

public class backspace_String_Compare {

    //Brute Force -- SC : O(m + n) TC :O(m + n)
    public boolean backspace_Compare(String s, String t){
        // return build(s).equals(build(t));
        return getActualString(s).equals(getActualString(t));
    }

    public String build(String str){
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch == '#'){
                if(result.length() > 0){
                    result.deleteCharAt(result.length() - 1);
                }
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }

    //Optimal Approach -- TC: O(n)
    public static String getActualString(String str){
        StringBuilder actualString = new StringBuilder();
        int hashCount = 0;

        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '#'){
                hashCount++;
                continue;
            }

            if(hashCount > 0){
                hashCount--;
            }else{
                actualString.insert(0, str.charAt(i));
            }
        }
        return actualString.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        backspace_String_Compare obj = new backspace_String_Compare();

        boolean res = obj.backspace_Compare(s, t);
        System.out.print(res);
    }
}
