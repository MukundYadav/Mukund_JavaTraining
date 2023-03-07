package exercise7;

import java.io.*;

public class CopyImage12 {
    public static void main(String[] args) {
        try (FileInputStream sourceFile = new FileInputStream("/Users/mukundyadav/Downloads/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg");
             FileOutputStream destFile = new FileOutputStream("/Users/mukundyadav/Downloads/winter-landscape-beautiful-christmas-morning-outdoors-forest-bright-sunshine-sunbeams-panorama-frosty-white-trees-131611498.jpg")) {

            int byteRead;
            while ((byteRead = sourceFile.read()) != -1) {
                destFile.write(byteRead);
            }
        } catch (IOException e) {
        	System.out.println("Error Occured while Copying...");
            System.out.println(e);
        }
    }
}
