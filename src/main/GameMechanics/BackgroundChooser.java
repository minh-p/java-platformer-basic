package GameMechanics;

/*
 * This class gets a background by image name or random.
 * Automatically making it resized as well.
*/

import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.Image;

public class BackgroundChooser {
    private int backgroundWidth;
    private int backgroundHeight;
    private String imagesDirectory = "";

    public BackgroundChooser(int w, int h, String imgsDir) {
        backgroundWidth = w;
        backgroundHeight = h;
        imagesDirectory = imgsDir;
    }

    public ImageIcon getImage(String imageName) {
        ImageIcon imageIcon = null;

        // Finding and returning the image if it exists.
        // Else, throw a beautiful IOException
        try {
            File sourceImage = new File(imagesDirectory + imageName);
            Image image = ImageIO.read(sourceImage);
            imageIcon = new ImageIcon(image);
        } catch(IOException e) {
            System.out.println(
                "From BackgroundChooser: "
                + "No Image found With Name In Declared Directory."
            );
            System.out.println("imagesDirectory path: " + imagesDirectory);
        }

        return imageIcon;
    }
}
