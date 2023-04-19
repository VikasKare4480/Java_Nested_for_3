// import java.io.PrintStream;

public class Pattern9 {

    // 1 
    // 8 27 
    // 64 125 216 
    // 343 512 729 1000

   public static void main(String[] args) {
    
        int row = 4;
        int num = 1;

        for(int i = 1; i <= row; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(num * num * num + " ");
                num++;
            
            }
            System.out.println();
        }
   } 
    
}
