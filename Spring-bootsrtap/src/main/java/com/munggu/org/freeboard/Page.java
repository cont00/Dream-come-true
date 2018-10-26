package com.munggu.org.freeboard;

public class Page {
	private int rownum;
	private int pagenum;
	private int rowcnt;
	private int pagecnt;
	
	public int getPagecnt() {
		return pagecnt;
	}

	public void setPagecnt(int pagecnt) {
		this.pagecnt = pagecnt;
	}

	public int getRowcnt() {
		return rowcnt;
	}

	public void setRowcnt(int rowcnt) {
		this.rowcnt = rowcnt;
	}

	@Override
	public String toString() {
		return "Page [rownum=" + rownum + "]";
	}

	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}
	
}
