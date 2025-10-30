import java.util.Scanner;

public class Tugas326 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Jumlah Cabang Kafe: ");
        int cabang= sc.nextInt();
        System.out.println("\n===== Input Penjualan Per Cabang =====");

        int i, totalPelanggan=0, seluruhItemTotal=0, totalItem=0;
        
        for(i=1; i<=cabang; i++) {
            System.out.print("\n--- Cabang "+i+ "---");
            System.out.print("\nJumlah Pelanggan: ");
            int pelanggan= sc.nextInt();
            totalPelanggan+=pelanggan;

            int j;
            for (j=1; j<=pelanggan; j++) {
                System.out.print("- Pelanggan "+j+" memesan berapa item?: ");
                int item= sc.nextInt();
                totalItem+=item;
            }

            System.out.print("Cabang "+i+": ");
            System.out.print("\n- Pelanggan    : "+pelanggan);
            System.out.println("\n- Item terjual : "+totalItem);
        }

        seluruhItemTotal+=totalItem;
        System.out.println("\n====== Total Seluruh Cabang ====== ");
        System.out.println("Pelanggan   : "+totalPelanggan+" orang");
        System.out.println("Item terjual: "+seluruhItemTotal);
    }
    
}
