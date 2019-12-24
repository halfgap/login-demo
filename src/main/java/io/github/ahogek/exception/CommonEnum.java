package io.github.ahogek.exception;

public enum CommonEnum implements BaseErrorInfoInterface {
	// 数据操作错误定义
	SUCCESS("200", "成功！"),
	BODY_NOT_MATCH("400", "请求的数据格式不符！")
	;
	
	private String resultCode;
	
	private String resultMsg;
	
	CommonEnum(String resultCode, String resultMsg) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}
	
	@Override
	public String getResultCode() {
		// TODO Auto-generated method stub
		return resultCode;
	}

	@Override
	public String getResultMsg() {
		// TODO Auto-generated method stub
		return resultMsg;
	}

}
