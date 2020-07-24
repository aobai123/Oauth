package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseMessage {
    private Integer code;
    private String message;
    public static ResponseMessage success(){
        return new ResponseMessage(0,"操作成功");
    }
    public static ResponseMessage fail(){
        return new ResponseMessage(99,"操作失败");
    }
}
