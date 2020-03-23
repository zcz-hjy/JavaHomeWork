package demo01;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\JAVASE文档\\了不起的盖茨比英文.txt");
        File targetFile = new File("D:\\JAVASE文档\\统计.txt");
        Map<String, Integer> map = new HashMap<>();
        try (Reader r = new FileReader(sourceFile);
             BufferedReader br = new BufferedReader(r);
             BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
             ) {
            while (true) {
                String line = br.readLine();
                if (null == line) {
                    break;
                }
                String[] stirngArray = line.trim().split(" +");
                for (String word : stirngArray) {
                    if(word != System.getProperty("line.separator")) {
                        if (!map.containsKey(word)) {
                            map.put(word, 1);
                        } else {
                            map.put(word, map.get(word) + 1);
                        }
                    }
                }
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list,(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2)->
            {  return o2.getValue()-o1.getValue();});

            for(Map.Entry<String, Integer> entry: list){

                    String outString = entry.getKey() + "\t" + entry.getValue();
                    bw.write(outString);
                    bw.newLine();

            }
           /* System.out.println(list.get(0).getKey() =="");
*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

