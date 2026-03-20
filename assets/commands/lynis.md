# TAGLINE

security auditing tool for Unix-based systems

# TLDR

Check for **updates**

```sudo lynis update info```

Run **full system audit**

```sudo lynis audit system```

Run audit **quietly** (non-interactive)

```sudo lynis audit system --quick```

Audit a **Dockerfile**

```lynis audit dockerfile [path/to/Dockerfile]```

Run only tests from a **specific category**

```sudo lynis audit system --tests-from-category [networking]```

# SYNOPSIS

**lynis** [_mode_] [_options_]

# DESCRIPTION

**lynis** is a security auditing tool for Unix-based systems. It performs an extensive health scan covering system hardening, vulnerability scanning, and compliance testing.

# PARAMETERS

**audit system**
> Perform full system security audit.

**audit dockerfile** _FILE_
> Audit a Dockerfile for security issues.

**update info**
> Check for lynis updates.

**show profiles**
> List available audit profiles.

**show settings**
> Display current settings.

**show categories**
> List available test categories.

**show commands**
> Show available lynis commands.

**-c**, **--cronjob**
> Run as cronjob (non-interactive, with auto-rotation of log files)

**-Q**, **--quick**
> Quick mode, do not wait for user input.

**-q**, **--quiet**
> Suppress output to screen. Implies --quick.

**--no-colors**
> Disable colored output.

**--pentest**
> Non-privileged scan, show points of interest for penetration testing.

**--forensics**
> Perform forensics on a running or mounted system.

**--tests** _TEST-IDs_
> Only run specific test(s).

**--tests-from-category** _CATEGORY_
> Only run tests belonging to the specified category.

**--profile** _FILE_
> Use alternative audit profile.

**--logfile** _FILE_
> Define alternative log file location.

**--report-file** _FILE_
> Define alternative report file location.

# CAVEATS

Requires root privileges for complete audit. Reports are stored in /var/log/lynis-report.dat. Some tests may be distribution-specific.

# HISTORY

Developed by CISOfy as an open-source security auditing tool, evolved from rkhunter concepts with broader security coverage.

# SEE ALSO

[rkhunter](/man/rkhunter)(8), [chkrootkit](/man/chkrootkit)(8)
