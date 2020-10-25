import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println("Hi");
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        String searchString [] ={"Java","Javascript"};
        HtmlPage htmlPage = webClient.getPage("https://google.com");
        DomElement htmlForm = htmlPage.getElementById("tsf");
   /*     for (int i = 0; i < searchString.length; i++) {*/

System.out.println(htmlForm);
     /*   }*/
        System.out.println(htmlPage.asText());
    }
}
