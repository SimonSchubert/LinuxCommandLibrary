# TLDR

**Show system info**

```pfetch```

**Show with custom ASCII art**

```PF_ASCII="[arch]" pfetch```

**Show specific info fields**

```PF_INFO="[ascii title os kernel uptime]" pfetch```

**Disable colors**

```PF_COLOR=0 pfetch```

**Custom separator**

```PF_SEP=": " pfetch```

# SYNOPSIS

**pfetch**

# ENVIRONMENT

**PF_INFO**
> Fields to display (space-separated).

**PF_ASCII**
> ASCII art to use (distro name or "off").

**PF_COLOR**
> Enable colors (1) or disable (0).

**PF_SEP**
> Separator between label and value.

**PF_COL1**
> Color for labels.

**PF_COL2**
> Color for info.

**PF_COL3**
> Color for title.

# AVAILABLE INFO FIELDS

**ascii**
> Distro ASCII art.

**title**
> Username@hostname.

**os**
> Operating system.

**host**
> Machine model.

**kernel**
> Kernel version.

**uptime**
> System uptime.

**pkgs**
> Package count.

**memory**
> RAM usage.

**shell**
> Current shell.

**editor**
> Default editor.

**wm**
> Window manager.

**palette**
> Color palette.

# DESCRIPTION

**pfetch** displays system information with ASCII art. It's a minimal, fast alternative to neofetch and screenfetch.

The tool is a single POSIX shell script with no dependencies. It works on Linux, BSD, macOS, and other Unix-like systems.

Configuration uses environment variables. Set PF_INFO to control displayed fields. Set PF_ASCII to use different distro logos.

Output is colorful by default, suitable for screenshots and ricing. Colors can be disabled for logging or minimal environments.

Detection covers many distributions, package managers, window managers, and desktop environments automatically.

The minimal design prioritizes speed over features. It starts instantly compared to heavier alternatives.

# CAVEATS

Fewer features than neofetch. Some obscure systems may not be detected. ASCII art limited compared to alternatives.

# HISTORY

**pfetch** was created by **Dylan Araps** around **2019** as a minimal system info tool. The same author created neofetch, with pfetch being a stripped-down alternative for those preferring simplicity.

# SEE ALSO

[neofetch](/man/neofetch)(1), [screenfetch](/man/screenfetch)(1), [fastfetch](/man/fastfetch)(1), [macchina](/man/macchina)(1)
