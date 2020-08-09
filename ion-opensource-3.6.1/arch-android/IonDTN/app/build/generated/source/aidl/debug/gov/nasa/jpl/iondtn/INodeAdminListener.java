/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/Montilla/Desktop/Spatiam.nosync/Android/IonDTN-3.6.1/ion-opensource-3.6.1/arch-android/IonDTN/app/src/main/aidl/gov/nasa/jpl/iondtn/INodeAdminListener.aidl
 */
package gov.nasa.jpl.iondtn;
// Declare any non-default types here with import statements

public interface INodeAdminListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements gov.nasa.jpl.iondtn.INodeAdminListener
{
private static final java.lang.String DESCRIPTOR = "gov.nasa.jpl.iondtn.INodeAdminListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an gov.nasa.jpl.iondtn.INodeAdminListener interface,
 * generating a proxy if needed.
 */
public static gov.nasa.jpl.iondtn.INodeAdminListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof gov.nasa.jpl.iondtn.INodeAdminListener))) {
return ((gov.nasa.jpl.iondtn.INodeAdminListener)iin);
}
return new gov.nasa.jpl.iondtn.INodeAdminListener.Stub.Proxy(obj);
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
case TRANSACTION_notifyStatusChanged:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.notifyStatusChanged(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements gov.nasa.jpl.iondtn.INodeAdminListener
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
/**
     * Is called when a bundle assigned to the subscribers eid has been
     * received in ION
     */
@Override public void notifyStatusChanged(java.lang.String status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(status);
mRemote.transact(Stub.TRANSACTION_notifyStatusChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_notifyStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Is called when a bundle assigned to the subscribers eid has been
     * received in ION
     */
public void notifyStatusChanged(java.lang.String status) throws android.os.RemoteException;
}
