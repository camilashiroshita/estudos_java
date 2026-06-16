importar java.útil.Scanner ;
 
public class Exercise3 {   
    public static void main ( String [] args ) {   
        Scanner scanner = novo Scanner ( System.in);
        int numberOfRows = scanner.nextInt ( ) ;
 
        for ( int i = 1 ; i <= númeroDeLinhas ; i ++) {   
            for ( int j = 1 ; j <= i ; j ++) {   
                System.out.print ( j );
            }
            System.out.println ( );
        }
        
        scanner.fechar ( ) ;
    }
}

