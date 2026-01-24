# TLDR

**Compile document**

```xetex [document.tex]```

**Output to specific name**

```xetex -jobname=[output] [document.tex]```

**Non-stop mode**

```xetex -interaction=nonstopmode [document.tex]```

# SYNOPSIS

**xetex** [_-interaction mode_] [_-jobname name_] [_options_] _file_

# PARAMETERS

**-interaction** _MODE_
> Error handling mode.

**-jobname** _NAME_
> Output name.

**-output-directory** _DIR_
> Output location.

**-halt-on-error**
> Stop on error.

# DESCRIPTION

**xetex** is a TeX engine. It supports Unicode natively.

Unicode support. Full UTF-8.

System fonts. Use installed fonts.

PDF output. Direct generation.

OpenType features. Font variations.

# CAVEATS

Different from pdfTeX. Font handling differs. fontspec package useful.

# HISTORY

**XeTeX** was created by **Jonathan Kew** to add native Unicode and modern font support to TeX.

# SEE ALSO

[xelatex](/man/xelatex)(1), [pdflatex](/man/pdflatex)(1), [luatex](/man/luatex)(1)
