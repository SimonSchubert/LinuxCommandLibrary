# TAGLINE

reverse regex matching string generator

# TLDR

**Generate all strings** matching a regex

```exrex '[a-z]{2}'```

Generate a single **random** matching string

```exrex -r '[A-Za-z0-9]{8}'```

**Count** the number of matching strings

```exrex -c '[0-9]{3}'```

**Limit** the range size for unbounded quantifiers (+, *)

```exrex -l [5] '[0-9]+'```

Cap the **maximum number** of generated strings

```exrex -m [10] '[a-z]+'```

Use a custom output **delimiter**

```exrex -d ', ' '[ab]{2}'```

# SYNOPSIS

**exrex** [_options_] _regex_

# PARAMETERS

_REGEX_
> Regular expression pattern to generate strings from.

**-r**, **--random**
> Return a single random string that matches the regex.

**-c**, **--count**
> Print the number of matching strings instead of the strings.

**-l** _N_, **--limit** _N_
> Maximum range size for unbounded quantifiers (+, *). Default is 20.

**-m** _N_, **--max-number** _N_
> Maximum number of strings to generate. Default is -1 (all).

**-o** _FILE_, **--output** _FILE_
> Write output to FILE instead of standard output.

**-d** _DELIM_, **--delimiter** _DELIM_
> Output delimiter (default newline).

**-s**, **--simplify**
> Simplify the regular expression.

**-v**, **--verbose**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**exrex** is a command-line tool and Python library that generates all or random strings matching a given regular expression. It's useful for testing, fuzzing, and generating sample data.

The tool parses regex patterns and produces strings that would match, rather than matching existing strings. It supports most common regex features including character classes, quantifiers, groups, and alternation.

exrex is particularly useful for generating test inputs, creating wordlists, or understanding what patterns a regex would match.

# CAVEATS

Unlimited quantifiers (*, +) are bounded by default. Complex patterns may generate massive output. Not all regex features supported. Memory usage scales with output size.

# HISTORY

exrex is a Python-based regex string generator created for testing and security research, providing reverse regex matching capabilities for generating test data and wordlists.

# SEE ALSO

[grep](/man/grep)(1), [sed](/man/sed)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/asciimoo/exrex)```

<!-- verified: 2026-07-15 -->
