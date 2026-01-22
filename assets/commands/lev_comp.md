# TLDR

**Compare strings**

```lev_comp "[string1]" "[string2]"```

**Show distance**

```lev_comp -d "[string1]" "[string2]"```

**Case insensitive**

```lev_comp -i "[String1]" "[string2]"```

# SYNOPSIS

**lev_comp** [_options_] _string1_ _string2_

# PARAMETERS

_STRING1_ _STRING2_
> Strings to compare.

**-d**
> Show Levenshtein distance.

**-i**
> Case insensitive.

**--help**
> Display help information.

# DESCRIPTION

**lev_comp** calculates Levenshtein distance between strings. The distance measures edit operations needed.

The tool compares string similarity. Lower distance means more similar strings.

lev_comp measures string distance.

# CAVEATS

Specific implementation. May not be widely available. Simple edit distance.

# HISTORY

lev_comp implements **Levenshtein distance**, named after Vladimir Levenshtein who defined the metric in 1965.

# SEE ALSO

[diff](/man/diff)(1), [cmp](/man/cmp)(1)
