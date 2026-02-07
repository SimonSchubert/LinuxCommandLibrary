# TAGLINE

Regex generator from example strings

# TLDR

**Generate regex from examples**

```grex [foo] [bar] [baz]```

**Case insensitive matching**

```grex -i [example1] [example2]```

**Allow digits**

```grex -d [test1] [test2]```

**Escape special characters**

```grex -e [example]```

**Output with anchors**

```grex --with-anchors [examples...]```

# SYNOPSIS

**grex** [_options_] _test-strings_

# PARAMETERS

_TEST-STRINGS_
> Example strings to generate regex from.

**-d**, **--digit**
> Convert digits to \d.

**-s**, **--space**
> Convert spaces to \s.

**-w**, **--word**
> Convert alphanumerics to \w.

**-i**, **--ignore-case**
> Case insensitive matching.

**-e**, **--escape**
> Escape all non-ASCII chars.

**--with-anchors**
> Add start/end anchors.

**-r**, **--repetition**
> Detect repetitions.

**--help**
> Display help information.

# DESCRIPTION

**grex** generates regular expressions from user-provided test strings. It analyzes the input examples and produces a regex that matches all of them.

The tool supports various character class conversions and can detect patterns like repetitions. It is useful for quickly creating regexes without manual pattern analysis.

# CAVEATS

Generated regex may be overly specific or general. Manual refinement often needed. Complex patterns may require additional examples.

# HISTORY

grex was created by **Peter M. Stahl** as a command-line tool to simplify regex creation through example-based learning.

# SEE ALSO

[grep](/man/grep)(1), [sed](/man/sed)(1), [regex](/man/regex)(7)
