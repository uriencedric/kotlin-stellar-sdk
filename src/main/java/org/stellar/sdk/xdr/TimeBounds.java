// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct TimeBounds
//  {
//      TimePoint minTime;
//      TimePoint maxTime; // 0 here means no maxTime
//  };

//  ===========================================================================
public class TimeBounds implements XdrElement {
  public TimeBounds() {}

  private TimePoint minTime;

  public TimePoint getMinTime() {
    return this.minTime;
  }

  public void setMinTime(TimePoint value) {
    this.minTime = value;
  }

  private TimePoint maxTime;

  public TimePoint getMaxTime() {
    return this.maxTime;
  }

  public void setMaxTime(TimePoint value) {
    this.maxTime = value;
  }

  public static void encode(XdrDataOutputStream stream, TimeBounds encodedTimeBounds)
      throws IOException {
    TimePoint.encode(stream, encodedTimeBounds.minTime);
    TimePoint.encode(stream, encodedTimeBounds.maxTime);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static TimeBounds decode(XdrDataInputStream stream) throws IOException {
    TimeBounds decodedTimeBounds = new TimeBounds();
    decodedTimeBounds.minTime = TimePoint.decode(stream);
    decodedTimeBounds.maxTime = TimePoint.decode(stream);
    return decodedTimeBounds;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.minTime, this.maxTime);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TimeBounds)) {
      return false;
    }

    TimeBounds other = (TimeBounds) object;
    return Objects.equal(this.minTime, other.minTime) && Objects.equal(this.maxTime, other.maxTime);
  }

  public static final class Builder {
    private TimePoint minTime;
    private TimePoint maxTime;

    public Builder minTime(TimePoint minTime) {
      this.minTime = minTime;
      return this;
    }

    public Builder maxTime(TimePoint maxTime) {
      this.maxTime = maxTime;
      return this;
    }

    public TimeBounds build() {
      TimeBounds val = new TimeBounds();
      val.setMinTime(minTime);
      val.setMaxTime(maxTime);
      return val;
    }
  }
}