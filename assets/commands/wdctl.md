# TAGLINE

Display hardware watchdog timer status

# TLDR

**Display** the watchdog status

```wdctl```

**Display** the watchdog status in key-value format on one line

```wdctl -O```

**Display** only specific watchdog flags

```wdctl -f [flag_list]```

# SYNOPSIS

**wdctl** [_options_] [_device_]

# PARAMETERS

**-O, --oneline**
> Output in single-line key-value format

**-f, --flags _list_**
> Display only specified flags

**-s, --settimeout _seconds_**
> Set the watchdog timeout

**-x, --flags-only**
> Show flags only

**-o, --output _list_**
> Define output columns

**-r, --raw**
> Raw output format

**-n, --noheadings**
> Don't print headings

# DESCRIPTION

**wdctl** shows the status of the hardware watchdog timer. A watchdog is a hardware or software timer that triggers a system reset if the main program fails to regularly reset it, preventing system lockups.

The output includes information about the watchdog device, timeout values, and supported features. Different hardware watchdogs support different capabilities.

# CAVEATS

Requires read access to the watchdog device (typically **/dev/watchdog**). Available flags are driver-specific. Not all systems have hardware watchdog support. Part of the util-linux package.

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add util-linux-misc```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[watchdog](/man/watchdog)(8)
