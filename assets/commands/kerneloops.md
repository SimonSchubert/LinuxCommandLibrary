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

The **oops.kernel.org** host named in the documentation no longer resolves in DNS, and the original kerneloops.org service was reported defunct on the kernel mailing list in 2011, so default submissions are unlikely to succeed. Distributions still package the client. Submitted oops data may contain kernel state information. The daemon reads a syslog-style file, so it needs **/var/log/messages** or an equivalent to find oopses. The daemon typically runs as root.

# HISTORY

kerneloops was written by **Arjan van de Ven** at **Intel** to collect kernel crash data and help identify bugs in the Linux kernel.

# SEE ALSO

[dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1)
