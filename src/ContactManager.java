import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.nio.*;

/**
 * Created by cstoker on 5/25/17.
 */
public class ContactManager {

  private ArrayList<Contact> dudesList;

  public void getContacts() {
    for (Contact dude : this.dudesList) {
      System.out.println(dude);
    }
  }

  public void add(Contact dude) {
    this.dudesList.add(dude);
  }

  public ContactManager() {
    this.dudesList = new ArrayList<Contact>();
  }

  public void writeDudes() {
    String directory = "contacts";
    String filename = "contacts.txt";
    Path dudes = Paths.get(directory, filename);
    List<String> stringDudes = new ArrayList<>();

    for (Contact dude : this.dudesList) {
     stringDudes.add(dude.toString());
    }
    try {
      Files.write(dudes, stringDudes);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
