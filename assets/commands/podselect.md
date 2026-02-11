# TAGLINE

Extract sections from Perl POD files

# TLDR

**Extract specific sections from POD**

```podselect -section [NAME] [file.pod]```

**Extract multiple sections**

```podselect -section [NAME] -section [SYNOPSIS] [file.pod]```

**Process multiple files**

```podselect -section [NAME] [*.pod]```

# SYNOPSIS

**podselect** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input POD files.

**-section** _NAME_
> Section to extract.

# DESCRIPTION

**podselect** extracts specific named sections from Perl POD (Plain Old Documentation) files. It filters the POD content and outputs only the sections matching the **-section** arguments.

Multiple **-section** flags can be specified to extract several sections at once. This is useful for extracting individual sections like NAME, SYNOPSIS, or DESCRIPTION from larger POD documents. Part of the standard Perl distribution.

# CAVEATS

Perl-specific format. Standard Perl utility.

# HISTORY

podselect was created for **selective POD** section extraction.

# SEE ALSO

[pod2text](/man/pod2text)(1), [podchecker](/man/podchecker)(1), [perldoc](/man/perldoc)(1)

