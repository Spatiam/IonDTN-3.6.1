/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/Montilla/Desktop/Spatiam.nosync/Android/IonDTN-3.6.1/ion-opensource-3.6.1/arch-android/IonDTN/app/src/main/aidl/gov/nasa/jpl/iondtn/IBundleReceiverListener.aidl
 */
package gov.nasa.jpl.iondtn;
public interface IBundleReceiverListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements gov.nasa.jpl.iondtn.IBundleReceiverListener
{
private static final java.lang.String DESCRIPTOR = "gov.nasa.jpl.iondtn.IBundleReceiverListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an gov.nasa.jpl.iondtn.IBundleReceiverListener interface,
 * generating a proxy if needed.
 */
public static gov.nasa.jpl.iondtn.IBundleReceiverListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof gov.nasa.jpl.iondtn.IBundleReceiverListener))) {
return ((gov.nasa.jpl.iondtn.IBundleReceiverListener)iin);
}
return new gov.nasa.jpl.iondtn.IBundleReceiverListener.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_notifyBundleReceived:
{
data.enforceInterface(DESCRIPTOR);
gov.nasa.jpl.iondtn.DtnBundle _arg0;
if ((0!=data.readInt())) {
_arg0 = gov.nasa.jpl.iondtn.DtnBundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.notifyBundleReceived(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements gov.nasa.jpl.iondtn.IBundleReceiverListener
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public int notifyBundleReceived(gov.nasa.jpl.iondtn.DtnBundle b) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((b!=null)) {
_data.writeInt(1);
b.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyBundleReceived, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_notifyBundleReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public int notifyBundleReceived(gov.nasa.jpl.iondtn.DtnBundle b) throws android.os.RemoteException;
}
