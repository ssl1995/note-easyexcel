package com.alibaba.easyexcel.test.demo.write;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * 基础数据类
 *
 * @author Jiaju Zhuang
 **/
@Getter
@Setter
@EqualsAndHashCode
public class DemoExportData {

  @ExcelProperty("权限点名称")
  private String permissionName;

  @ExcelProperty("权限点英文名")
  private String permissionFeature;

  @ExcelProperty("权限点关联的角色")
  private String roleName;

  /*
   * 姓名（工号）
   */
  @ExcelProperty("角色包含员工")
  private String roleEmployee;
}
