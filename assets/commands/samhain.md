# TAGLINE

File integrity checking and host intrusion detection

# TLDR

**Initialize the file integrity database**

```samhain -t init```

**Check files against the baseline database**

```samhain -t check```

**Run as a daemon** for continuous monitoring

```samhain -D```

**Check configuration file syntax**

```samhain -t check --verify-config```

**Update the database** with current file states

```samhain -t update```

**Run in foreground** with verbose output

```samhain -t check --foreground -p info```

# SYNOPSIS

**samhain** [_-t init|check|update_] [_-D_] [_-p priority_] [_--foreground_] [_-c configfile_]

# PARAMETERS

**-t** _action_
> Specify action: init (create baseline), check (verify against baseline), update (refresh database)

**-D**
> Run as a daemon process

**--foreground**
> Run in foreground, do not fork

**-c** _file_
> Use alternate configuration file (default: /etc/samhainrc)

**-p** _priority_
> Set logging priority: debug, info, notice, warn, err, crit

**--verify-config**
> Check configuration file syntax and exit

**-l** _file_
> Specify log file path

**-e** _file_
> Specify database file path

# DESCRIPTION

**Samhain** is a host-based intrusion detection system (HIDS) that provides file integrity monitoring, log file analysis, and rootkit detection. It tracks checksums, permissions, timestamps, and attributes of critical system files to detect unauthorized modifications.

The system operates in three modes: **init** creates a baseline database, **check** compares current file states against the baseline, and **update** refreshes the database. Samhain can detect hidden processes, rogue SUID executables, and kernel-level compromises.

For multi-host environments, Samhain uses a client-server architecture where **yule** serves as the central log server and configuration host. Configuration is stored in **/etc/samhainrc**.

# CONFIGURATION

**/etc/samhainrc**
> Main configuration file defining monitored directories, file attributes to check, logging targets, and severity levels.

**/var/lib/samhain/samhain_file**
> Default location of the file integrity baseline database.

# CAVEATS

The baseline database should be created from a known-clean system state and stored securely (ideally read-only media). When compiled with stealth options, help files and man pages may be unavailable to hide HIDS presence from attackers.

# HISTORY

Samhain was developed by **Rainer Wichmann** and first released in **1999**. Named after the Celtic festival marking the end of harvest, it evolved from a simple file integrity checker into a comprehensive HIDS supporting centralized monitoring across heterogeneous environments.

# SEE ALSO

[aide](/man/aide)(1), [tripwire](/man/tripwire)(8), [rkhunter](/man/rkhunter)(1), [chkrootkit](/man/chkrootkit)(1)
