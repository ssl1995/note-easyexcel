package com.alibaba.easyexcel.test.demo.read;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class WorkNumberVo {

  /**
   * 员工工号
   */
  @ExcelProperty(value = {"工号"})
  private String employeeNumber;

}
