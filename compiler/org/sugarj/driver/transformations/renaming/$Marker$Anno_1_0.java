package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Marker$Anno_1_0 extends Strategy 
{ 
  public static $Marker$Anno_1_0 instance = new $Marker$Anno_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MarkerAnno_1_0");
    Fail68:
    { 
      IStrategoTerm t_112 = null;
      IStrategoTerm s_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMarkerAnno_1 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      s_112 = term.getSubterm(0);
      IStrategoList annos49 = term.getAnnotations();
      t_112 = annos49;
      term = g_20.invoke(context, s_112);
      if(term == null)
        break Fail68;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMarkerAnno_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}