# TAGLINE

Detect SCSI and USB scanner devices

# TLDR

**Find all SCSI and USB scanners**

```sane-find-scanner```

**Verbose output** with device details

```sane-find-scanner -v```

**Very verbose** with SCSI inquiry and USB descriptors

```sane-find-scanner -vv```

**Quiet mode** showing only device names

```sane-find-scanner -q```

**Probe for parallel port scanners**

```sane-find-scanner -p```

**Force specific devices** to be checked

```sane-find-scanner -f [/dev/sg0] [/dev/usb/scanner0]```

# SYNOPSIS

**sane-find-scanner** [_-hvqpf_] [_-F filename_] [_devname_...]

# PARAMETERS

**-h**, **-?**
> Print usage message

**-v**
> Verbose output; use twice for SCSI inquiry and USB descriptors

**-q**
> Quiet mode; print only device names without comments

**-p**
> Probe for parallel port scanners

**-f**
> Force treating specified devices as SCSI or USB scanners

**-F** _filename_
> Read USB descriptors from file (Linux /proc/bus/usb/devices format)

# DESCRIPTION

**sane-find-scanner** detects SCSI and USB scanners and reports their device files. It helps verify that scanners are properly connected and accessible to SANE backends.

For SCSI scanners, it sends inquiry commands to generic device files like /dev/sg0 looking for scanner or processor device types. For USB scanners, it checks kernel scanner device files and uses libusb to detect devices, identifying vendor and product IDs along with the USB chip type.

The tool can find scanners even if they are not supported by any SANE backend, making it useful for initial hardware detection and troubleshooting.

# CAVEATS

Cannot detect most parallel port scanners except some Mustek models with **-p**. Proprietary port scanners are not detected. USB support requires Linux, FreeBSD, NetBSD, or OpenBSD with libusb.

# HISTORY

sane-find-scanner is part of the **SANE** (Scanner Access Now Easy) project, which provides standardized access to scanner hardware on Unix-like systems. The project began in **1996** to create a universal scanner API.

# SEE ALSO

[scanimage](/man/scanimage)(1), [saned](/man/saned)(8), [xsane](/man/xsane)(1), [sane](/man/sane)(7)
