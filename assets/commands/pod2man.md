# TAGLINE

Convert Perl POD documentation to man pages

# TLDR

**Convert POD to man page**

```pod2man [file.pod] > [file.1]```

**Specify section**

```pod2man --section=[1] [file.pod] > [file.1]```

**Set name and release**

```pod2man --name="[NAME]" --release="[1.0]" [file.pod] > [file.1]```

# SYNOPSIS

**pod2man** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input POD file.

**--section** _N_
> Man page section.

**--name** _NAME_
> Man page name.

**--release** _VERSION_
> Release version string.

**--center** _TEXT_
> Center header text.

**--date** _DATE_
> Date for left-hand footer (default: input file modification date).

**--utf8**
> Assume UTF-8 encoding for input.

**--stderr**
> Print errors to stderr.

**--fixed** _FONT_
> Fixed-width font for verbatim text.

# DESCRIPTION

**pod2man** is a front-end for Pod::Man, converting Perl POD (Plain Old Documentation) into Unix manual page format (*roff). The output can be displayed with **nroff** via **man**, or printed with **troff**.

If no input file is given, it reads from STDIN. If no output file is given, it writes to STDOUT. The default center header is "User Contributed Perl Documentation". Part of the standard Perl distribution, commonly used in module build systems.

# CAVEATS

Perl-specific format. Standard Perl utility.

# HISTORY

pod2man was created for **generating man pages** from Perl documentation.

# SEE ALSO

[pod2html](/man/pod2html)(1), [pod2text](/man/pod2text)(1), [man](/man/man)(1), [nroff](/man/nroff)(1)

