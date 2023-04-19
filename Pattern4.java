public class Pattern4{

    // 3C 3C 3C 3C 
    // 3C 3C 3C 
    // 3C 3C 
    // 3C 
    public static void main(String[] args) {

        int row = 4;

            for(int i = 1; i <= row; i++){

                for(int j = row; j >= i; j--){  // (j = 1; j <= row-i+1; j++)
                    System.out.print("3C ");
                }
                System.out.println();
            }
        
    }
}
