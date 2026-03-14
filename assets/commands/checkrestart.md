# TAGLINE

find processes using outdated shared libraries

# TLDR

**Check for processes using deleted libraries**

```sudo checkrestart```

**Show verbose output with deleted file details**

```sudo checkrestart -v```

**Only report processes belonging to a package**

```sudo checkrestart -p```

**Show terse output suitable for monitoring tools**

```sudo checkrestart -t```

**Output in machine-readable tab-separated format**

```sudo checkrestart -m```

**Exclude a specific package from results**

```sudo checkrestart -i [package_name]```

# SYNOPSIS

**checkrestart** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Verbose output, enables -f and shows reasons for exclusions.

**-f**, **--show-files**
> List the deleted files and which program is using them.

**-d**, **--debug**
> Include debugging details in output, enables -v.

**-t**, **--terse**
> Terse single-line output suitable for Nagios and similar monitoring tools.

**-m**, **--machine**
> Machine-readable output; each line is tab-separated.

**-p**, **--package**
> Only report processes that belong to a package.

**-a**, **--all**
> Prevent exclude.conf and local-exclude.conf from being read.

**-n**, **--no-lsof**
> Do not use lsof(8) even if available.

**-i** _REGEXP_, **--exclude-package** _REGEXP_
> Ignore services associated with the matching package name.

**-x** [_TYPE:_]_REGEXP_, **--exclude** [_TYPE:_]_REGEXP_
> Exclude items matching the pattern (types: package, unit, program, pid, file).

**-e** _PID_
> Exclude processes with this PID.

**-b** _FILE_, **--blocklistfile** _FILE_
> Ignore deleted files matching patterns in FILE.

**-h**, **--help**
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
