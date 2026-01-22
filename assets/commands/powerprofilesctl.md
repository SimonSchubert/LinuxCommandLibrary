# TLDR

**List** available power profiles

```powerprofilesctl list```

**Set** a power profile

```powerprofilesctl set [performance|balanced|power-saver]```

# SYNOPSIS

**powerprofilesctl** [**list**|**set** _profile_|**get**]

# COMMANDS

**list**
> List all available power profiles

**get**
> Get current active profile

**set _profile_**
> Set the active power profile

# PARAMETERS

**profile**
> Profile name: performance, balanced, or power-saver

# DESCRIPTION

**powerprofilesctl** manages system power profiles via the power-profiles-daemon. It allows switching between performance and power-saving modes to balance energy consumption and system responsiveness.

Profiles affect CPU governor, GPU power management, and other hardware power settings. The daemon exposes profiles over D-Bus for desktop integration.

# CAVEATS

Requires power-profiles-daemon running. Available profiles depend on hardware support. May conflict with other power management tools (TLP, etc.). GNOME/KDE integrate this via GUI settings.

# HISTORY

**power-profiles-daemon** was developed by **Bastien Nocera** for freedesktop.org. It provides a simple, standardized interface for power management that desktop environments can use.

# SEE ALSO

[tlp](/man/tlp)(1), [cpupower](/man/cpupower)(1), [tuned-adm](/man/tuned-adm)(8)
