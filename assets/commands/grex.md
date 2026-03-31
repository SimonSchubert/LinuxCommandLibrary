# TAGLINE

Regex generator from example strings

# TLDR

**Generate regex from examples**

```grex [foo] [bar] [baz]```

**Convert digits to** `\d`

```grex -d [test1] [test2]```

**Convert whitespace to** `\s` **and words to** `\w`

```grex -s -w [example1] [example2]```

**Case insensitive matching**

```grex -i [example1] [example2]```

**Generate with repetition detection**

```grex -r [aaab] [aaac]```

**Generate without start/end anchors**

```grex --no-anchors [examples...]```

**Read examples from file** (one per line)

```grex -f [examples.txt]```

# SYNOPSIS

**grex** [_options_] _test-strings_

# PARAMETERS

_TEST-STRINGS_
> Example strings to generate regex from.

**-d**, **--digits**
> Convert Unicode decimal digits to \d.

**-D**, **--non-digits**
> Convert non-digit characters to \D.

**-s**, **--spaces**
> Convert Unicode whitespace to \s.

**-S**, **--non-spaces**
> Convert non-whitespace characters to \S.

**-w**, **--words**
> Convert Unicode word characters to \w.

**-W**, **--non-words**
> Convert non-word characters to \W.

**-i**, **--ignore-case**
> Generate case-insensitive regex.

**-e**, **--escape**
> Replace all non-ASCII characters with unicode escape sequences.

**-r**, **--repetitions**
> Detect repeated substrings and convert to quantifier notation.

**--no-anchors**
> Remove ^ and $ anchors (anchors are added by default).

**--no-start-anchor**
> Remove the ^ start anchor only.

**--no-end-anchor**
> Remove the $ end anchor only.

**-f**, **--file** _FILE_
> Read test strings from a file (one per line).

**--help**
> Display help information.

# DESCRIPTION

**grex** generates regular expressions from user-provided test strings. It analyzes the input examples and produces a regex that matches all of them. By default, the generated regex includes ^ and $ anchors.

The tool supports various character class conversions (\d, \s, \w and their inverses), repetition detection, and case-insensitive matching. It is useful for quickly creating regexes without manual pattern analysis.

# CAVEATS

Generated regex may be overly specific or general. Manual refinement often needed. Complex patterns may require additional examples.

# HISTORY

grex was created by **Peter M. Stahl** as a command-line tool to simplify regex creation through example-based learning.

# SEE ALSO

[grep](/man/grep)(1), [sed](/man/sed)(1), [regex](/man/regex)(7)
