public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        //implement code here
        if(x.length() >= 2){
            if(x.substring(x.length()-2, x.length()).equals("ly") ){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String conCat(String s1, String s2) {
        //implement code here
        String news1;
        String concat;
        if(s2.length() == 0 || s1.length() ==0){
            concat = s1 + s2;
            return concat;
        }
        if(s1.substring(s1.length()-1, s1.length()).equals(s2.substring(0,1))){
            news1 = s1.substring(0,s1.length()-1);
            concat = news1 + s2;
            return concat;    
        }else {
            concat = s1 + s2;
            return concat;
        }
    }

    public String withoutX(String s1) {
        //implement code here
        String finalstr = s1;
        if(s1.substring(0, 1).equals("x") && s1.substring(s1.length()-1, s1.length()).equals("x")){
            finalstr = s1.substring(1,s1.length()-1);
        }
        if(s1.substring(0, 1).equals("x") && !s1.substring(s1.length()-1, s1.length()).equals("x")){
            finalstr = s1.substring(1, s1.length());
        }
        if(s1.substring(s1.length()-1, s1.length()).equals("x") && !s1.substring(0, 1).equals("x")){
            finalstr = s1.substring(0, s1.length()-1);
        }
        if(!s1.substring(s1.length()-1, s1.length()).equals("x") && !s1.substring(0, 1).equals("x")){
            return s1;
        }
        return finalstr;
    }

    public String fizzString(String s1) {
        //implement code here
        if(s1.substring(0,1).equals("f") && s1.substring(s1.length()-1, s1.length()).equals("b")){
            return "FizzBuzz";
        }
        if(s1.substring(0,1).equals("f")){
            return "Fizz";
        }
        if(s1.substring(s1.length()-1, s1.length()).equals("b")){
            return "Buzz";
        }
        return s1;
    }

    public String fizzString2(int x) {
        //implement code here
        if((x % 3 == 0) && (x % 5 == 0)){
            return "FizzBuzz!";
        }
        if(x % 3 == 0){
            return "Fizz!";
        }
        if(x % 5 == 0){
            return "Buzz!";
        }
        return (x + "!");
    }

}
