package BUILDER;

public class demoX {
    public static void main(String[] args) {
        String [] words={"hello","world","of","String","builders"};
//        System.out.println("<ul>\n"+"  <li> "+words[0]+" </li>");
//        System.out.println("  <li> "+words[1]+" </li>");
//        System.out.println("</ul> ");

        StringBuilder sb=new StringBuilder();
        sb.append("<ul> \n");
        for(String Word: words){
            sb.append("   <li>"+ Word+"</li> \n");
        }
        sb.append("</ul>");
        System.out.println(sb);

    }
}
