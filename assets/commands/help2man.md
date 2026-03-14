# TAGLINE

generates man pages from program --help and --version output

# TLDR

**Generate a man page from a program's help output**

```help2man [program] > [program.1]```

**Generate with a specific man page section number**

```help2man -s [1] [program] > [program.1]```

**Add a name/description for the NAME section**

```help2man -n "program description" [program] > [program.1]```

**Include additional text from an include file**

```help2man --include [extra.h2m] [program] > [program.1]```

**Write output directly to a file**

```help2man -o [program.1] [program]```

**Suppress "info" pointer in the generated page**

```help2man -N [program] > [program.1]```

# SYNOPSIS

**help2man** [_options_] _executable_

# PARAMETERS

_EXECUTABLE_
> Program whose --help and --version output will be used to generate the man page.

**-n**, **--name** _STRING_
> Short description for the NAME section.

**-s**, **--section** _NUM_
> Man page section number (default: 1).

**-i**, **--include** _FILE_
> Include extra material from file. The file uses `[section]` headers to place text.

**-I**, **--opt-include** _FILE_
> Like **-i** but does not fail if file is missing.

**-N**, **--no-info**
> Suppress the "see also info page" pointer.

**-o**, **--output** _FILE_
> Write output to file instead of stdout.

**-l**, **--locale** _STRING_
> Set locale for fetching help output (e.g., for translated pages).

**-L**, **--libtool**
> Drop libtool `lt-` prefix from program name.

**-p**, **--info-page** _NAME_
> Name of info page to reference.

**--no-discard-stderr**
> Include stderr output when generating the man page.

**--version**
> Show help2man version.

# DESCRIPTION

**help2man** generates man pages from a program's `--help` and `--version` output. It parses the structured help text and formats it as troff-style man page source, creating basic documentation automatically.

The tool produces minimal man pages suitable for programs that follow GNU conventions for help output. Additional content can be added via include files (`.h2m`), which support inserting text before or after automatically generated sections using `[section]` headers.

# CAVEATS

Output quality depends heavily on the format of the program's `--help` output. Works best with GNU-style option formatting (leading dashes, aligned descriptions). Programs with non-standard help text may produce poorly formatted man pages that require manual editing. Does not document features not mentioned in `--help` output.

# HISTORY

help2man was created by **Brendan O'Dea** as part of the **GNU** project to automate man page generation for GNU utilities during the build process.

# SEE ALSO

[man](/man/man)(1), [pod2man](/man/pod2man)(1), [ronn](/man/ronn)(1)
