package com.android.jtblk.client.bean;

import com.android.jtblk.utils.Utils;

public class Memo {
	private String memoData;
	private String memoType;
	public String getMemoData() {
		return memoData;
	}
	public void setMemoData(String memoData) {
		this.memoData = Utils.hexStrToStr(memoData);;
	}
	public String getMemoType() {
		return memoType;
	}
	public void setMemoType(String memoType) {
		this.memoType = memoType;
	}
	
	

}
