package org.WebCrawler_BFS;

import java.io.*;
import java.net.*;
import java.util.Set;
import java.util.regex.*;


public class WebCrawler {
    
    public static void main(String[] args){
    	
    	String firstWebsite = "https://www.bvaeb.at/";
    	String patterns = "http[s]*://(\\w+\\.)*(\\w+)";

    	
    	BFS myCrawler = new BFS(firstWebsite, 60, patterns);
    	 
        try{
        	Set<String> urlsCrawled = myCrawler.bfs();
        	
        	 System.out.println(urlsCrawled.size() + " web sites crawled!");
        	 System.out.println("Here is the list: ");
             for(String s : urlsCrawled){
                 System.out.println(s);
             
             }
        }catch(IOException e){
            System.out.println("IOException: " + e);
        }
    }


}