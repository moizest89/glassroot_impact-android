package moizest89.indigitous.com.glassrootimpact.data.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class Request implements Parcelable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("latitud")
    @Expose
    private Double latitud;
    @SerializedName("longitud")
    @Expose
    private Double longitud;
    @SerializedName("distance")
    @Expose
    private String distance;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("requests")
    @Expose
    private List<Request_> requests = new ArrayList<Request_>();

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The latitud
     */
    public Double getLatitud() {
        return latitud;
    }

    /**
     *
     * @param latitud
     * The latitud
     */
    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    /**
     *
     * @return
     * The longitud
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     *
     * @param longitud
     * The longitud
     */
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    /**
     *
     * @return
     * The distance
     */
    public String getDistance() {
        return distance;
    }

    /**
     *
     * @param distance
     * The distance
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /**
     *
     * @return
     * The reason
     */
    public String getReason() {
        return reason;
    }

    /**
     *
     * @param reason
     * The reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     *
     * @return
     * The requests
     */
    public List<Request_> getRequests() {
        return requests;
    }

    /**
     *
     * @param requests
     * The requests
     */
    public void setRequests(List<Request_> requests) {
        this.requests = requests;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeValue(this.latitud);
        dest.writeValue(this.longitud);
        dest.writeString(this.distance);
        dest.writeString(this.reason);
        dest.writeTypedList(this.requests);
    }

    public Request() {
    }

    protected Request(Parcel in) {
        this.name = in.readString();
        this.latitud = (Double) in.readValue(Double.class.getClassLoader());
        this.longitud = (Double) in.readValue(Double.class.getClassLoader());
        this.distance = in.readString();
        this.reason = in.readString();
        this.requests = in.createTypedArrayList(Request_.CREATOR);
    }

    public static final Creator<Request> CREATOR = new Creator<Request>() {
        @Override
        public Request createFromParcel(Parcel source) {
            return new Request(source);
        }

        @Override
        public Request[] newArray(int size) {
            return new Request[size];
        }
    };
}
