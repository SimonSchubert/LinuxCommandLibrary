# TAGLINE

automatically finds the fastest Debian mirror and generates an appropriate

# TLDR

Create **sources.list** using the lowest latency server

```sudo netselect-apt```

Specify **Debian branch** (stable is default)

```sudo netselect-apt [testing]```

Include **non-free section**

```sudo netselect-apt -n```

Specify a **country** for the mirror list lookup

```sudo netselect-apt -c [India]```

# SYNOPSIS

**netselect-apt** [_options_] [_distribution_]

# PARAMETERS

**-n, --non-free**
> Include non-free section in sources.list

**-c, --country _name_**
> Limit mirror selection to a specific country

**-f, --ftp**
> Use FTP mirrors instead of HTTP

**-s, --sources**
> Include deb-src lines for source packages

**-o, --outfile _file_**
> Write output to specified file instead of sources.list

**_distribution_**
> Debian release name: stable, testing, unstable, or codename

# DESCRIPTION

**netselect-apt** automatically finds the fastest Debian mirror and generates an appropriate sources.list file. It downloads the current mirror list, tests each server using **netselect**, and creates sources.list with the fastest mirror.

The tool fetches the official Debian mirror list and filters by country if specified. It then measures latency to each mirror and selects the one with the best performance for your location.

This is particularly useful when setting up new Debian systems or when experiencing slow package downloads from the default mirror.

# CAVEATS

Requires root privileges. Network conditions vary; run periodically to find currently optimal mirrors. Generated sources.list should be reviewed before replacing the system file. Mirror speed may differ for actual large downloads versus small test packets.

# SEE ALSO

[netselect](/man/netselect)(1), [apt](/man/apt)(8), [sources.list](/man/sources.list)(5)
