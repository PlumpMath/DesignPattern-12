package com.subrata.adapter;

public class TransactionWriter implements CustomLogger {
	   MediaAdapter mediaAdapter; 

	   @Override
	   public void writeToLogFile(int type, String fileName) {		

	      //inbuilt support to play mp3 music files
	      if(type == CustomLogger.LOG_TYPE_TEXT){
	         System.out.println("**********Subrata :: Writing the text ->"+fileName+"<- to debug.log file !!");
	      } 
	      //mediaAdapter is providing support to play other file formats
	      else if(type == CustomLogger.LOG_TYPE_PRINTER 
	         || type == CustomLogger.LOG_TYPE_MAIL){
	         mediaAdapter = new MediaAdapter(type);
	         mediaAdapter.writeToLogFile(type, fileName);
	      }
	      else{
	         System.out.println("**********Subrata :: Invalid type "+
	            type + " format not supported !!");
	      }
	   }   
	}
