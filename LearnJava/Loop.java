package LearnJava;


public class Loop {
    /**
     *  return max number
     * @param a
     * @param b
     * @return
     */
     public static int maxnum(int a , int b){
         if(a >=  b){
             return a;
         }else{
             return b;
         }
     }

    /**
     * Calculate factorial
     * @param n
     * @return
     */

     public static int jiecheng(int n){
         int res = 1;
         for(int i = 1; i <= n; i++){
             res = res * i;
         }
         return res;
     }




    public  static void main(String[] args){

    }

}
