/*
 * Copyright 2012. Guidewire Software, Inc.
 */

package gw.lang.parser.statements;

import gw.lang.parser.IExpression;
import gw.lang.parser.IStatement;

public interface ILoopStatement extends IStatement
{
  IExpression getExpression();
  IStatement getStatement();
  boolean isConditionLiteralTrue();
}
