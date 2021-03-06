package huhu.com.qrfore.Util;

/**
 * Created by Huhu on 5/5/16.
 * 常量类
 */
public class Config {
    //判断是否联网的标志
    public static Boolean isOnline = true;
    //判断离线保存人员的个数
    public static int DisOnlineCoun = 0;
    //字符集
    public static final String CHARSET = "utf-8";
    //服务器地址
    public static final String LOCALHOST = "121.250.219.167";
    //登陆接口
    public static final String URL_LOGIN = "http://" + LOCALHOST + ":8080/servlet/SignLogin";
    //签到接口
    public static final String URL_SIGN = "http://" + LOCALHOST + ":8080/servlet/SignIn";
    //显示人员信息
    public static final String URL_SHOW_DETAIL = "http://" + LOCALHOST + ":8080/servlet/PersonInfo";
    //结束签到
    public static final String URL_CUT = "http://" + LOCALHOST + ":8080/servlet/SignOver";
    //刷新
    public static final String URL_REFRESH = "http://" + LOCALHOST + ":8080/servlet/Refresh";
    //签到清零
    public static final String URL_CLEAR = "http://" + LOCALHOST + ":8080/servlet/Clear";
    //判断当前签到点是否有会议
    public static Boolean hasMeeting = false;
    //注册接口
    public static final String URL_REGISTER = "http://" + LOCALHOST + ":8080/servlet/RegistSign";
    //当前会议的信息"=
    public static String MID;
    public static String MNAME;
    public static String MSTARTTIME;
    public static String MENDTIME;
    public static String MCONTENT;
    public static String MCOUNT;
    //当前签到点信息
    public static String SING;
    //当前已经签到的人数
    public static int hasSign = 0;
    //签到开始时间
    public static String MSTART;
    //签到结束时间
    public static String MEND;


}
