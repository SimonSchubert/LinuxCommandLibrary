# TAGLINE

security auditing tool for Unix-based systems

# TLDR

Check for **updates**

```sudo lynis update info```

Run **system audit**

```sudo lynis audit system```

Audit a **Dockerfile**

```sudo lynis audit dockerfile [path/to/Dockerfile]```

# SYNOPSIS

**lynis** [_mode_] [_options_]

# DESCRIPTION

**lynis** is a security auditing tool for Unix-based systems. It performs an extensive health scan covering system hardening, vulnerability scanning, and compliance testing.

# PARAMETERS

**audit system**
> Perform full system security audit

**audit dockerfile FILE**
> Audit a Dockerfile for security issues

**update info**
> Check for lynis updates

**show profiles**
> List available audit profiles

**show settings**
> Display current settings

**-c, --cronjob**
> Run as cronjob (non-interactive)

**-Q, --quick**
> Quick mode (fewer tests)

**--pentest**
> Perform penetration testing scan

# CAVEATS

Requires root privileges for complete audit. Reports are stored in /var/log/lynis-report.dat. Some tests may be distribution-specific.

# HISTORY

Developed by CISOfy as an open-source security auditing tool, evolved from rkhunter concepts with broader security coverage.

# SEE ALSO

[rkhunter](/man/rkhunter)(8), [chkrootkit](/man/chkrootkit)(8)
