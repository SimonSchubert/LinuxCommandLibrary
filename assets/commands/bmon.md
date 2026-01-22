# TLDR

Display **all interfaces**

```bmon -a```

Display data transfer rates in **bits per second**

```bmon -b```

Specify which **interfaces** to display

```bmon -p [interface_1,interface_2,interface_3,...]```

Specify the **rate calculation interval** in seconds

```bmon -R [2.0]```

# SYNOPSIS

**bmon** [_options_]

# DESCRIPTION

**bmon** is a bandwidth monitor and rate estimator that displays network interface statistics in a visual format. It shows real-time throughput, packets per second, and error rates for network interfaces.

The tool provides both a graphical TUI display and text output options suitable for scripting and logging.

# PARAMETERS

**-a, --show-all**
> Show all interfaces, including those with no traffic

**-b, --use-bit**
> Display rates in bits per second instead of bytes

**-p, --policy** _interfaces_
> Comma-separated list of interfaces to display

**-R, --rate-interval** _seconds_
> Interval for rate calculations (default: 1.0)

**-r, --read** _file_
> Read input from file instead of live data

**-o, --output** _format_
> Output format: ascii, curses, format, null

# SEE ALSO

[iftop](/man/iftop)(8), [nethogs](/man/nethogs)(8), [vnstat](/man/vnstat)(1), [nload](/man/nload)(1)
