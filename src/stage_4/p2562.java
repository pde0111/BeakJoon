package stage_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p2562 {
    public static void main(String[] args) throws IOException {
        List<Integer> intList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while ((str = br.readLine()) != null){
            intList.add(Integer.parseInt(str));
        }
        int max = intList.get(0);
        int n = 0;
        for (int i=1; i < intList.size() ; i++){
            max = max > intList.get(i) ? max : intList.get(i);
        }
        for (int i=0; i < intList.size()-1 ; i++){
            if (max == intList.get(i)) n = i+1;
        }
        br.close();
        sb.append(max).append("\n").append(n);
        System.out.println(sb);
    }
}