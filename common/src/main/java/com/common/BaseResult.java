package com.common;

import lombok.Data;

@Data
public class BaseResult {

    //后台返回code：0000表示业务成功，1111表示业务失败
    private String code="0000";

    //后台返回信息，用于前端显示
    private String message="业务执行成功";


}
