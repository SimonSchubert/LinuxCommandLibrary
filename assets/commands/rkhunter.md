# TAGLINE

Scan system for rootkits and vulnerabilities

# TLDR

**Check** system for rootkits

```sudo rkhunter --check```

**Update** database

```sudo rkhunter --update```

**List** all tests

```sudo rkhunter --list```

Check **version**

```sudo rkhunter --versioncheck```

Display **help**

```sudo rkhunter --help```

# SYNOPSIS

**rkhunter** [**--check**] [**--update**] [**--propupd**] [**--list**] [_options_]

# PARAMETERS

**--check**
> Perform system check

**--update**
> Update malware signatures

**--propupd**
> Update file properties database

**--list**
> List available tests

**--versioncheck**
> Check for updates

**--skip-keypress**
> Don't wait for keypress

**--report-warnings-only**
> Only show warnings

**-l, --logfile _file_**
> Write to specific log file

# DESCRIPTION

**rkhunter** (Rootkit Hunter) scans Linux systems for rootkits, backdoors, and local exploits. It checks for hidden files, suspicious kernel modules, modified binaries, and other signs of compromise.

The tool maintains a database of known malware signatures and file checksums, comparing current system state against known-good values.

# CONFIGURATION

**/etc/rkhunter.conf**
> Main configuration file controlling scan behavior, whitelisted files, update mirrors, and notification settings.

**/var/lib/rkhunter/db/**
> Database directory containing malware signatures, file property hashes, and known-good checksums used for comparison during scans.

**/var/log/rkhunter.log**
> Default log file where scan results and warnings are recorded.

# CAVEATS

Requires regular updates for effectiveness. May produce false positives on customized systems. Run --propupd after legitimate system changes. Log review recommended after checks.

# HISTORY

**rkhunter** was created by **Michael Boelen** to help system administrators detect rootkits and potential security issues. It's been actively maintained since 2003.

# SEE ALSO

[chkrootkit](/man/chkrootkit)(1), [aide](/man/aide)(1), [tripwire](/man/tripwire)(8)
