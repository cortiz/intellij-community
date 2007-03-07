package org.jetbrains.plugins.groovy;

import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.Commenter;
import com.intellij.lang.PsiParser;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.groovy.lang.parser.GroovyParserDefinition;
import org.jetbrains.plugins.groovy.highlighter.GroovyCommenter;
import org.jetbrains.plugins.groovy.highlighter.GroovySyntaxHighlighter;

/**
 * @author Ilya.Sergey
 */
public class GroovyLanguage extends Language {
  public GroovyLanguage() {
    super("Groovy");
  }

  public ParserDefinition getParserDefinition() {
    return new GroovyParserDefinition();
  }

  @NotNull
  public SyntaxHighlighter getSyntaxHighlighter(Project project, final VirtualFile virtualFile) {
    return new GroovySyntaxHighlighter();
  }

  @Nullable
  public Commenter getCommenter() {
    return new GroovyCommenter();
  }
}
