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

**podchecker** validates Perl POD documentation syntax. Part of Perl distribution.

The tool finds formatting errors. Reports documentation problems.

podchecker validates POD.

# CAVEATS

Perl-specific format. Standard Perl utility.

# HISTORY

podchecker was created for **validating POD** documentation syntax.

# SEE ALSO

[pod2man](/man/pod2man)(1), [pod2html](/man/pod2html)(1), [perldoc](/man/perldoc)(1)

