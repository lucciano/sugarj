package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Signature_1_0 extends Strategy 
{ 
  public static $Signature_1_0 instance = new $Signature_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Signature_1_0");
    Fail281:
    { 
      IStrategoTerm m_181 = null;
      IStrategoTerm l_181 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consSignature_1 != ((IStrategoAppl)term).getConstructor())
        break Fail281;
      l_181 = term.getSubterm(0);
      IStrategoList annos228 = term.getAnnotations();
      m_181 = annos228;
      term = w_42.invoke(context, l_181);
      if(term == null)
        break Fail281;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consSignature_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_181));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}