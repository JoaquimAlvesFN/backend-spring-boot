package com.trixlog.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Rota {

	@Id
	private String id;
	
	private String name;
	
	private String encodedPath;
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEncodedPath() {
		return encodedPath;
	}

	public void setEncodedPath(String encodedPath) {
		this.encodedPath = encodedPath;
	}
}
