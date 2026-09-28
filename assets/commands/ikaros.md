# TAGLINE

driver management tool for Vanilla OS

# TLDR

**List** detected devices with their IDs and available drivers

```ikaros list-devices```

List devices as **JSON**

```ikaros list-devices --json```

**Install** the driver for a specific device

```ikaros install [device_id]```

**Automatically install** the recommended drivers for all devices

```ikaros auto-install [device_id]```

Show the **version**

```ikaros --version```

# SYNOPSIS

**ikaros** _command_ [_arguments_] [_options_]

# PARAMETERS

**list-devices** [**-j**, **--json**]
> List detected devices grouped by type, showing ID, product, vendor, bus info and matching drivers. **--json** prints the result as JSON.

**install** _DEVICE_ID_
> Install the driver for the device with the given ID (as shown by **list-devices**).

**auto-install** _ARG_
> Install the correct drivers for all detected devices.

**completion** _SHELL_
> Generate a shell completion script.

**-h**, **--help**
> Show help for ikaros or a subcommand.

**-v**, **--version**
> Show the version.

# DESCRIPTION

**ikaros** is the drivers backend for Vanilla OS. It detects hardware devices and installs appropriate drivers, and is meant as a replacement for Ubuntu's **ubuntu-drivers-common**.

Use **list-devices** to find a device's ID, then either install a driver for that device or let **auto-install** pick the drivers for all devices.

# CAVEATS

Specific to Vanilla OS. The upstream README still describes the project as in development and not ready for production use. **auto-install** currently requires exactly one argument even though it acts on all devices. Device support depends on the drivers available in the repositories.

# HISTORY

Ikaros was developed by the Vanilla OS team as part of the Vanilla OS project, an immutable Linux distribution first released in **2022**. It is written in **Go**.

# SEE ALSO

[apx](/man/apx)(1), [abroot](/man/abroot)(1), [ubuntu-drivers](/man/ubuntu-drivers)(1)

# RESOURCES

```[Source code](https://github.com/Vanilla-OS/Ikaros)```

```[Homepage](https://vanillaos.org)```

<!-- verified: 2026-09-29 -->
