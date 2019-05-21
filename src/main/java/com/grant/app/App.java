package com.grant.app;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;

public class App
{
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.melon.com/mymusic/dj/mymusicdjplaylistview_inform.htm?plylstSeq=443997103").get();
            Elements tbody = doc.getElementsByTag("tbody");
            System.out.println(tbody);
        } catch (IOException error) {
            System.out.println("LINK NOT FOUND" + error);
    }

    }
}

