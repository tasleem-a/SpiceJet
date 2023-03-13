package com.spicejet.genericLibrary;

public enum PropertyKeyData {
	BROWSER ("browser"), URL ("url"), TIMEOUT ("timeout"),FURL("furl");
	private String keys;
	//setter
	/**
	 * this constructor is used to set the keys
	 * @param keys
	 */
	private PropertyKeyData(String keys)
	{
		this.keys=keys;
	}
	//getter
	/**
	 * This method is used to get the actual sheet name
	 * @return
	 */
	public String convertToString()
	{
		return keys.toString();
	}

}
