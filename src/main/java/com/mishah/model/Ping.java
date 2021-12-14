package com.mishah.model;

import javax.persistence.*;

@Entity
@Table(name = "Pingdata")
public class Ping {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "url")
    private String url;

    @Column(name = "min")
    private Float min;

    @Column(name = "max")
    private Float max;

    @Column(name = "avg")
    private Float avg;

    @Column(name = "stddev")
    private Float stddev;

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    public Float getAvg() {
        return avg;
    }

    public void setAvg(Float avg) {
        this.avg = avg;
    }

    public Float getStddev() {
        return stddev;
    }

    public void setStddev(Float stddev) {
        this.stddev = stddev;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
