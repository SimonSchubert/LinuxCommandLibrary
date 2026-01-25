# TLDR

**Check for processes using deleted libraries**

```sudo checkrestart```

**Show verbose output**

```sudo checkrestart -v```

**Check a specific package**

```sudo checkrestart -p [package_name]```

**Show all processes** not just services

```sudo checkrestart -a```

**Output in machine-readable format**

```sudo checkrestart -m```

# SYNOPSIS

**checkrestart** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Verbose output showing detailed information.

**-p**, **--package** _name_
> Check only specific package.

**-a**, **--all**
> Show all processes, not just services.

**-m**, **--machine**
> Machine-readable output format.

**-n**, **--nopager**
> Disable pager for output.

**--help**
> Display help information.

# DESCRIPTION

**checkrestart** identifies processes that are still using old (deleted) versions of libraries after upgrades. When system libraries are updated, running processes continue using the old versions loaded in memory. This tool finds these processes so they can be restarted to use the new libraries.

After package updates, especially security patches, critical services may still run vulnerable code until restarted. checkrestart scans **/proc/*/maps** for references to deleted library files and reports affected processes with suggested restart commands.

The tool integrates with system init systems to suggest appropriate service restart commands (**systemctl restart**, **service restart**). For non-service processes, it reports the process name and PID.

# CAVEATS

Requires root privileges to scan all processes. Some processes may be difficult to restart safely (X server, session manager). The tool cannot detect all cases where restart is needed. Kernel updates require a full reboot, not just process restart.

# HISTORY

**checkrestart** is part of the **debian-goodies** package, a collection of utilities for Debian systems. It was created to help system administrators identify which services need restarting after library updates, a common concern in security-conscious environments. Similar functionality exists in other tools like **needs-restarting** in the Red Hat ecosystem.

# SEE ALSO

[needrestart](/man/needrestart)(1), [lsof](/man/lsof)(8), [apt](/man/apt)(8), [needs-restarting](/man/needs-restarting)(1)
