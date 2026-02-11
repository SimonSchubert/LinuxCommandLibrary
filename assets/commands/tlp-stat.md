# TAGLINE

TLP power management status reports

# TLDR

Generate **full** status report

```sudo tlp-stat```

Show **device** information

```sudo tlp-stat --[battery|disk|processor|graphics|pcie|rfkill|usb]```

Show **verbose** device info

```sudo tlp-stat -v --[battery|processor|pcie|usb]```

Show **configuration**

```sudo tlp-stat -c```

Monitor power **events**

```sudo tlp-stat -P```

Show **power supply** diagnostics

```sudo tlp-stat --psup```

Show **temperatures** and fan speed

```sudo tlp-stat -t```

Show **system** information

```sudo tlp-stat -s```

# SYNOPSIS

**tlp-stat** [_OPTIONS_]

# PARAMETERS

**-b, --battery**
> Battery status and information

**-d, --disk**
> Disk information

**-p, --processor**
> Processor information

**-g, --graphics**
> Graphics card information

**--pcie**
> PCIe devices

**--usb**
> USB devices

**-c, --config**
> Show configuration

**-t, --temp**
> Temperature and fan speed

**-s, --system**
> General system information

**-v, --verbose**
> Verbose output

**-P, --pev**
> Monitor power supply udev events

**--psup**
> Power supply diagnostics

# DESCRIPTION

**tlp-stat** generates status reports for TLP power management. It shows active settings, battery health, power consumption, and hardware status. The output helps diagnose power issues and verify TLP configuration.

# CAVEATS

Some information requires root privileges. Battery statistics may not be available on all hardware. Use verbose mode for detailed diagnostics.

# HISTORY

**tlp-stat** is the companion diagnostic tool for **TLP**, created by **Thomas Koch** for monitoring and troubleshooting Linux laptop power management.

# SEE ALSO

[tlp](/man/tlp)(8), [powertop](/man/powertop)(8)
