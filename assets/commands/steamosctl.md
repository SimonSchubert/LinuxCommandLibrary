# TAGLINE

SteamOS system and hardware management tool

# TLDR

**Get all system properties**

```steamosctl get-all-properties```

**Get the current fan control state**

```steamosctl get-fan-control-state```

**Set fan control** to OS-managed

```steamosctl set-fan-control-state os```

**Get current TDP limit**

```steamosctl get-tdp-limit```

**Set TDP limit** in watts

```steamosctl set-tdp-limit [15]```

**Set GPU performance level**

```steamosctl set-gpu-performance-level [auto|low|high|manual]```

**Set max battery charge level**

```steamosctl set-max-charge-level [80]```

**List available performance profiles**

```steamosctl get-available-performance-profiles```

**Switch to desktop mode**

```steamosctl switch-to-desktop-mode```

**Get the device model**

```steamosctl get-device-model```

# SYNOPSIS

**steamosctl** \<command\> [arguments]

# DESCRIPTION

**steamosctl** is a command-line utility for managing SteamOS system hardware and software settings. It communicates with the **steamos-manager** daemon over D-Bus to control hardware features on devices running SteamOS, including the Steam Deck and other supported handhelds.

The steamos-manager system consists of a user daemon on the session bus and a root daemon on the system bus for privileged operations. steamosctl provides command-line access to all exposed functionality including fan control, CPU and GPU tuning, TDP limits, Wi-Fi configuration, battery management, and firmware updates.

# COMMANDS

**get-fan-control-state** / **set-fan-control-state** _\<bios|os\>_
> Get or set the fan control mode.

**get-cpu-scaling-governor** / **set-cpu-scaling-governor** _\<governor\>_
> Get or set the CPU scaling governor.

**get-available-cpu-scaling-governors**
> List the CPU scaling governors supported on this device.

**get-cpu-scheduler** / **set-cpu-scheduler** _\<scheduler\>_ / **get-available-cpu-schedulers**
> Get, set or list CPU schedulers.

**get-cpu-boost-state** / **set-cpu-boost-state** _\<enabled|disabled\>_
> Get or set CPU boost.

**get-gpu-performance-level** / **set-gpu-performance-level** _\<auto|low|high|manual|profile_peak\>_
> Get or set GPU performance level.

**get-gpu-power-profile** / **set-gpu-power-profile** _\<profile\>_
> Get or set GPU power profile.

**get-available-gpu-power-profiles**
> List the GPU power profiles supported on this device.

**get-manual-gpu-clock** / **set-manual-gpu-clock** _\<freq\>_
> Get or set manual GPU clock frequency in MHz. Only works when the performance level is **manual**.

**get-manual-gpu-clock-min** / **get-manual-gpu-clock-max**
> Get the allowed manual GPU clock range.

**get-tdp-limit** / **set-tdp-limit** _\<watts\>_
> Get or set TDP limit.

**get-tdp-limit-min** / **get-tdp-limit-max**
> Get minimum or maximum allowed TDP values.

**get-performance-profile** / **set-performance-profile** _\<profile\>_
> Get or set performance profile.

**get-available-performance-profiles** / **suggested-default-performance-profile**
> List supported profiles or get the suggested default.

**get-wifi-backend** / **set-wifi-backend** _\<iwd|wpa_supplicant\>_
> Get or set Wi-Fi backend.

**get-wifi-power-management-state** / **set-wifi-power-management-state** _\<enabled|disabled\>_
> Get or set Wi-Fi power management.

**get-hdmi-cec-state** / **set-hdmi-cec-state** _\<disabled|control-only|control-and-wake\>_
> Get or set HDMI-CEC state.

**get-max-charge-level** / **set-max-charge-level** _\<1-100|-1\>_
> Get or set max battery charge level. Use -1 for default.

**switch-to-desktop-mode** [_session_] / **switch-to-game-mode**
> Switch from the current session into desktop or game mode.

**get-default-login-mode** / **set-default-login-mode** _\<game|desktop\>_
> Get or set the default login mode.

**get-valid-desktop-sessions** / **get-default-desktop-session** / **set-default-desktop-session** _\<session\>_
> List desktop sessions, or get or set the default one.

**update-bios**
> Update the BIOS firmware.

**update-dock**
> Update dock firmware.

**trim-devices**
> Trim applicable storage drives.

**prepare-factory-reset** _\<user|os|all\>_
> Prepare a factory reset.

**reload-config**
> Reload configuration from disk.

**get-all-properties**
> Get all properties from the manager.

**get-device-model**
> Get the model and variant of the device.

# CAVEATS

Only available on SteamOS. Requires the **steamos-manager** daemon to be running. Some operations like firmware updates and factory resets require elevated privileges through the system D-Bus daemon. The tool has no traditional man page; documentation lives in the source code.

# HISTORY

**steamosctl** was developed by **Valve** with contributions from **Collabora** as part of the **steamos-manager** project. Written in **Rust**, it is hosted on Valve's public GitLab since **May 2025**. The tool provides a standardized D-Bus interface enabling third-party handheld devices to support SteamOS hardware management features.

# SEE ALSO

[steamos-update](/man/steamos-update)(1), [cpupower](/man/cpupower)(1), [powerprofilesctl](/man/powerprofilesctl)(1)

# RESOURCES

```[Source code](https://gitlab.steamos.cloud/holo/steamos-manager)```

<!-- verified: 2026-11-09 -->
