/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class App {
    public static void main(String[] args) throws Exception {
        
		Scanner scn = new Scanner(System.in);
        Printer obj = new Printer();
        
        //in
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan nama anda : ");
        String nama = scn.next();
        obj.setNama("nama");
        System.out.print("Mau cetak nama berapa kali? : ");
        int jmlCetak = scn.nextInt();
        
        //out
        obj.setNama(nama);
        obj.setJmlCetak(jmlCetak);
        obj.cetak(nama);
        obj.cetak(jmlCetak, nama);
    }
}
