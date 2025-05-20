import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("."); // mengambil path direktori code ini, kalau di laptop saya lagi di folder JavaProject
        String[] files = dir.list(); // masukkan nama masing file file ke array files
        if(files != null){
            for (String file : files){
                System.out.println(file); // setiap file diprintkan
            }
        } else {
            System.out.println("yooooo filenya kosong dawg"); // kalau misal foldernya ndak ada filenya
        }
    }
}
