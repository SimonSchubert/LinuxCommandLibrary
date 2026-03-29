# TAGLINE

Terminal digital clock

# TLDR

**Display a centered clock** with seconds

```tty-clock -c -s```

**Display in 12-hour format** with bold font

```tty-clock -t -b```

**Display with a box border** in green

```tty-clock -x -C 2```

**Display UTC time** with a custom date format

```tty-clock -u -f "[%A %d %B]"```

**Display in screensaver mode** (exits on keypress)

```tty-clock -S -c -s```

**Display with bouncing motion** and blinking colon

```tty-clock -r -B```

# SYNOPSIS

**tty-clock** [**-iuvsScbtrahDBxn**] [**-C** _0-7_] [**-f** _format_] [**-d** _delay_] [**-a** _nsdelay_] [**-T** _tty_]

# PARAMETERS

**-s**
> Display seconds.

**-S**
> Screensaver mode; exit on first keypress.

**-x**
> Show a box around the clock.

**-c**
> Center the clock on the terminal.

**-C** _0-7_
> Set clock color (0=black, 1=red, 2=green, 3=yellow, 4=blue, 5=magenta, 6=cyan, 7=white).

**-b**
> Enable bold font.

**-t**
> Use 12-hour (AM/PM) time format.

**-u**
> Display UTC time.

**-T** _tty_
> Display clock on the specified terminal device.

**-r**
> Enable bouncing motion; clock bounces off terminal edges.

**-f** _format_
> Custom date format string (per **strftime**(3)).

**-n**
> Do not quit on keypress; must be killed with a signal.

**-D**
> Hide the date display.

**-B**
> Enable blinking colon separator.

**-d** _delay_
> Set redraw delay in seconds (default: 1).

**-a** _nsdelay_
> Additional nanosecond delay between redraws.

**-i**
> Display clock information (version, compiled options).

**-v**
> Display version information.

**-h**
> Display help text.

# DESCRIPTION

**tty-clock** is a terminal-based digital clock built with the ncurses library. It renders the current time in large block digits directly in the terminal, with optional date display below. The clock supports various display modes including centering, bouncing animation, screensaver mode, and customizable colors.

While running, the clock responds to keyboard commands: **K/J/H/L** for vi-style repositioning, **0-7** to change color, **B** to toggle bold, **X** to toggle the box border, **C** to center, **R** for bouncing mode, **S** to toggle seconds, **T** for 12-hour format, and **Q** to quit.

# CAVEATS

The **-C** color option only supports the basic 8-color terminal palette. Centering with **-c** disables vi-style movement commands. When using **-n** mode, the process must be terminated with a signal since keypress exit is disabled. Requires **libncurses** to be installed.

# HISTORY

**tty-clock** was created by **Martin Duquesnoy** (xorg62) in **2008** as a lightweight terminal clock utility written in C. The project has been community-maintained since, with contributions improving signal handling, locale compatibility, and ncurses support over the years.

# SEE ALSO

[tty](/man/tty)(1), [date](/man/date)(1), [watch](/man/watch)(1)
