package com.gao.api;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class ResponseUtil {
    private static ResponseModel responseModel;
    private AtomicReference<ResponseModel> atomicReference = new AtomicReference<> ();

    static {
        if (Objects.isNull (responseModel)) {
            synchronized (ResponseModel.class) {
                if (Objects.isNull (responseModel)) {
                    System.out.println ("初始化--------------");
                    responseModel = new ResponseModel ();
                }
            }
        }
    }

    public static ResponseModel success() {
        return infomation ("1", "success", null);
    }

    public static ResponseModel success(Object data) {
        return infomation ("1", "success", data);
    }


    public static ResponseModel fail(int code, String msg) {
        return fail (code + "", msg);
    }

    public static ResponseModel fail(String msg) {
        return fail ("1", msg);
    }

    public static ResponseModel fail(String code, String msg) {
        return infomation (code, msg, null);
    }

    private static ResponseModel infomation(String code, String msg, Object data) {
        responseModel.setResponseCode (code);
        responseModel.setResponseMsg (msg);
        responseModel.setData (data);
        return responseModel;
    }


}
