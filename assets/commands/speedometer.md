# TAGLINE

Real-time network traffic ASCII graphs

# TLDR

Show **network traffic** graph for an interface

```speedometer -r [eth0] -t [eth0]```

Monitor **received** bytes only

```speedometer -r [eth0]```

Monitor **transmitted** bytes only

```speedometer -t [eth0]```

Track **file download** progress

```speedometer -f [path/to/file] [expected_size]```

Use **multiple columns** for different sources

```speedometer -r [eth0] -c -t [eth0]```

Set **refresh interval**

```speedometer -i [seconds] -r [eth0]```

# SYNOPSIS

**speedometer** [_OPTIONS_] _tap_ [_tap_...]

# PARAMETERS

**-r** _interface_
> Monitor received bytes on network interface

**-t** _interface_
> Monitor transmitted bytes on network interface

**-f** _filename_ [_size_]
> Track file download with optional progress bar

**-c**
> Start a new display column

**-i** _seconds_
> Set refresh interval (default: 1)

**-b**
> Use blocky display instead of smooth characters

**-l**
> Use linear scale instead of logarithmic

**-s**
> Show speeds in bits/second instead of bytes/second

**-m** _max_
> Set maximum bytes/second for chart

**-n** _min_
> Set minimum bytes/second for chart

**-k** _colors_
> Terminal color support (1, 16, 88, or 256)

**-p**
> Plain text display mode

**-x**
> Exit when file reaches expected size

**-z**
> Report zero for non-existent files

# DESCRIPTION

**speedometer** displays real-time network traffic or file transfer speeds as ASCII graphs in the terminal. It reads data from network interfaces or monitors file growth, presenting the information visually with customizable scales and refresh rates.

Multiple data sources (taps) can be displayed simultaneously in columns, allowing comparison of upload/download speeds or monitoring multiple interfaces. The tool is useful for monitoring transfers, debugging network issues, and visualizing bandwidth usage.

# CAVEATS

Requires access to network interface statistics in /proc or /sys. Interface names vary by system (eth0, enp0s3, wlan0, etc.). Large refresh intervals may miss traffic spikes. Terminal must support the display characters being used.

# HISTORY

**speedometer** was created as a Python script for visualizing network bandwidth. The tool provides a lightweight alternative to graphical network monitors, suitable for remote SSH sessions and headless servers. It has been available in Linux distribution repositories since the mid-**2000s**.

# SEE ALSO

[iftop](/man/iftop)(8), [nethogs](/man/nethogs)(8), [bmon](/man/bmon)(1), [vnstat](/man/vnstat)(1)
