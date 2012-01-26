package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Body$Decs_1_0 extends Strategy 
{ 
  public static $Enum$Body$Decs_1_0 instance = new $Enum$Body$Decs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumBodyDecs_1_0");
    Fail45:
    { 
      IStrategoTerm g_106 = null;
      IStrategoTerm f_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEnumBodyDecs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail45;
      f_106 = term.getSubterm(0);
      IStrategoList annos36 = term.getAnnotations();
      g_106 = annos36;
      term = v_16.invoke(context, f_106);
      if(term == null)
        break Fail45;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEnumBodyDecs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}