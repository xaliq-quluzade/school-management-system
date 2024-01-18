package util;

import java.io.*;

public class FileUtil {
    public static Object readFile(String fileName) {
        Object obj = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            obj = in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }

    public static void writeFile(Object obj, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
