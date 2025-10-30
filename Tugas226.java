import java.util.Scanner;

public class Tugas226 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n (minimal 3): ");
            n = sc.nextInt();

            if (n < 3) {
                System.out.println("Nilai n kurang dari 3! Silakan input ulang.\n");
            }
        } while (n < 3);

        for(int i=1; i<=n; i++) {
            System.out.print(n+"  ");
            } 
        System.out.println();       
            
        for(int i=1; i<=n-2; i++) {    
            System.out.print(n+" ");
            for(int j=1; j<=n; j++) {
                System.out.print("  ");
            }
            System.out.println(n+"  ");
        }
        
        for (int i=1; i<=n; i++) {
            System.out.print(n+"  ");
        }
        System.out.println();
    }
  
}
