# TLDR

**Check the printcap database for errors**

```checkpc```

**Fix permissions and create missing files**

```sudo checkpc -f```

**Print verbose printcap information**

```checkpc -p```

**Report job files older than specified age**

```checkpc -A [7D]```

**Remove junk files older than specified age**

```checkpc -r -A [7D]```

**Truncate log files to specified size**

```checkpc -t [10M]```

# SYNOPSIS

**checkpc** [**-aflprsV**] [**-A** _age_] [**-D** _debugflags_] [**-t** _size_]

# DESCRIPTION

**checkpc** validates the printcap database and printer spool directories for the LPRng print system. It checks file permissions, ownership, and directory structure, reporting problems and optionally fixing them.

The command is useful when installing a new printcap configuration or cleaning up existing printer spoolers. It can identify and remove stale job files and truncate oversized log files.

# PARAMETERS

**-a**
> Do not create accounting files

**-f**
> Fix mode: create missing files and fix permissions. May need multiple runs

**-l**
> Do not create log files

**-p**
> Print verbose printcap information

**-r**
> Remove junk or job files older than age (requires -A)

**-s**
> Do not create filter status files

**-A** _age_
> Report files older than age. Suffix: D (days), H (hours), M (minutes), S (seconds). Default: days

**-D** _debugflags_
> Enable debugging flags

**-t** _size_
> Truncate log files to size in K (kilobytes) or M (megabytes, default)

**-V**
> Print version information

# CAVEATS

The **-f** option should be run as root. Running as non-root will report many permission failures. Part of **LPRng**, not CUPS. Systems with both installed may have conflicts.

# HISTORY

**checkpc** is part of **LPRng** (LPR Next Generation), an enhanced printer spooler system with functionality similar to the original Berkeley LPR software but with additional features and improved security.

# SEE ALSO

[lpr](/man/lpr)(1), [lpq](/man/lpq)(1), [lprm](/man/lprm)(1), [lpc](/man/lpc)(8)
