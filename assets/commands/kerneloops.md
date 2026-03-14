# TAGLINE

collects and submits kernel crash information

# TLDR

**Start kerneloops daemon**

```sudo kerneloops```

**Run in debug mode** without daemonizing

```kerneloops --debug```

**Parse a specific file** for kernel oops messages

```kerneloops --file [/var/log/messages]```

**Run in foreground** without becoming a daemon

```kerneloops --nodaemon```

# SYNOPSIS

**kerneloops** [_options_]

# PARAMETERS

**--debug**
> Enable debug mode with additional diagnostic output.

**--file** _filename_
> Parse the specified file as if it were /var/log/messages.

**--nodaemon**
> Do not daemonize; run in the foreground.

# DESCRIPTION

**kerneloops** collects kernel crash information (oops messages) and submits the extracted signatures to the oops.kernel.org website for statistical analysis and presentation to Linux kernel developers.

The daemon monitors /var/log/messages for kernel oops data and automatically submits it. Configuration is stored in /etc/kerneloops.conf.

# CAVEATS

Submitted oops data may contain kernel state information. Requires network connectivity to submit reports to oops.kernel.org. The daemon typically runs as root.

# HISTORY

kerneloops was created by **Intel** to collect kernel crash data and help identify bugs in the Linux kernel.

# SEE ALSO

[dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1)
