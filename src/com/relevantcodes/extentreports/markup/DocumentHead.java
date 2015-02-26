package com.relevantcodes.extentreports.markup;

import com.relevantcodes.extentreports.support.FileReaderEx;
import com.relevantcodes.extentreports.support.FileWriterEx;

class DocumentHead implements IDocumentHead {
	private String filePath;
	private Configuration instance;
	
	public Configuration addCustomStylesheet(String cssFilePath) {
		String link = "<link href='file:///" + cssFilePath + "' rel='stylesheet' type='text/css' />";
		String markup = FileReaderEx.readAllText(filePath)
						.replace(MarkupFlag.get("customcss"), link + MarkupFlag.get("customcss"));
		
		FileWriterEx.write(filePath, markup);
		
		return instance;
	}
	
	public Configuration addCustomStyles(String styles) {
		styles = "<style type='text/css'>" + styles + "</style>";
		String markup = FileReaderEx.readAllText(filePath)
						.replace(MarkupFlag.get("customcss"), styles + MarkupFlag.get("customcss"));
		
		FileWriterEx.write(filePath, markup);
		
		return instance;
	}
	
	public DocumentHead(String filePath, Configuration instance) {
		this.filePath = filePath;
		this.instance = instance;
	} 
}
