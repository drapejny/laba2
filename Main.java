import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        HashTable hashTable = new HashTable(50);
        FileReader fileReader = new FileReader("words");
        Scanner scan = new Scanner(fileReader);
        for (int i = 0; scan.hasNextLine(); i++) {
            hashTable.add(new Node(scan.nextLine()));
        }
        fileReader.close();
        hashTable.print();
    }
}
