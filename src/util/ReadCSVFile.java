package util;


import  java.io.*;
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class ReadCSVFile<T>{

    public List<T> readcsvdata( String url, typeParser<T> parser){
        List<T> importData = new ArrayList<>();
        try {
        Scanner scan = new Scanner(new File(url));
        // get headers
        String[] headers  = splitCSVdata(scan.nextLine());
        while(scan.hasNextLine()){
            String[] rowData =  splitCSVdata(scan.nextLine());
            T data = parser.parse(rowData);
            importData.add(data);
        }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        return importData;

    }

    private String[] splitCSVdata(String nextLine) {
            ArrayList<String> key = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            boolean isQuotes= false;

            
            for(char ch : nextLine.toCharArray()){
                if(ch == '\"'){
                    isQuotes = !isQuotes;
                }
                else if(ch == ',' && !isQuotes){
                    key.add(sb.toString().trim());
                    sb.setLength(0);
                }
                else{
                    sb.append(ch);
                }
            }
            key.add(sb.toString().trim());
            return key.toArray(String[]::new);

    }
}
