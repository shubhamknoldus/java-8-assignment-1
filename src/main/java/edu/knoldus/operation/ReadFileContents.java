package edu.knoldus.operation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFileContents {
    Map<String, Integer> initialMap;
    public ReadFileContents(){
        initialMap = new HashMap<>();
    }
     public Map<String, Integer> returnWordCount() {
         FileReader fr= null;
         try {
             fr = new FileReader("/home/knoldus/Desktop/fileJava.txt");
             BufferedReader br=new BufferedReader(fr);
             String readLine;
             while((readLine = br.readLine()) != null){
                 String[] arr = readLine.split(" ");
                 int i = 0;
                 while( i < arr.length){
                     if(initialMap.containsKey(arr[i])){
                         initialMap.put(arr[i], initialMap.get(arr[i]) + 1);
                     } else {
                         initialMap.put(arr[i], 1);
                     }
                     i++;
                 }


             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return initialMap;
     }
}
