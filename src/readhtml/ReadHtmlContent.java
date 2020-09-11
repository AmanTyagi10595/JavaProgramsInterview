package readhtml;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ReadHtmlContent {

	public static void main(String args[]) {
		 
        // Parse HTML String using JSoup library
        String HTMLSTring = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>User</title>"
                + "</head>"
                + "<body>"
                + "<table><tr><td><h1>Hello aman</h1>"
                +"<p>this is the paragraph</p>"
                + "</tr>"
                + "</table>"
                + "</body>"
                + "</html>";
 
        Document html = Jsoup.parse(HTMLSTring);
        String title = html.title();
        String h1 = html.body().getElementsByTag("h1").text();
        String p = html.body().getElementsByTag("p").text();

 
        System.out.println("Input HTML String to JSoup :" + HTMLSTring);
        System.out.println("After parsing, Title : " + title);
        System.out.println("Afte parsing, Heading : " + h1);
        System.out.println(p);
 
    }
}
