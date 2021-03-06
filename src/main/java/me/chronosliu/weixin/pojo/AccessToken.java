package me.chronosliu.weixin.pojo;
/**
 * AccessToken 凭证
 * 
 * @author ChronosLiu
 * @date 2017年8月1日 下午8:02:43
 */
public class AccessToken {

	/**
	 * 获取到的凭证
	 */
	private String access_token;
	/**
	 * 凭证有效时间，单位：秒 7200
	 */
	private int expires_in;
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public int getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}
	
}
