package COM.GOVA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class StudentObjToXml {
	public static void main(String args[]) throws JAXBException, FileNotFoundException
	{
		JAXBContext contextObj=JAXBContext.newInstance(Student.class);
		Marshaller marshallerObj=contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Student stud=new Student(1, "gova", "IT", 65);
		Student stud1=new Student(2, "madhu", "ece", 69);
		marshallerObj.marshal(stud, new FileOutputStream("E:/gova/gova.xml"));
		marshallerObj.marshal(stud1, new FileOutputStream("E:/gova/gova.xml"));

	}

}
