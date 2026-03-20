# TAGLINE

extended TeX engine with embedded Lua scripting

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
> Set interaction mode: batchmode, nonstopmode, scrollmode, or errorstopmode.

**--halt-on-error**
> Stop on first error.

**--lua** _file_
> Lua initialization file. When present, LuaTeX enters an alternative mode of command-line parsing.

**--luaonly**
> Start LuaTeX as a Lua interpreter only, not a TeX engine.

**--safer**
> Disable Lua commands that can be abused by malicious documents.

**--nosocket**
> Disable the luasocket (network) library.

**--synctex** _NUMBER_
> Enable/disable SyncTeX extension for source-PDF synchronization.

**--jobname** _STRING_
> Set the job name to STRING.

**--draftmode**
> Skip PDF output and image reading for faster compilation.

# DESCRIPTION

**LuaTeX** is an extended version of pdfTeX with Unicode and OpenType font support, embedded Lua scripting, the e-TeX and Omega extensions, and an integrated MetaPost engine. It can produce both PDF and DVI output. The engine combines the typesetting power of TeX with Lua programming, enabling dynamic document generation and advanced customization.

LuaLaTeX is the LaTeX format for LuaTeX, commonly used as a modern replacement for pdfLaTeX. LuaTeX can also be invoked as **texlua** (a Lua interpreter with TeX-related libraries) or **texluac** (a Lua bytecode compiler).

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

Slower than pdfLaTeX for simple documents. Some packages need adaptation for the LuaTeX engine. Memory usage is higher than other TeX engines. Natively supports Unicode (UTF-8 input).

# HISTORY

LuaTeX development started in **2007** by **Taco Hoekwater**, **Hartmut Henkel**, and **Hans Hagen** as a successor to pdfTeX with scripting capabilities.

# SEE ALSO

[lualatex](/man/lualatex)(1), [pdftex](/man/pdftex)(1), [pdflatex](/man/pdflatex)(1), [xelatex](/man/xelatex)(1), [tex](/man/tex)(1)
