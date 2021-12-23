package com.angular.application.configuration;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author MadhanRandy
 *
 */
@XmlRootElement(name = "queries")
public class QueriesDTO {
	private List<QueryDTO> queries;

	/**
	 * @return the queries
	 */
	@XmlElement(name = "query", type = QueryDTO.class)
	public List<QueryDTO> getQueries() {
		return queries;
	}

	/**
	 * @param queries the queries to set
	 */
	public void setQueries(List<QueryDTO> queries) {
		this.queries = queries;
	}

}
