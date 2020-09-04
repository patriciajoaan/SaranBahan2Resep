 import java.util.Scanner;
 


/**
 *
 * @author WINDOWS 10
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String identitas = "Patricia Joan Duanty Angeline / X RPL 4 / 35";
    
        System.out.println("Identitas: "+identitas);
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan Anda");
        int bahan1 = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            }else{
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.println("Masukkan no pilihan Anda :");
            int bahan2 = scanner.nextInt();
            
         }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "
                    + "tidak dapat memberikan saran resep");
        int bahan2 = scanner.nextInt();
        
        if (bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println(
                            "Anda dapat membuat milk shake banana"); break;
                    case 2: System.out.println(
                            "Anda dapat membuat pisang goreng"); break;
                    case 3: System.out.println(
                            "Anda dapat membuat telur rebus");
                } 
            
            
        }else     
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "
                + "tidak dapat memberikan saran resepp");
        
}
    
}
