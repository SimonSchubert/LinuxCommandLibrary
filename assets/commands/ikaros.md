# TLDR

**Interactively install** drivers for a device

```ikaros install [device]```

**Automatically install** recommended drivers

```ikaros auto-install [device]```

**List** all devices

```ikaros list-devices```

# SYNOPSIS

**ikaros** _command_ [_arguments_]

# PARAMETERS

**install** _DEVICE_
> Interactively install drivers for the specified device

**auto-install** _DEVICE_
> Automatically install recommended drivers for the device

**list-devices**
> List all detected devices that may need drivers

# DESCRIPTION

**ikaros** is the driver management tool for Vanilla OS. It detects hardware devices and helps install appropriate drivers, simplifying the often complex process of finding and installing device drivers on Linux.

The tool can either guide users through interactive driver selection or automatically install recommended drivers based on detected hardware.

# CAVEATS

Specific to Vanilla OS and its package management system. Device support depends on available drivers in the repository. Some proprietary drivers may require additional configuration.

# HISTORY

Ikaros was developed as part of the Vanilla OS project, an immutable Linux distribution that launched in **2022**. The tool provides a user-friendly way to manage drivers in the Vanilla OS environment.

# SEE ALSO

[apx](/man/apx)(1), [ubuntu-drivers](/man/ubuntu-drivers)(1)
