/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egor.comment.modules;

/**
 *
 * @author egor
 */
public class CommentPage {
    private final String webPageBeginning = "<!DOCTYPE html>\n" +
"\n" +
"<html>\n" +
"    <head>\n" +
"        <title>Comment page</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <h3>Hey, buddy!\n" +
"            Just enter your text</h3>\n" +
"        \n" +
"        <form action=\"CommentServlet\" method=\"POST\">\n" +
"            <input type=\"text\" name=\"comment\"/>\n" +
"            <input type=\"submit\">\n" +
"        </form>" +
"        <hr>"
            + "\n";
    private final String webPageEnding = "    </body>\n"
            + "</html>";
    private StringBuilder webPage;
    public CommentPage() {
        webPage = new StringBuilder(webPageBeginning);
    }
    public void addComment(String time, String text) {
        webPage.append("<p><cite>" + time + "</p></cite>\n" + text + "\n<hr>");
    }
    public String getContent() {
        return webPage.toString() + webPageEnding;
    }
}
