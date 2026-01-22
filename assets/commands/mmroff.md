# TLDR

**Process mm document**

```mmroff [document.mm]```

**Output PostScript**

```mmroff -Tps [document.mm]```

**Output PDF**

```mmroff -Tpdf [document.mm]```

**Preview**

```mmroff -Thtml [document.mm]```

# SYNOPSIS

**mmroff** [_options_] _file_

# PARAMETERS

_FILE_
> Input mm document.

**-T** _FORMAT_
> Output format.

**--help**
> Display help information.

# DESCRIPTION

**mmroff** processes mm macro documents. mm is a groff macro package for memos.

The tool formats documents using the memorandum macros. Part of groff.

mmroff formats mm documents.

# CAVEATS

Part of groff. mm macro format. For formal documents.

# HISTORY

mmroff is part of **groff** for processing documents with the memorandum (mm) macro package.

# SEE ALSO

[groff](/man/groff)(1), [nroff](/man/nroff)(1), [troff](/man/troff)(1)

