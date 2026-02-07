# TAGLINE

Low-level Bluetooth adapter management tool

# TLDR

**Start interactive mode**

```btmgmt```

**List Bluetooth adapters**

```btmgmt info```

**Use specific adapter**

```btmgmt -i [hci0] info```

**Power on adapter**

```btmgmt power on```

**Power off adapter**

```btmgmt power off```

**Start discovery**

```btmgmt find```

**Enable monitor mode**

```btmgmt -m```

**Run command with timeout**

```btmgmt -t [10] find```

# SYNOPSIS

**btmgmt** [_options_] [_command_]

# DESCRIPTION

**btmgmt** is an interactive Bluetooth management tool that issues commands to the kernel using the Bluetooth Management socket. It provides low-level control of Bluetooth adapter settings, discovery, and pairing functionality.

The tool is part of the BlueZ Bluetooth stack and uses the management interface available since Linux kernel 3.4.

# PARAMETERS

**-i, --index** _adapter_
> Specify adapter index (e.g., hci0)

**-m, --monitor**
> Enable monitor output

**-t, --timeout** _seconds_
> Timeout for non-interactive mode

**-v, --version**
> Display version

**--init-script** _file_
> Run commands from init script

**-h, --help**
> Display help

# COMMANDS

**info**
> Show adapter information

**power** _on|off_
> Control adapter power state

**find**
> Start device discovery

**pair** _address_
> Pair with device

**unpair** _address_
> Remove pairing

**disconnect** _address_
> Disconnect device

**con**
> List connections

# CAVEATS

Some commands require net-admin capability or root privileges. This is a low-level interface meant for bluetoothd; applications should use D-Bus APIs instead. Direct use may cause unexpected behavior with the Bluetooth daemon.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hciconfig](/man/hciconfig)(1), [hcitool](/man/hcitool)(1), [bluetoothd](/man/bluetoothd)(8)
