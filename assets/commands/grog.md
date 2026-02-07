# TAGLINE

Groff command-line option guesser

# TLDR

**Guess groff options**

```grog [file.roff]```

**Process and run groff**

```grog [file.roff] | sh```

**Show command without running**

```grog [file.roff]```

**Process multiple files**

```grog [file1.roff] [file2.roff]```

# SYNOPSIS

**grog** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to analyze.

**-C**
> Compatibility mode.

**--run**
> Execute the suggested command.

**--warnings**
> Enable warnings.

**--help**
> Display help information.

# DESCRIPTION

**grog** analyzes roff input files and suggests the appropriate groff command line. It detects which macro packages and preprocessors are needed by examining document content for macro usage.

The tool outputs the complete groff command with correct options, which can be piped to a shell for execution.

# CAVEATS

Part of groff package. May not detect all requirements. Suggestions should be verified.

# HISTORY

grog was developed as part of **GNU groff** to simplify determining the correct options for complex documents.

# SEE ALSO

[groff](/man/groff)(1), [nroff](/man/nroff)(1), [troff](/man/troff)(1)
