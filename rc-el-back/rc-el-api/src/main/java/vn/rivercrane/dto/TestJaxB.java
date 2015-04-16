package vn.rivercrane.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Test DTO
 * @author Ha.Thanh
 *
 */

@XmlRootElement
public class TestJaxB {
	
	private String id;
	private String message;
	private boolean isGood;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isGood() {
		return isGood;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	
	
}
