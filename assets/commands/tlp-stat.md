# TAGLINE

TLP power management status reports

# TLDR

Generate **full** status report

```sudo tlp-stat```

Show **battery** information

```sudo tlp-stat -b```

Show **processor** tunables

```sudo tlp-stat -p```

Show **disk** device tunables

```sudo tlp-stat -d```

Show **configuration**

```sudo tlp-stat -c```

Show **configuration differences** from defaults

```sudo tlp-stat --cdiff```

Show **temperatures** and fan speed

```sudo tlp-stat -t```

Show **system** information and TLP status

```sudo tlp-stat -s```

Monitor power supply **udev events**

```sudo tlp-stat -P```

# SYNOPSIS

**tlp-stat** [_OPTIONS_]

# PARAMETERS

**-b, --battery**
> Battery data

**-c, --config**
> Active configuration

**--cdiff**
> Differences between defaults and user configuration

**-d, --disk**
> Disk device tunables

**-e, --pcie**
> PCIe device tunables

**-g, --graphics**
> Graphics card tunables

**-p, --processor**
> Processor tunables

**-r, --rfkill**
> Radio device states and tunables

**-s, --system**
> System information and TLP status

**-t, --temp**
> Temperatures and fan speed

**-u, --usb**
> USB device tunables

**-v, --verbose**
> Show additional detail in supported categories

**-q, --quiet**
> Omit version header and reduce processor output

**-P, --pev**
> Monitor power supply udev events

**--psup**
> Power supply diagnostics

**-T, --trace**
> Trace output

**--udev**
> Check if udev rules are active

**-w, --warn**
> Warnings about SATA disks

**--version**
> Print TLP version

# DESCRIPTION

**tlp-stat** generates status reports for TLP power management. It shows active settings, battery health, power consumption, and hardware status. The output helps diagnose power issues and verify TLP configuration.

# CAVEATS

Some information requires root privileges. Battery statistics may not be available on all hardware. Use verbose mode for detailed diagnostics. Some options like --cdiff, --version, and -q require TLP 1.7 or later.

# HISTORY

**tlp-stat** is the companion diagnostic tool for **TLP**, created by **Thomas Koch** for monitoring and troubleshooting Linux laptop power management.

# SEE ALSO

[tlp](/man/tlp)(8), [powertop](/man/powertop)(8), [rfkill](/man/rfkill)(8)
