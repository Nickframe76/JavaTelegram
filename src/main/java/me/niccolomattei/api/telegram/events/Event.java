package me.niccolomattei.api.telegram.events;

public class Event {
	
	private String name;
	
	public Event() { }
	
	public String getEventName() {
		if(name == null) this.name = getClass().getSimpleName();
		return this.name;
	}

}
