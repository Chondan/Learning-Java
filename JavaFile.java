import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFile {
    public static class FileHandle {
        // ----- Java File Handling
        // The File class from the java.io package, allow us to work with files.
        // To use the File class, create an object of the class, and specify the filename or directory
        private static File myFile = new File("./txt/test.txt");
        public static void showFileLength() {
            System.out.println(myFile.length());
        }
        // ----- Java Create and Write To Files
        // --- Create a File
        // To create a file in Java, you can use the createNewFile() method. This method returns a boolean value true
        // if the file was successfully created, and false if the file already exist. 
        // Note that the method is enclosed in a try...catch block. This is necessary because  it throws an IOException if an error occurs (if the file cannot be created for some reason)
        public static void createFile(String fileDirectory) {
            try {
                File newFile = new File(fileDirectory);
                if (newFile.createNewFile()) {
                    System.out.println("The file was created.");
                } else {
                    System.out.println("The file is already exist.");
                }
            } catch (IOException e) {
                System.out.println("An error occure.");
                e.printStackTrace();
            }
        }
        // To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the '\' character (for window)
        // On Mac and Linux you can just write  the path, like /Users/name/filename.txt
        
        // --- Write to a file
        public static void writeFile(String fileDirectory, String fileContent) {
            try {
                FileWriter writeFile = new FileWriter(fileDirectory);
                writeFile.write(fileContent);
                writeFile.close();
                System.out.println("Successfully wrote  to the file");
            } catch (IOException e) {
                System.out.println("An error occure.");
                e.printStackTrace();
            }
        }
        // --- Java Read Files
        // We use the Scanner class to read the contents of the text file we created in the previous chapter.
        public static void readFile(String fileDirectory) {
            try {
                File readFile = new File(fileDirectory);
                Scanner myReader = new Scanner(readFile);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }    
        }
        public static File getFile(String fileDirectory) {
            return new File(fileDirectory);
        }
        // ----- Delete Files
        public static void deleteFile(String fileDirectory) {
            File deleteFile = new File(fileDirectory);
            if (deleteFile.delete()) {
                System.out.println("Deleted the file: " + deleteFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
    public static void main(String[] args) {
                
        // FileHandle.showFileLength();
        // FileHandle.createFile("./txt/helloword.txt");
        // FileHandle.writeFile("./txt/greeting.txt", "Hola! Como estads?");
        FileHandle.readFile("./txt/test.txt");

        // --- Get File Information
        File file1 = FileHandle.getFile("./txt/helloword.txt");
        if (file1.exists()) {
            System.out.println("File name: " + file1.getName());
            System.out.println("Absolute  path: " + file1.getAbsolutePath());
            System.out.println("Writeable: " + file1.canWrite());
            System.out.println("Readable: " + file1.canRead());
            System.out.println("File size in bytes " + file1.length());
            System.out.print("File content: ");
            FileHandle.readFile(file1.getAbsolutePath());
        } else {
            System.out.println("The file does not exist.");
        }

        // ---- Delete Files
        // FileHandle.writeFile("./txt/thisFileWillBeDeleted.txt", "Pleas!!!");
        // FileHandle.deleteFile("./txt/thisFileWillBeDeleted.txt");

        // -- You can also delete a folder. However, it must be empty.
        // FileHandle.deleteFile("./folder");

        
        
        
    }


    
}