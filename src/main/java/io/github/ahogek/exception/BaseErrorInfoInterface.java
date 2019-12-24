package io.github.ahogek.exception;

/**
 * 基础错误信息接口
 * 
 * @author AhogeK
 * @since 2019-12-22
 */
public interface BaseErrorInfoInterface {
	
	/** 错误码 */
	String getResultCode();
	
	/** 错误描述 */
	String getResultMsg();
}
