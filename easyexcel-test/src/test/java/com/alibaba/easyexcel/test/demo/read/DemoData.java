package com.alibaba.easyexcel.test.demo.read;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * permissionName	permissionFeature	role	employeeName	employeeWorknumber
 *
 * @author Jiaju Zhuang
 **/
@Getter
@Setter
@EqualsAndHashCode
public class DemoData {
  private String permissionName;
  private String permissionFeature;
  private String roleName;
  private String employeeName;
  private String employeeWorkNumber;
}
