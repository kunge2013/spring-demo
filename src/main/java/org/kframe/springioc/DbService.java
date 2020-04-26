package org.kframe.springioc;

public class DbService implements IDbService {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void save() {
		System.out.println("save method ......" + this.name);
	}
	
}
