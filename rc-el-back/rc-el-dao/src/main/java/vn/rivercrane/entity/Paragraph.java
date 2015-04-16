package vn.rivercrane.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
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
@Entity()
@Table(name="tbl_paragraph")
public class Paragraph implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4850608514906129929L;

	@Id
	@Column(name = "paragraph_id")
	@TableGenerator(name = "appSeqStore", table = "APP_SEQ_STORE", pkColumnName = "APP_SEQ_NAME", pkColumnValue = "TRACSACTIONS.ID", valueColumnName = "APP_SEQ_VALUE", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "appSeqStore")
	private int paragraphId;
	
	@Column(name="level")
	private String level;
	
	@Column(name="paragraph_del_flg")
	private int paragraphDelFlg;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="register_user_id")
	private  int registerUserId;
	
	@Column(name="update_date")
	private Date updateDate;
	
	@Column(name="update_user_id")
	private int updateUserId;
	
	@ManyToOne 
	private ParagraphSentence paragraphSentence;
	
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
	public ParagraphSentence getParagraphSentence() {
		return paragraphSentence;
	}

	public void setParagraphSentence(ParagraphSentence paragraphSentence) {
		this.paragraphSentence = paragraphSentence;
	}
	
}
