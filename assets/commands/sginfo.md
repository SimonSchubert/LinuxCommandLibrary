# TLDR

**Display INQUIRY data** for a SCSI device

```sudo sginfo [/dev/sda]```

**List all mode pages** supported by the device

```sudo sginfo -u 63 [/dev/sda]```

**Display a specific mode page**

```sudo sginfo -t [0x08] [/dev/sda]```

**Display modifiable fields** instead of current values

```sudo sginfo -m -t [0x08] [/dev/sda]```

**Display manufacturer's defaults**

```sudo sginfo -M -t [0x08] [/dev/sda]```

**Display saved defaults**

```sudo sginfo -S -t [0x08] [/dev/sda]```

**Output values in editable list format**

```sudo sginfo -X -t [0x08] [/dev/sda]```

# SYNOPSIS

**sginfo** [_options_] [_DEVICE_]

# PARAMETERS

**-a**
> Display all mode pages reported by the device.

**-A**
> Display all mode pages and subpages reported by the device.

**-c**
> Display caching page information.

**-C**
> Display control mode page.

**-d**
> Display disconnect-reconnect page.

**-D**
> Display defect lists (requires disk support).

**-e**
> Display error recovery page.

**-f**
> Display format page.

**-g**
> Display geometry page.

**-i**
> Display INQUIRY data and serial number.

**-m**
> Display modifiable fields instead of current values.

**-M**
> Display manufacturer's default values.

**-S**
> Display saved values.

**-t** _PN_
> Display mode page number PN.

**-u** _PN_
> Display mode page PN in unprocessed hexadecimal format.

**-X**
> Output values in a list format suitable for editing and restoring with **-R**.

**-R**
> Replace mode page values from input file.

**-v**
> Display version information.

# DESCRIPTION

**sginfo** accesses mode page information for SCSI and ATAPI devices. It can display and modify SCSI mode pages which control various device behaviors such as caching, error recovery, and power management.

Each SCSI device maintains four sets of values for mode pages: **current** (active values), **default** (manufacturer's settings), **saved** (values retained across power cycles), and **changeable** (mask of modifiable fields).

The primary use case is reading and modifying device configuration through mode pages. Mode pages can be displayed in raw hexadecimal or decoded format, and modified values can be written back to the device.

# CAVEATS

This utility is in legacy mode and only receives critical bug fixes. The **-l** option for listing devices is broken on Linux 2.6 and later; use **lsscsi** instead. For working with mode pages, **sdparm** is recommended as a more modern alternative. Mode page definitions are not being updated as the T10 SCSI standards evolve.

# HISTORY

**sginfo** is a port of the Linux **scsiinfo** program originally written by Eric Youngdale. It was rewritten by Douglas Gilbert with contributions from Kurt Garloff as part of the **sg3_utils** package. The utility has been available since the Linux 2.4 kernel series and continues to be distributed under the GPL version 2, though it is now considered legacy software.

# SEE ALSO

[sg_modes](/man/sg_modes)(8), [sg_inq](/man/sg_inq)(8), [sdparm](/man/sdparm)(8), [lsscsi](/man/lsscsi)(1), [sg_vpd](/man/sg_vpd)(8)
