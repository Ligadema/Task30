package by.yandex.sidvlada;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

        public static void main(String[] args) throws IOException {

            FileReader fileReader = new FileReader("C:\\Users\\sid-v\\Text.txt");
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sid-v\\Text.txt"));
            String res = reader.readLine();
            ArrayList<Object> text = new ArrayList<>();
            Pattern pattern = Pattern.compile("[,.:;?!-]" + "...");
            int c = 0;
            try {
                reader = new BufferedReader(fileReader);

                while ((res = reader.readLine()) != null) {

                    System.out.println(res);

                    char[] z = res.toCharArray();

                    for (int i = 0; i < z.length; i++) {
                        text.add(z[i]);
                    }
                    System.out.println();

                    Matcher matcher = pattern.matcher(res);
                    while (matcher.find()) {
                        c++;
                    }
                }
            }
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            System.out.println(text);
            System.out.println("Знаки препинания: " + c);
        }
}

