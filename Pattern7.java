public class Pattern7 {

// Z 
// Y Z 
// X Y Z 
// W X Y Z 
// V W X Y Z 
// U V W X Y Z 
// T U V W X Y Z 
// S T U V W X Y Z 
// R S T U V W X Y Z 
// Q R S T U V W X Y Z 
// P Q R S T U V W X Y Z 
// O P Q R S T U V W X Y Z 
// N O P Q R S T U V W X Y Z 
// M N O P Q R S T U V W X Y Z 
// L M N O P Q R S T U V W X Y Z 
// K L M N O P Q R S T U V W X Y Z 
// J K L M N O P Q R S T U V W X Y Z 
// I J K L M N O P Q R S T U V W X Y Z 
// H I J K L M N O P Q R S T U V W X Y Z 
// G H I J K L M N O P Q R S T U V W X Y Z 
// F G H I J K L M N O P Q R S T U V W X Y Z 
// E F G H I J K L M N O P Q R S T U V W X Y Z 
// D E F G H I J K L M N O P Q R S T U V W X Y Z 
// C D E F G H I J K L M N O P Q R S T U V W X Y Z 
// B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

   public static void main(String[] args) {

    
    int row = 26;

    char ch = 'Z';

        for(int i = 1; i <= row; i++){
            
            char ch1 = ch;

            for(int j =1; j <= i; j++){

                System.out.print(ch1 + " ");
                ch1++;
            }
            ch--;
            System.out.println();
        }
   } 
    
}
