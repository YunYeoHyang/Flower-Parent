package com.flower.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class BaseResult {

    private Map<String,Object> data = new HashMap<>();

    /**
     * 返回状态码与状态信息
     * @param errno
     * @param errmsg
     */
    public BaseResult(Integer errno, String errmsg) {
        data.put("errno" , errno);
        data.put("errmsg" , errmsg);
    }

    /**
     * 追加数据
     * @param key
     * @param msg
     * @return
     */
    public BaseResult append(String key , Object msg){
        data.put(key , msg);
        return this;
    }
}
