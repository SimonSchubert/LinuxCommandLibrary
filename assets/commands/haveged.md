# TAGLINE

random number generator daemon that feeds the Linux kernel's entropy pool

# TLDR

**Start** haveged daemon

```sudo haveged```

Run haveged in **foreground**

```sudo haveged -F```

Set **file path** for output

```sudo haveged -f [path/to/file]```

Set **run level** for daemon

```sudo haveged -r [runlevel]```

Set collection **buffer size** in KiB words

```sudo haveged -b [buffersizeinKW]```

Set **cache size** in KiB words

```sudo haveged -d [cachesizeinKW]```

Set **number of bytes** to write to output file

```sudo haveged -n [byteamount]```

# SYNOPSIS

**haveged** [_options_]

# PARAMETERS

**-F**, **--Foreground**
> Run in foreground (don't daemonize)

**-f**, **--file** _PATH_
> Write random data to file instead of /dev/random

**-r**, **--run** _LEVEL_
> Set run level (0=run as daemon, 1=display results)

**-b**, **--buffer** _SIZE_
> Collection buffer size in KiB words

**-d**, **--data** _SIZE_
> Cache size in KiB words

**-n**, **--number** _BYTES_
> Number of bytes to write to output

**-w**, **--write** _BYTES_
> Write _BYTES_ to /dev/random at a time

**-v**, **--verbose** _LEVEL_
> Verbosity level

# DESCRIPTION

**haveged** is a random number generator daemon that feeds the Linux kernel's entropy pool (/dev/random). It uses the HAVEGE (HArdware Volatile Entropy Gathering and Expansion) algorithm, which harvests entropy from CPU timing variations.

The daemon is particularly useful for:
- Headless servers lacking traditional entropy sources (keyboard, mouse)
- Virtual machines with limited hardware entropy
- Systems requiring high-throughput random number generation
- Preventing /dev/random blocking during cryptographic operations

haveged monitors the kernel entropy pool and automatically feeds it when levels drop.

# CAVEATS

Some security researchers debate HAVEGE's entropy quality on virtualized or modern CPUs with consistent timing. Consider using hardware RNG (rngd) when available. On modern kernels, /dev/random no longer blocks, reducing the need for haveged.

# HISTORY

haveged was developed by Gary Wuertz based on the HAVEGE algorithm created by André Seznec and Nicolas Sendrier. It became popular for addressing entropy starvation on Linux servers and VMs.

# SEE ALSO

[rngd](/man/rngd)(8), [random](/man/random)(4), [getrandom](/man/getrandom)(2)
