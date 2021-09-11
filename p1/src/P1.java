public class P1 {

    public static void main (String []arg){

        int count=5;
        for(int i=1;i<=5;i++){

            for(int j=1;j<=count;j++){
                System.out.print("#");
            }
            count-=1;
            System.out.println("");
        }

    }
}
