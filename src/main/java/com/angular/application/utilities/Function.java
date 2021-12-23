/**
 * 
 */
package com.angular.application.utilities;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * @author MadhanRandy
 *
 */
public final class Function {

	public static <T> Object fromXML(String xml, Class<T> type) throws JAXBException {
		var reader = new StringReader(xml);
		var jaxbcontext = JAXBContext.newInstance(type);
		var unmarshall = jaxbcontext.createUnmarshaller();
		return unmarshall.unmarshal(reader);
	}

}
