package bt.hw.gistapitest.pojo;

import java.util.HashMap;
import java.util.Map;

public class File1Txt {

private String content;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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