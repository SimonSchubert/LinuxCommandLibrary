# TAGLINE

Manage Ubuntu hardware driver packages

# TLDR

**List** available drivers for current hardware

```sudo ubuntu-drivers list```

**Install** all recommended drivers

```sudo ubuntu-drivers install```

Install a **specific driver**

```sudo ubuntu-drivers install nvidia-driver-535```

Display **help**

```ubuntu-drivers --help```

Show **devices** and available drivers

```ubuntu-drivers devices```

# SYNOPSIS

**ubuntu-drivers** [_options_] _command_

# DESCRIPTION

**ubuntu-drivers** is a utility for managing driver packages on Ubuntu systems. It detects hardware that requires proprietary or additional drivers and can automatically install the recommended drivers.

# PARAMETERS

**list**
> List recommended driver packages for detected hardware

**install**
> Install recommended drivers for all detected hardware

**install DRIVER**
> Install a specific driver package

**devices**
> Show devices and available drivers

**autoinstall**
> Install drivers automatically (used during installation)

**debug**
> Print debug information for troubleshooting

# CAVEATS

Requires root privileges for installation. A system restart is typically required after driver installation. For NVIDIA drivers, this tool is the recommended method on Ubuntu systems.

# HISTORY

**ubuntu-drivers** is developed by Canonical as part of Ubuntu's device driver management system, simplifying the process of finding and installing hardware drivers.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [nvidia-smi](/man/nvidia-smi)(1)
