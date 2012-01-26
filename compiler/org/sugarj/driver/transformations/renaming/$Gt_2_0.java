package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Gt_2_0 extends Strategy 
{ 
  public static $Gt_2_0 instance = new $Gt_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_22, Strategy p_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Gt_2_0");
    Fail122:
    { 
      IStrategoTerm b_122 = null;
      IStrategoTerm z_121 = null;
      IStrategoTerm a_122 = null;
      IStrategoTerm c_122 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consGt_2 != ((IStrategoAppl)term).getConstructor())
        break Fail122;
      z_121 = term.getSubterm(0);
      a_122 = term.getSubterm(1);
      IStrategoList annos107 = term.getAnnotations();
      b_122 = annos107;
      term = o_22.invoke(context, z_121);
      if(term == null)
        break Fail122;
      c_122 = term;
      term = p_22.invoke(context, a_122);
      if(term == null)
        break Fail122;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consGt_2, new IStrategoTerm[]{c_122, term}), checkListAnnos(termFactory, b_122));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}