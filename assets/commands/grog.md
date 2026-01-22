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

**grog** analyzes roff input files and suggests the appropriate groff command line. It detects which macro packages and preprocessors are needed.

The tool examines document content for macro usage like .TH (man), .PP (ms), and preprocessor commands. It outputs the complete groff command.

grog guesses correct groff options from files.

# CAVEATS

Part of groff package. May not detect all requirements. Suggestions should be verified.

# HISTORY

grog was developed as part of **GNU groff** to simplify determining the correct options for complex documents.

# SEE ALSO

[groff](/man/groff)(1), [nroff](/man/nroff)(1), [troff](/man/troff)(1)
