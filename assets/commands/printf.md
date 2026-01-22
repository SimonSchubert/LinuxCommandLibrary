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

**printf** formats and prints data. C-style formatted output.

The tool provides precise output control. Standard Unix command.

printf formats output.

# CAVEATS

Format string required. More portable than echo.

# HISTORY

printf originated from **C programming language** formatting functions.

# SEE ALSO

[echo](/man/echo)(1), [print](/man/print)(1), [fmt](/man/fmt)(1)

