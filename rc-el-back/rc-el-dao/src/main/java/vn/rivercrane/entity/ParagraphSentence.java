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
 * sentence
 * @author Luong.Tuong
 *
 */

@XmlRootElement
@Entity()
@Table(name="tbl_paragraph_sentence")
public class ParagraphSentence implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4009427100254585736L;

	@Id
	@Column(name = "sentence_id")
	@TableGenerator(name = "appSeqStore", table = "APP_SEQ_STORE", pkColumnName = "APP_SEQ_NAME", pkColumnValue = "TRACSACTIONS.ID", valueColumnName = "APP_SEQ_VALUE", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "appSeqStore")
	private int paragraphSentenceId;
	
	@ManyToOne
	@Column(name="paragraph_id")
	private Paragraph paragraph;

	@ManyToOne
	@Column(name="sentence_id")
	private Sentence sentence;
	
	@Column(name="order")
	private int order;
	
	@Column(name="sentence_del_flg")
	private int sentenceDelFlg;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="register_user_id")
	private  int registerUserId;
	
	@Column(name="update_date")
	private Date updateDate;
	
	@Column(name="update_user_id")
	private int updateUserId;
	
	@Column(name="tbl_paragraph_sentencecol")
	private String tblParagraphSentencecol;

	public int getParagraphSentenceId() {
		return paragraphSentenceId;
	}

	public void setParagraphSentenceId(int paragraphSentenceId) {
		this.paragraphSentenceId = paragraphSentenceId;
	}

	public Paragraph getParagraph() {
		return paragraph;
	}

	public void setParagraph(Paragraph paragraph) {
		this.paragraph = paragraph;
	}

	public Sentence getSentence() {
		return sentence;
	}

	public void setSentence(Sentence sentence) {
		this.sentence = sentence;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getSentenceDelFlg() {
		return sentenceDelFlg;
	}

	public void setSentenceDelFlg(int sentenceDelFlg) {
		this.sentenceDelFlg = sentenceDelFlg;
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

	public String getTblParagraphSentencecol() {
		return tblParagraphSentencecol;
	}

	public void setTblParagraphSentencecol(String tblParagraphSentencecol) {
		this.tblParagraphSentencecol = tblParagraphSentencecol;
	}
	
	
}
