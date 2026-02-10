# TAGLINE

formats text for terminal display

# TLDR

**Format document**

```nroff [file.roff]```

**Format for terminal**

```nroff -Tascii [file]```

**Format man page**

```nroff -man [page.1]```

**Format with macros**

```nroff -ms [file.ms]```

**Preview output**

```nroff [file] | less```

# SYNOPSIS

**nroff** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input files.

**-T** _DEV_
> Output device.

**-man**
> Use man macros.

**-ms**
> Use ms macros.

**-me**
> Use me macros.

**--help**
> Display help information.

# DESCRIPTION

**nroff** formats text for terminal display. Part of troff/groff system.

The tool processes roff documents. Outputs plain text formatting.

# CAVEATS

Part of groff. Terminal output. Use groff for typeset output.

# HISTORY

nroff originated in **Unix V7** for formatting text on line printers and terminals.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [man](/man/man)(1)

