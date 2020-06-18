package com.beer.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	@XmlElement(required=true)
	private String name;
	
	@XmlElement(required=true)
	private String cpf;
	
	@XmlElement(required=true)
	private boolean isAdmin;
	
	public User(String name, String cpf, boolean isAdmin) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.isAdmin = isAdmin;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", cpf=" + cpf + ", isAdmin=" + isAdmin + "]";
	}
}
