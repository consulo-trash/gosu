/*
 * Copyright 2013 Guidewire Software, Inc.
 */

package gw.lang.parser.statements;

import gw.lang.parser.IExpression;

public interface IReturnStatement extends ITerminalStatement
{
  IExpression getValue();
}
