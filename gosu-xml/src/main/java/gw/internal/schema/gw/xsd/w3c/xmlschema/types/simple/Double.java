package gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Double extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.AnySimpleType implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "double", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.types.simple.Double" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public Double() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected Double( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }

  public Double( java.lang.Double value ) {
    this();
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, value );
  }


  @Deprecated
  public java.lang.String getValue() {
    return super.getValue();
  }

  @Deprecated
  public void setValue( java.lang.String param ) {
    super.setValue( param );
  }

  public java.lang.Double getValue$$gw_xsd_w3c_xmlschema_types_simple_Double() {
    return (java.lang.Double) TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().getValue( this );
  }

  public void setValue$$gw_xsd_w3c_xmlschema_types_simple_Double( java.lang.Double param ) {
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -3788403261967307401L;

}
