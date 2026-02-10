# TAGLINE

scans files for license information and copyright statements

# TLDR

**Check files for licenses**

```licensecheck [file]```

**Check directory recursively**

```licensecheck -r [directory]```

**Output in machine-readable format**

```licensecheck --copyright -m [file]```

**Check specific file types**

```licensecheck -r --check '*.py' [directory]```

**Show only files with licenses**

```licensecheck -r -l [directory]```

# SYNOPSIS

**licensecheck** [_options_] _files_...

# PARAMETERS

**-r**, **--recursive**
> Check directories recursively.

**-l**, **--lines** _n_
> Check first n lines (default 60).

**-c**, **--check** _regex_
> Check only matching filenames.

**-i**, **--ignore** _regex_
> Ignore matching filenames.

**-m**, **--machine**
> Machine-readable output.

**--copyright**
> Show copyright statements.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**licensecheck** scans files for license information and copyright statements. It examines source code headers to identify the license under which files are distributed.

The tool recognizes many common open-source licenses including GPL, MIT, BSD, Apache, and others.

# RECOGNIZED LICENSES

```
GPL, LGPL, AGPL (various versions)
MIT, BSD (2/3-clause)
Apache, MPL
Artistic, Perl
Public Domain
```

# CAVEATS

Heuristic-based detection may miss or misidentify licenses. Custom licenses need manual review. Only checks file headers.

# HISTORY

licensecheck originated in Debian as a tool for checking license compliance in package source code, helping maintainers verify licensing.

# SEE ALSO

[license](/man/license)(1), [reuse](/man/reuse)(1), [scancode](/man/scancode)(1)
