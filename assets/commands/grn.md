# TLDR

**Process gremlin file**

```grn [file.grn] | groff > output.ps```

**Specify macro file**

```grn -M [macrodir] [file.grn]```

**Compatible mode**

```grn -C [file.grn]```

# SYNOPSIS

**grn** [_options_] [_file_]

# PARAMETERS

_FILE_
> Gremlin input file.

**-M** _DIR_
> Macro directory.

**-C**
> Compatible mode with older versions.

**-F** _FILE_
> Font file.

**--help**
> Display help information.

# DESCRIPTION

**grn** is a groff preprocessor for Gremlin graphics files. It converts Gremlin vector graphics format to groff commands for embedding in documents.

The tool was originally developed for SunView and later adapted for groff. It handles line drawings, text, and other Gremlin primitives.

grn preprocesses Gremlin graphics for groff.

# CAVEATS

Part of groff suite. Gremlin format is largely obsolete. Limited to basic vector graphics.

# HISTORY

grn was created at **UC Berkeley** for the Gremlin drawing program, later included in **GNU groff** for compatibility.

# SEE ALSO

[groff](/man/groff)(1), [pic](/man/pic)(1), [grap](/man/grap)(1)
