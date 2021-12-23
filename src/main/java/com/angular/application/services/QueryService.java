package com.angular.application.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.angular.application.configuration.QueriesDTO;
import com.angular.application.interfaceservices.IQueryService;
import com.angular.application.utilities.Function;

/**
 * @author MadhanRandy
 *
 */
@Service()
public class QueryService implements IQueryService {

	public static final Map<String, String> QUERY_MAP = new HashMap<>();

	@Value("${query.location}")
	private String queryPath;

	@PostConstruct
	public void init() throws IOException, JAXBException {
		byte[] str = Files.readAllBytes(new File(queryPath).toPath());
		String qryStr = new String(str);
		var queries = (QueriesDTO) Function.fromXML(qryStr, QueriesDTO.class);
		queries.getQueries().forEach(qry -> QUERY_MAP.put(qry.getName(), qry.getQuery()));
	}

	@Override
	public String get(String queryName) {
		return QUERY_MAP.get(queryName);
	}

}
