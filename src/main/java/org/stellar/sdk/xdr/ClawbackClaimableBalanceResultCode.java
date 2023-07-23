// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import java.io.IOException;

// === xdr source ============================================================

//  enum ClawbackClaimableBalanceResultCode
//  {
//      // codes considered as "success" for the operation
//      CLAWBACK_CLAIMABLE_BALANCE_SUCCESS = 0,
//
//      // codes considered as "failure" for the operation
//      CLAWBACK_CLAIMABLE_BALANCE_DOES_NOT_EXIST = -1,
//      CLAWBACK_CLAIMABLE_BALANCE_NOT_ISSUER = -2,
//      CLAWBACK_CLAIMABLE_BALANCE_NOT_CLAWBACK_ENABLED = -3
//  };

//  ===========================================================================
public enum ClawbackClaimableBalanceResultCode implements XdrElement {
  CLAWBACK_CLAIMABLE_BALANCE_SUCCESS(0),
  CLAWBACK_CLAIMABLE_BALANCE_DOES_NOT_EXIST(-1),
  CLAWBACK_CLAIMABLE_BALANCE_NOT_ISSUER(-2),
  CLAWBACK_CLAIMABLE_BALANCE_NOT_CLAWBACK_ENABLED(-3),
  ;
  private int mValue;

  ClawbackClaimableBalanceResultCode(int value) {
    mValue = value;
  }

  public int getValue() {
    return mValue;
  }

  public static ClawbackClaimableBalanceResultCode decode(XdrDataInputStream stream)
      throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return CLAWBACK_CLAIMABLE_BALANCE_SUCCESS;
      case -1:
        return CLAWBACK_CLAIMABLE_BALANCE_DOES_NOT_EXIST;
      case -2:
        return CLAWBACK_CLAIMABLE_BALANCE_NOT_ISSUER;
      case -3:
        return CLAWBACK_CLAIMABLE_BALANCE_NOT_CLAWBACK_ENABLED;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, ClawbackClaimableBalanceResultCode value)
      throws IOException {
    stream.writeInt(value.getValue());
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
