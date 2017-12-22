package bt.hw.gistapitest.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GistResponse {

	private String url;
	private String forksUrl;
	private String commitsUrl;
	private String id;
	private String description;
	private Boolean _public;
	private Owner owner;
	private Object user;
	private Files files;
	private Boolean truncated;
	private Integer comments;
	private String commentsUrl;
	private String htmlUrl;
	private String gitPullUrl;
	private String gitPushUrl;
	private String createdAt;
	private String updatedAt;
	private List<Fork> forks = null;
	private List<History> history = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public String getUrl() {
	return url;
	}
	
	public void setUrl(String url) {
	this.url = url;
	}
	
	public String getForksUrl() {
	return forksUrl;
	}
	
	public void setForksUrl(String forksUrl) {
	this.forksUrl = forksUrl;
	}
	
	public String getCommitsUrl() {
	return commitsUrl;
	}
	
	public void setCommitsUrl(String commitsUrl) {
	this.commitsUrl = commitsUrl;
	}
	
	public String getId() {
	return id;
	}
	
	public void setId(String id) {
	this.id = id;
	}
	
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
	
	public Owner getOwner() {
	return owner;
	}
	
	public void setOwner(Owner owner) {
	this.owner = owner;
	}
	
	public Object getUser() {
	return user;
	}
	
	public void setUser(Object user) {
	this.user = user;
	}
	
	public Files getFiles() {
	return files;
	}
	
	public void setFiles(Files files) {
	this.files = files;
	}
	
	public Boolean getTruncated() {
	return truncated;
	}
	
	public void setTruncated(Boolean truncated) {
	this.truncated = truncated;
	}
	
	public Integer getComments() {
	return comments;
	}
	
	public void setComments(Integer comments) {
	this.comments = comments;
	}
	
	public String getCommentsUrl() {
	return commentsUrl;
	}
	
	public void setCommentsUrl(String commentsUrl) {
	this.commentsUrl = commentsUrl;
	}
	
	public String getHtmlUrl() {
	return htmlUrl;
	}
	
	public void setHtmlUrl(String htmlUrl) {
	this.htmlUrl = htmlUrl;
	}
	
	public String getGitPullUrl() {
	return gitPullUrl;
	}
	
	public void setGitPullUrl(String gitPullUrl) {
	this.gitPullUrl = gitPullUrl;
	}
	
	public String getGitPushUrl() {
	return gitPushUrl;
	}
	
	public void setGitPushUrl(String gitPushUrl) {
	this.gitPushUrl = gitPushUrl;
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
	
	public List<Fork> getForks() {
	return forks;
	}
	
	public void setForks(List<Fork> forks) {
	this.forks = forks;
	}
	
	public List<History> getHistory() {
	return history;
	}
	
	public void setHistory(List<History> history) {
	this.history = history;
	}
	
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
}
}
