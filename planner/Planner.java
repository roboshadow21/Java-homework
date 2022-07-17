package planner;

import java.io.*;


public class Planner {

    public static void importTask(String path, String data, User info, ID id) throws IOException {
        FileWriter f = new FileWriter(path, true);
        f.write(Integer.toString(id.id));
        f.write(" ");
        f.write(data + " " + info.name + " " + info.surname + "\n");
        f.close();
    }

    public static void exportTask() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.csv"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();

    }


}
