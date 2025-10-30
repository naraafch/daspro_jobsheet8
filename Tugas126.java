import java.util.Scanner;

public class Tugas126 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n= sc.nextInt();

        int i=1;
        while(i<=n) {
            System.out.print("n: "+i+" -> Jumlah Kuadrat = ");

            int j=1;
            int jumlah=0;
            while(j<=i) {
                int kuadrat= j*j;
                jumlah+=kuadrat;

                if (j==1) {
                    System.out.print(kuadrat);
                } else {
                    System.out.print(" + "+kuadrat);
                } j++;
            }
            System.out.println(" = "+jumlah);
            i++;
        }
        
    }
    
}
