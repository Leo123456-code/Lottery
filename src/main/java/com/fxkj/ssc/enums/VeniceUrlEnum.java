package com.fxkj.ssc.enums;

/**
 * @author Karl
 * @version 1.0.0
 * @ClassName DSInterfaceEnum.java
 * @Description ds电子游戏接口枚举
 * @createTime 2019年05月10日 11:43:00
 */
public enum VeniceUrlEnum {

    /**
     * 注册用户
     */
    CREATE_ACCOUNT("/createAccount", "注册用户"),
    /**
     * 登录游戏
     */
    START_GAME("/startGame", "登录游戏"),

    /**
     * 充值
     */
    RECHANGE("/rechange", "充值"),

    /**
     * 提现
     */
    WITHDRAW("/withdraw", "提现"),
    /**
     * 获取开通游戏列表
     */
    GET_GAME_LIST("/getGameList", "获取开通游戏列表"),
	/**
	 * 获取开通游戏列表
	 */
	GET_GAME_USER_MESSAGE("/getUserAccount", "获取对应游戏用户信息");

    private String url;
    private String desc;

    private VeniceUrlEnum(String url, String desc) {
        this.url = url;
        this.desc = desc;
    }

    /**
     * @return 获取 url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param 设置  url 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return 获取 desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param 设置  desc 
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
