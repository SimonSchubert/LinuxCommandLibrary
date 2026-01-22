# TLDR

Start **ntpq in interactive mode**

```ntpq```

Print a **list of NTP peers**

```ntpq -p```

Print a list of NTP peers **without resolving hostnames**

```ntpq -n -p```

Use ntpq in **debugging mode**

```ntpq -d```

Print **NTP system variables** values

```ntpq -c rv```

# SYNOPSIS

**ntpq** [_options_] [_host_...]

# PARAMETERS

**-p, --peers**
> Print a summary of all configured peers

**-n, --numeric**
> Display addresses numerically without DNS resolution

**-c _command_, --command _command_**
> Execute a command without entering interactive mode

**-d, --debug-level**
> Enable debugging output

**-i, --interactive**
> Force interactive mode

# DESCRIPTION

**ntpq** queries the NTP daemon for status and configuration information. It can display peer associations, system variables, and synchronization statistics in both interactive and command-line modes.

The peer list (**-p**) shows all configured time sources with columns indicating:
- **remote**: Server address (* = current sync source)
- **refid**: Reference clock or upstream server
- **st**: Stratum level
- **reach**: Reachability register (377 = all recent queries successful)
- **delay/offset/jitter**: Timing metrics in milliseconds

Interactive mode provides additional commands for detailed inspection of the NTP daemon's state.

# CAVEATS

Queries the local ntpd by default; specify a hostname to query remote daemons. Requires ntpd to be running. Some information may require authentication to access. The output format is cryptic; refer to NTP documentation for interpretation.

# SEE ALSO

[ntpd](/man/ntpd)(8), [ntpdate](/man/ntpdate)(8), [chronyc](/man/chronyc)(1), [timedatectl](/man/timedatectl)(1)
