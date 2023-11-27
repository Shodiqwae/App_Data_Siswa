public class Siswa {
    private final Integer  NIPD;
    private final String NamaSiswa;
    private final String Alamat;
    private final Integer No_telepon;

    public Siswa(Integer NIPD, String NamaSiswa, String Alamat, Integer No_telepon )
    {
        this.NIPD = NIPD;
        this.NamaSiswa = NamaSiswa;
        this.Alamat = Alamat;
        this.No_telepon = No_telepon;
    }
    

    public Integer getNIPD(){
        return NIPD;
    }

    public String getNamaSiswa(){
        return NamaSiswa;
    }

    public String getAlamat(){
        return Alamat;
    }

    public Integer getNo_Telepon(){
        return No_telepon;
    }
    
  
    @Override
    public String toString(){
        return "NIPD: " + NIPD + ", NamaSiswa: " + NamaSiswa + ", Alamat: " 
        + Alamat + ", No_telepon: " + No_telepon; 
    }
}
