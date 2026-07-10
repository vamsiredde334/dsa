import java.io.FileWriter;
import java.io.IOException;
public class file {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("student.txt",true);
        fileWriter.write("VAMC RED");

        fileWriter.close();;
        System.out.println("data writen sucessfully");
    }
}