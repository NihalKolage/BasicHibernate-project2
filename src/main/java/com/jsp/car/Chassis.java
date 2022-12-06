package com.jsp.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chassis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int chassis_id;
	public int getChassis_id() {
		return chassis_id;
	}
	public void setChassis_id(int chassis_id) {
		this.chassis_id = chassis_id;
	}
	public long getChassis_number() {
		return chassis_number;
	}
	public void setChassis_number(long chassis_number) {
		this.chassis_number = chassis_number;
	}
	private long chassis_number;

}
