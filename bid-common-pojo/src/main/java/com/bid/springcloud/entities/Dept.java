 
package com.bid.springcloud.entities;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@Accessors(chain=true)
@Getter
public class Dept implements Serializable //必须序列化
{
  private Long  deptno;   //主键
  private String  dname;   //部门名称
  private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
  
  public Dept(String dname)
  {
   super();
   this.dname = dname;
  }
  public Dept() {
	// TODO Auto-generated constructor stub
}
  
 
public Long getDeptno() {
	return deptno;
}
public void setDeptno(Long deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDb_source() {
	return db_source;
}
public void setDb_source(String db_source) {
	this.db_source = db_source;
}
}
 
 
