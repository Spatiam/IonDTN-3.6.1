/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/Montilla/Desktop/Spatiam.nosync/Android/IonDTN-3.6.1/ion-opensource-3.6.1/arch-android/IonDTN/app/src/main/aidl/gov/nasa/jpl/iondtn/INodeAdminService.aidl
 */
package gov.nasa.jpl.iondtn;
public interface INodeAdminService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements gov.nasa.jpl.iondtn.INodeAdminService
{
private static final java.lang.String DESCRIPTOR = "gov.nasa.jpl.iondtn.INodeAdminService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an gov.nasa.jpl.iondtn.INodeAdminService interface,
 * generating a proxy if needed.
 */
public static gov.nasa.jpl.iondtn.INodeAdminService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof gov.nasa.jpl.iondtn.INodeAdminService))) {
return ((gov.nasa.jpl.iondtn.INodeAdminService)iin);
}
return new gov.nasa.jpl.iondtn.INodeAdminService.Stub.Proxy(obj);
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
case TRANSACTION_registerStatusChangeListener:
{
data.enforceInterface(DESCRIPTOR);
gov.nasa.jpl.iondtn.INodeAdminListener _arg0;
_arg0 = gov.nasa.jpl.iondtn.INodeAdminListener.Stub.asInterface(data.readStrongBinder());
int _result = this.registerStatusChangeListener(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_unregisterStatusChangeListener:
{
data.enforceInterface(DESCRIPTOR);
gov.nasa.jpl.iondtn.INodeAdminListener _arg0;
_arg0 = gov.nasa.jpl.iondtn.INodeAdminListener.Stub.asInterface(data.readStrongBinder());
int _result = this.unregisterStatusChangeListener(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startION:
{
data.enforceInterface(DESCRIPTOR);
this.startION();
reply.writeNoException();
return true;
}
case TRANSACTION_stopION:
{
data.enforceInterface(DESCRIPTOR);
this.stopION();
reply.writeNoException();
return true;
}
case TRANSACTION_getContactListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getContactListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getRangeListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getRangeListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSchemeListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getSchemeListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getEndpointListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getEndpointListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getProtocolListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getProtocolListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getInductListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getInductListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getOutductListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getOutductListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getBabRuleListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getBabRuleListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getBibRuleListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getBibRuleListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getBcbRuleListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getBcbRuleListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getKeyListString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getKeyListString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements gov.nasa.jpl.iondtn.INodeAdminService
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
@Override public int registerStatusChangeListener(gov.nasa.jpl.iondtn.INodeAdminListener lst) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((lst!=null))?(lst.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerStatusChangeListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int unregisterStatusChangeListener(gov.nasa.jpl.iondtn.INodeAdminListener lst) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((lst!=null))?(lst.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterStatusChangeListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Start the underlying ION instance

@Override public void startION() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startION, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Stop the unerlying ION instance

@Override public void stopION() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopION, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String getContactListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getContactListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getRangeListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRangeListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getSchemeListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSchemeListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getEndpointListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEndpointListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getProtocolListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProtocolListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getInductListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getInductListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getOutductListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getOutductListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getBabRuleListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBabRuleListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getBibRuleListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBibRuleListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getBcbRuleListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBcbRuleListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getKeyListString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getKeyListString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerStatusChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterStatusChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startION = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopION = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getContactListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getRangeListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getSchemeListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getEndpointListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getProtocolListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getInductListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getOutductListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getBabRuleListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getBibRuleListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getBcbRuleListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getKeyListString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
}
public int registerStatusChangeListener(gov.nasa.jpl.iondtn.INodeAdminListener lst) throws android.os.RemoteException;
public int unregisterStatusChangeListener(gov.nasa.jpl.iondtn.INodeAdminListener lst) throws android.os.RemoteException;
// Start the underlying ION instance

public void startION() throws android.os.RemoteException;
// Stop the unerlying ION instance

public void stopION() throws android.os.RemoteException;
public java.lang.String getContactListString() throws android.os.RemoteException;
public java.lang.String getRangeListString() throws android.os.RemoteException;
public java.lang.String getSchemeListString() throws android.os.RemoteException;
public java.lang.String getEndpointListString() throws android.os.RemoteException;
public java.lang.String getProtocolListString() throws android.os.RemoteException;
public java.lang.String getInductListString() throws android.os.RemoteException;
public java.lang.String getOutductListString() throws android.os.RemoteException;
public java.lang.String getBabRuleListString() throws android.os.RemoteException;
public java.lang.String getBibRuleListString() throws android.os.RemoteException;
public java.lang.String getBcbRuleListString() throws android.os.RemoteException;
public java.lang.String getKeyListString() throws android.os.RemoteException;
}
