package com.springWorkout.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ApiLog")
public class ApiLog {

    @Id
    private String id;
    private String request;
    private String response;
    private Date requestDate;
    private Date responseDate;

    private ApiLog(Builder builder) {
        this.request = builder.request;
        this.response = builder.response;
        this.requestDate = builder.requestDate;
        this.responseDate = builder.responseDate;
        this.id = builder.id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((request == null) ? 0 : request.hashCode());
        result = prime * result + ((requestDate == null) ? 0 : requestDate.hashCode());
        result = prime * result + ((response == null) ? 0 : response.hashCode());
        result = prime * result + ((responseDate == null) ? 0 : responseDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        ApiLog other = (ApiLog) obj;
        if (id == null) {
            if (other.id != null) { return false; }
        } else if (!id.equals(other.id)) { return false; }
        if (request == null) {
            if (other.request != null) { return false; }
        } else if (!request.equals(other.request)) { return false; }
        if (requestDate == null) {
            if (other.requestDate != null) { return false; }
        } else if (!requestDate.equals(other.requestDate)) { return false; }
        if (response == null) {
            if (other.response != null) { return false; }
        } else if (!response.equals(other.response)) { return false; }
        if (responseDate == null) {
            if (other.responseDate != null) { return false; }
        } else if (!responseDate.equals(other.responseDate)) { return false; }
        return true;
    }

    @Override
    public String toString() {
        return "ApiLog [id=" + id + ", request=" + request + ", response=" + response + ", requestDate=" + requestDate
            + ", responseDate=" + responseDate + "]";
    }

    public static class Builder {

        private String id;
        private String request;
        private String response;
        private Date requestDate;
        private Date responseDate;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder request(String request) {
            this.request = request;
            return this;
        }

        public Builder response(String response) {
            this.response = response;
            return this;
        }

        public Builder requestDate(Date requestDate) {
            this.requestDate = requestDate;
            return this;
        }

        public Builder responseDate(Date responseDate) {
            this.responseDate = responseDate;
            return this;
        }

        public ApiLog build() {
            return new ApiLog(this);
        }
    }

}
