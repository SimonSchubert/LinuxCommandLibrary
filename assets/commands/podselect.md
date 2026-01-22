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

**podselect** extracts sections from Perl POD documentation. Part of Perl.

The tool filters POD content. Selects specific sections.

podselect extracts sections.

# CAVEATS

Perl-specific format. Standard Perl utility.

# HISTORY

podselect was created for **selective POD** section extraction.

# SEE ALSO

[pod2text](/man/pod2text)(1), [podchecker](/man/podchecker)(1), [perldoc](/man/perldoc)(1)

