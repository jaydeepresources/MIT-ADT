package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carId;
	private String carRegNo;
	private String carModel;
	private String carManufacturer;
	private String carColor;

	public Car() {

	}

	public Car(int carId, String carRegNo, String carModel, String carManufacturer, String carColor) {
		super();
		this.carId = carId;
		this.carRegNo = carRegNo;
		this.carModel = carModel;
		this.carManufacturer = carManufacturer;
		this.carColor = carColor;
	}

	public Car(int carId, String carModel, String carManufacturer) {
		super();
		this.carId = carId;
		this.carModel = carModel;
		this.carManufacturer = carManufacturer;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarRegNo() {
		return carRegNo;
	}

	public void setCarRegNo(String carRegNo) {
		this.carRegNo = carRegNo;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarManufacturer() {
		return carManufacturer;
	}

	public void setCarManufacturer(String carManufacturer) {
		this.carManufacturer = carManufacturer;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carRegNo=" + carRegNo + ", carModel=" + carModel + ", carManufacturer="
				+ carManufacturer + ", carColor=" + carColor + "]";
	}

}
