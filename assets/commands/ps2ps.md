# TAGLINE

Optimize and normalize PostScript files

# TLDR

**Optimize PostScript file**

```ps2ps [input.ps] [output.ps]```

**Convert with specific options**

```ps2ps -dSAFER [input.ps] [output.ps]```

# SYNOPSIS

**ps2ps** [_options_] _input_ _output_

# PARAMETERS

_INPUT_
> Input PostScript file.

_OUTPUT_
> Output PostScript file.

**-dSAFER**
> Safer mode.

# DESCRIPTION

**ps2ps** optimizes and normalizes PostScript files by reading them through the Ghostscript interpreter and rewriting the output as clean, canonical PostScript. This process can reduce file size, resolve compatibility issues, and simplify complex PostScript code for use with printers or other tools that struggle with the original.

The tool is part of the Ghostscript suite and is essentially a wrapper around **gs** with PostScript output enabled. If no output filename is given, the result is written to stdout.

# CAVEATS

Part of Ghostscript suite. May alter formatting.

# HISTORY

ps2ps is part of **Ghostscript** for PostScript optimization.

# SEE ALSO

[gs](/man/gs)(1), [ps2pdf](/man/ps2pdf)(1), [ps2epsi](/man/ps2epsi)(1)

