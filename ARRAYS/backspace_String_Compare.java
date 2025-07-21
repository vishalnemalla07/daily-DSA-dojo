package ARRAYS;

public class backspace_String_Compare {

    //Brute Force -- SC : O(m + n) TC :O(m + n)
    public boolean backspace_Compare(String s, String t){
        return build(s).equals(build(t));
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
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        backspace_String_Compare obj = new backspace_String_Compare();

        boolean res = obj.backspace_Compare(s, t);
        System.out.print(res);
    }
}
