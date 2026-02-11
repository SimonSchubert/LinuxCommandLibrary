# TAGLINE

Filter or count adjacent duplicate lines

# TLDR

**Remove adjacent duplicate lines**

```sort [file] | uniq```

**Show only duplicate lines**

```sort [file] | uniq -d```

**Show only unique lines**

```sort [file] | uniq -u```

**Count occurrences**

```sort [file] | uniq -c```

**Ignore case when comparing**

```sort [file] | uniq -i```

**Skip first N fields** when comparing

```sort [file] | uniq -f [N]```

**Skip first N characters** when comparing

```sort [file] | uniq -s [N]```

# SYNOPSIS

**uniq** [_options_] [_input_ [_output_]]

# PARAMETERS

**-c**, **--count**
> Prefix lines with occurrence count

**-d**, **--repeated**
> Only print duplicate lines, one per group

**-D**
> Print all duplicate lines

**-u**, **--unique**
> Only print unique lines (occurring once)

**-i**, **--ignore-case**
> Ignore case when comparing

**-f** _N_, **--skip-fields**=_N_
> Skip first N fields when comparing

**-s** _N_, **--skip-chars**=_N_
> Skip first N characters when comparing

**-w** _N_, **--check-chars**=_N_
> Compare only first N characters

**-z**, **--zero-terminated**
> Line delimiter is NUL, not newline

# DESCRIPTION

**uniq** filters adjacent matching lines from input, writing unique lines to output. It only compares consecutive lines, so input typically needs to be sorted first.

Commonly used with **sort** in a pipeline: **sort file | uniq** removes all duplicates. Adding **-c** shows frequency counts, useful for analyzing log files or finding common patterns.

The **-d** option shows only lines that appear more than once, while **-u** shows only lines appearing exactly once. These are mutually exclusive perspectives on the data.

Field and character skipping options allow ignoring prefixes (like timestamps or line numbers) when comparing for uniqueness.

# CAVEATS

Uniq only removes **adjacent** duplicates. Without sorting first, non-adjacent duplicates remain. Always use **sort | uniq** or **sort -u** for true deduplication.

**sort -u** is often more efficient than **sort | uniq** as it removes duplicates during sorting rather than in a separate pass.

The count option (**-c**) prefixes with spaces and count, which may need processing for further use.

# SEE ALSO

[sort](/man/sort)(1), [comm](/man/comm)(1), [cut](/man/cut)(1), [wc](/man/wc)(1)
