package solutions_week2;

public class q_647 {
    static int count =0;
    public static int countSubstrings(String s) {

        for(int i=0;i<s.length();i++){
            count(s,i,i);
            count(s,i,i+1);
        }

        return count;


    }
    public static void count(String s, int start, int end){
        while(start>=0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            count++;
            start--;
            end++;
        }
    }



    public static void main(String[] args){

        System.out.println(countSubstrings("aaaabbbbbrrrjoj"));

    }

}
