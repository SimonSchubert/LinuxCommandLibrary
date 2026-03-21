# TAGLINE

Vanilla OS system operator tool

# TLDR

Check for **updates**

```vso sys-upgrade check```

**Upgrade** system now

```vso sys-upgrade upgrade --now```

Initialize **Pico** subsystem

```vso pico-init```

**Install** applications

```vso install [package1] [package2]```

**Remove** applications

```vso remove [package1] [package2]```

Enter subsystem **shell**

```vso shell```

**Run** application

```vso run [package]```

Show **config**

```vso config show```

# SYNOPSIS

**vso** _COMMAND_ [_OPTIONS_]

# COMMANDS

**sys-upgrade check**
> Check for system updates

**sys-upgrade upgrade**
> Upgrade the system

**pico-init**
> Initialize Pico subsystem

**install**
> Install applications in subsystem

**remove**
> Remove applications from subsystem

**shell**
> Enter subsystem shell

**run**
> Run application from subsystem

**export**
> Export an installed application as a desktop entry

**unexport**
> Remove an exported desktop entry

**config show**
> Display configuration

**help**
> Show help for a command

# PARAMETERS

**--now**
> Perform system upgrade immediately without scheduling

**-h**, **--help**
> Show help information

**--version**
> Show version information

# DESCRIPTION

**vso** (Vanilla System Operator) is a package manager, system updater, and task automator for Vanilla OS. It manages the immutable host system and a mutable Pico subsystem for package installation.

The subsystem provides a container-like environment where traditional packages can be installed without modifying the base system.

# CAVEATS

Vanilla OS specific. Subsystem must be initialized before package operations. System upgrades may require reboot.

# SEE ALSO

[apx](/man/apx)(1), [flatpak](/man/flatpak)(1), [snap](/man/snap)(1)
