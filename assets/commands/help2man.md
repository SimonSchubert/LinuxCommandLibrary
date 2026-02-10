# TAGLINE

generates man pages from program --help and --version output

# TLDR

**Generate man page**

```help2man [program] > [program.1]```

**Specify section**

```help2man -s [1] [program] > [program.1]```

**Add name description**

```help2man -n "program description" [program] > [program.1]```

**Include additional text**

```help2man --include [extra.h2m] [program] > [program.1]```

# SYNOPSIS

**help2man** [_options_] _executable_

# PARAMETERS

_EXECUTABLE_
> Program to document.

**-n**, **--name** _STRING_
> Name description.

**-s**, **--section** _NUM_
> Man page section.

**-i**, **--include** _FILE_
> Include extra material.

**-N**, **--no-info**
> Omit info pointer.

**-o**, **--output** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**help2man** generates man pages from program --help and --version output. It creates basic documentation automatically from existing help text.

The tool produces minimal man pages suitable for programs with standard help output. Additional content can be included via include files.

# CAVEATS

Output quality depends on --help format. May need manual editing. Best with GNU-style help.

# HISTORY

help2man was created by **Brendan O'Dea** as part of the **GNU** project to automate man page generation.

# SEE ALSO

[man](/man/man)(1), [pod2man](/man/pod2man)(1), [ronn](/man/ronn)(1)
