import java.util.ArrayList;

public class Data {
    private ArrayList<Siswa> DataSiswa;
    
    public Data(){
       DataSiswa = new ArrayList<>();

    }
    public int jumlahdata(){
        return DataSiswa.size();
    }
    

    public void tambahData( Integer NIPD, String NamaSiswa, String Alamat, Integer No_telepon){
        DataSiswa.add(new Siswa(NIPD, NamaSiswa, Alamat, No_telepon));
    }
    public void tambahSiswa(Siswa siswa) {
        DataSiswa.add(siswa);
    }
    

    
    public boolean hapusSiswa(String NamaSiswa) {
        Siswa siswa = cariSiswa(NamaSiswa);
        if (siswa != null) {
            DataSiswa.remove(siswa);
            return true;
        }
        return false;
    }


    public Siswa lihatdata(Integer index){
        return DataSiswa.get(index);
    }
    public Siswa cariSiswa(String NamaSiswa){
        for (Siswa murid : DataSiswa){
            if (murid.getNamaSiswa().contains(NamaSiswa)){
                return murid;
            }
        }
        return null;
    }
    public boolean editData(String NamaSiswa, Siswa dataBaru) {
        Siswa dataLama = cariSiswa(NamaSiswa);
        if (dataLama != null) {            dataLama = dataBaru;
            return true;
        }
        return false;
    }
   
}