package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("genders")
public class genders {
    @TableId(value = "gender_id", type = IdType.AUTO)
    private int genderId;
    private String genderName;
}
