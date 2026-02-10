# TAGLINE

teX engine that combines LaTeX with the Lua programming language

# TLDR

**Compile LaTeX document**

```lualatex [document.tex]```

**Compile to specified output directory**

```lualatex -output-directory=[output/] [document.tex]```

**Compile in draft mode** (faster, no images)

```lualatex -draftmode [document.tex]```

**Compile with shell escape** (for external commands)

```lualatex -shell-escape [document.tex]```

**Compile with interaction mode**

```lualatex -interaction=[nonstopmode] [document.tex]```

**Compile with job name**

```lualatex -jobname=[output] [document.tex]```

**Show version**

```lualatex --version```

# SYNOPSIS

**lualatex** [_-output-directory=dir_] [_-shell-escape_] [_-interaction=mode_] [_options_] [_file.tex_]

# PARAMETERS

**-output-directory**=_DIR_
> Write output files to directory.

**-jobname**=_NAME_
> Set output file base name.

**-interaction**=_MODE_
> Set interaction mode (batchmode, nonstopmode, scrollmode, errorstopmode).

**-shell-escape**
> Enable \\write18 shell commands.

**-no-shell-escape**
> Disable shell commands.

**-draftmode**
> Run without output, for syntax checking.

**-halt-on-error**
> Stop at first error.

**-file-line-error**
> Show file:line:error format.

**-synctex**=_N_
> Generate SyncTeX data for editor integration.

**-fmt**=_FORMAT_
> Use specified format file.

**--version**
> Print version information.

**--help**
> Show help.

# DESCRIPTION

**lualatex** is a TeX engine that combines LaTeX with the Lua programming language. It compiles LaTeX documents while allowing Lua scripting within the document.

Lua integration enables dynamic content generation, complex calculations, and programmatic document manipulation. The fontspec package works seamlessly for OpenType and TrueType font handling.

Unlike pdflatex, lualatex uses UTF-8 natively without additional packages. It can access system fonts directly, making font management simpler.

Multiple compilation passes may be needed for documents with cross-references, tables of contents, or bibliographies. Tools like latexmk automate this process.

Shell escape mode allows external program execution, needed by packages like minted for code highlighting. Use with caution on untrusted documents.

# CAVEATS

Slower than pdflatex due to Lua overhead. Some packages incompatible with LuaTeX. Memory usage higher than other TeX engines. May need multiple runs for references.

# HISTORY

**LuaTeX** development began around **2007**, led by **Hans Hagen**, **Hartmut Henkel**, and **Taco Hoekwater**. It combined the pdfTeX engine with an embedded Lua interpreter. lualatex provides the LaTeX format for LuaTeX, becoming the recommended engine for modern LaTeX development.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [xelatex](/man/xelatex)(1), [latexmk](/man/latexmk)(1), [luatex](/man/luatex)(1), [texdoc](/man/texdoc)(1)
