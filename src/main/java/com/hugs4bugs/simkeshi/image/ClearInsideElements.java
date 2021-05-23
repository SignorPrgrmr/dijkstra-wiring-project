package com.hugs4bugs.simkeshi.image;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
kole ishi ke lazem di bulasan budi ki bidana object duzadajaxsan hala ya 'File' constructora ver ya 'BufferedImage',
o object usta da methode 'clear()' charajaxsan, TAMAM.

                String loadPath = "";
                String savePath = "";
                BufferedImage img = ImageIO.read(new File(loadPath));
                ClearInsideElements cie = new ClearInsideElements(img);
                cie.clear();
                ImageIO.write(img, "jpg", new File(savePath));

                kole codi da ki niazon di ishlatmagha main da bu tika di ki yazmisham, ya try/catch ichina goy
                 ya da throw exception ela.
    2021-05-23 23:02
 */

public class ClearInsideElements {

    private BufferedImage img;

    public ClearInsideElements() {
    }

    public ClearInsideElements(File file) throws IOException {
        this.img = ImageIO.read(file);
    }

    public ClearInsideElements(BufferedImage img) {
        this.img = img;
    }

    public void clear() {
        operate();
        operate();
        operate();
    }

    private void operate() {
        int side = 8;
        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                int pixel = img.getRGB(x, y);
                if (isBlack(pixel)) {
                    if (vertical(x, y, side) || horizontal(x, y, side)) {
                        Color color = new Color(255, 255, 255);
                        img.setRGB(x, y, color.getRGB());
                    }
                }
            }
        }
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int pixel = img.getRGB(x, y);
                if (!isBlack(pixel)) {
                    Color color = new Color(255, 255, 255);
                    img.setRGB(x, y, color.getRGB());
                }
            }
        }
    }

    private boolean isBlack(int pixel) {
        Color color = new Color(pixel);
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        int rgbColor = 30;
        return (red < rgbColor) && (green < rgbColor) && (blue < rgbColor);
    }

    private boolean vertical(int x, int y, int side) {
        return left(x, y, side) && right(x, y, side);
    }

    private boolean left(int x, int y, int side) {
        int counter = 0;
        if (x >= side) {
            for (int i = side; i > 0; i--) {
                if (counter > side / 2) {
                    return true;
                } else {
                    if (!isBlack(img.getRGB(x - i, y))) {
                        counter++;
                    }
                }
            }
        }
        return false;
    }

    private boolean right(int x, int y, int side) {
        int counter = 0;
        if (x < img.getWidth() - side) {
            for (int i = 1; i < side + 1; i++) {
                if (counter > side / 2) {
                    return true;
                } else {
                    if (!isBlack(img.getRGB(x + i, y))) {
                        counter++;
                    }
                }
            }
        }
        return false;
    }

    private boolean horizontal(int x, int y, int side) {
        return up(x, y, side) && down(x, y, side);
    }

    private boolean up(int x, int y, int side) {
        int counter = 0;
        if (y >= side) {
            for (int i = side; i > 0; i--) {
                if (counter > side / 2) {
                    return true;
                } else {
                    if (!isBlack(img.getRGB(x, y - i))) {
                        counter++;
                    }
                }
            }
        }
        return false;
    }

    private boolean down(int x, int y, int side) {
        int counter = 0;
        if (y < img.getHeight() - side) {
            for (int i = 1; i < side + 1; i++) {
                if (counter > side / 2) {
                    return true;
                } else {
                    if (!isBlack(img.getRGB(x, y + 1))) {
                        counter++;
                    }
                }
            }
        }
        return false;
    }
}