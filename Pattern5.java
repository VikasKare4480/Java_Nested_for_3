public class Pattern5 {

    public static void main(String[] args) {

        // 10 10 10 10 
        // 9 9 9 
        // 8 8 
        // 7 

        
        int row = 4;

        int num = 10;

            for(int i = 1; i <= row; i++){

                for(int j = 1; j <= row-i+1; j++){

                    System.out.print(num + " ");
                }

                System.out.println();
                num--;
            }

    }
    
}
