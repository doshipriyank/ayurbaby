package com.lognsys.babycare.core.funfacts;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;


@Entity
@Table(name="ayurbaby_funfacts")
public class Facts implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4693139108992809541L;

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="compound_id")
	@JsonBackReference
	private Compound compound;

	private String question;

	private String answer;

	public Compound getCompound()
	{
		return compound;
	}

	public void setCompound(Compound compound)
	{
		this.compound = compound;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getQuestion()
	{
		return question;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public String getAnswer()
	{
		return answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}

	@Override
	public String toString()
	{
		return "FunfactsVO [id=" + id + ", compound_id=" + compound.getId() + ", question=" + question + ", answer="
				+ answer + "]";
	}

}
