package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  TermReference w_22;

  TermReference x_22;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail389:
    { 
      lifted4 lifted40 = new lifted4();
      lifted40.w_22 = w_22;
      lifted40.x_22 = x_22;
      term = $S$Var_1_0.instance.invoke(context, term, lifted40);
      if(term == null)
        break Fail389;
      if(true)
        return term;
    }
    return null;
  }
}