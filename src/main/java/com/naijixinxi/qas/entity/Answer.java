package com.naijixinxi.qas.entity;

public class Answer {
	private int id;
	private int qid;
	private String content;
	private String answeruser;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAnsweruser() {
		return answeruser;
	}
	public void setAnsweruser(String answeruser) {
		this.answeruser = answeruser;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", qid=" + qid + ", content=" + content + ", answeruser=" + answeruser + "]";
	}
	
}
