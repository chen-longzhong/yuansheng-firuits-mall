package com.ysdevelop.common.result;

/**
 * 
 * @author OldHuang
 * 
 * @Package com.ysdevelop.result
 * 
 * @Description: 返回给用户的结果的统一格式
 * 
 * @date 2018年4月2日
 * 
 * @version
 * 
 */
public class Result<T> {
	private int code;
	private String msg;
	private T data;
	
	/**
	 *  成功时候的调用
	 * */
	public static  <T> Result<T> success(String msg){
		return new Result<T>(msg);
	}
	
	/**
	 *  成功时候的调用,data设置
	 * */
	public static  <T> Result<T> successData(T data){
		return new Result<T>(data);
	}
	
	/**
	 *  失败时候的调用
	 * */
	public static  <T> Result<T> error(CodeMsg codeMsg){
		return new Result<T>(codeMsg);
	}
	
	private Result(){
		
	}
	
	private Result(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
		
	private Result(T data) {
		this.data = data;
	}
	
	private Result(String msg){
		this.msg = msg;
	}
	
	
	private Result(CodeMsg codeMsg){
		if(codeMsg!=null){
			this.code = codeMsg.getCode();
			this.msg = codeMsg.getMsg();
		}
	}
	

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}

	
	
	

	
	
	
}
