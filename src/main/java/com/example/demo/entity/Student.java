package com.example.demo.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("student")
public class Student {

    /*主键*/
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

    private Integer score;

}

