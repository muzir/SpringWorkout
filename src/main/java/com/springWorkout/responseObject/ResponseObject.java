package com.springWorkout.responseObject;


public class ResponseObject {

    private String responseCode;
    private String responseMessage;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((responseCode == null) ? 0 : responseCode.hashCode());
        result = prime * result + ((responseMessage == null) ? 0 : responseMessage.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        ResponseObject other = (ResponseObject) obj;
        if (responseCode == null) {
            if (other.responseCode != null) { return false; }
        } else if (!responseCode.equals(other.responseCode)) { return false; }
        if (responseMessage == null) {
            if (other.responseMessage != null) { return false; }
        } else if (!responseMessage.equals(other.responseMessage)) { return false; }
        return true;
    }

    @Override
    public String toString() {
        return "ResponseObject [responseCode=" + responseCode + ", responseMessage=" + responseMessage + "]";
    }

}
