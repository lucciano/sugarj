package org.sugarj.fomega;

import java.util.LinkedList;
import java.util.List;

import org.sugarj.common.path.Path;
import org.sugarj.languagelib.SourceFileContent;
import org.sugarj.languagelib.SourceImport;

public class FomegaSourceFileContent extends SourceFileContent {

  private String moduleDecl;
  private List<SourceImport> imports = new LinkedList<SourceImport>();
  private List<SourceImport> checkedImports = new LinkedList<SourceImport>();
  private List<String> bodyDecls = new LinkedList<String>();
 
  private boolean hasNonhaskellDecl;
  
  @Override
  public boolean isEmpty() {
    return bodyDecls.isEmpty() && hasNonhaskellDecl;
  }
  
  public void setHasNonfomegaDecl(boolean hasNonhaskellDecl) {
    this.hasNonhaskellDecl = hasNonhaskellDecl;
  }
  
  public FomegaSourceFileContent() {
  }

  public void setNamespaceDecl(String moduleDecl) {
    this.moduleDecl = moduleDecl;
  }

  public void addImport(SourceImport imp) {
    imports.add(imp);
  }

  public void addCheckedImport(SourceImport imp) {
    checkedImports.add(imp);
  }

  public void addBodyDecl(String bodyDecl) {
    bodyDecls.add(bodyDecl);
  }

  @Override
  public SourceFileContent.Generated getCode(Path outFile) {
    List<String> requiredPaths = new LinkedList<String>();
    
    StringBuilder code = new StringBuilder();
    code.append(moduleDecl);
    code.append('\n');

    for (SourceImport imp : checkedImports)
      code.append(imp.getPrettyPrint()).append("\n");

    for (SourceImport imp : imports) {
      code.append(imp.getPrettyPrint()).append("\n");
      requiredPaths.add(imp.getPath());
    }

    for (String bodyDecl : bodyDecls)
      code.append(bodyDecl).append("\n");

    return new SourceFileContent.Generated(code.toString(), requiredPaths);
  }

  public int hashCode() {
    return moduleDecl.hashCode() + checkedImports.hashCode() + imports.hashCode() + bodyDecls.hashCode();
  }

  public boolean equals(Object o) {
    if (!(o instanceof FomegaSourceFileContent))
      return false;

    FomegaSourceFileContent other = (FomegaSourceFileContent) o;
    return other.moduleDecl.equals(moduleDecl) 
        && other.checkedImports.equals(checkedImports)
        && other.imports.equals(imports)
        && other.bodyDecls.equals(bodyDecls);
  }

}
