import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Collectors;

public class FileGrabber {

    private final File outputFolder;
    private final File inputFolder;

    public FileGrabber(String outputFolder, String inputFolder){
        this.outputFolder = new File(outputFolder);
        this.inputFolder = new File(inputFolder);
    }

    public void walkAndPrintFiles(File folder){
        try {
            Files.walk(folder.toPath()).forEach(System.out::println);
        }
        catch(IOException e){
            System.out.println("Error Occured");
        }
    }

    public void printFiles(File folder){
        try {
            for (String file: Files.readAllLines(folder.toPath())){
                System.out.println(file);
            }
        }
        catch(IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }

    public void filterWalkPrint(File folder, String pattern){
        try{
            Files.walk(folder.toPath()).filter(fileName -> fileName.toString().contains(pattern)).forEach(System.out::println);
        }
        catch(IOException e){
            e.getCause();
        }
    }

    public File getOutputFolder() {
        return outputFolder;
    }

    public File getInputFolder() {
        return inputFolder;
    }

}
