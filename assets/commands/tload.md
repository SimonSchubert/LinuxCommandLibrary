# TAGLINE

Graphical representation of system load average

# TLDR

**Show a live ASCII graph** of the system load on the current terminal

```tload```

**Display the graph on a specific tty** (e.g. a secondary virtual console)

```tload [/dev/tty2]```

**Set the vertical scale** (characters between graph ticks — smaller value = larger scale)

```tload -s [1]```

**Update the graph every 5 seconds** instead of the default

```tload -d [5]```

**Combine scale and update interval**

```tload -s 2 -d 2```

# SYNOPSIS

**tload** [_options_] [_tty_]

# PARAMETERS

**-s** _NUMBER_, **--scale** _NUMBER_
> Vertical scale in characters between graph ticks. A smaller value produces a taller, more sensitive graph.

**-d** _SECONDS_, **--delay** _SECONDS_
> Seconds between redraws. Setting **-d 0** disables the alarm and freezes the display.

**-h**, **--help**
> Display help text and exit.

**-V**, **--version**
> Print version information and exit.

# DESCRIPTION

**tload** prints a rolling ASCII graph of the **1-, 5-, and 15-minute load averages** read from **/proc/loadavg** to the specified tty — or to the terminal that started tload if none is given. Each column in the graph represents one sample, so the display scrolls from right to left as new values arrive.

The current load averages are also printed at the top of the screen in the familiar **uptime** format. tload is especially useful on headless servers, serial consoles, and tmux panes where a full curses-based monitor such as **top** or **htop** would be overkill.

The utility exits on any keystroke (**q**, **Ctrl-C**, etc.) and redraws cleanly on SIGWINCH when the terminal is resized.

# FILES

**/proc/loadavg**
> Source file read every update cycle for the three load-average values.

# CAVEATS

Passing **-d 0** sets the internal **alarm(2)** timer to zero, which never fires; the display therefore remains static until the process is killed. The vertical scale is in whole characters, so very quiet systems may show a flat line unless **-s 1** is used.

# HISTORY

**tload** originated in the early **procps** utilities for Linux (mid-1990s) as a lightweight counterpart to **xload** on systems without X11. It is now maintained as part of the **procps-ng** suite alongside **ps**, **top**, **uptime**, and **w**.

# SEE ALSO

[uptime](/man/uptime)(1), [top](/man/top)(1), [htop](/man/htop)(1), [w](/man/w)(1), [ps](/man/ps)(1)
