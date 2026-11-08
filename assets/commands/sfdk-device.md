# TAGLINE

List and access registered Sailfish OS devices

# TLDR

**List registered devices**

```sfdk device list```

**Open a shell on the configured device**

```sfdk device exec```

**Run a command on a specific device**

```sfdk device exec [name_or_index] [command]```

**Force pseudo-terminal allocation**

```sfdk device exec -t [command]```

**Select the device used by other commands**

```sfdk config device=[device_name]```

# SYNOPSIS

**sfdk device list**

**sfdk device exec** [_name-or-idx_] [**-t**] [**--**] [_command_ [_arg_...]]

# PARAMETERS

**list**
> List registered devices.

**exec**
> Execute a command on a device, or an interactive shell when no command is given. Without _name-or-idx_, the device selected with the **device** configuration option is used.

**-t**
> Follows the semantics of the **-t** option of **ssh**.

# DESCRIPTION

**sfdk device** lists and accesses devices registered with the Sailfish SDK. Part of the Sailfish SDK command-line tool.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-config](/man/sfdk-config)(1), [sfdk-emulator](/man/sfdk-emulator)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
