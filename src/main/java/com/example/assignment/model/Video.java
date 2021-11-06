package com.example.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="video")
public class Video {
@Id
@Column(name="video_id")
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
@Column(name="video_name")
private String name;
@Column(name="author")
private String auther;
@Column(name="copies")
private Integer copies;
@Column(name="price")
private Float price;
@Column(name="restrictions")
private Integer restrictions;
@Column(name="video_cat_id")
private Integer vcatid;
public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAuther() {
return auther;
}
public void setAuther(String auther) {
this.auther = auther;
}
public Integer getCopies() {
return copies;
}
public void setCopies(Integer copies) {
this.copies = copies;
}
public Float getPrice() {
return price;
}
public void setPrice(Float price) {
this.price = price;
}
public Integer getRestrictions() {
return restrictions;
}
public void setRestrictions(Integer restrictions) {
this.restrictions = restrictions;
}
public Integer getVcatid() {
return vcatid;
}
public void setVcatid(Integer vcatid) {
this.vcatid = vcatid;
}
}
