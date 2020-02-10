import java.io.*;
import java.util.*;

public class removeFromList {
    public static void main(String[] args) throws Exception {

        ArrayList<String> emails = new ArrayList<String>();
        ArrayList<String> remover = new ArrayList<String>();

        File file = new File("emails.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            emails.add(data);
            //System.out.println(data);
        }
        reader.close();

        File file2 = new File("emailsARemover.txt");
        Scanner reader2 = new Scanner(file2);
        while (reader2.hasNextLine()) {
            String data = reader2.nextLine();
            remover.add(data);
            //System.out.println(data);
        }
        reader2.close();

        for (int i = 0; i < remover.size(); i++) {
            for (int j = 0; j < emails.size(); j++) {
                if (remover.get(i).equals(emails.get(j))) {
                    //System.out.println(emails.get(j));
                    emails.remove(j);
                }
            }
        }

        //System.out.println("====================================================================================");
        for (int p = 0; p < emails.size(); p++) {
            System.out.println(emails.get(p));
        }
    }
}