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
> Date for footer.

# DESCRIPTION

**pod2man** converts Perl POD to man page format. Part of Perl distribution.

The tool creates Unix manual pages. Generates nroff/troff output.

pod2man creates man pages.

# CAVEATS

Perl-specific format. Standard Perl utility.

# HISTORY

pod2man was created for **generating man pages** from Perl documentation.

# SEE ALSO

[pod2html](/man/pod2html)(1), [pod2text](/man/pod2text)(1), [man](/man/man)(1)

