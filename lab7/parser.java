
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Apr 20 22:19:07 IST 2020
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Apr 20 22:19:07 IST 2020
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\013\002\000\002\005\005\000\002\002" +
    "\004\000\002\002\004\000\002\002\003\000\002\003\003" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\004\006\000\002\004\006\000\002\004\006\000\002" +
    "\010\005\000\002\010\003\000\002\010\007\000\002\010" +
    "\005\000\002\011\005\000\002\011\003\000\002\011\007" +
    "\000\002\011\005\000\002\012\005\000\002\012\003\000" +
    "\002\007\006\000\002\007\006\000\002\007\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\016\004\004\005\010\007\013\010\014\012" +
    "\011\020\015\001\002\000\004\010\052\001\002\000\020" +
    "\004\ufffc\005\ufffc\007\ufffc\010\ufffc\011\ufffc\012\ufffc\020" +
    "\ufffc\001\002\000\020\004\ufffd\005\ufffd\007\ufffd\010\ufffd" +
    "\011\ufffd\012\ufffd\020\ufffd\001\002\000\020\004\004\005" +
    "\010\007\013\010\014\011\001\012\011\020\015\001\002" +
    "\000\004\010\041\001\002\000\020\004\ufffa\005\ufffa\007" +
    "\ufffa\010\ufffa\011\ufffa\012\ufffa\020\ufffa\001\002\000\020" +
    "\004\ufff9\005\ufff9\007\ufff9\010\ufff9\011\ufff9\012\ufff9\020" +
    "\ufff9\001\002\000\004\013\032\001\002\000\020\004\ufffb" +
    "\005\ufffb\007\ufffb\010\ufffb\011\ufffb\012\ufffb\020\ufffb\001" +
    "\002\000\004\010\020\001\002\000\004\002\017\001\002" +
    "\000\004\002\uffff\001\002\000\004\007\021\001\002\000" +
    "\010\006\024\013\025\022\ufff0\001\002\000\004\022\023" +
    "\001\002\000\020\004\ufff7\005\ufff7\007\ufff7\010\ufff7\011" +
    "\ufff7\012\ufff7\020\ufff7\001\002\000\004\007\021\001\002" +
    "\000\004\021\026\001\002\000\006\006\027\022\uffee\001" +
    "\002\000\004\007\021\001\002\000\004\022\uffef\001\002" +
    "\000\004\022\ufff1\001\002\000\010\015\034\021\035\023" +
    "\033\001\002\000\004\022\040\001\002\000\004\022\037" +
    "\001\002\000\004\022\036\001\002\000\020\004\uffea\005" +
    "\uffea\007\uffea\010\uffea\011\uffea\012\uffea\020\uffea\001\002" +
    "\000\020\004\uffe9\005\uffe9\007\uffe9\010\uffe9\011\uffe9\012" +
    "\uffe9\020\uffe9\001\002\000\020\004\uffeb\005\uffeb\007\uffeb" +
    "\010\uffeb\011\uffeb\012\uffeb\020\uffeb\001\002\000\004\007" +
    "\042\001\002\000\006\006\045\022\uffec\001\002\000\004" +
    "\022\044\001\002\000\020\004\ufff6\005\ufff6\007\ufff6\010" +
    "\ufff6\011\ufff6\012\ufff6\020\ufff6\001\002\000\004\007\042" +
    "\001\002\000\004\022\uffed\001\002\000\020\004\ufffe\005" +
    "\ufffe\007\ufffe\010\ufffe\011\ufffe\012\ufffe\020\ufffe\001\002" +
    "\000\004\011\051\001\002\000\004\002\000\001\002\000" +
    "\004\007\053\001\002\000\010\006\056\013\057\022\ufff4" +
    "\001\002\000\004\022\055\001\002\000\020\004\ufff8\005" +
    "\ufff8\007\ufff8\010\ufff8\011\ufff8\012\ufff8\020\ufff8\001\002" +
    "\000\004\007\053\001\002\000\004\023\060\001\002\000" +
    "\006\006\061\022\ufff2\001\002\000\004\007\053\001\002" +
    "\000\004\022\ufff3\001\002\000\004\022\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\014\002\006\003\005\004\004\005\015\007" +
    "\011\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\003\046\004\004\007\011\013\047\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\021\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\030\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\027\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\012\042\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\053\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\062" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\061\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 2;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return getScanner().next_token(); 
    }
}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

 Map<String,String> hash = new HashMap<String,String>(); 
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // defn ::= ID EQ STR SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		 if(hash.get(e)==null)
			{
			System.out.println("variable not declared");
			}
			else if(hash.get(e).equals("STRING"))
			{
			System.out.println("Valid Assignment \n");
			}
			else
			{
			System.out.println("Error: Invalid Assignment \n");
			}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("defn",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // defn ::= ID EQ DECIMAL SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		 if(hash.get(e)==null)
			{
			System.out.println("Variable not Declared \n");
			}
			else if(hash.get(e).equals("FLOAT"))
			{
			System.out.println("Valid Assignment \n");
			}
			else
			{
			System.out.println("Error: Invalid Assignment \n");
			}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("defn",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // defn ::= ID EQ NUM SEMI 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		
			if(hash.get(e)==null){
			System.out.println("Variable not declared");
			}
			else if(hash.get(e).equals("INT"))
			{
			System.out.println("Valid Assignment \n");
			}
			else
			{
			System.out.println("Error: Invalid Assignment \n");
			}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("defn",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // stringvarlist ::= ID 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding INT to HashMap");
						hash.put(e.toString(),"STRING");
						}
					else{
						System.out.println("Error : Dupicate Declaration");					
						}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stringvarlist",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // stringvarlist ::= ID COMMA stringvarlist 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding INT to HashMap");
						hash.put(e.toString(),"STRING");
						}
					else{
						System.out.println("Error : Dupicate Declaration");					
						}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stringvarlist",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // floatvarlist ::= ID EQ DECIMAL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("floatvarlist",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // floatvarlist ::= ID EQ DECIMAL COMMA floatvarlist 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("floatvarlist",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // floatvarlist ::= ID 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding INT to HashMap");
						hash.put(e.toString(),"FLOAT");
						}
					else{
						System.out.println("Error : Dupicate Declaration");					
						}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("floatvarlist",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // floatvarlist ::= ID COMMA floatvarlist 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding INT to HashMap");
						hash.put(e.toString(),"FLOAT");
						}
					else{
						System.out.println("Error : Dupicate Declaration");					
						}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("floatvarlist",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // intvarlist ::= ID EQ NUM 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("intvarlist",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // intvarlist ::= ID EQ NUM COMMA intvarlist 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("intvarlist",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // intvarlist ::= ID 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding INT to HashMap");
						hash.put(e.toString(),"INT");
						}
					else{
						System.out.println("Error : Dupicate Declaration");					
						}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("intvarlist",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // intvarlist ::= ID COMMA intvarlist 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 
					if(hash.get(e)==null)
						{
						System.out.println("Valid Declaration, Adding INT to HashMap");
						hash.put(e.toString(),"INT");
						}
					else{
						System.out.println("Error : Dupicate Declaration");					
						}
              CUP$parser$result = parser.getSymbolFactory().newSymbol("intvarlist",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // decln ::= STRING SPACE stringvarlist SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decln",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // decln ::= FLOAT SPACE floatvarlist SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decln",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // decln ::= INT SPACE intvarlist SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decln",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmt ::= defn 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmt ::= NL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= SPACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= decln 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // prog ::= stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // prog ::= prog stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s ::= prog NT$0 EOFILE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		System.exit(0);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // NT$0 ::= 
            {
              Object RESULT =null;
 System.out.println("Completed Parsing");System.exit(0); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

