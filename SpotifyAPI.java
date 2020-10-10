import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class SpotifyAPI {

    private static HttpURLConnection connection;
    public static void main(String[] args)
    {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {

            URL url = new URL("https://accounts.spotify.com/authorize");
            java.awt.Desktop.getDesktop().browse(URI.create("spotify:artist:5K4W6rqBFWDnAN6FQUkS6x"));


            connection = (HttpURLConnection) url.openConnection();

            // Request Setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if(status > 299)
            {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null)
                {
                    responseContent.append(line);
                }
                reader.close();
            }else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null)
                {
                    responseContent.append(line);
                }
                reader.close();
            }
                System.out.println(responseContent.toString());
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
            connection.disconnect();
        }
    }
}
