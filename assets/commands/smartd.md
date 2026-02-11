# TAGLINE

SMART disk monitoring daemon

# TLDR

**Start smartd** in the foreground

```smartd -d```

**Start with a specific configuration file**

```smartd -c [/etc/smartd.conf]```

**Check configuration file syntax**

```smartd -q onecheck```

**Run once and exit** (no daemon mode)

```smartd -q onecheck -d```

**Set polling interval** in seconds

```smartd -i [1800]```

# SYNOPSIS

**smartd** [_-d_] [_-c configfile_] [_-i interval_] [_-l facility_] [_-p pidfile_] [_-q opt_]

# PARAMETERS

**-d**
> Run in foreground (debug mode); do not fork into background

**-c** _file_
> Use specified configuration file instead of /etc/smartd.conf

**-i** _N_
> Set interval between disk checks in seconds (default: 1800)

**-l** _facility_
> Use specified syslog facility for logging

**-p** _file_
> Write PID to specified file

**-q** _option_
> Quiet mode options: errors, nodev, nodev0, never, onecheck, showtests

**-r** _type_
> Report ATA errors as type (ioctl, bpt)

# DESCRIPTION

**smartd** is a daemon that monitors SMART (Self-Monitoring, Analysis and Reporting Technology) data from ATA/SATA and SCSI/SAS hard drives and SSDs. It detects degraded drives and predicts failures before data loss occurs.

The daemon polls devices at configurable intervals (default 30 minutes), logging changes to SMART attributes via syslog. It can send email alerts, run custom scripts, or execute tests when problems are detected.

Configuration is stored in **/etc/smartd.conf**, listing devices to monitor with their options. Without a config file, smartd scans and monitors all SMART-capable devices.

# CONFIGURATION

**/etc/smartd.conf**
> Main configuration file listing devices to monitor and their check options, alert actions, and test schedules.

**/etc/default/smartmontools**
> Startup options for the smartd daemon on Debian-based systems.

# CAVEATS

smartd monitors disk health but is not a backup solution. Some USB enclosures don't pass SMART data through. Virtual drives and RAID controllers may not expose SMART to the host. Start smartd via systemd: **systemctl enable --now smartd**.

# HISTORY

smartd is part of **smartmontools**, originally developed by Bruce Allen starting in **2002**. The package provides open-source tools for monitoring SMART data across various drive types and operating systems.

# SEE ALSO

[smartctl](/man/smartctl)(8), [smartd.conf](/man/smartd.conf)(5), [hddtemp](/man/hddtemp)(8)
