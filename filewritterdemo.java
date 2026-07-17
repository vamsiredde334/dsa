import java.io.FileWriter;
import java.io.IOException;
public class filewritterdemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("student.txt",true);
        fileWriter.write("vamsi/n");
        fileWriter.write("rahul/n");
        fileWriter.write("rahul/n");

        fileWriter.close();;
        System.out.println("data writen sucessfully");
    }
}
