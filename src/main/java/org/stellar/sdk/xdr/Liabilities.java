// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct Liabilities
//  {
//      int64 buying;
//      int64 selling;
//  };

//  ===========================================================================
public class Liabilities implements XdrElement {
  public Liabilities() {}

  private Int64 buying;

  public Int64 getBuying() {
    return this.buying;
  }

  public void setBuying(Int64 value) {
    this.buying = value;
  }

  private Int64 selling;

  public Int64 getSelling() {
    return this.selling;
  }

  public void setSelling(Int64 value) {
    this.selling = value;
  }

  public static void encode(XdrDataOutputStream stream, Liabilities encodedLiabilities)
      throws IOException {
    Int64.encode(stream, encodedLiabilities.buying);
    Int64.encode(stream, encodedLiabilities.selling);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static Liabilities decode(XdrDataInputStream stream) throws IOException {
    Liabilities decodedLiabilities = new Liabilities();
    decodedLiabilities.buying = Int64.decode(stream);
    decodedLiabilities.selling = Int64.decode(stream);
    return decodedLiabilities;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.buying, this.selling);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Liabilities)) {
      return false;
    }

    Liabilities other = (Liabilities) object;
    return Objects.equal(this.buying, other.buying) && Objects.equal(this.selling, other.selling);
  }

  public static final class Builder {
    private Int64 buying;
    private Int64 selling;

    public Builder buying(Int64 buying) {
      this.buying = buying;
      return this;
    }

    public Builder selling(Int64 selling) {
      this.selling = selling;
      return this;
    }

    public Liabilities build() {
      Liabilities val = new Liabilities();
      val.setBuying(buying);
      val.setSelling(selling);
      return val;
    }
  }
}