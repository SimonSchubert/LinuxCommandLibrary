# TAGLINE

Manage Sailfish SDK build engine

# TLDR

**Start SDK engine**

```sfdk engine start```

**Stop SDK engine**

```sfdk engine stop```

**Show engine status**

```sfdk engine status```

**Open an interactive shell** inside the engine

```sfdk engine exec```

**Run a command inside the engine**

```sfdk engine exec [command]```

**Show engine properties**

```sfdk engine show```

**Give the engine VM more CPUs and memory**

```sfdk engine set vm.cpu-count=[4] vm.memory-size=[8192]```

**Forward host environment variables** matching a pattern into the build environment

```sfdk engine set environment.filter="[MY_* CI]"```

# SYNOPSIS

**sfdk engine** {**start**|**stop**|**status**}

**sfdk engine set** _property_=_value_...

**sfdk engine show**

**sfdk engine exec** [**-t**] [**--**] [_command_ [_arg_...]]

# PARAMETERS

**start**
> Start the build engine virtual machine.

**stop**
> Stop the build engine virtual machine.

**status**
> Print status information about the engine.

**set** _property_=_value_...
> Set one or more build engine properties.

**show**
> Print the current build engine properties.

**exec** [**-t**] [_command_]
> Execute _command_ inside the build engine, or an interactive shell if none is given. **-t** behaves like the **-t** option of ssh(1).

# ENGINE PROPERTIES

**environment.filter** _pattern_...
> Host environment variables matching any pattern (with "*" wildcards, whitespace separated) are forwarded into the otherwise isolated build environment.

**host-name** _name_
> Host name recorded in build result metadata. Defaults to the host name of the machine running sfdk.

**vm.cpu-count** _number_
> Number of virtual CPUs in the engine VM, limited by the host CPU count.

**vm.memory-size** _megabytes_
> RAM available to the engine VM.

**vm.storage-size** _megabytes_
> Disk space of the engine VM. It can only grow, never shrink.

**vm.swap-size** _megabytes_
> Swap size inside the VM. **0** (default) disables swap.

# DESCRIPTION

**sfdk engine** manages the Sailfish SDK build engine, a virtual machine (or container) that provides the Sailfish OS build environment. Starting it explicitly is usually not required: sfdk commands that need the engine start it automatically. Explicit **start** and **stop** are a convenience, for example to free resources after a build session.

# CAVEATS

The engine requires a working virtualization backend (VirtualBox or Docker, depending on the SDK installation). To stop every VM provided by the SDK, including emulators, use **sfdk misc stop-vms**.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-build-shell](/man/sfdk-build-shell)(1), [sfdk-config](/man/sfdk-config)(1), [sfdk-emulator](/man/sfdk-emulator)(1), [sfdk-device](/man/sfdk-device)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-23 -->
