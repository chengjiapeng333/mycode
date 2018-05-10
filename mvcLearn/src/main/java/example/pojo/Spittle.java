package example.pojo;

import java.util.Date;

/**
 * Created by chengjiapeng on 2018/5/11.
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    //纬度
    private Double latitude;

    private Double longitude;

    public Spittle(Long id, String message, Date time, Double latitude, Double longitude) {
        this.id = id;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
