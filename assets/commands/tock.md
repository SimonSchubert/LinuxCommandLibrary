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

**-s**, **--second**
> Display seconds.

**-m**, **--military**
> Use 24-hour (military) time format.

**-c**, **--center**
> Center the clock in the terminal (overrides manual positioning).

**-C**, **--color** _COLOR_
> Set the clock color using an ANSI value 0-7 (default: 2).

**-x**, **--x** _X_
> Horizontal 0-indexed position of the clock's top-left corner (default: 0).

**-y**, **--y** _Y_
> Vertical 0-indexed position of the clock's top-left corner (default: 0).

**-W**, **--width** _WIDTH_
> Font width in characters per tile (default: 2).

**-H**, **--height** _HEIGHT_
> Font height in characters per tile (default: 1).

**-f**, **--format** _FORMAT_
> Custom date format string (default: "%F | %Z").

**-h**, **--help**
> Display help information.

# INTERACTIVE KEYS

**q**
> Quit the clock.

**s**
> Toggle seconds display.

**m**
> Toggle 24-hour (military) time.

**0**-**7**
> Change the ANSI color at runtime.

# DESCRIPTION

**tock** is a digital clock for the terminal inspired by tty-clock. It supports customizable positioning, font sizing, 12/24-hour modes, color selection, seconds display, and date formatting.

# CAVEATS

UNIX only due to termios usage.

# HISTORY

**tock** was created by **nwtnni** and is written in **Rust**.

# SEE ALSO

[date](/man/date)(1), [tty-clock](/man/tty-clock)(1), [figlet](/man/figlet)(1)
