package com.code.TimeUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:TimeUtil
 * Package:com.code.TimeUtil
 * Description:
 *
 * @Date: 2020/5/14 0014 22:20
 * @Author:YAP
 */
public class TimeUtil {
    //传入你想要设置的参数即可 id为表中最后一行的id
    public   static String order(int  NeedId,String type){
        String  id=NeedId*1+1+"";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String[] time=df.format(new Date()).split("\\-");
        String times="";
        String strings=null;
        for (String xx:time){ times+=xx; }
        if(id.length()>=4){
            strings=type+times+id;
        }else if(id.length()==3){
            strings=type+times+"0"+id;
        }else if(id.length()==2){
            strings=type+times+"00"+id;
        }else{
            strings=type+times+"000"+id;
        }
        return  strings;
    }
}
