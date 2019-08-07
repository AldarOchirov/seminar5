package part1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class IndexHtmlGenerator {
    static String generateIndexHtml(String dirName){
        File dir = new File(dirName);
        StringBuilder out = new StringBuilder("<html><head></head><body><table>");
        if (dir.isDirectory()){
            File[] filesInDir = dir.listFiles();
            Arrays.sort(filesInDir, new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    if (o1.getName().compareTo(o2.getName()) == -1){
                        return -1;
                    }
                    else{
                        if (o1.getName().compareTo(o2.getName()) == 1){
                            return 1;
                        }
                        else{
                            return 0;
                        }
                    }
                }
                //<td><a href="..">Parent</a></td>
            });
            for (File file : filesInDir){
                out.append("<tr>");
                out.append("<td>");
                out.append("<a ref=\"" + file.getName() +"\">");
                out.append(file.getName());
                out.append("</td>");
                file.lastModified(); //дата последней модификации
                file.length(); // размер в байтах
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        String indexHtml = generateIndexHtml("<your_path>");
        try (FileWriter writer = new FileWriter("index.html")){
            writer.write(indexHtml);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
