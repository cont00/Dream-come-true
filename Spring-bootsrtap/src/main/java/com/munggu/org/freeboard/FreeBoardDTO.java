package com.munggu.org.freeboard;

public class FreeBoardDTO {
	private int idx;
    private String title;
    private String content;
    private String regdate;
    private int read_cnt;
    
	@Override
	public String toString() {
		return "FreeBoardDTO [idx=" + idx + ", title=" + title + ", content=" + content + ", regdate=" + regdate
				+ ", read_cnt=" + read_cnt + "]";
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getRead_cnt() {
		return read_cnt;
	}
	public void setRead_cnt(int read_cnt) {
		this.read_cnt = read_cnt;
	}
    
    
}
