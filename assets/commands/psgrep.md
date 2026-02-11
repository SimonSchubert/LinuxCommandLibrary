# TAGLINE

Search for processes by name pattern

# TLDR

**Search processes by name**

```psgrep [pattern]```

**Case insensitive search**

```psgrep -i [pattern]```

**Show full command line**

```psgrep -f [pattern]```

# SYNOPSIS

**psgrep** [_options_] _pattern_

# PARAMETERS

_PATTERN_
> Process name pattern.

**-i**
> Case insensitive.

**-f**
> Full command line.

**-v**
> Invert match.

# DESCRIPTION

**psgrep** is a convenience wrapper that combines **ps** and **grep** to search for running processes by name or pattern. It filters the process list and displays matching entries, automatically excluding the grep process itself from the results to avoid false matches.

The tool provides a simpler alternative to the `ps aux | grep pattern` idiom. On many systems, the built-in **pgrep** command offers similar functionality with more options.

# CAVEATS

Different implementations exist. Some systems use pgrep.

# HISTORY

psgrep was created as a **convenience wrapper** for process searching.

# SEE ALSO

[pgrep](/man/pgrep)(1), [ps](/man/ps)(1), [grep](/man/grep)(1)

