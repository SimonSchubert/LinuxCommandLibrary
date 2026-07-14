# TAGLINE

standard Unix line editor

# TLDR

**Start ed with** file

```ed [file.txt]```

**Print line 5**

```5p```

**Print all lines**

```,p```

**Substitute text**

```s/old/new/```

**Substitute globally** on line

```s/old/new/g```

**Append after** current line

```a```

**Write and quit**

```wq```

**Edit a file non-interactively** by piping commands to ed

```printf '%s\n' ',s/old/new/g' 'w' 'q' | ed -s [file.txt]```

# SYNOPSIS

**ed** [_options_] [_file_]

# PARAMETERS

_FILE_
> File to edit.

**-p** _STRING_, **--prompt=**_STRING_
> Use STRING as the command prompt (there is no prompt by default).

**-s**, **--quiet**, **--script**
> Suppress diagnostics, byte counts and the '!' prompt: the usual choice for scripts.

**-E**, **--extended-regexp**
> Use extended regular expressions instead of basic ones.

**-G**, **--traditional**
> Run in compatibility mode with the traditional Unix ed.

**-l**, **--loose-exit-status**
> Exit with 0 status even if a command fails.

**-r**, **--restricted**
> Restricted mode: disallow shell escapes and editing files outside the current directory.

**-v**, **--verbose**
> Print full error messages rather than a bare '?'.

**--help**
> Display help and exit.

**--version**
> Display version and exit.

# DESCRIPTION

**ed** is the standard Unix line editor. It operates in command mode by default, accepting single-letter commands to navigate, view, and modify text. It's the ancestor of sed and vi.

Commands typically consist of an address or range followed by a command letter. Addresses can be line numbers, patterns, or special characters (. for current, $ for last line).

ed is useful for scripted editing, as commands can be piped to it. Its minimal interface makes it valuable for emergency system recovery when full-screen editors aren't available.

# CAVEATS

No visual feedback by default. Errors reported with "?" unless verbose. Learning curve for command syntax. Not suitable for casual editing.

# HISTORY

ed was written by **Ken Thompson** at Bell Labs in **1969**, making it one of the earliest Unix programs. Its design influenced sed, ex, vi, and ultimately modern text editors.

# SEE ALSO

[sed](/man/sed)(1), [vi](/man/vi)(1), [ex](/man/ex)(1)

# RESOURCES

```[Homepage](https://www.gnu.org/software/ed/)```

```[Documentation](https://www.gnu.org/software/ed/manual/ed_manual.html)```

<!-- verified: 2026-07-14 -->
