# TLDR

This is a reference page for regular expression syntax, not a standalone command.

# SYNOPSIS

**regex** — regular expression pattern matching syntax

# DESCRIPTION

**Regular expressions** (regex) are patterns used to match character combinations in strings. They are supported by many commands including **grep**, **sed**, **awk**, **perl**, and programming languages.

# BASIC REGEX (BRE)

**.**: Match any single character
**\***: Match zero or more of preceding element
**^**: Match start of line
**$**: Match end of line
**[abc]**: Match any character in brackets
**[^abc]**: Match any character not in brackets
**[a-z]**: Match character range
**\\**: Escape special character

# EXTENDED REGEX (ERE)

**+**: Match one or more of preceding element
**?**: Match zero or one of preceding element
**|**: Alternation (OR)
**(...)**: Grouping
**{n}**: Match exactly n times
**{n,}**: Match n or more times
**{n,m}**: Match between n and m times

# CHARACTER CLASSES

**\d**: Digit (PCRE) — equivalent to [0-9]
**\w**: Word character — [a-zA-Z0-9_]
**\s**: Whitespace — [ \t\n\r\f]
**\D**, **\W**, **\S**: Negated versions

# POSIX CLASSES

**[[:alpha:]]**: Alphabetic characters
**[[:digit:]]**: Digits
**[[:alnum:]]**: Alphanumeric
**[[:space:]]**: Whitespace
**[[:upper:]]**: Uppercase letters
**[[:lower:]]**: Lowercase letters

# ANCHORS

**^**: Start of line/string
**$**: End of line/string
**\b**: Word boundary (PCRE)
**\B**: Non-word boundary (PCRE)

# CAVEATS

Different tools support different regex flavors: BRE (basic), ERE (extended), PCRE (Perl-compatible). Use appropriate flags: **grep -E** for ERE, **grep -P** for PCRE.

Escape sequences and metacharacters vary between flavors. Test patterns with your specific tool.

Greedy vs. non-greedy: **\*** and **+** are greedy by default. Use **\*?** and **+?** for non-greedy matching (PCRE).

# SEE ALSO

[grep](/man/grep)(1), [sed](/man/sed)(1), [awk](/man/awk)(1), [perlre](/man/perlre)(1), [regex](/man/regex)(7)
