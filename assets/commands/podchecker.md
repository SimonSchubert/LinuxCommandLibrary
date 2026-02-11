# TAGLINE

Validate Perl POD documentation syntax

# TLDR

**Check POD syntax**

```podchecker [file.pod]```

**Check multiple files**

```podchecker [*.pod]```

**Warnings only**

```podchecker -warnings [file.pod]```

# SYNOPSIS

**podchecker** [_options_] [_files_]

# PARAMETERS

_FILES_
> POD files to check.

**-warnings**
> Show warnings.

**-nowarnings**
> Suppress warnings.

# DESCRIPTION

**podchecker** validates the syntax of Perl POD (Plain Old Documentation) files, reporting errors such as unknown formatting codes, mismatched begin/end blocks, and malformed headings.

It checks for both hard errors that would cause incorrect rendering and warnings about questionable constructs. Use **-warnings** to control the level of warning output. Part of the standard Perl distribution.

# CAVEATS

Perl-specific format. Standard Perl utility.

# HISTORY

podchecker was created for **validating POD** documentation syntax.

# SEE ALSO

[pod2man](/man/pod2man)(1), [pod2html](/man/pod2html)(1), [perldoc](/man/perldoc)(1)

