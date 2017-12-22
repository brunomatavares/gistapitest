package bt.hw.gistapitest.pojo;


import java.util.HashMap;
import java.util.Map;

public class RingErl {

private Integer size;
private String rawUrl;
private String type;
private String language;
private Boolean truncated;
private String content;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Integer getSize() {
return size;
}

public void setSize(Integer size) {
this.size = size;
}

public String getRawUrl() {
return rawUrl;
}

public void setRawUrl(String rawUrl) {
this.rawUrl = rawUrl;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getLanguage() {
return language;
}

public void setLanguage(String language) {
this.language = language;
}

public Boolean getTruncated() {
return truncated;
}

public void setTruncated(Boolean truncated) {
this.truncated = truncated;
}

public String getContent() {
return content;
}

public void setContent(String content) {
this.content = content;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}