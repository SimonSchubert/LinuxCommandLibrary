# TAGLINE

display text output

# TLDR

**Print text**

```echo "[Hello World]"```

**Print without trailing newline**

```echo -n "[text]"```

**Interpret escape sequences**

```echo -e "[Line 1\nLine 2]"```

**Print an environment variable**

```echo $[PATH]```

**Write text to a file**

```echo "[content]" > [file.txt]```

**Append text to a file**

```echo "[more content]" >> [file.txt]```

# SYNOPSIS

**echo** [_options_] [_string_...]

# DESCRIPTION

**echo** displays a line of text to standard output. It's one of the most basic and frequently used commands, essential for scripts, logging, and displaying information to users.

The command exists as both a shell built-in and standalone program.

# PARAMETERS

**-n**
> Don't output trailing newline

**-e**
> Enable interpretation of backslash escapes

**-E**
> Disable interpretation of backslash escapes (default)

# ESCAPE SEQUENCES

(With **-e** flag):

**\n** - Newline
**\t** - Tab
**\r** - Carriage return
**\a** - Alert (bell)
**\b** - Backspace
**\\\\** - Backslash
**\\"** - Double quote
**\xHH** - Hexadecimal byte
**\0NNN** - Octal byte

# CAVEATS

Behavior differs between shells and between the shell built-in and `/bin/echo`. The **-e** flag is not POSIX and is not supported by all implementations. For portable scripts, prefer **printf** which has consistent behavior across platforms. Most shells (bash, zsh, dash) provide echo as a built-in that may behave differently from the external binary.

# HISTORY

**echo** has been part of Unix since Version 2 in **1972**, though its behavior has varied across different Unix variants.

# SEE ALSO

[printf](/man/printf)(1), [cat](/man/cat)(1), [tee](/man/tee)(1)
