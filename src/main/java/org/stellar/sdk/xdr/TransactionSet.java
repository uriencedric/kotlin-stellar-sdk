// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Arrays;

// === xdr source ============================================================

//  struct TransactionSet
//  {
//      Hash previousLedgerHash;
//      TransactionEnvelope txs<>;
//  };

//  ===========================================================================
public class TransactionSet implements XdrElement {
  public TransactionSet() {}

  private Hash previousLedgerHash;

  public Hash getPreviousLedgerHash() {
    return this.previousLedgerHash;
  }

  public void setPreviousLedgerHash(Hash value) {
    this.previousLedgerHash = value;
  }

  private TransactionEnvelope[] txs;

  public TransactionEnvelope[] getTxs() {
    return this.txs;
  }

  public void setTxs(TransactionEnvelope[] value) {
    this.txs = value;
  }

  public static void encode(XdrDataOutputStream stream, TransactionSet encodedTransactionSet)
      throws IOException {
    Hash.encode(stream, encodedTransactionSet.previousLedgerHash);
    int txssize = encodedTransactionSet.getTxs().length;
    stream.writeInt(txssize);
    for (int i = 0; i < txssize; i++) {
      TransactionEnvelope.encode(stream, encodedTransactionSet.txs[i]);
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static TransactionSet decode(XdrDataInputStream stream) throws IOException {
    TransactionSet decodedTransactionSet = new TransactionSet();
    decodedTransactionSet.previousLedgerHash = Hash.decode(stream);
    int txssize = stream.readInt();
    decodedTransactionSet.txs = new TransactionEnvelope[txssize];
    for (int i = 0; i < txssize; i++) {
      decodedTransactionSet.txs[i] = TransactionEnvelope.decode(stream);
    }
    return decodedTransactionSet;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.previousLedgerHash, Arrays.hashCode(this.txs));
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TransactionSet)) {
      return false;
    }

    TransactionSet other = (TransactionSet) object;
    return Objects.equal(this.previousLedgerHash, other.previousLedgerHash)
        && Arrays.equals(this.txs, other.txs);
  }

  public static final class Builder {
    private Hash previousLedgerHash;
    private TransactionEnvelope[] txs;

    public Builder previousLedgerHash(Hash previousLedgerHash) {
      this.previousLedgerHash = previousLedgerHash;
      return this;
    }

    public Builder txs(TransactionEnvelope[] txs) {
      this.txs = txs;
      return this;
    }

    public TransactionSet build() {
      TransactionSet val = new TransactionSet();
      val.setPreviousLedgerHash(previousLedgerHash);
      val.setTxs(txs);
      return val;
    }
  }
}
