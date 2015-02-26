package com.relevantcodes.extentreports.markup;

import com.relevantcodes.extentreports.support.*;

class Header implements IHeader {
	private String filePath;
	private Configuration instance;
	
	public Configuration introSummary(String newSummary) {
		String markup = FileReaderEx.readAllText(filePath);
		String pattern = MarkupFlag.get("reportsummary") + ".*" + MarkupFlag.get("reportsummary");
		newSummary = pattern.replace(".*", newSummary); 
		
		String oldSummary = RegexMatcher.getNthMatch(markup, pattern, 0);
		markup = markup.replace(oldSummary, newSummary);
		
		FileWriterEx.write(filePath, markup);
		
		return instance;
	}
	
	public Header(String filePath, Configuration instance) {
		this.filePath = filePath;
		this.instance = instance;
	} 
}
