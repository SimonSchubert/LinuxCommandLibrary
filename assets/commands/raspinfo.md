# TAGLINE

Display Raspberry Pi hardware and software info

# TLDR

Display **system information**

```raspinfo```

Display system information **paged**

```raspinfo | more```

**Save** the report for a bug report

```raspinfo > [raspinfo.txt]```

# SYNOPSIS

**raspinfo**

# DESCRIPTION

**raspinfo** is a short script that dumps diagnostic information about a Raspberry Pi to standard output, intended for attaching to bug reports. It takes no options.

The report covers the board model and OS release, kernel version, throttling status, camera detection, VideoCore firmware version, filesystems, installed package versions, networking, USB devices, display and audio configuration, firmware settings, and the **dmesg** log.

# CAVEATS

Raspberry Pi specific tool, installed by default even on Lite images. Several steps call **sudo** internally, so it may prompt for a password. MAC and IP addresses are masked by a filter, but read the output before posting it publicly.

# HISTORY

Maintained by Raspberry Pi in the **raspberrypi/utils** repository. On Raspberry Pi OS it ships in the **raspinfo** package, which the **raspi-utils** metapackage pulls in.

# SEE ALSO

[raspi-config](/man/raspi-config)(1), [vcgencmd](/man/vcgencmd)(1), [pinout](/man/pinout)(1)

# RESOURCES

```[Source code](https://github.com/raspberrypi/utils)```

<!-- verified: 2026-11-09 -->
