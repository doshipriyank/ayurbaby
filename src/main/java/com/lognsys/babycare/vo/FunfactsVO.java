package com.lognsys.babycare.vo;

public class FunfactsVO
{
	private int id;

	private int compound_id;

	private String question = "";

	private String answer = "";

	public int getCompound_id()
	{
		return compound_id;
	}

	public void setCompound_id(int compound_id)
	{
		this.compound_id = compound_id;
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
		return "FunfactsVO [id=" + id + ", compound_id=" + compound_id + ", question=" + question + ", answer="
				+ answer + "]";
	}

}
