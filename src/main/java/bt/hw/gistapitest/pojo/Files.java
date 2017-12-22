package bt.hw.gistapitest.pojo;


import java.util.HashMap;
import java.util.Map;

public class Files {
	private File1Txt file1Txt;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public File1Txt getFile1Txt() {
	return file1Txt;
	}

	public void setFile1Txt(File1Txt file1Txt) {
	this.file1Txt = file1Txt;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}


}