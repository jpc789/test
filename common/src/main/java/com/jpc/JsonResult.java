package com.jpc;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class JsonResult implements Serializable{
	private Boolean success;
	private String message;
	private Object data;
}
