package libpython_clj.jna;


import com.sun.jna.*;


public interface JVMBridge extends AutoCloseable
{
  public Pointer getAttr(String name);
  public void setAttr(String name, Pointer val);
  public String[] dir();
  public Object interpreter();
  public Object wrappedObject();
  // Called from python when the python mirror is deleted.
  // This had better not throw anything.
  public default void close() {}
}
