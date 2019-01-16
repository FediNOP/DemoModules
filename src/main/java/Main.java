import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {

        try {

            Process proc = Runtime.getRuntime().exec("ls");
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            while(reader.readLine() != null){

                System.out.println(reader.readLine());

            }


        }catch (Exception e){

            e.printStackTrace();

        }




    }



}
