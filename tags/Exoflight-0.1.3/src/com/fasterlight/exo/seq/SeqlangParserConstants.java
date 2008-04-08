/* Generated By:JavaCC: Do not edit this line. SeqlangParserConstants.java */
package com.fasterlight.exo.seq;

public interface SeqlangParserConstants {

  int EOF = 0;
  int SINGLE_LINE_COMMENT = 8;
  int SEQUENCE = 10;
  int WAIT = 11;
  int UNTIL = 12;
  int FOR = 13;
  int DURATION = 14;
  int INTERVAL = 15;
  int TIMEOUT = 16;
  int CONDITION = 17;
  int TRUE = 18;
  int FALSE = 19;
  int OR = 20;
  int AND = 21;
  int NOT = 22;
  int DEG = 23;
  int NULL = 24;
  int GOTO = 25;
  int STOP = 26;
  int SET = 27;
  int ABORT = 28;
  int CANCEL = 29;
  int NEW = 30;
  int INTEGER_LITERAL = 31;
  int DECIMAL_LITERAL = 32;
  int HEX_LITERAL = 33;
  int OCTAL_LITERAL = 34;
  int FLOATING_POINT_LITERAL = 35;
  int EXPONENT = 36;
  int IDENT_LITERAL = 37;
  int QUOTED_LITERAL = 38;
  int IDENTIFIER = 39;
  int LETTER = 40;
  int DIGIT = 41;
  int LPAREN = 42;
  int RPAREN = 43;
  int LBRACE = 44;
  int RBRACE = 45;
  int LBRACKET = 46;
  int RBRACKET = 47;
  int SEMICOLON = 48;
  int COMMA = 49;
  int DOT = 50;
  int COLON = 51;
  int ASSIGN = 52;
  int GT = 53;
  int LT = 54;
  int EQ = 55;
  int LE = 56;
  int GE = 57;
  int NE = 58;
  int ATSIGN = 59;
  int ASSIGNOPT = 60;

  int DEFAULT = 0;
  int IN_SINGLE_LINE_COMMENT = 1;
  int IN_FORMAL_COMMENT = 2;
  int IN_MULTI_LINE_COMMENT = 3;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"--\"",
    "\"//\"",
    "<SINGLE_LINE_COMMENT>",
    "<token of kind 9>",
    "\"sequence\"",
    "\"wait\"",
    "\"until\"",
    "\"for\"",
    "\"duration\"",
    "\"interval\"",
    "\"timeout\"",
    "\"condition\"",
    "\"true\"",
    "\"false\"",
    "\"or\"",
    "\"and\"",
    "\"not\"",
    "\"deg\"",
    "\"null\"",
    "\"goto\"",
    "\"stop\"",
    "\"set\"",
    "\"abort\"",
    "\"cancel\"",
    "\"new\"",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<IDENT_LITERAL>",
    "<QUOTED_LITERAL>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\",\"",
    "\".\"",
    "\":\"",
    "\"=\"",
    "\">\"",
    "\"<\"",
    "\"==\"",
    "\"<=\"",
    "\">=\"",
    "\"!=\"",
    "\"@\"",
    "\"=?\"",
    "\"-\"",
  };

}
