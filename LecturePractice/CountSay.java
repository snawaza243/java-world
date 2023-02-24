// s="33222521"
// 23 two times three
// 32 three times two
/*
 * n=1  1
 * n=2  11
 * n=3  21
 * n=4  1211
 * n=5  111221
 * n=6  312211
 * n=7  13112221
 *
 * n=1=1
 * n=2=11
 */

public class CountSay {
    public static void main(String[] args) {
        int count = 1;
        String s = "11";
        int n=2;
        String x = "11";
        String t;


        for (int i=0; i<s.length(); i++)
        {
        //    int si = (int) s.cha;
            if(s.charAt(i) ==s.charAt(i-1)){
                count++;
                t= t+toString(count);

            }
        }
    }
    
}
