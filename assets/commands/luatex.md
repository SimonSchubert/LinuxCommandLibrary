# TLDR

**Compile LaTeX document**

```luatex [document.tex]```

**Compile LuaLaTeX document**

```lualatex [document.tex]```

**Compile with shell escape**

```luatex --shell-escape [document.tex]```

**Compile to DVI**

```luatex --output-format=dvi [document.tex]```

**Specify output directory**

```luatex --output-directory=[dir] [document.tex]```

# SYNOPSIS

**luatex** [_options_] [_file_]

# PARAMETERS

**--fmt** _format_
> Format file to use.

**--output-format** _fmt_
> pdf or dvi.

**--output-directory** _dir_
> Output directory.

**--shell-escape**
> Enable shell commands.

**--interaction** _mode_
> Interaction mode.

**--halt-on-error**
> Stop on first error.

**--lua** _file_
> Lua initialization file.

# DESCRIPTION

**LuaTeX** is an extended TeX engine with embedded Lua scripting. It combines the typesetting power of TeX with Lua programming, enabling dynamic document generation and advanced customization.

LuaLaTeX is the LaTeX format for LuaTeX, replacing pdfLaTeX for modern documents.

# LUA IN DOCUMENTS

```latex
\directlua{
  tex.print("Hello from Lua!")
  for i=1,5 do
    tex.print(i)
  end
}
```

# CAVEATS

Slower than pdfLaTeX for simple documents. Some packages need adaptation. Memory usage higher than other engines. Unicode-native.

# HISTORY

LuaTeX development started in **2007** by **Taco Hoekwater**, **Hartmut Henkel**, and **Hans Hagen** as a successor to pdfTeX with scripting capabilities.

# SEE ALSO

[lualatex](/man/lualatex)(1), [pdflatex](/man/pdflatex)(1), [xelatex](/man/xelatex)(1), [tex](/man/tex)(1)
