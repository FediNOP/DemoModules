

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        try {

            StringBuilder sb = new StringBuilder();
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            String[] commands = new String[]{"/bin/sh", "-c", command};
            try {
                Process proc = new ProcessBuilder(commands).start();
                BufferedReader stdInput = new BufferedReader(new
                        InputStreamReader(proc.getInputStream()));

                BufferedReader stdError = new BufferedReader(new
                        InputStreamReader(proc.getErrorStream()));
			
		System.out.println(true);
                String s = null;
                while ((s = stdInput.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }

                while ((s = stdError.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
		
		System.out.println(sb.toString());

            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
