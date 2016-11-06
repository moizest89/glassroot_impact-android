package moizest89.indigitous.com.glassrootimpact.data.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class Request_ implements Parcelable {

    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;

    /**
     *
     * @return
     * The item
     */
    public String getItem() {
        return item;
    }

    /**
     *
     * @param item
     * The item
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     *
     * @return
     * The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     * The quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.item);
        dest.writeValue(this.quantity);
    }

    public Request_() {
    }

    protected Request_(Parcel in) {
        this.item = in.readString();
        this.quantity = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Request_> CREATOR = new Parcelable.Creator<Request_>() {
        @Override
        public Request_ createFromParcel(Parcel source) {
            return new Request_(source);
        }

        @Override
        public Request_[] newArray(int size) {
            return new Request_[size];
        }
    };
}
