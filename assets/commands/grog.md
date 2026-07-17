# TAGLINE

Groff command-line option guesser

# TLDR

**Guess the groff command needed for a file**

```grog [file.roff]```

**Guess and immediately run groff**

```grog [file.roff] | sh```

**Process multiple files at once**

```grog [file1.roff] [file2.roff]```

**Read from standard input**

```cat [file.roff] | grog```

# SYNOPSIS

**grog** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to analyze; reads standard input if omitted or given as "-".

**-C**
> Enable AT&T troff compatibility mode (also passed through to the guessed command).

**-v**, **--version**
> Display version information and exit.

**-h**, **--help**
> Display a usage message and exit.

Any other **groff**(1) option (e.g. **-T**, **-k**) is passed through unchanged to the guessed command line.

# DESCRIPTION

**grog** analyzes roff input files and suggests the appropriate groff command line. It detects which macro packages and preprocessors are needed by examining document content for macro usage.

The tool outputs the complete groff command with correct options, which can be piped to a shell for execution.

# CAVEATS

Part of groff package. May not detect all requirements. Suggestions should be verified.

# HISTORY

grog was developed as part of **GNU groff** to simplify determining the correct options for complex documents.

# SEE ALSO

[groff](/man/groff)(1), [nroff](/man/nroff)(1), [troff](/man/troff)(1)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/cgit/groff.git)```

```[Homepage](https://www.gnu.org/software/groff/)```

```[Documentation](https://www.gnu.org/software/groff/groff.html)```

<!-- verified: 2026-07-17 -->
