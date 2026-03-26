# TAGLINE

Manage Sailfish OS emulator instances

# TLDR

**Start emulator**

```sfdk emulator start```

**Stop emulator**

```sfdk emulator stop```

**List emulators**

```sfdk emulator list```

**Show emulator** properties

```sfdk emulator show```

**Set emulator** CPU count

```sfdk emulator set vm.cpuCount=[4]```

**Set emulator** memory size

```sfdk emulator set vm.memorySize=[2048]```

# SYNOPSIS

**sfdk emulator** _command_ [_options_]

# PARAMETERS

**start**
> Start the emulator virtual machine.

**stop**
> Stop the emulator virtual machine.

**list**
> List available emulator instances.

**show**
> Display emulator virtual machine properties.

**set** _property=value_
> Set emulator virtual machine properties (e.g., vm.cpuCount, vm.memorySize).

**status**
> Show the current status of the emulator.

# DESCRIPTION

**sfdk emulator** manages Sailfish OS emulator instances for testing applications. It provides commands to start, stop, and configure emulator virtual machines. VM properties such as CPU count and memory size can be adjusted using the **set** subcommand. Part of the Sailfish SDK.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-device](/man/sfdk-device)(1)

