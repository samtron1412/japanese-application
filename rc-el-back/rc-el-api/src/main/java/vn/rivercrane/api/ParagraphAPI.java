package vn.rivercrane.api;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.util.StringUtils;

import vn.rivercrane.dao.ParagraphDao;
import vn.rivercrane.dto.TestJaxB;
import vn.rivercrane.service.ParagraphSentenceService;
import vn.rivercrane.service.ParagraphService;
import vn.rivercrane.service.SentenceService;

/**
 * Paragraph API
 * @author Luong.Tuong
 *
 */

@Path("/paragraph")
public class ParagraphAPI {
	
	  private ParagraphService paragraphService;
	  private SentenceService sentenceService;
	  private ParagraphSentenceService paragrapSentenceService;
	  
	  @POST
	  @Produces(MediaType.TEXT_HTML)
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response addNewParagraph(
	      @FormParam("level") String level,
	      @FormParam("contentJapanese") String contentJapanese,
	      @FormParam("contentTranslate") String contentTranslate,
	      @FormParam("lang") String lang,
	      @FormParam("userCreated") String userCreated,
	      @FormParam("saveDraft") String saveDraft,
	      @Context HttpServletResponse servletResponse) throws IOException {
		// Kiem tra co save Draft , neu true thi luu vao bang temp(chua design)
		//Truong hop submit => da qua cong doan validate.
		String[] contentArraySentence;
		//Phan tich tung cau
		if (StringUtils.hasLength(contentJapanese)) {
			contentArraySentence = contentJapanese.split(".");
		}
		return Response.status(200).entity("success").build();

		//Insert paragraph 
		
		
		//Get Id paragraph
		
		//Insert sentence one by one.
		
		//Get sentence id 
		
		
		//Combine id paragraph and sentence insert to sentence paragraph
		
		
		//tra ve flag cho user
		
		
//	    Todo todo = new Todo(id, summary);
//	    if (description != null) {
//	      todo.setDescription(description);
//	    }
//	    TodoDao.instance.getModel().put(id, todo);
//
//	    servletResponse.sendRedirect("../create_todo.html");
	  }
	  
//	public Response addNewParagraph() {
//		TestJaxB test = new TestJaxB();
//		test.setId("this is Id");
//		test.setMessage("This is message");
//		test.setGood(true);
//		
//		return Response.status(200).entity(test).build();
// 
//	}	
}
