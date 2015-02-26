package com.relevantcodes.extentreports.markup;

public interface IFooter {
	Configuration useExtentFooter(Boolean use);
	
	/**
	 * @deprecated
	 * This method has been deprecated. Use useExtentFooter(false) instead.
	 */
	@Deprecated
	void removeExtentFooter();
	
	/**
	 * @deprecated
	 * This method has been deprecated. Use useExtentFooter(true) instead.
	 */
	@Deprecated
	void addExtentFooter();
} 
