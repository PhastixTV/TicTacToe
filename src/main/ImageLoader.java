package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgX, imgO;

    public ImageLoader() {
        try {
            imgX = ImageIO.read(new File("ressource/images/x.png"));
            imgO = ImageIO.read(new File("ressource/images/o.png"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
