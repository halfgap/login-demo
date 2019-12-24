package io.github.ahogek.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;

@Data
@TableName("user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.UUID)
	private String id;
	
	@TableField(value = "name")
	private String name;
	
	@TableField(value = "age")
	private Integer age;
	
	@TableField(value = "email")
	private String email;

}
