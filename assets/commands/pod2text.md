# TAGLINE

Convert Perl POD documentation to plain text

# TLDR

**Convert POD to plain text**

```pod2text [file.pod]```

**Output to file**

```pod2text [file.pod] > [output.txt]```

**Specify width**

```pod2text -w [80] [file.pod]```

**Loose formatting**

```pod2text -l [file.pod]```

# SYNOPSIS

**pod2text** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input POD file.

**-w** _WIDTH_
> Output width in columns.

**-l**, **--loose**
> Loose paragraph formatting.

**-q** _QUOTES_
> Quote characters.

**-c**, **--color**
> Use ANSI colors.

# DESCRIPTION

**pod2text** converts Perl POD (Plain Old Documentation) into formatted plain text suitable for terminal display. It renders headings, lists, code blocks, and other POD formatting into readable ASCII output.

The **-w** option sets the output width in columns, **-l** enables loose paragraph formatting with extra spacing, and **-c** enables ANSI color output for enhanced terminal readability. Part of the standard Perl distribution.

# CAVEATS

Perl-specific format. Part of standard Perl.

# HISTORY

pod2text was created for **terminal viewing** of Perl documentation.

# SEE ALSO

[pod2man](/man/pod2man)(1), [pod2html](/man/pod2html)(1), [perldoc](/man/perldoc)(1)

