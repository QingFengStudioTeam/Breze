package com.breze.entity.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class UpdatePasswordDTO implements Serializable {

	@NotBlank(message = "新密码不能为空")
	private String password;

	@NotBlank(message = "旧密码不能为空")
	private String currentPass;
}
