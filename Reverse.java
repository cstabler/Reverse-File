import java.io.*;
import java.util.*;

/**
 *  A class that reads a file from the command line
 * and writes it to new file while reversing it
 *
 *@author Colleen Stabler
 *@date Fri Dec 8 2017
 */

public class Reverse {

  public static void main(String[] args) {

    List<String> array = new ArrayList<String>(); // create array
    File f = new File(args[0]); // save file 'f' as what we input second on the command line
    String line;

    try {
      BufferedReader file = new BufferedReader(new FileReader(f)); // read the file into a BufferedReader
      while ((line = file.readLine()) != null) { //while there is a next line
        array.add(line); //add the line to the array
      }
      file.close(); //close the file
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    try{
    BufferedWriter a = new BufferedWriter(new FileWriter(args[0])); //write the file
      for (int i = 0; i < array.size(); i++) { //go through element of the array
        line = array.get(i); // save each element of the array in line
        StringBuffer input = new StringBuffer(line); // add it to StringBuffer
        a.write(input.reverse().toString()); // reverse it and write it
        a.newLine(); // indicate that it's a new line now
      //  System.out.println(input.reverse());
      }
      a.close(); // close a
    }
    catch(IOException e) {
      e.printStackTrace();
    }

    // cat homework.txt will print it 

  }
}
