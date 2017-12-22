package bt.hw.gistapitest.pojo;

import java.util.HashMap;
import java.util.Map;

public class History {

private String url;
private String version;
private User_ user;
private ChangeStatus changeStatus;
private String committedAt;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public User_ getUser() {
return user;
}

public void setUser(User_ user) {
this.user = user;
}

public ChangeStatus getChangeStatus() {
return changeStatus;
}

public void setChangeStatus(ChangeStatus changeStatus) {
this.changeStatus = changeStatus;
}

public String getCommittedAt() {
return committedAt;
}

public void setCommittedAt(String committedAt) {
this.committedAt = committedAt;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}