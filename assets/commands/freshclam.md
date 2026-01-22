# TLDR

**Update virus definitions**

```freshclam```

**Check for updates** only

```freshclam --check```

**Run in daemon** mode

```freshclam -d```

**Verbose output**

```freshclam -v```

**Use specific config**

```freshclam --config-file=[/path/freshclam.conf]```

# SYNOPSIS

**freshclam** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run as background daemon.

**-c** _N_, **--checks** _N_
> Daily checks when running as daemon.

**-v**, **--verbose**
> Verbose output.

**--check**
> Check for updates without downloading.

**--config-file** _FILE_
> Configuration file path.

**-l** _FILE_, **--log** _FILE_
> Log file path.

**--help**
> Display help information.

# DESCRIPTION

**freshclam** downloads and updates ClamAV virus signature databases. It connects to ClamAV mirrors to fetch the latest malware definitions for the clamscan and clamd scanners.

The tool can run as a daemon for automatic updates or be triggered manually. Multiple mirrors provide redundancy. Downloaded databases are verified before installation.

freshclam is essential for keeping ClamAV effective against new threats.

# CAVEATS

Requires network access to mirrors. Download frequency limits apply. Large database downloads on first run.

# HISTORY

freshclam is part of **ClamAV**, the open source antivirus engine. ClamAV was created in 2001 and acquired by Sourcefire (later Cisco), providing free virus scanning for Unix systems.

# SEE ALSO

[clamscan](/man/clamscan)(1), [clamd](/man/clamd)(8), [clamdscan](/man/clamdscan)(1)
