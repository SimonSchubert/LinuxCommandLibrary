# TAGLINE

validate PostScript Printer Description files

# TLDR

**Test a PPD file**

```cupstestppd [file.ppd]```

**Test with verbose output**

```cupstestppd -v [file.ppd]```

**Test with detailed conformance and all PPD information**

```cupstestppd -vv [file.ppd]```

**Quiet mode** (only errors)

```cupstestppd -q [file.ppd]```

**Test from stdin**

```cat [file.ppd] | cupstestppd -```

**Test with relaxed conformance** requirements

```cupstestppd -r [file.ppd]```

# SYNOPSIS

**cupstestppd** [_options_] _file.ppd_ [_files..._]

# PARAMETERS

**-v**
> Detailed conformance testing results.

**-vv**
> Display all PPD information in addition to detailed conformance results.

**-q**
> Quiet mode, only show errors.

**-r**
> Relaxed conformance: treat common whitespace, control character, and formatting problems as non-fatal.

**-W** _category_
> Report errors as warnings for a category: filters, profiles, sizes, translations, all, or none.

**-I** _category_
> Ignore errors for a category: filename or filters.

**-R** _root_
> Set alternate root directory.

# DESCRIPTION

**cupstestppd** tests the conformance of PPD files to the Adobe PostScript Printer Description file format specification version 4.3. It can also be used to list the supported options and available fonts in a PPD file. It accepts filenames on the command line or reads from standard input when given a dash (-) argument.

Exit code 0 indicates a valid PPD file.

# SEE ALSO

[cupsd](/man/cupsd)(8), [lpadmin](/man/lpadmin)(8)
