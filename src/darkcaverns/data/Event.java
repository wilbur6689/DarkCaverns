/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkcaverns.data;

import java.io.Serializable;

/**
 *
 * @author wibur
 */
public class Event implements Serializable {
    
    String eventType;
    String locationType;
    String eventName;
    String eventDescription;
  

    public Event(String eventType, String locationType, String Name, String description) {
        this.eventType = eventType;
        this.locationType = locationType;
        this.eventName = Name;
        this.eventDescription = description;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    
    
}
