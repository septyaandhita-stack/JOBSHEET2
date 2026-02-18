public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs = new Mahasiswa23();
        mhs.nama = "Septya Andhita Pradhana";
        mhs.nim = "254107060038";
        mhs.kelas = "SI 2J";
        mhs.ipk = 3.55;

        mhs.tampilkanInformasi();
        mhs.ubahKelas("SI 2K");
        mhs.updateIpk(3.60);
        mhs.tampilkanInformasi();
        


        


    }
}
