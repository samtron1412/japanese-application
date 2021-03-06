package vn.rivercrane.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Create the following data model and a Singleton 
 * which serves as the data provider for the model. 
 * We use the implementation based on an enumeration. Please see the link for details. The Todo class is annotated with a JAXB annotation. 
 * See Java and XML to learn about JAXB.
 * Paragraph
 * @author Luong.Tuong
 *
 */

@XmlRootElement
public class Paragraph {
	
	private int paragraphId;
	private String level;
	private int paragraphDelFlg;
	private Date createDate;
	private  int registerUserId;
	private Date updateDate;
	private int updateUserId;
	
	public Paragraph(int paragraphId, String level, int paragraphDelFlg,
			Date createDate, int registerUserId, Date updateDate,
			int updateUserId) {
		this.paragraphId = paragraphId;
		this.level = level;
		this.paragraphDelFlg = paragraphDelFlg;
		this.createDate = createDate;
		this.registerUserId = registerUserId;
		this.updateDate = updateDate;
		this.updateUserId = updateUserId;
	}
	public int getParagraphId() {
		return paragraphId;
	}
	public void setParagraphId(int paragraphId) {
		this.paragraphId = paragraphId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getParagraphDelFlg() {
		return paragraphDelFlg;
	}
	public void setParagraphDelFlg(int paragraphDelFlg) {
		this.paragraphDelFlg = paragraphDelFlg;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getRegisterUserId() {
		return registerUserId;
	}
	public void setRegisterUserId(int registerUserId) {
		this.registerUserId = registerUserId;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(int updateUserId) {
		this.updateUserId = updateUserId;
	}
	
	
}
