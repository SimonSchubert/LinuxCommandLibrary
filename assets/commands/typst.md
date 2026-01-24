# TLDR

**Compile document to PDF**

```typst compile [document.typ]```

**Compile with specific output**

```typst compile [document.typ] [output.pdf]```

**Watch and recompile on changes**

```typst watch [document.typ]```

**Compile to PNG**

```typst compile [document.typ] [output.png]```

**Compile to SVG**

```typst compile [document.typ] [output.svg]```

**List available fonts**

```typst fonts```

**Compile with custom font path**

```typst compile --font-path [/path/to/fonts] [document.typ]```

**Initialize new project**

```typst init```

# SYNOPSIS

**typst** _command_ [_--font-path path_] [_options_] _input_ [_output_]

# PARAMETERS

**compile** _INPUT_ [_OUTPUT_]
> Compile document to output.

**watch** _INPUT_
> Watch for changes and recompile.

**fonts**
> List available fonts.

**init** [_TEMPLATE_]
> Initialize new project.

**query** _INPUT_ _SELECTOR_
> Query document metadata.

**--root** _DIR_
> Project root directory.

**--font-path** _PATH_
> Additional font search path.

**--format** _FORMAT_
> Output format: pdf, png, svg.

**--ppi** _NUM_
> Pixels per inch for raster output.

**--diagnostic-format** _FMT_
> Diagnostic format: human, short.

**--input** _KEY=VALUE_
> Set input variable.

**--open**
> Open output after compile.

**-h**, **--help**
> Show help.

**-V**, **--version**
> Show version.

# DESCRIPTION

**Typst** is a modern typesetting system designed as an alternative to LaTeX. It combines the power of LaTeX with simpler syntax and faster compilation.

Documents use .typ files with markup similar to Markdown. Headers, lists, emphasis, and links use familiar syntax. Mathematical equations use a LaTeX-inspired but simpler notation.

Compilation is incremental and extremely fast - documents compile in milliseconds. Watch mode provides near-instant preview updates during editing.

Styling uses a functional approach. Set rules configure defaults; show rules transform elements. The language is Turing-complete, enabling complex documents with scripting.

Templates and packages extend functionality. Bibliography support uses BibTeX or Hayagriva formats. Multi-column layouts, figures, and tables work intuitively.

Output formats include PDF (default), PNG pages, and SVG. Font embedding ensures documents render correctly anywhere.

# CAVEATS

Newer ecosystem with fewer packages than LaTeX. Some advanced features still developing. Not all LaTeX packages have equivalents. PDF/A for archival not yet supported. Limited IDE integration compared to LaTeX.

# HISTORY

**Typst** was created by **Martin Haug** and **Laurenz Mädje** around **2019** as a master's thesis project. The goal was creating a typesetting system that's as powerful as LaTeX but more approachable. After development at Typst GmbH, it was open-sourced in **2023** and rapidly gained adoption.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [pandoc](/man/pandoc)(1), [groff](/man/groff)(1), [asciidoctor](/man/asciidoctor)(1)
