package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Body_1_0 extends Strategy 
{ 
  public static $Class$Body_1_0 instance = new $Class$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassBody_1_0");
    Fail74:
    { 
      IStrategoTerm o_136 = null;
      IStrategoTerm n_136 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      n_136 = term.getSubterm(0);
      IStrategoList annos50 = term.getAnnotations();
      o_136 = annos50;
      term = u_29.invoke(context, n_136);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consClassBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_136));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}