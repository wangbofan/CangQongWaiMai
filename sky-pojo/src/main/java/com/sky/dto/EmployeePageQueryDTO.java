package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    private String name;

    //页码,可以理解为起点
    private int page;

    //每页显示记录数
    private int pageSize;

}
