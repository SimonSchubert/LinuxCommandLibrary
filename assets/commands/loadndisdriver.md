# TAGLINE

ndiswrapper helper that loads Windows NDIS drivers into the kernel module

# TLDR

Show the **version** of the ndiswrapper utilities

```loadndisdriver -v```

Load the **ndiswrapper kernel module**, which calls loadndisdriver automatically

```sudo modprobe ndiswrapper```

**Install** a Windows driver so it can be loaded (use ndiswrapper, not loadndisdriver)

```sudo ndiswrapper -i [path/to/driver.inf]```

# SYNOPSIS

**loadndisdriver** **-v**

**loadndisdriver** _command_ _debug_ _version_ _arguments_...

# PARAMETERS

**-v**, **--version**
> Print the utilities version and exit.

**load_device** _debug_ _version_ _vendor_ _device_ _subvendor_ _subdevice_ _bus_
> Load the configuration for a device identified by hexadecimal PCI/USB IDs.

**load_driver** _debug_ _version_ _driver_ _conf_file_
> Load the Windows driver files (.sys, .conf) for _driver_ from /etc/ndiswrapper.

**load_bin_file** _debug_ _version_ _driver_ _file_
> Load an additional binary firmware file used by a driver.

_debug_
> Debug level (0 or higher); messages go to syslog.

_version_
> Utilities version expected by the kernel module; a mismatch aborts loading.

# DESCRIPTION

**loadndisdriver** is a low-level helper from **ndiswrapper**, installed in **/sbin**. It is not meant to be run by hand: the ndiswrapper kernel module invokes it as a usermode helper when a matching device is found, and it reads the driver files that **ndiswrapper -i** installed under **/etc/ndiswrapper/**_driver_ and passes them to the module through the **/dev/ndiswrapper** ioctl device.

Drivers are installed, listed and removed with the **ndiswrapper** command; loadndisdriver only performs the loading step.

# CAVEATS

The loadndisdriver version must match the loaded ndiswrapper kernel module. Windows drivers must match the kernel architecture (32-bit drivers for 32-bit kernels, 64-bit for 64-bit). ndiswrapper only supports old Windows XP-era NDIS 5 drivers, is no longer actively developed, and does not build against recent kernels without patches; native Linux drivers are strongly preferred.

# HISTORY

loadndisdriver ships with **ndiswrapper**, started by **Pontus Fuchs** and **Giridhar Pemmasani** in **2003** to run Windows wireless drivers on Linux when no native driver existed. The last release, 1.63, dates from **2020**.

# SEE ALSO

[ndiswrapper](/man/ndiswrapper)(8), [modprobe](/man/modprobe)(8), [lspci](/man/lspci)(8), [lsusb](/man/lsusb)(8)

# RESOURCES

```[Source code](https://github.com/pgiri/ndiswrapper)```

```[Homepage](https://sourceforge.net/projects/ndiswrapper/)```

<!-- verified: 2026-09-29 -->
