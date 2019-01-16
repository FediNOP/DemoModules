import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            Process proc = Runtime.getRuntime().exec(sc.next());
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = "";

            while((line = reader.readLine()) != null){

                System.out.println(reader.readLine());

            }

            reader.close();

        }catch (Exception e){

            e.printStackTrace();

        }


    }



}
