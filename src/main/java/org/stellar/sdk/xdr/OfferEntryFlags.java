// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import java.io.IOException;

// === xdr source ============================================================

//  enum OfferEntryFlags
//  {
//      // an offer with this flag will not act on and take a reverse offer of equal
//      // price
//      PASSIVE_FLAG = 1
//  };

//  ===========================================================================
public enum OfferEntryFlags implements XdrElement {
  PASSIVE_FLAG(1),
  ;
  private int mValue;

  OfferEntryFlags(int value) {
    mValue = value;
  }

  public int getValue() {
    return mValue;
  }

  public static OfferEntryFlags decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 1:
        return PASSIVE_FLAG;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, OfferEntryFlags value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
