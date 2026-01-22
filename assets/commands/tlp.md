# TLDR

**Start** (apply power settings)

```sudo tlp start```

Apply **battery** settings

```sudo tlp bat```

Apply **AC** settings

```sudo tlp ac```

# SYNOPSIS

**tlp** _COMMAND_

# COMMANDS

**start**
> Apply settings based on current power source

**bat**
> Apply battery profile (ignore actual power source)

**ac**
> Apply AC profile (ignore actual power source)

**usb**
> Enable autosuspend for USB devices

**diskid**
> Show disk IDs for configuration

# DESCRIPTION

**tlp** is an advanced power management tool for Linux that optimizes battery life on laptops. It automatically applies power-saving settings when on battery and performance settings when on AC power.

Settings are configured in `/etc/tlp.conf` and cover CPU frequency, disk spin-down, USB autosuspend, WiFi power saving, and more.

# CAVEATS

May conflict with other power management tools. Some settings require specific hardware support. Test settings carefully on new hardware. Use `tlp-stat` to check current status.

# HISTORY

**TLP** was created by **Thomas Koch** (linrunner) to provide comprehensive power management for Linux laptops without requiring manual configuration.

# SEE ALSO

[tlp-stat](/man/tlp-stat)(8), [powertop](/man/powertop)(8)
