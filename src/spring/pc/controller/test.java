package spring.pc.controller;


import org.codehaus.jettison.json.JSONObject;

import static com.mothod.MD5Util.twiceMD5;

public class test {
    public static void main(String agres[]){
        String s = twiceMD5("8888888");
        System.out.print(s);
        JSONObject json = new JSONObject();
    }
}