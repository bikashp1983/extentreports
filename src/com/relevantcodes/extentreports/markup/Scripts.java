package com.relevantcodes.extentreports.markup;

import com.relevantcodes.extentreports.support.FileReaderEx;
import com.relevantcodes.extentreports.support.FileWriterEx;

class Scripts implements IScripts {
	private String filePath;
	private Configuration instance;
	
	public Configuration insertJS(String script) {
		script = "<script type='text/javascript'>" + script + "</script>";
		String markup = FileReaderEx.readAllText(filePath)
						.replace(MarkupFlag.get("customscript"), script + MarkupFlag.get("customscript"));
		
		FileWriterEx.write(filePath, markup);
		
		return instance;
	}
	
	public Scripts(String filePath, Configuration instance) {
		this.filePath = filePath;
		this.instance = instance;
	}
}
