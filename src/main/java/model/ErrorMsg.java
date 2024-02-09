package model;

import java.io.Serializable;

public class ErrorMsg implements Serializable{
  private String msg;
  
  public ErrorMsg(String msg) {
	  this.msg = msg;
  }

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}
  
}
