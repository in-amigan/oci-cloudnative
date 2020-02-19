package mushop.shipping.entities;

import java.util.UUID;

import org.json.JSONObject;

/*
 * 
 */
public class Shipment {
    private String id;
    private String name;

    /*
     * 
     */
    public Shipment() {
        this("");
    }

    /*
     * 
     */
    public Shipment(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    /*
     * 
     */
    public Shipment(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
     * 
     */
    public JSONObject ToJson() {
    	JSONObject json = new JSONObject();
    	json.put("id", id);
    	json.put("name", name);
    	return json;
    }
    
    /*
     * 
     */
    @Override
    public String toString() {
        return ToJson().toString();
    }

    /*
     * 
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shipment shipment = (Shipment) o;
        return getId() != null ? getId().equals(shipment.getId()) : shipment.getId() == null;
    }

    /*
     * 
     */
    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    /*
     * 
     */
    public String getId() {
        return id;
    }

    /*
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /*
     * 
     */
    public String getName() {
        return name;
    }

    /*
     * 
     */
    public void setName(String name) {
        this.name = name;
    }
}