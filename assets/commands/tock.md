# TAGLINE

Digital clock for the terminal

# TLDR

**Display a centered 24-hour clock with seconds**

```tock -s -m -c```

**Custom color and font dimensions**

```tock -C [4] -W [3] -H [2]```

**Custom date format**

```tock -f "[%A, %B %d]"```

# SYNOPSIS

**tock** [_options_]

# PARAMETERS

**-s**
> Display seconds.

**-m**
> Use 24-hour (military) time.

**-c**
> Center the clock in the terminal.

**-C** _COLOR_
> Set the clock color.

**-f** _FORMAT_
> Custom date format string.

# DESCRIPTION

**tock** is a digital clock for the terminal inspired by tty-clock. It supports customizable positioning, font sizing, 12/24-hour modes, color selection, seconds display, and date formatting.

# CAVEATS

UNIX only due to termios usage.

# HISTORY

**tock** was created by **nwtnni** and is written in **Rust**.

# SEE ALSO

[date](/man/date)(1)
