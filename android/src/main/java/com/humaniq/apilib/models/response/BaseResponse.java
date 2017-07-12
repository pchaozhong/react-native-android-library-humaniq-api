package com.humaniq.apilib.models.response;

/**
 * Created by gritsay on 7/12/17.
 */

import com.google.gson.annotations.SerializedName;

/**
 *
 */

public class BaseResponse<T> {
    public String status;
    @SerializedName("error_code")
    public int errorCode;
    public T data;
}

