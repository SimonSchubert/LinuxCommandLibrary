# TAGLINE

Userspace bandwidth shaper for applications

# TLDR

**Limit download speed** of a command

```trickle -d [100] [command]```

**Limit upload speed** of a command

```trickle -u [50] [command]```

**Limit both download and upload**

```trickle -d [100] -u [50] [command]```

**Run in standalone mode**

```trickle -s -d [100] -u [50] [command]```

**Limit wget download speed**

```trickle -d [200] wget [https://example.com/file.iso]```

**Limit scp transfer speed**

```trickle -d [50] -u [50] scp [file] [user@host:/path]```

# SYNOPSIS

**trickle** [_options_] _command_ [_args_]

# PARAMETERS

**-d** _rate_
> Limit download bandwidth to rate KB/s.

**-u** _rate_
> Limit upload bandwidth to rate KB/s.

**-s**
> Run in standalone mode, independent of trickled.

**-w** _length_
> Peak detection window size in KB. Lower values are more aggressive but may over-shape (default: 512).

**-t** _seconds_
> Smoothing time interval in seconds (default: 5).

**-l** _length_
> Smoothing length in KB (default: 10).

**-L** _latency_
> Set latency in milliseconds for shaping calculations.

**-n** _path_
> trickled socket path (default: /tmp/.trickled.sock).

**-v**
> Increase verbosity level. Can be specified multiple times.

**-V**
> Display version information.

**-h**
> Display help.

# DESCRIPTION

**trickle** is a lightweight userspace bandwidth shaper that limits network bandwidth consumption of individual applications. It works without root privileges or kernel modifications by intercepting socket calls.

The tool uses preloading (LD_PRELOAD) to inject bandwidth limiting into dynamically linked applications. In standalone mode (-s), each application gets its own bandwidth limits. When trickled daemon is running, bandwidth can be shared among multiple applications.

Use cases include preventing a single download from saturating your connection, testing application behavior under low bandwidth, and fair bandwidth allocation among processes.

# CAVEATS

Only works with dynamically linked executables using TCP (SOCK_STREAM) sockets. Does not work with statically linked or setuid programs. UDP traffic is not affected. Standalone mode uses fixed limits; daemon mode allows shared limits via trickled.

# HISTORY

**trickle** was developed by Marius Aamodt Eriksen as a simple solution for application-level bandwidth limiting. It provides an alternative to complex traffic control solutions like tc, working entirely in userspace without system-wide configuration.

# SEE ALSO

[tc](/man/tc)(1), [wondershaper](/man/wondershaper)(1), [nethogs](/man/nethogs)(1)
