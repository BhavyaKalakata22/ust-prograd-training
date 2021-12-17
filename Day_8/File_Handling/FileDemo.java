import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args)throws IOException {
        File file = new File("Demo");
//        System.out.println(file.canRead());//it checks the file is present or not, if yes returns true
//        System.out.println(file.createNewFile());
//        System.out.println(file.delete());
        System.out.println(file.mkdir());
        System.out.println(file.length());
        System.out.println(file.delete());
    }
}