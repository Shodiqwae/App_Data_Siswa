import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int pilihan = 0;
        Scanner data = new Scanner(System.in);
        
        Data data1 = new Data();
        
        data1.tambahData( 121, "Jarwo", "Cilodong", 62763248);
        data1.tambahData( 123, "Slamet", "Jati Jajar", 6276900);
        data1.tambahData( 129, "Jarwoy", "Cilodongo", 62583973);
        
        
       do {
        System.out.println("Menu Data: ");
        System.out.println("1. Tambah Data Siswa");
        System.out.println("2. Cari Data Siswa");
        System.out.println("3. Edit Data Siswa");
        System.out.println("4. Hapus Data Siswa");
        System.out.println("Jumlah Data :" + data1.jumlahdata());
        System.out.print("Masukkan Pilihan: ");
        int menu = data.nextInt(); 
        data.nextLine();
        
        switch (menu) {
            case 1 :
            System.out.print("Masukkan NIPD: ");
            int NIPD = data.nextInt();
            System.out.print("Masukkan Nama: ");
            String NamaSiswa = data.next();
            System.out.print("Masukkan Alamat: ");
            String Alamat = data.next();
            System.out.print("Masukkan No Telepon: ");
            int noTelepon = data.nextInt();
            

            Siswa anakBaru = new Siswa(NIPD, NamaSiswa, Alamat, noTelepon);
            data1.tambahSiswa(anakBaru);
            System.out.println("data telah ditambahkan");
            break;
            case 2:
            
            System.out.print("Cari data Nama siswa : " );
            String NamaSiswacari = data.nextLine();
            Siswa siswacari = data1.cariSiswa(NamaSiswacari);
            if (siswacari != null) {
                System.out.println(siswacari);
            }
            else {
                System.out.println("Data Siswa Tidak ada");
                
            } 
            break;
            
            
            case 3 :
            System.out.println("Masukkan Nama Siswa yang ingin kamu ubah: ");
            String SiswaUpdate = data.nextLine();
            Siswa updateData = data1.cariSiswa(SiswaUpdate);
            if (updateData != null) {
                System.out.print("Masukkan NIPD baru: ");
                NIPD = data.nextInt();
                System.out.print("Masukkan Nama baru: ");
                NamaSiswa = data.next();
                System.out.print("Masukkan Alamat baru: ");
                Alamat = data.next();
                System.out.print("Masukkan No Telepon baru: ");
                noTelepon = data.nextInt();

                Siswa dataBaru = new Siswa( NIPD, NamaSiswa, Alamat, noTelepon);
                if (data1.editData(SiswaUpdate, dataBaru)) {
                  System.out.println("Data Siswa telah diubah");
                }
                else{
                    System.out.println("Data Siswa tidak berhasil diubah");
                }

            } else {
                System.out.println("Data Siswa tidak ditemukan");
            }

           break;
           case 4:
           System.out.print("Masukkan Nama siswa yang akan dihapus: ");
           String NamaHapus = data.nextLine();
           if (data1.hapusSiswa(NamaHapus)) {
               System.out.println("Data siswa telah dihapus.");
           } else {
               System.out.println("Tidak menemukan Data Siswa");
           }
           break;

            default:
                break;
        }
       } while (pilihan != 4);
    }
}
