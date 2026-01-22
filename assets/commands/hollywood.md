# TLDR

**Fill the console** with Hollywood technobabble

```hollywood```

**Exit** hollywood

```Ctrl+C Ctrl+C```

Display **help**

```hollywood -h```

# SYNOPSIS

**hollywood** [_options_]

# DESCRIPTION

**hollywood** fills your terminal with the kind of fake "hacking" screens seen in movies. It creates multiple tmux panes displaying various busy-looking activities like hexdumps, network traffic, system logs, and code scrolling.

The display is purely cosmetic - it doesn't actually perform any real hacking or system modifications. It's designed for entertainment, movie props, or impressing people who don't know better.

Activities displayed include:
- Scrolling hexadecimal data
- Fake system logs
- Network monitoring displays
- Code compilation output
- Directory listings
- Various system utilities

# CAVEATS

Requires tmux and various other tools to be installed. High CPU usage due to running many processes simultaneously. Press Ctrl+C twice to exit (once may only close one pane).

# HISTORY

hollywood was created by Dustin Kirkland at Canonical as a fun side project. It became popular as a way to recreate the unrealistic "hacking" scenes from Hollywood movies, where computers display endless streams of incomprehensible data.

# SEE ALSO

[tmux](/man/tmux)(1), [cmatrix](/man/cmatrix)(1), [no-more-secrets](/man/no-more-secrets)(1)
