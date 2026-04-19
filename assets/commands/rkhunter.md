# TAGLINE

Scan system for rootkits and vulnerabilities

# TLDR

**Check** system for rootkits

```sudo rkhunter --check```

**Check** non-interactively (no keypress prompts)

```sudo rkhunter --check --sk```

**Update** database

```sudo rkhunter --update```

**Update** file properties database after legitimate changes

```sudo rkhunter --propupd```

**List** all tests

```sudo rkhunter --list tests```

Check **version**

```sudo rkhunter --versioncheck```

Run from **cron** reporting warnings only

```sudo rkhunter --cronjob --report-warnings-only```

# SYNOPSIS

**rkhunter** [**--check**] [**--update**] [**--propupd**] [**--list**] [_options_]

# PARAMETERS

**-c**, **--check**
> Perform system check for rootkits, backdoors, and exploits.

**--update**
> Update data files and malware signatures.

**--propupd**
> Update file properties database with current values (run after legitimate system changes).

**--list** [_tests|rootkits|lang|perl|propfiles_]
> List supported capabilities.

**--versioncheck**
> Check for a newer rkhunter version.

**-C**, **--config-check**
> Validate configuration file(s).

**--sk**, **--skip-keypress**
> Don't wait for a keypress between test groups.

**--rwo**, **--report-warnings-only**
> Only display warnings.

**--cronjob**
> Optimize output for cron execution (no colors, no keypress).

**--configfile** _file_
> Use an alternate configuration file.

**-l**, **--logfile** _file_
> Write log output to a specific file.

**--appendlog**
> Append to an existing log file instead of overwriting.

**--disable** _tests_
> Disable specific tests (comma-separated list).

**--enable** _tests_
> Enable only the specified tests.

**--pkgmgr** _type_
> Use package manager verification (RPM, DPKG, BSD, SOLARIS, NONE).

**-q**, **--quiet**
> Suppress all output.

**--nocolors**
> Disable colored output.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

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
