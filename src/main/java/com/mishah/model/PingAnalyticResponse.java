package com.mishah.model;

public class PingAnalyticResponse {

    private boolean error;
    private String message;
    private String sysId;
    private Ping ping;

    public PingAnalyticResponse() {
        error = false;
    }

    public Ping getPing() {
        return ping;
    }

    public void setPing(Ping ping) {
        this.ping = ping;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Ping getPingAnalyticResponse() {
        return ping;
    }

    public void setPingAnalyticResponse(Ping ping) {
        this.ping = ping;
    }
}
