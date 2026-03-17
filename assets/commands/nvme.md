# TAGLINE

NVMe storage command line interface utility

# TLDR

**List all NVMe devices**

```sudo nvme list```

**Show controller identification**

```sudo nvme id-ctrl [/dev/nvme0]```

**Show namespace identification**

```sudo nvme id-ns [/dev/nvme0n1]```

**Show SMART health information**

```sudo nvme smart-log [/dev/nvme0]```

**Show error log entries**

```sudo nvme error-log [/dev/nvme0]```

**Format a namespace (destroys all data)**

```sudo nvme format [/dev/nvme0n1]```

**Download firmware to a device**

```sudo nvme fw-download [/dev/nvme0] --fw=[firmware.bin]```

**Run a device self-test**

```sudo nvme device-self-test [/dev/nvme0] --stc=[1]```

# SYNOPSIS

**nvme** _command_ [_device_] [_options_]

# PARAMETERS

**list**
> List all NVMe devices and namespaces.

**id-ctrl** _DEVICE_
> Send an identify controller command and display the result.

**id-ns** _DEVICE_
> Send an identify namespace command and display the result.

**smart-log** _DEVICE_
> Retrieve SMART / health information log.

**error-log** _DEVICE_
> Retrieve error information log.

**fw-log** _DEVICE_
> Retrieve firmware slot information log.

**format** _DEVICE_
> Format namespace(s) with specified LBA format.

**fw-download** _DEVICE_
> Download firmware image to the device.

**fw-activate** _DEVICE_
> Activate a downloaded firmware image.

**sanitize** _DEVICE_
> Perform a sanitize operation (secure erase).

**device-self-test** _DEVICE_
> Run a device self-test (short or extended).

**get-feature** _DEVICE_
> Get a feature value from the controller.

**set-feature** _DEVICE_
> Set a feature value on the controller.

**discover**
> Discover NVMe-over-Fabrics subsystems.

**connect** _DEVICE_
> Connect to an NVMe-over-Fabrics controller.

**help** _COMMAND_
> Display help for a specific subcommand.

# DESCRIPTION

**nvme** is a user space utility providing standards-compliant tooling for NVM-Express (NVMe) drives on Linux. It has subcommands for all admin and I/O commands defined in the NVMe specification, as well as commands for displaying controller registers and retrieving various log pages.

The utility supports NVMe-over-Fabrics operations including discovery, connect, and disconnect for remote NVMe subsystems. It can also submit completely arbitrary vendor-specific commands via passthrough.

All commands return 0 on success and 1 on failure.

# CAVEATS

Root privileges are required for most operations. The **format** and **sanitize** commands destroy all data on the device and are irreversible. The **sanitize** command cannot be aborted once started. NVMe-over-Fabrics commands require appropriate kernel modules.

# HISTORY

**nvme-cli** is developed as an open-source project under the Linux NVMe project at https://github.com/linux-nvme/nvme-cli. It relies on Linux kernel NVMe IOCTLs and is Linux-specific.

# SEE ALSO

[smartctl](/man/smartctl)(1), [hdparm](/man/hdparm)(8), [lsblk](/man/lsblk)(1)
