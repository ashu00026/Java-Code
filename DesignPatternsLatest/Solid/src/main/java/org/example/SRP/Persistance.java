package org.example.SRP;

import org.example.SRP.Journal;

import java.io.*;

public class Persistance {
    public void saveToFile(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {
        if(overwrite||new File(fileName).exists()){
            try(PrintStream out=new PrintStream(fileName)){
                out.println(journal.toString());
            }

        }
    }

    public void appendToFile(String textToAppend,String filePath) throws IOException {
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath,true))){
            writer.write(textToAppend);
            writer.newLine();
        }
    }

    public void readFile(String FilePath) throws IOException {
        try(BufferedReader reader=new BufferedReader(new FileReader(FilePath))){
            StringBuilder wholeContent=new StringBuilder();
            String line=reader.readLine();
            while(line!=null){
                wholeContent.append(line).append("\n");
                line=reader.readLine();
            }
            System.out.println(wholeContent);
        }
    }

    public void testing(String fileName)throws IOException{
        try(FileOutputStream writer=new FileOutputStream(fileName,true)){
            byte[]theBytes="abcdefgh".getBytes();
//            System.out.println(theBytes);
            for(byte x:theBytes){
                System.out.println(x);
            }
            writer.write(theBytes);

        }
    }


}
