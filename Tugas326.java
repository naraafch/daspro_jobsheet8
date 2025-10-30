import java.util.Scanner;

public class Tugas326 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Jumlah Cabang Kafe: ");
        int cabang= sc.nextInt();
        System.out.println("\n===== Input Penjualan Per Cabang =====");

        int i, totalPelanggan=0, itemTotal=0;
        for(i=1; i<=cabang; i++) {
            System.out.print("\n--- Cabang "+i+ "---");
            System.out.print("\nJumlah Pelanggan: ");
            int pelanggan= sc.nextInt();
            totalPelanggan+=pelanggan;

            int totalItem=0, j;
            for (j=1; j<=pelanggan; j++) {
                System.out.print("- Pelanggan "+j+" memesan berapa item?: ");
                int item= sc.nextInt();
                totalItem+=item;
                itemTotal+=totalItem;
            }
            System.out.print("Cabang "+i+": ");
            System.out.print("\n- Pelanggan: "+pelanggan);
            System.out.print("\n- Item terjual: "+totalItem);
        }
        System.out.println("\n\nTotal Seluruh Cabang: ");
        System.out.println("Pelanggan: "+totalPelanggan);
        System.out.println("Item terjual: "+itemTotal);
    }
    
}
