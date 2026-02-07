# TAGLINE

Versatile NTP time synchronization suite

# TLDR

**Check synchronization status**

```chronyc tracking```

**Show NTP sources**

```chronyc sources```

**Show detailed source statistics**

```chronyc sourcestats```

**Force immediate synchronization**

```sudo chronyc makestep```

**Add a new NTP server**

```chronyc add server [ntp.example.com]```

**Show all peers**

```chronyc clients```

**Check if chrony is synchronized**

```chronyc waitsync```

# SYNOPSIS

**chronyc** [_options_] [_command_]

**chronyd** [_options_]

# PARAMETERS (chronyc)

**tracking**
> Display system clock synchronization status.

**sources** [**-v**]
> Show NTP sources (verbose with -v).

**sourcestats**
> Display source statistics.

**makestep**
> Step clock immediately if offset is large.

**add server** _address_
> Add an NTP server.

**delete** _address_
> Remove an NTP source.

**burst** _polls_/_good_
> Speed up initial synchronization.

**activity**
> Show number of online/offline sources.

**ntpdata** _address_
> Show detailed NTP data for a source.

**waitsync** [_max-tries_]
> Wait until synchronized.

# PARAMETERS (chronyd)

**-d**
> Run in foreground (debug mode).

**-f** _file_
> Specify configuration file.

**-q**
> Set clock once and exit.

**-Q**
> Like -q but don't set clock.

# DESCRIPTION

**chrony** is a versatile NTP (Network Time Protocol) implementation for synchronizing system clocks. It consists of **chronyd** (daemon) and **chronyc** (command-line interface).

chrony excels in challenging environments: intermittent network connections, virtual machines with unstable clocks, and systems that sleep or hibernate. It synchronizes faster than ntpd and maintains better accuracy in variable conditions.

Configuration is in **/etc/chrony.conf** (or **/etc/chrony/chrony.conf**), specifying NTP servers, access controls, and clock adjustments. The daemon can operate as both NTP client and server.

# CONFIGURATION

**/etc/chrony.conf** (or **/etc/chrony/chrony.conf**)
> Main configuration file specifying NTP servers, access controls, clock adjustments, and logging options.

**/var/lib/chrony/drift**
> Drift file tracking the system clock's frequency error for accurate correction when offline.

**/var/log/chrony/** (or via syslog)
> Log directory for tracking and measurements data.

# CAVEATS

The makestep command can cause time jumps that affect running applications. Firewall must allow UDP port 123 for NTP. chronyd must run as root or with CAP_SYS_TIME capability. Some applications may malfunction if time changes significantly.

# HISTORY

chrony was originally written by **Richard Curnow** starting in **1997** to provide better accuracy for systems with intermittent network connectivity. **Miroslav Lichvar** took over maintenance and development in **2007**. chrony has become the default NTP client in many Linux distributions including Fedora and RHEL, chosen over ntpd for its faster sync and better handling of modern computing environments.

# SEE ALSO

[ntpd](/man/ntpd)(8), [timedatectl](/man/timedatectl)(1), [hwclock](/man/hwclock)(8)
