# TLDR

Search packages containing **file**

```urpmf [filename]```

Search **summary** with AND

```urpmf --summary [keyword1] -a [keyword2]```

Search **description** with OR

```urpmf --description [keyword1] -o [keyword2]```

Search with **exclusion**

```urpmf --description ! [keyword] -F'|'```

# SYNOPSIS

**urpmf** [_OPTIONS_] _PATTERN_

# PARAMETERS

**--summary**
> Search in package summaries

**--description**
> Search in package descriptions

**-a**
> AND operator between patterns

**-o**
> OR operator between patterns

**!**
> Negation (exclude matches)

**-F** _SEP_
> Field separator (default: colon)

# DESCRIPTION

**urpmf** finds files in packages and queries information about them in Mageia Linux. It can search by filename, summary, or description using boolean operators.

Part of the urpmi package management suite for Mageia.

# CAVEATS

Mageia specific. Searches through all configured media. Large queries may take time to process.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmq](/man/urpmq)(8)
