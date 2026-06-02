# TAGLINE

Manage Sailfish SDK build engine

# TLDR

**Start SDK engine**

```sfdk engine start```

**Stop SDK engine**

```sfdk engine stop```

**Show engine status**

```sfdk engine status```

**Run a command inside the engine**

```sfdk engine exec [command]```

# SYNOPSIS

**sfdk engine** _command_ [_options_]

# PARAMETERS

**start**
> Start the build engine virtual machine.

**stop**
> Stop the build engine virtual machine.

**status**
> Show whether the engine is running.

**exec** _command_
> Execute a command inside the running engine.

# DESCRIPTION

**sfdk engine** manages the Sailfish SDK build engine, which runs as a virtual machine providing the Sailfish OS build environment. The engine must be started before other `sfdk` build commands can be used, and is typically left running across builds.

# CAVEATS

The engine is a virtual machine and requires a working virtualization backend (VirtualBox or Docker depending on the SDK variant). Starting the engine can take several seconds on first launch.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-build-shell](/man/sfdk-build-shell)(1)

