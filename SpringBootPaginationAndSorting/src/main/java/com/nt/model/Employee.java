package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {
@Id
@Column(name="employeeid")
private long employeeid;
@Column(name="employeename")
private String employeename;
@Column(name="work")
private String work;
@Column(name="address")
private String address;
}
