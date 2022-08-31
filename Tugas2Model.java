package tugas;

public class Tugas2Model {
    private String nama;
    private String alamat;
    private int nik;
    private int tanggal;
    private String vaksin;
    private int hasil;

    public Tugas2Model() {

    }

    public Tugas2Model(String nama, String alamat, int nik, int tanggal, String vaksin, int hasil) {
        this.nama = nama;
        this.alamat = alamat;
        this.nik = nik;
        this.tanggal = tanggal;
        this.vaksin = vaksin;
        this.hasil = hasil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public String getVaksin() {
        return vaksin;
    }

    public void setVaksin(String bul) {
        this.vaksin = bul;
    }

    public int getHasil() {
        return hasil;
    }

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    @Override
    public String toString() {
        return "Tugas2Model{" +
                "nama = '" + nama + '\'' +
                ", alamat = '" + alamat + '\'' +
                ", nik = " + nik +
                ", tanggal = " + tanggal +
                ", vaksin = '" + vaksin + '\'' +
                ", hasil = " + hasil +
                '}';
    }
}
