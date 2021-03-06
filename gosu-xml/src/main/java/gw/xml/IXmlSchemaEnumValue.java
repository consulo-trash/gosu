/*
 * Copyright 2013 Guidewire Software, Inc.
 */

package gw.xml;

import gw.lang.PublishInGosu;

/**
 * All schema-based enumerations implement this interface.
 */
@PublishInGosu
public interface IXmlSchemaEnumValue {

  /**
   * Returns the ordinal value of this enum constant.
   * @return the ordinal value of this enum constant
   */
  int getOrdinal();

  /**
   * Returns the code of this enum constant.
   * @return the code of this enum constant
   */
  @gw.lang.InternalAPI
  String getCode();

}
