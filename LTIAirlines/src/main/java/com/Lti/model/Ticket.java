package com.Lti.model;

import java.time.LocalDateTime;

public class Ticket {
	LocalDateTime date;
   int TId;
   String name;
public int getTId() {
	return TId;
}
public void setTId(int tId) {
	TId = tId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
   
}
