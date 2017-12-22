package bt.hw.gistapitest.pojo;

import java.util.HashMap;
import java.util.Map;

public class Fork {
private User user;
private String url;
private String id;
private String createdAt;
private String updatedAt;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public User getUser() {
return user;
}

public void setUser(User user) {
this.user = user;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public String getUpdatedAt() {
return updatedAt;
}

public void setUpdatedAt(String updatedAt) {
this.updatedAt = updatedAt;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}