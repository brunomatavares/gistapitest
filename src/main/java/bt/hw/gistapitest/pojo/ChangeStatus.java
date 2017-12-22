package bt.hw.gistapitest.pojo;

import java.util.HashMap;
import java.util.Map;

public class ChangeStatus {

	private Integer deletions;
	private Integer additions;
	private Integer total;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public Integer getDeletions() {
		return deletions;
	}
	
	public void setDeletions(Integer deletions) {
		this.deletions = deletions;
	}
	
	public Integer getAdditions() {
		return additions;
	}
	
	public void setAdditions(Integer additions) {
		this.additions = additions;
	}
	
	public Integer getTotal() {
		return total;
	}
	
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}