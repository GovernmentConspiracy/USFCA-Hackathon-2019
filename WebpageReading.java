
import javax.swing.text.Document;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WebpageReading {

    public static void main(String[] args) {

        try {
            String current = "https://www.reddit.com/r/RoastMe/comments/ba7b2x/24_yo_dropped_out_of_college_left_the_military/";
            URL url = new URL(current);

            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            boolean display = true;
            while ((line = in.readLine()) != null) {
//                if (line.contains("<body"))
//                    display = true;
                if (display)
                    System.out.println(line);
//                if (line.contains("</body"))
//                    display = false;
            }
            in.close();

        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }

}

