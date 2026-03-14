# TAGLINE

calculates Levenshtein distance between strings

# TLDR

**Compare two strings and show the distance**

```lev_comp "[string1]" "[string2]"```

**Compare strings with detailed distance output**

```lev_comp -d "[string1]" "[string2]"```

**Compare strings case-insensitively**

```lev_comp -i "[String1]" "[string2]"```

# SYNOPSIS

**lev_comp** [_options_] _string1_ _string2_

# PARAMETERS

_STRING1_ _STRING2_
> Strings to compare.

**-d**
> Show Levenshtein distance.

**-i**
> Case insensitive comparison.

**--help**
> Display help information.

# DESCRIPTION

**lev_comp** calculates the Levenshtein distance between two strings. The distance represents the minimum number of single-character edit operations (insertions, deletions, or substitutions) needed to transform one string into the other.

A lower distance means the strings are more similar. A distance of zero means the strings are identical.

# CAVEATS

This is a niche utility and may not be available in standard package repositories. Only handles simple edit distance without support for weighted operations or transpositions.

# HISTORY

lev_comp implements **Levenshtein distance**, named after Vladimir Levenshtein who defined the metric in 1965.

# SEE ALSO

[diff](/man/diff)(1), [cmp](/man/cmp)(1)
