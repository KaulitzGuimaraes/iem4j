package com.github.eyce9000.iem.api.relevance.results;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import com.bigfix.schemas.besapi.RelevanceAnswer;
import com.github.eyce9000.iem.api.serialization.ResultAnswerAdapter;
import com.github.eyce9000.iem.api.serialization.ResultAnswerAdapter.Answer;

@XmlType(name = "Query")
@XmlRootElement(name="BESAPI")
@XmlAccessorType(XmlAccessType.FIELD)
public class QueryResult {
	@XmlPath("Query/@Resource")
	private String query;

	@XmlPath("Query/Result/Tuple")
    protected List<ResultTuple> results = new ArrayList<ResultTuple>();
	
	@XmlPath("Query/Result/Answer")
	@XmlJavaTypeAdapter(value=ResultAnswerAdapter.class)
	protected List<Object> singleResultAnswer = new ArrayList<Object>();
	
	@XmlPath("Query/Evaluation")
	private QueryEvaluation evaluation;

	@XmlPath("Query/Error/text()")
	private String error;
	
	public String getQuery() {
		return query;
	}

	public List<ResultTuple> getPluralResults() {
		return results;
	}
	public List<Object> getSingleResults(){
		return singleResultAnswer;
	}
	public QueryEvaluation getEvaluation() {
		return evaluation;
	}

	public String getError() {
		return error;
	}
}
