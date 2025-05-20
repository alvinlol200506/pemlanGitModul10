import java.io.File;

public class GetFileSize {
    public static void main(String[] args) {
        File file = new File("test.txt"); // ngarahin file ke path test.txt
        long sizeInBytes = file.length();
        if (sizeInBytes < 1024 * 1024) { // 1 mb adalah 1024 * 1024 jadi dicek apakah kurang dari 1 mb or nah
            System.out.printf("Ukuran: %.2f KB%n", sizeInBytes / 1024.0); // kalau kurang dari 1 mb bakal nunjukin kb (cuman dibagi 1024 sekali)
        } else {
            System.out.printf("Ukuran: %.2f MB%n", sizeInBytes / (1024.0 * 1024.0 )); // kalau lebih dari 1 mb bakal nunjukin mb (dibagi 1024 dua kali)
        }
    }
}
