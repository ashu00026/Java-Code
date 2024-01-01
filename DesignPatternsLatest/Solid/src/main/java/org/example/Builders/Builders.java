package org.example.Builders;

import java.util.List;

public class Builders {
    private List<String> words;

    public Builders(List<String>words){
        this.words=words;
    }

    public StringBuilder buildTheList(){
        StringBuilder sb= new StringBuilder();
        sb.append("<ul>\n");
        for(String word:words){
            sb.append(String.format("  <li>%s</li>\n",word));
        }
        sb.append("</ul>");
        return sb;
    }
}
