# TAGLINE

Monitor and control SMART disk health data

# TLDR

**Show drive information**

```smartctl -i /dev/[sda]```

**Show all SMART data**

```smartctl -a /dev/[sda]```

**Check drive health**

```smartctl -H /dev/[sda]```

**Run short self-test**

```smartctl -t short /dev/[sda]```

**Run extended self-test**

```smartctl -t long /dev/[sda]```

**View self-test results**

```smartctl -l selftest /dev/[sda]```

**View error log**

```smartctl -l error /dev/[sda]```

**Enable SMART** on drive

```smartctl -s on /dev/[sda]```

**Scan for drives**

```smartctl --scan```

# SYNOPSIS

**smartctl** [_options_] _device_

# DESCRIPTION

**smartctl** is a command-line tool for monitoring and controlling SMART (Self-Monitoring, Analysis and Reporting Technology) data on hard drives and SSDs. SMART data can predict drive failures before they occur.

The tool can display drive identity, health status, attributes, error logs, and self-test results. It can also initiate self-tests and control SMART features. Different manufacturers implement SMART differently, so attribute interpretation varies.

smartctl is part of smartmontools and is essential for system administrators monitoring disk health and planning replacements before failure.

# PARAMETERS

**-i**, **--info**
> Show device identification.

**-a**, **--all**
> Show all SMART information.

**-H**, **--health**
> Show SMART health status.

**-A**, **--attributes**
> Show SMART attributes.

**-l** _type_, **--log=** _type_
> Show log (error, selftest, selective).

**-t** _test_, **--test=** _test_
> Run test (short, long, conveyance, select).

**-s** _on|off_
> Enable/disable SMART.

**-d** _type_
> Specify device type.

**--scan**
> Scan for devices.

**-x**, **--xall**
> Show all extended information.

**-q** _type_
> Quiet output (errorsonly, silent).

# KEY ATTRIBUTES

**Reallocated Sector Count**: Bad sectors moved to spare area
**Current Pending Sector Count**: Sectors waiting to be remapped
**Offline Uncorrectable**: Sectors that couldn't be corrected
**Power-On Hours**: Total operating time
**Temperature**: Drive temperature

# CAVEATS

Requires root privileges for most operations. SMART must be supported and enabled on the drive. Attribute interpretation varies by manufacturer. Self-tests may affect performance while running.

# HISTORY

**smartmontools** was created by **Bruce Allen** in **2002** as a fork of the smartsuite package. It provides cross-platform SMART monitoring on Linux, BSD, macOS, and Windows. The project continues active development and is the standard SMART monitoring tool on Unix-like systems.

# SEE ALSO

[smartd](/man/smartd)(8), [hdparm](/man/hdparm)(1), [nvme](/man/nvme)(1), [lsblk](/man/lsblk)(1)
