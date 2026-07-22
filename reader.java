import java.io.FileReader;
import java.io.IOException;
public class reader {
    public static void main(String[] args) throws IOException{
        FileReader reader=new FileReader("student.txt");
        int ch;
        while((ch=reader.read())!=-1){
        System.out.println((char)ch);
        }
    reader.close();
    }
}
