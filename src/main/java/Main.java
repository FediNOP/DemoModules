import javafx.beans.binding.StringBinding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            Process proc = new ProcessBuilder(sc.next()).start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(proc.getErrorStream()));


            StringBuilder sb = new StringBuilder();

            String s;
            while ((s = reader.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }

            while ((s = errorReader.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }

            reader.close();

        }catch (Exception e){

            e.printStackTrace();

        }


    }



}
