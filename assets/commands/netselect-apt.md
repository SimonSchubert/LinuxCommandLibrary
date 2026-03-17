# TAGLINE

Automatically find the fastest Debian mirror and create sources.list

# TLDR

**Create sources.list using the fastest mirror**

```sudo netselect-apt```

**Specify Debian distribution (default is stable)**

```sudo netselect-apt [testing]```

**Include non-free section**

```sudo netselect-apt -n```

**Limit mirrors to a specific country**

```sudo netselect-apt -c [India]```

**Include deb-src lines for source packages**

```sudo netselect-apt -s```

**Write output to a custom file**

```sudo netselect-apt -o [/etc/apt/sources.list]```

**Use a specific architecture**

```sudo netselect-apt -a [amd64]```

# SYNOPSIS

**netselect-apt** [_options_] [_distribution_]

# PARAMETERS

**-a**, **--arch** _arch_
> Use mirrors containing the specified architecture. Defaults to the architecture reported by dpkg.

**-c**, **--country** _name_
> Limit mirror selection to a specific country (ISO-3166 code or full English name).

**-f**, **--ftp**
> Use FTP mirrors instead of HTTP.

**-n**, **--non-free**
> Include non-free section in the generated sources.list.

**-o**, **--outfile** _file_
> Write output to the specified file instead of sources.list.

**-s**, **--sources**
> Include deb-src lines for source packages.

**-t**, **--tests** _num_
> Number of hosts to test for mirror validity (default 10).

**-i**, **--infile** _file_
> Use a local mirror list file instead of downloading one. Must be in mirrors_full format.

_distribution_
> Debian release name: stable, testing, unstable, experimental, or a codename (e.g. bookworm, trixie). Default is stable.

# DESCRIPTION

**netselect-apt** automatically finds the fastest Debian mirror and generates an appropriate sources.list file. It downloads the official Debian mirror list, optionally filters by country, tests each server for latency using **netselect**, and creates a sources.list with the fastest mirror.

This is particularly useful when setting up new Debian systems or when experiencing slow package downloads from the default mirror.

# CAVEATS

Requires root privileges for ICMP network testing. Network conditions vary over time; run periodically to find the currently optimal mirror. The generated sources.list should be reviewed before replacing the system file. Mirror latency may not reflect actual download speed for large files.

# SEE ALSO

[netselect](/man/netselect)(1), [apt](/man/apt)(8), [apt-get](/man/apt-get)(8)
