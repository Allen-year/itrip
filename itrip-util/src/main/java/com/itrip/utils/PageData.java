package com.itrip.utils;

import java.util.List;

public class PageData<T> {

	
	public PageData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageData(int pageIndex, int pageSize, int totalCount,
			 List<T> list) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		//������ҳ��
		this.totalPageCount = this.totalCount%this.pageSize==0?
				(this.totalCount/this.pageSize)
				:(this.totalCount/this.pageSize+1);
		this.list = list;

	}
	private int pageIndex;  //��ǰҳ��
	private int pageSize;   //ҳ��С
	private int totalCount;   //������
	private int totalPageCount;  //��ҳ��
	private List<T> list; //ĳһҳ������
	private boolean hasPrevious;   //�Ƿ�����һҳ
	private boolean hasNext;  //�Ƿ�����һҳ
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public boolean isHasPrevious() {
		//�ж��Ƿ�����һҳ
		return this.pageIndex>1;
	}
	public void setHasPrevious(boolean hasPrevious) {
		this.hasPrevious = hasPrevious;
	}
	public boolean isHasNext() {
		
		//�ж��Ƿ�����һҳ
		return this.pageIndex<this.totalPageCount;
	}
	public void setHasNext(boolean hasNext) {
		
		this.hasNext = hasNext;
		
	}
	
	
}
