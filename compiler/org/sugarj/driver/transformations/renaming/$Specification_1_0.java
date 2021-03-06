package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Specification_1_0 extends Strategy 
{ 
  public static $Specification_1_0 instance = new $Specification_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Specification_1_0");
    Fail284:
    { 
      IStrategoTerm v_181 = null;
      IStrategoTerm u_181 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSpecification_1 != ((IStrategoAppl)term).getConstructor())
        break Fail284;
      u_181 = term.getSubterm(0);
      IStrategoList annos231 = term.getAnnotations();
      v_181 = annos231;
      term = z_42.invoke(context, u_181);
      if(term == null)
        break Fail284;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSpecification_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_181));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}