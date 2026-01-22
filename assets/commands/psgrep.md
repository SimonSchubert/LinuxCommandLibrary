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

**psgrep** searches for processes by name. Combines ps and grep.

The tool finds running processes. Convenient wrapper.

psgrep finds processes.

# CAVEATS

Different implementations exist. Some systems use pgrep.

# HISTORY

psgrep was created as a **convenience wrapper** for process searching.

# SEE ALSO

[pgrep](/man/pgrep)(1), [ps](/man/ps)(1), [grep](/man/grep)(1)

