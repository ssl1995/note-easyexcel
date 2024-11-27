package com.alibaba.easyexcel.test.demo.read;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class RoleRelationEmployeeVo {

  @ExcelProperty(value = {"系统名称"})
  private String businessName;

  /**
   * 角色名
   */
  @ExcelProperty(value = {"角色名"})
  private String roleName;

  /**
   * 角色关联员工
   */
  @ExcelProperty(value = {"角色关联员工"})
  private String employeeName;

  /**
   * 员工工号
   */
  @ExcelProperty(value = {"员工工号"})
  private String employeeNumber;
}
