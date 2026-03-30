# TAGLINE

fills your terminal with the kind of fake "hacking" screens seen in movies

# TLDR

**Fill the console** with Hollywood technobabble

```hollywood```

Specify the **number of splits** for the screen

```hollywood -s [4]```

Run **without sound** (disable theme song)

```hollywood -q```

Display **help**

```hollywood -h```

# SYNOPSIS

**hollywood** [**-s** _SPLITS_] [**-q**|**--quiet**|**--nosound**]

# PARAMETERS

**-s**, **--splits** _SPLITS_
> The number of splits to divide the screen into.

**-q**, **--quiet**, **--nosound**
> Disable the theme song.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**hollywood** fills your console with Hollywood melodrama technobabble. It splits a byobu/tmux console into multiple panes displaying various busy-looking activities like hexdumps, network traffic, system logs, and code scrolling.

The display is purely cosmetic - it doesn't actually perform any real hacking or system modifications. It tries not to overwhelm the system by running widgets with minimum scheduling priority. It's designed for entertainment, movie props, or impressing people who don't know better.

Activities displayed include:
- Scrolling hexadecimal data
- Fake system logs
- Network monitoring displays
- Code compilation output
- Directory listings
- Various system utilities

# CAVEATS

Requires byobu, tmux, and various other tools to be installed. Recommends packages such as cmatrix, htop, ccze, speedometer, and others for full effect. High CPU usage due to running many processes simultaneously. Press Ctrl+C to exit.

# HISTORY

hollywood was created by Dustin Kirkland at Canonical as a fun side project. It became popular as a way to recreate the unrealistic "hacking" scenes from Hollywood movies, where computers display endless streams of incomprehensible data.

# SEE ALSO

[tmux](/man/tmux)(1), [byobu](/man/byobu)(1), [cmatrix](/man/cmatrix)(1)
