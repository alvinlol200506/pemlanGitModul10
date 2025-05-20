import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TulisFile1 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.print("Masukkan teks yang akan disimpan: ");
        var text = keyboard.nextLine();
        try (var writer = new FileWriter("test.txt", true)) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Gagal menulis ke file");
        }
    }
}

/*
Yang terjadi ketika append di FileWriter kita set sebagai false maka ketika kita inputkan maka file
sebelumnya akan teroverwrite dengan yang baru. Tetapi ketika kita ganti appendnya menjadi true file
sebelumnya akan ditambah dengan yang baru di kanannya tetapi tidak ada spasinya, jadi misalnya yang pertama bilang
yogurt, keduanya bilang HIDUP JOKOWI maka akan muncul yogurtHIDUP JOKOWI
 */