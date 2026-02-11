# TAGLINE

Format and print data with specifiers

# TLDR

**Print formatted output**

```printf "%s\n" "Hello"```

**Print with variables**

```printf "Name: %s, Age: %d\n" "[name]" [25]```

**Print hexadecimal**

```printf "%x\n" [255]```

**Print with padding**

```printf "%10s\n" "text"```

**Print floating point**

```printf "%.2f\n" [3.14159]```

# SYNOPSIS

**printf** _format_ [_arguments_]

# PARAMETERS

_FORMAT_
> Format string.

_ARGUMENTS_
> Values to format.

**%s**
> String.

**%d**
> Integer.

**%f**
> Float.

**%x**
> Hexadecimal.

**%o**
> Octal.

# DESCRIPTION

**printf** formats and prints data according to a format string, similar to the C library function of the same name. The format string can contain literal text, escape sequences like **\n** and **\t**, and conversion specifiers such as **%s** for strings, **%d** for integers, **%f** for floating-point numbers, and **%x** for hexadecimal.

Unlike **echo**, printf provides precise control over output formatting and behaves consistently across shells and platforms. If more arguments are provided than the format string consumes, the format string is reused, making it easy to process lists. The command does not append a trailing newline unless explicitly included with **\n** in the format string.

printf is part of GNU coreutils and is also available as a shell built-in in most shells. It is the preferred tool for generating formatted output in portable shell scripts.

# CAVEATS

Format string required. More portable than echo.

# HISTORY

printf originated from **C programming language** formatting functions.

# SEE ALSO

[echo](/man/echo)(1), [print](/man/print)(1), [fmt](/man/fmt)(1)

