/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.io.File;
import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author egor
 */
public class CommentPage {
    private HTMLDocument webPage;
    public CommentPage() {
        JEditorPane p = new JEditorPane();
        p.setContentType("text/html");
        p.setText("..."); // Document text is provided below.
        //Scanner s = new Scanner(new File("../"));
        //webPage = (HTMLDocument) p.getDocument();
        
        
    }
    public String getContent() {
        //return webPage.toString();
        return "Hi";//new File(".").getAbsolutePath();
    }
}
