import java.io.*;

public class FileHandlingPro {
    public static void main (String[] args) throws IOException {
        String filepath = "C:\\Users\\shubhangi anil khose\\IdeaProjects\\Abc\\src\\data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        //Check File Exist
        File f=new File("C:\\\\Users\\\\shubhangi anil khose\\\\IdeaProjects\\\\Abc\\\\src\\\\data.txt");
        if (f.exists()){
            System.out.println("File Exist");
        }

        //create file
        File f2=new File("C:\\\\Users\\\\shubhangi anil khose\\\\IdeaProjects\\\\Abc\\\\src\\\\Demo.txt");
        if (f2.createNewFile())
        {
            System.out.println("File Created");
        }


        //Write Text in file
        FileWriter writer = new FileWriter("C:\\\\Users\\\\shubhangi anil khose\\\\IdeaProjects\\\\Abc\\\\src\\\\data.txt");
        writer.write("Hello, File!");
        writer.close();

        //Read from a file
        BufferedReader reader = new BufferedReader(new FileReader("C:\\\\Users\\\\shubhangi anil khose\\\\IdeaProjects\\\\Abc\\\\src\\\\data.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();


        //Delete a file
        File file = new File("Demo.txt");
        if (file.delete()) {
            System.out.println("Deleted");
        }

    }

}