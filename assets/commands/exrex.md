# TAGLINE

reverse regex matching string generator

# TLDR

**Generate strings from** regex

```exrex '[a-z]{3}'```

**Generate all matches**

```exrex -a '[0-9]{2}'```

**Limit output count**

```exrex -c [10] '[a-z]+'```

**Random generation**

```exrex -r '[A-Za-z0-9]{8}'```

**Print match count**

```exrex -n '[a-z]{2}'```

# SYNOPSIS

**exrex** [_options_] _regex_

# PARAMETERS

_REGEX_
> Regular expression pattern to generate strings from.

**-a**, **--all**
> Generate all possible matching strings.

**-c** _N_, **--count** _N_
> Limit output to N strings.

**-r**, **--random**
> Generate random matching string.

**-n**, **--num**
> Print count of possible matches.

**-d** _DELIM_, **--delimiter** _DELIM_
> Output delimiter (default newline).

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
