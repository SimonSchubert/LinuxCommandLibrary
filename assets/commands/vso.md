# TAGLINE

Vanilla OS system operator tool

# TLDR

Check for **updates**

```vso upgrade check```

**Upgrade** the system in the background

```vso upgrade```

**Upgrade** and reboot once the update is ready

```vso upgrade --now```

Initialize the **native subsystem**

```vso native init```

**Install** applications

```vso native install [package1] [package2]```

**Remove** applications

```vso native remove [package1] [package2]```

**Sideload** a local package

```vso native sideload [path/to/package.deb]```

Enter subsystem **shell**

```vso native shell```

**Run** a command from the subsystem

```vso native run [command]```

**Export** an application to the host desktop

```vso native export --app [app_name]```

Show **config**

```vso config show```

List scheduled **tasks**

```vso tasks list```

# SYNOPSIS

**vso** _COMMAND_ [_OPTIONS_]

# COMMANDS

**upgrade** [**--now**]
> Prepare the available system image update in the background

**upgrade check** [**--json**]
> Check for system updates

**native init** [**-f**]
> Initialize the VSO subsystem used for package management

**native install**
> Install applications in the subsystem

**native remove**
> Remove applications from the subsystem

**native sideload**
> Sideload DEB/APK packages inside the subsystem

**native update**
> Update the subsystem's package repository

**native upgrade**
> Upgrade the packages inside the subsystem

**native shell**
> Enter the subsystem shell

**native run** [**--no-reset**]
> Run an application from the subsystem

**native export**
> Export an application or binary from the subsystem

**native unexport**
> Remove an exported application or binary

**config show**
> Display configuration

**config get** _KEY_
> Read a configuration value

**config set** _KEY_ _VALUE_
> Change a configuration value (requires administrative privileges)

**tasks list** [**-j**]
> List all scheduled tasks

**tasks new**
> Create a new task

**tasks rm** [**-n** _NAME_] [**-f**]
> Remove a task

**tasks rotate**
> Rotate tasks

**man**
> Generate the manual page

# PARAMETERS

**--now**
> With **upgrade**: reboot after the upgrade is ready

**--json**
> With **upgrade check**: output the result in JSON format

**-f**, **--force**
> With **native init**: initialize even if the subsystem already exists

**--no-reset**
> With **native run**: do not propose to reset the subsystem if something goes wrong

**--app** _NAME_
> With **native export** or **unexport**: name of the application

**--bin** _NAME_
> With **native export** or **unexport**: name of the binary

**--bin-output** _PATH_
> With **native export** or **unexport**: path of the binary output (default: ~/.local/bin/)

**-j**, **--json**
> With **tasks list**: output in JSON format

**-h**, **--help**
> Show help information

**--version**
> Show version information

# CONFIGURATION

**updates.smart**
> Accepts true or false.

**updates.schedule**
> Accepts never, daily, weekly or monthly.

# DESCRIPTION

**vso** (Vanilla System Operator) provides the user-facing commands for system upgrades, native package management and scheduled tasks on Vanilla OS. Image deployment is delegated to ABRoot, so the current system remains usable while the future state is prepared.

The native subsystem installs Debian packages without modifying the host image. It is managed by Apx under the name apx-vso-native.

# CAVEATS

Vanilla OS specific. The subsystem must be initialized before package operations. VSO 3 replaced the VSO 2 **sys-upgrade** command and the top-level package commands (**pico-init**, **install**, **remove**, **shell**, **run**, **export**), and no longer provides the former Android and Waydroid commands. Installations upgraded from an older release may also contain the legacy apx-vso-pico subsystem.

# SEE ALSO

[abroot](/man/abroot)(1), [apx](/man/apx)(1), [flatpak](/man/flatpak)(1), [snap](/man/snap)(1)

# RESOURCES

```[Source code](https://github.com/Vanilla-OS/vanilla-system-operator)```

```[Homepage](https://vanillaos.org)```

```[Documentation](https://docs.vanillaos.org/docs/en/vso)```

<!-- verified: 2026-11-09 -->
