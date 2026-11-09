# TAGLINE

Manage Sailfish OS emulator instances

# TLDR

**Start emulator**

```sfdk emulator start```

**Stop emulator**

```sfdk emulator stop```

**List** installed emulators

```sfdk emulator list```

**List emulators available** for installation

```sfdk emulator list --available```

**Install** an emulator

```sfdk emulator install [name]```

**Open a shell** inside the emulator

```sfdk emulator exec```

**Run a command** inside the emulator

```sfdk emulator exec [command]```

**Show emulator** properties

```sfdk emulator show```

**Set emulator** CPU count

```sfdk emulator set vm.cpu-count=[4]```

**Set emulator** memory size in megabytes

```sfdk emulator set vm.memory-size=[2048]```

# SYNOPSIS

**sfdk emulator** _command_ [_options_]

# PARAMETERS

**list** [**-a**, **--available**]
> List installed emulators, or with **--available** those available from SDK repositories.

**start**|**stop**|**status** [_name_]
> Start or stop the emulator virtual machine, or print its status.

**set** [_name_] [**--**] _property=value_...
> Set emulator properties.

**show** [_name_]
> Display emulator properties.

**exec** [_name_] [**-t**] [**--**] [_command_ [_arg_...]]
> Execute a command inside the emulator, or an interactive shell if no command is given.

**install** _name_
> Install an emulator from the SDK repositories.

**remove** _name_
> Remove an installed emulator.

**device-model-list**
> List the available device models.

**device-model-show** _model_
> Show details of a device model.

# PROPERTIES

**device-model** _name_
> The device model to emulate.

**orientation** _portrait_|_landscape_
> Display orientation.

**downscale** _boolean_
> Downscale the display resolution by a factor of 2.

**vm.cpu-count** _number_
> Number of virtual CPUs, limited by the CPUs available on the host.

**vm.memory-size** _megabytes_
> Amount of RAM, limited by the physical memory of the host.

**vm.storage-size** _megabytes_
> Amount of disk space. Storage can only grow; shrinking is not possible.

# DESCRIPTION

**sfdk emulator** manages Sailfish OS emulator instances for testing applications. It provides commands to install, start, stop, and configure emulator virtual machines. Part of the Sailfish SDK.

When _name_ is omitted, the default emulator shown by **list** is used. Starting an emulator explicitly is usually not required, as commands that need it running ensure that it is.

# CAVEATS

The emulated CPU architecture is always i486. Only the display properties of the emulated hardware can vary between device models.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-device](/man/sfdk-device)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-09 -->
