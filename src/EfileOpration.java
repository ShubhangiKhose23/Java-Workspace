import java.io.*;
import java.util.Scanner;

public class EfileOpration
{
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\shubhangi anil khose\\IdeaProjects\\Abc\\src\\Userinput.txt";
        Scanner sc=new Scanner(System.in);

        try (FileWriter fw = new FileWriter(filePath, true)) {
            System.out.println("Enter Something Here ");
            String text = sc.nextLine();
            fw.write(text + System.lineSeparator());
            fw.write("New Log Entry\n");
            System.out.println(text);
        }
        catch (IOException io)
        {
            System.out.println(io.getMessage());
        }


        //Display
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line=br.readLine())  != null){
                System.out.println(line);
            }
        }
        catch (IOException io)
        {
            System.out.println(io.getMessage());
            io.printStackTrace();
        }

       //List Files in a Directory
        File folder = new File("C:\\Users\\shubhangi anil khose\\IdeaProjects\\Abc\\src");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }

    }
}
