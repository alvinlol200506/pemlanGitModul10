import java.io.File;

public class DeleteFIle {
    public static void main(String[] args) {
        File dir = new File("C:/Users/Alvin/Desktop/JavaProject/test.txt"); // mengarahkan dir ke path file ini
        File[] files = dir.listFiles(); // array diisi dengan file file di dalam direktori
        if (files != null){
            for (File file : files){ // untuk setiap file di dalam direktori
                file.delete(); // hapus satu per satu
            }
        }
        if (dir.delete()){ // kalau dah kehapus kasihtahu kalau berhasil
            System.out.println("Direktori sudah dihapusssssss");
        } else { // kalau gagal bilang kalau gagal
            System.out.println("Direktori gagal dihapus :(");
        }
    }
}
