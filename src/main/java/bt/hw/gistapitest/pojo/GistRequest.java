package bt.hw.gistapitest.pojo;


import java.util.HashMap;
import java.util.Map;

public class GistRequest {

	private String description;
	private Boolean _public;
	private Files files;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Boolean getPublic() {
		return _public;
	}
	
	public void setPublic(Boolean _public) {
		this._public = _public;
	}
	
	public Files getFiles() {
		return files;
	}
	
	public void setFiles(Files files) {
		this.files = files;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
}