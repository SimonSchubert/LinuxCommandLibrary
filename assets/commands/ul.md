# TAGLINE

Translate underline sequences for terminals

# TLDR

**Display** file with underlines

```ul [file.txt]```

Display with **dash** underlines

```ul -i [file.txt]```

# SYNOPSIS

**ul** [_OPTIONS_] [_FILE_...]

# PARAMETERS

**-i, --indicated**
> Use dashes (-) for underlining

**-t, --terminal** _TYPE_
> Override terminal type

# DESCRIPTION

**ul** translates underline sequences in text files to the appropriate terminal escape sequences. It processes files containing overstriking (backspace-based underlining) and converts them to display properly on modern terminals.

The tool reads files that use traditional underlining where each underlined character is followed by backspace and underscore.

# CAVEATS

Input must contain traditional overstrike underline sequences. Output depends on terminal capabilities. Modern text rarely uses this format.

# HISTORY

**ul** is part of **util-linux** and dates from early Unix when terminals used overstrike sequences for formatting effects.

# SEE ALSO

[col](/man/col)(1), [colcrt](/man/colcrt)(1)
