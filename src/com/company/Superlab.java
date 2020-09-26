package madeira.cs;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Superlab {

    public static void main(String[] args) {


       try {
           File myObj = new File ("C:\\Users\\artemis\\Downloads\\artistList.txt");
           Scanner myReader = new Scanner(myObj);
           int numberOfLines = myReader.nextInt();
           String temp = myReader.nextLine();

           String [] fullLinesFromFile = new String [numberOfLines];
           Artist [] newArtist = new Artist [numberOfLines];

           int counter = 0;

           while (myReader.hasNextLine()) {
               fullLinesFromFile[counter] = myReader.nextLine();
               counter++;
           }
           myReader.close();

           counter = 0;

           for (String line: fullLinesFromFile) {
               newArtist [counter] = new Artist();
               newArtist [counter].setName(line.split(",")[0]);
               newArtist [counter].setAlbum(line.split(",")[2]);
               newArtist [counter].setTwitterHandle(line.split(",")[1]);

            Scanner theirRating = new Scanner(System.in);
            newArtist [counter].setRating(theirRating.nextInt());


            System.out.println(newArtist[counter].getName());
            System.out.println(newArtist[counter].getAlbum());
            System.out.println(newArtist[counter].getTwitterHandle());
            System.out.println(newArtist[counter].getRating());

           }

       }
       catch (FileNotFoundException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
       }


    }
}

class Artist {
    String name;
    String album;
    String twitterHandle;
    int rating;

    public Artist () {
        name = "N/A";
        album = "N/A";
        twitterHandle = "N/A";
        rating = 0;
    }

    public void setName (String newName) {
        name = newName;
    }
    public String getName () {
        return name;
    }
    public void setAlbum (String newAlbum) {
        album = newAlbum;
    }
    public String getAlbum () {
        return album;
    }
    public void setTwitterHandle (String newTwitterHandle) {
        album = newTwitterHandle;
    }
    public String getTwitterHandle () {
        return twitterHandle;
    }




    public void setRating (int rating1) {
        rating = rating1;
    }
    public int getRating () {
        return rating;
    }

}

//I think there might be some error with the printing of the album but I did what I could ¯\_(ツ)_/¯//