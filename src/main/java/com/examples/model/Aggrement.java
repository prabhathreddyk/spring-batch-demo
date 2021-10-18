package com.examples.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Aggrement {

    @Id
    private Integer id;
    private String acai;
    private String acpi;
    private String productcode;
    private String ownershipind;
    private Date time;

    public Aggrement() {
    	
    }

    public Aggrement(Integer id, String acai, String acpi, String productcode, String ownershipind, Date time) {
		super();
		this.id = id;
		this.acai = acai;
		this.acpi = acpi;
		this.productcode = productcode;
		this.ownershipind = ownershipind;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcai() {
		return acai;
	}

	public void setAcai(String acai) {
		this.acai = acai;
	}

	public String getAcpi() {
		return acpi;
	}

	public void setAcpi(String acpi) {
		this.acpi = acpi;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getOwnershipind() {
		return ownershipind;
	}

	public void setOwnershipind(String ownershipind) {
		this.ownershipind = ownershipind;
	}

	public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
		return "ACAI: " + this.getAcai() + ", ACPI: " + this.getAcpi() + ", productcode : " + this.getProductcode();
	}
}
