import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MagicSquare {
    public static void main(String[] args){
        try(BufferedReader Reader = new BufferedReader(new FileReader("Luna.txt"))){
           String line;
           String[] splitline;
           List<Integer> intline = new ArrayList<>();
           while((line = Reader.readLine()) != null){
                int sum = 0;
                splitline = line.split("\t");
                intline.clear();
                for(String s: splitline){
                    if(!s.isEmpty()){
                        intline.add(Integer.valueOf(s));
                    }
                }
                for(int num: intline){
                    sum += num;
                }
                System.out.println(sum);
           }
        }catch (IOException e){
           e.printStackTrace();
        }

    }
}
