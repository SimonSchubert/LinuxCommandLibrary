# TLDR

**Check for common errors**

```pofilter -t [check] [input.po] [output.po]```

**List available checks**

```pofilter --list```

**Check accelerators**

```pofilter -t accelerators [input.po] [output.po]```

**Check printf format**

```pofilter -t printf [input.po] [output.po]```

**Multiple checks**

```pofilter -t escapes -t variables [input.po] [output.po]```

# SYNOPSIS

**pofilter** [_options_] _input_ _output_

# PARAMETERS

**-t**, **--test** _test_
> Test to run.

**-l**, **--language** _lang_
> Target language.

**--excludefilter** _filter_
> Exclude specific test.

**--list**
> List available tests.

**-i**, **--input** _path_
> Input file or directory.

**-o**, **--output** _path_
> Output file or directory.

# DESCRIPTION

**pofilter** filters PO files to find translation errors. It checks for common issues like missing variables, inconsistent punctuation, and encoding problems.

Part of the Translate Toolkit.

# EXAMPLES

```bash
# List all available checks
pofilter --list

# Check for variables
pofilter -t variables translations.po errors.po

# Check escapes and printf
pofilter -t escapes -t printf input.po output.po

# Exclude specific check
pofilter --excludefilter=blank input.po output.po

# Process directory
pofilter -t all locale/ errors/
```

# COMMON CHECKS

```
variables   - Check variable placeholders
printf      - Check printf format strings
accelerators - Check keyboard accelerators
escapes     - Check escape sequences
newlines    - Check newline consistency
```

# CAVEATS

Output contains only problematic entries. Part of Translate Toolkit.

# HISTORY

pofilter is part of the **Translate Toolkit** developed by **Translate House** for translation quality assurance.

# SEE ALSO

[msgfmt](/man/msgfmt)(1), [pomerge](/man/pomerge)(1), [pocount](/man/pocount)(1), [translate-toolkit](/man/translate-toolkit)(1)
