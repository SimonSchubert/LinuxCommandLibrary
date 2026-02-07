# TAGLINE

multi-threaded antivirus scanning daemon

# TLDR

**Start clamd** daemon

```clamd```

**Start in foreground**

```clamd --foreground```

**Start with specific config file**

```clamd -c [/etc/clamav/clamd.conf]```

**Check configuration** and exit

```clamd --config-check```

**Reload virus database**

```clamdscan --reload```

# SYNOPSIS

**clamd** [_options_]

# DESCRIPTION

**clamd** is the ClamAV daemon, a multi-threaded virus scanning service. It loads the virus database into memory once and handles scan requests from clients, providing much faster scanning than the standalone clamscan tool.

The daemon listens on a Unix socket or TCP port and accepts commands to scan files, directories, or data streams. Multiple clients can connect simultaneously, making it suitable for email servers, file servers, and web applications.

clamd is commonly used with mail transfer agents (Postfix, Exim, Sendmail), web proxies, and file upload handlers to provide real-time malware scanning.

# PARAMETERS

**-c** _file_, **--config-file=** _file_
> Use specified configuration file.

**--foreground**
> Run in foreground, don't daemonize.

**--debug**
> Enable debug mode.

**--config-check**
> Check configuration and exit.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# CONFIGURATION

**/etc/clamav/clamd.conf**
> Daemon configuration including socket type, scan limits, thread count, and logging options.

# CAVEATS

Requires regular virus database updates via freshclam. Memory usage depends on database size (typically 1-2GB). Socket permissions must allow client access. Self-check may fail if TCP connections are rate-limited. Performance depends on available memory and CPU.

# HISTORY

**ClamAV** was created by **Tomasz Kojm** in **2001** as an open-source antivirus engine, originally designed for email gateway scanning on Unix systems. It was acquired by **Sourcefire** in **2007** and later became part of **Cisco** when Sourcefire was acquired in **2013**. ClamAV remains one of the most widely deployed open-source antivirus solutions, particularly in mail and web gateway environments.

# SEE ALSO

[clamscan](/man/clamscan)(1), [clamdscan](/man/clamdscan)(1), [freshclam](/man/freshclam)(1), [clamd.conf](/man/clamd.conf)(5)
