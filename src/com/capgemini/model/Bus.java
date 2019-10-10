package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BUSDETAILS")
public class Bus {
	
	@Id
	@Column(name="BUSID")
	private int busid;
	@Column(name="BUSTRAVELNAME")
	private String bustravelname;
	@Column(name="SOURCE")
	private String source;
	@Column(name="DESTINATION")
	private String destination;
	@Column(name="AVAILABLESEATS")
	private int availableseats;
	@Override
	public String toString() {
		return "Bus [busid=" + busid + ", bustravelname=" + bustravelname
				+ ", source=" + source + ", destination=" + destination
				+ ", availableseats=" + availableseats + "]";
	}
	public int getBusid() {
		return busid;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	public String getBustravelname() {
		return bustravelname;
	}
	public void setBustravelname(String bustravelname) {
		this.bustravelname = bustravelname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
}
