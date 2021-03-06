package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Import$Dec_1_0 extends Strategy 
{ 
  public static $Type$Import$Dec_1_0 instance = new $Type$Import$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeImportDec_1_0");
    Fail54:
    { 
      IStrategoTerm e_129 = null;
      IStrategoTerm d_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consTypeImportDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail54;
      d_129 = term.getSubterm(0);
      IStrategoList annos30 = term.getAnnotations();
      e_129 = annos30;
      term = i_28.invoke(context, d_129);
      if(term == null)
        break Fail54;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consTypeImportDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}