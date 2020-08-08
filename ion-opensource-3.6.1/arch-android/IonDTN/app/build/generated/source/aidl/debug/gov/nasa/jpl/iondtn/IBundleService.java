/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/Montilla/Desktop/Spatiam.nosync/Android/IonDTN-3.6.1/ion-opensource-3.6.1/arch-android/IonDTN/app/src/main/aidl/gov/nasa/jpl/iondtn/IBundleService.aidl
 */
package gov.nasa.jpl.iondtn;
public interface IBundleService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements gov.nasa.jpl.iondtn.IBundleService
{
private static final java.lang.String DESCRIPTOR = "gov.nasa.jpl.iondtn.IBundleService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an gov.nasa.jpl.iondtn.IBundleService interface,
 * generating a proxy if needed.
 */
public static gov.nasa.jpl.iondtn.IBundleService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof gov.nasa.jpl.iondtn.IBundleService))) {
return ((gov.nasa.jpl.iondtn.IBundleService)iin);
}
return new gov.nasa.jpl.iondtn.IBundleService.Stub.Proxy(obj);
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
case TRANSACTION_openEndpoint:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
gov.nasa.jpl.iondtn.IBundleReceiverListener _arg1;
_arg1 = gov.nasa.jpl.iondtn.IBundleReceiverListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.openEndpoint(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_closeEndpoint:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.closeEndpoint();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendBundle:
{
data.enforceInterface(DESCRIPTOR);
gov.nasa.jpl.iondtn.DtnBundle _arg0;
if ((0!=data.readInt())) {
_arg0 = gov.nasa.jpl.iondtn.DtnBundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.sendBundle(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements gov.nasa.jpl.iondtn.IBundleService
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
// Open an endpoint object with the specified source eid

@Override public boolean openEndpoint(java.lang.String src_eid, gov.nasa.jpl.iondtn.IBundleReceiverListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(src_eid);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_openEndpoint, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Close the previously opened endpoint object

@Override public boolean closeEndpoint() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_closeEndpoint, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean sendBundle(gov.nasa.jpl.iondtn.DtnBundle b) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((b!=null)) {
_data.writeInt(1);
b.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendBundle, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_openEndpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_closeEndpoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_sendBundle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
// Open an endpoint object with the specified source eid

public boolean openEndpoint(java.lang.String src_eid, gov.nasa.jpl.iondtn.IBundleReceiverListener listener) throws android.os.RemoteException;
// Close the previously opened endpoint object

public boolean closeEndpoint() throws android.os.RemoteException;
public boolean sendBundle(gov.nasa.jpl.iondtn.DtnBundle b) throws android.os.RemoteException;
}
