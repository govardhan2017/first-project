package COM.GOVA;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class StudentXmlTOObject {

	public static void main(String []Args) throws JAXBException
	{
		try{
		File file=new File("E:/gova/gova.xml");
		JAXBContext jaxbcontextObj=JAXBContext.newInstance();
		Unmarshaller jaxbunmars=jaxbcontextObj.createUnmarshaller();
	    Student stud=(Student) jaxbunmars.unmarshal(file);
	    System.out.println(stud.getId()+" "+stud.getName()+" "+stud.getBranch()+" "+stud.getMarks());
	    
	}
	catch(JAXBException e){
		e.printStackTrace();
	}
	}
}
