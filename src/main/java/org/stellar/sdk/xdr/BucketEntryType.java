// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import java.io.IOException;

// === xdr source ============================================================

//  enum BucketEntryType
//  {
//      METAENTRY =
//          -1, // At-and-after protocol 11: bucket metadata, should come first.
//      LIVEENTRY = 0, // Before protocol 11: created-or-updated;
//                     // At-and-after protocol 11: only updated.
//      DEADENTRY = 1,
//      INITENTRY = 2 // At-and-after protocol 11: only created.
//  };

//  ===========================================================================
public enum BucketEntryType implements XdrElement {
  METAENTRY(-1),
  LIVEENTRY(0),
  DEADENTRY(1),
  INITENTRY(2),
  ;
  private int mValue;

  BucketEntryType(int value) {
    mValue = value;
  }

  public int getValue() {
    return mValue;
  }

  public static BucketEntryType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case -1:
        return METAENTRY;
      case 0:
        return LIVEENTRY;
      case 1:
        return DEADENTRY;
      case 2:
        return INITENTRY;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, BucketEntryType value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
