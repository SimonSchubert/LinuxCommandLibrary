# TAGLINE

validate PostScript Printer Description files

# TLDR

**Test a PPD file**

```cupstestppd [file.ppd]```

**Test with verbose output**

```cupstestppd -v [file.ppd]```

**Quiet mode** (only errors)

```cupstestppd -q [file.ppd]```

# SYNOPSIS

**cupstestppd** [_options_] _file.ppd_ [_files..._]

# PARAMETERS

**-v**
> Verbose output.

**-q**
> Quiet mode, only show errors.

**-W** _level_
> Set warning level (none, relaxed, all).

**-R** _root_
> Set alternate root directory.

# DESCRIPTION

**cupstestppd** validates PostScript Printer Description (PPD) files for use with CUPS. It checks for conformance issues and common errors.

Exit code 0 indicates a valid PPD file.

# SEE ALSO

[cupsd](/man/cupsd)(8), [lpadmin](/man/lpadmin)(8)
