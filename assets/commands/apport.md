# TLDR

Show **crash report** for a PID

```apport-retrace -s [/var/crash/_bin_foo.1000.crash]```

**List** pending crash reports

```ls /var/crash/```

**Unpack** a crash report

```apport-unpack [/var/crash/report.crash] [output_dir]```

File bug report **from crash**

```ubuntu-bug [/var/crash/report.crash]```

# SYNOPSIS

**apport** (system daemon)

# DESCRIPTION

**apport** is Ubuntu's crash reporting system that automatically collects data when applications crash, including core dumps, package versions, and system information. It stores crash reports in /var/crash/ for later submission.

When enabled, apport intercepts segmentation faults and other crashes, creating .crash files that can be reported to Launchpad or analyzed locally.

# CONFIGURATION

Apport is controlled by /etc/default/apport:
- **enabled=1**: Collect crash reports
- **enabled=0**: Disable crash collection

# RELATED COMMANDS

**apport-cli**
> Command-line crash report handler

**apport-unpack**
> Extract crash report contents

**apport-retrace**
> Regenerate stack traces

**ubuntu-bug**
> Report bugs to Launchpad

# CAVEATS

Core dumps can consume significant disk space. Crash reports may contain sensitive information. Disabled by default in production environments.

# HISTORY

**Apport** was created for Ubuntu, first appearing in **2006**. It integrates with Launchpad to facilitate automated bug reporting from desktop and server crashes.

# SEE ALSO

[coredumpctl](/man/coredumpctl)(1), [gdb](/man/gdb)(1), [dmesg](/man/dmesg)(1)
