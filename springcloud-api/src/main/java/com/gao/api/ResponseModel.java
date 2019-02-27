package com.gao.api;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ResponseModel<K, V extends Object> implements Serializable {
    private String responseCode;
    private String responseMsg;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    private Map<K, V> map = new ConcurrentSkipListMap<> ();

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }

    public void put(K key, V value) {
        map.put (key, value);
        setMap (map);
    }

    public V get(K key) {
        return getMap ().get (key);
    }
}
