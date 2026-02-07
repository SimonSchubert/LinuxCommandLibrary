# TAGLINE

Command-line interface for the chrony NTP daemon

# TLDR

**Check synchronization status**

```chronyc tracking```

**List time sources**

```chronyc sources```

**Verbose source list**

```chronyc sources -v```

**Source statistics**

```chronyc sourcestats```

**Force time sync**

```chronyc makestep```

**Add NTP server**

```chronyc add server [pool.ntp.org]```

**Interactive mode**

```chronyc```

# SYNOPSIS

**chronyc** [_options_] [_command_]

# DESCRIPTION

**chronyc** is the command-line interface for chronyd, the NTP daemon. Used to monitor synchronization status, manage time sources, and configure the daemon. Changes are not persistent across restarts.

# COMMANDS

**tracking**
> Display system clock status and offset

**sources**
> List NTP sources

**sourcestats**
> Show source statistics

**makestep**
> Force immediate clock correction

**activity**
> Show online/offline source count

**add server** _host_
> Add NTP server

**delete** _address_
> Remove NTP source

**burst** _good_/_max_
> Start rapid polling

**offline** / **online**
> Set sources offline/online

**ntpdata**
> Display NTP data for sources

# PARAMETERS

**-n**
> Don't resolve hostnames

**-c**
> CSV output format

**-m**
> Allow multiple commands

**-h** _host_
> Connect to remote chronyd

# CONFIGURATION

**/etc/chrony.conf**
> Permanent configuration for chronyd. Runtime changes via chronyc are lost on restart.

# CAVEATS

Requires chronyd running. Runtime changes lost on restart. Sub-microsecond accuracy possible with hardware timestamping.

# SEE ALSO

[chronyd](/man/chronyd)(8), [timedatectl](/man/timedatectl)(1), [ntpq](/man/ntpq)(1)
