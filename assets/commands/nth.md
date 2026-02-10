# TAGLINE

extracts specific fields from input

# TLDR

**Extract nth field**

```echo "[a b c]" | nth [2]```

**Extract from CSV**

```nth -d "," [1] < [file.csv]```

**Extract multiple fields**

```nth [1] [3] [5] < [file.txt]```

**Use custom delimiter**

```nth -d ":" [1] < [/etc/passwd]```

# SYNOPSIS

**nth** [_options_] _fields_ [_file_]

# PARAMETERS

_FIELDS_
> Field numbers to extract (1-indexed).

**-d** _DELIMITER_
> Field delimiter (default: whitespace).

**-0**
> Use null as output separator.

**--help**
> Display help information.

# DESCRIPTION

**nth** extracts specific fields from input. Simple alternative to awk/cut.

The tool handles field extraction efficiently. Cleaner syntax than awk.

# CAVEATS

Field numbering starts at 1. Simpler than awk but less powerful.

# HISTORY

nth provides **simple field extraction** as an alternative to awk and cut.

# SEE ALSO

[cut](/man/cut)(1), [awk](/man/awk)(1), [paste](/man/paste)(1)

