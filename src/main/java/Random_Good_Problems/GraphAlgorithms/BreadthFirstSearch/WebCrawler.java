package main.java.Random_Good_Problems.GraphAlgorithms.BreadthFirstSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

    Queue<String> queue;
    List<String> discoveredWebsites;


    WebCrawler() {
        this.queue = new LinkedList<>();
        this.discoveredWebsites = new ArrayList<>();
    }


    public void crawl(String website) {

        this.queue.add(website);
        this.discoveredWebsites.add(website);

        while (!queue.isEmpty()) {
            String visitedWebsite = queue.poll();

            String rawHTML = readURL(visitedWebsite);

            String regex = "(http|ftp|https):\\/\\/([\\w_-]+(?:(?:\\.[\\w_-]+)+))([\\w.,@?^=%&:\\/~+#-]*[\\w@?^=%&\\/~+#-])";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(rawHTML);

            while (matcher.find()) {
                String discoveredWebsite = matcher.group();

                if (!discoveredWebsites.contains(discoveredWebsite)) {
                    discoveredWebsites.add(discoveredWebsite);
                    System.out.println(" A new Website has been Crawled : " + discoveredWebsite);
                    queue.add(discoveredWebsite);

                }
            }
        }
    }

    private String readURL(String visitedWebsite) {

        StringBuilder rawHTML = new StringBuilder("");

        try {
            URL url = new URL(visitedWebsite);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line = "";

            while ((line = br.readLine()) != null) {
                rawHTML.append(line);
            }
        } catch (Exception e) {
            System.out.println("Some problem occurred while crawling the website : ");
        }

        return rawHTML.toString();
    }

    public static void main(String[] args) {
        WebCrawler webCrawler = new WebCrawler();
        webCrawler.crawl("https://www.news18.com/");
    }
}
