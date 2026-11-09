# TAGLINE

Automatic crash reporting and diagnostics system

# TLDR

**Regenerate stack traces** of a crash report and print them

```apport-retrace -s [/var/crash/_bin_foo.1000.crash]```

**Retrace in a sandbox** with downloaded debug symbols and open gdb

```apport-retrace -g -S system -C [~/.cache/apport-retrace] [/var/crash/report.crash]```

**List** pending crash reports

```ls /var/crash/```

**Unpack** a crash report

```apport-unpack [/var/crash/report.crash] [output_dir]```

**Enable** apport crash reporting

```sudo systemctl enable apport```

**Disable** apport crash reporting

```sudo systemctl disable --now apport```

File bug report **from crash**

```ubuntu-bug [/var/crash/report.crash]```

# SYNOPSIS

**/usr/share/apport/apport** [_--start_|_--stop_]

# DESCRIPTION

**apport** is Ubuntu's crash reporting system that automatically collects data when applications crash, including core dumps, package versions, and system information. It stores crash reports in /var/crash/ for later submission.

When enabled, apport registers itself as the kernel's core dump handler, intercepting segmentation faults and other crashes and creating .crash files that can be reported to Launchpad or analyzed locally. It is not run directly by users; **apport-cli**, **apport-retrace**, **apport-unpack** and **ubuntu-bug** work with the reports it produces.

# CONFIGURATION

**/etc/default/apport**
> Main configuration file. Set enabled=1 (the upstream default) to collect crash reports or enabled=0 to disable. Override once with **sudo service apport start force_start=1**.

**/var/crash/**
> Directory where crash report files are stored.

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

Core dumps can consume significant disk space. Crash reports may contain sensitive information such as memory contents, so review them before uploading.

# HISTORY

**Apport** was created for Ubuntu, first appearing in **2006**. It integrates with Launchpad to facilitate automated bug reporting from desktop and server crashes.

# SEE ALSO

[apport-cli](/man/apport-cli)(1), [apport-unpack](/man/apport-unpack)(1), [ubuntu-bug](/man/ubuntu-bug)(1), [coredumpctl](/man/coredumpctl)(1), [dmesg](/man/dmesg)(1)

# RESOURCES

```[Source code](https://github.com/canonical/apport)```

```[Homepage](https://launchpad.net/apport)```

<!-- verified: 2026-11-09 -->
