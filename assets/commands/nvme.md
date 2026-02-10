# TAGLINE

manages NVMe devices

# TLDR

**List NVMe devices**

```nvme list```

**Show device info**

```nvme id-ctrl [/dev/nvme0]```

**Show namespace info**

```nvme id-ns [/dev/nvme0n1]```

**Show SMART data**

```nvme smart-log [/dev/nvme0]```

**Format namespace**

```nvme format [/dev/nvme0n1]```

**Firmware update**

```nvme fw-download [/dev/nvme0] --fw=[firmware.bin]```

# SYNOPSIS

**nvme** [_command_] [_options_]

# PARAMETERS

**list**
> List NVMe devices.

**id-ctrl** _DEVICE_
> Show controller info.

**id-ns** _DEVICE_
> Show namespace info.

**smart-log** _DEVICE_
> Show SMART log.

**format** _DEVICE_
> Format namespace.

**fw-download** _DEVICE_
> Download firmware.

**--help**
> Display help information.

# DESCRIPTION

**nvme** manages NVMe devices. Provides admin and I/O commands.

The tool controls NVMe SSDs. Low-level device management.

# CAVEATS

Root required for most operations. Format destroys data. Use with caution.

# HISTORY

nvme-cli was created for **NVMe device management** on Linux systems.

# SEE ALSO

[smartctl](/man/smartctl)(1), [hdparm](/man/hdparm)(1), [lsblk](/man/lsblk)(1)

