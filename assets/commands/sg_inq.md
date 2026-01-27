# TLDR

**Query SCSI device** information

```sudo sg_inq [/dev/sda]```

**Get device identification** (serial number, WWN)

```sudo sg_inq --id [/dev/sda]```

**Display VPD page** by page number

```sudo sg_inq --vpd --page=[0x83] [/dev/sda]```

**Output response in hexadecimal**

```sudo sg_inq --hex [/dev/sda]```

**Decode version descriptors**

```sudo sg_inq --descriptors [/dev/sda]```

**Query ATA device** directly

```sudo sg_inq --ata [/dev/sda]```

**Output in JSON format**

```sudo sg_inq --json [/dev/sda]```

**Decode INQUIRY data from file**

```sg_inq --inhex=[path/to/file.hex]```

# SYNOPSIS

**sg_inq** [_options_] _DEVICE_

**sg_inq** **--inhex=**_FN_ [_options_]

# PARAMETERS

**-a**, **--ata**
> Treat device as ATA/ATAPI and use ATA IDENTIFY command instead of SCSI INQUIRY.

**-B**, **--block=**_0|1_
> Control blocking mode when opening device. 0 for non-blocking, 1 for blocking.

**-c**, **--cmddt**
> Set Command Support Data bit for opcode queries. Obsolete in SPC-2.

**-d**, **--descriptors**
> Decode version descriptors from the INQUIRY response.

**-e**, **--vpd**
> Enable Vital Product Data bit to fetch VPD pages.

**-f**, **--force**
> Skip sanity checks before accessing VPD pages.

**-H**, **--hex**
> Output response in hexadecimal format.

**-i**, **--id**
> Decode device identification VPD page (0x83).

**-I**, **--inhex=**_FN_
> Decode INQUIRY response from file instead of querying device.

**-j**, **--json**[=_JO_]
> Output in JSON format.

**-l**, **--len=**_LEN_
> Set allocation length for response buffer.

**-o**, **--only**
> Only output standard INQUIRY response, skip serial number VPD.

**-p**, **--page=**_PG_
> Specify VPD page number or abbreviation to fetch.

**-q**, **--quiet**
> Suppress decoding output and errors.

**-r**, **--raw**
> Output response in binary format.

**-s**, **--vendor**
> Display vendor-specific fields as ASCII.

**-v**, **--verbose**
> Increase verbosity level.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**sg_inq** sends a SCSI INQUIRY command to a device and outputs the decoded response. All SCSI devices are required to respond to a standard INQUIRY command with at least 36 bytes containing vendor, product, and revision information.

The utility supports Vital Product Data (VPD) pages which provide additional information such as device serial number (page 0x80), device identification with WWN (page 0x83), and block device characteristics. The **--id** option specifically decodes the device identification page which is mandatory for SPC-3 compliant devices.

Beyond SCSI, sg_inq can query ATA/ATAPI devices using the **--ata** option and NVMe devices where it sends an Identify controller NVMe Admin command. This makes it useful for querying various storage device types on Linux systems.

# CAVEATS

Requires root privileges to access raw device nodes. On Linux 2.4 kernels, only SCSI generic devices (/dev/sg*) can be used. Linux 2.6+ supports block devices directly. VPD page information is no longer being added to this utility; use **sg_vpd** or **sdparm** for newer VPD pages.

# HISTORY

**sg_inq** is part of the **sg3_utils** package, a collection of utilities for SCSI devices on Linux. The sg3_utils project was created to provide user-space tools for interacting with SCSI devices through the Linux SCSI generic (sg) driver. The package has evolved to support ATA devices via SAT (SCSI/ATA Translation) and more recently NVMe devices.

# SEE ALSO

[sg_vpd](/man/sg_vpd)(8), [sdparm](/man/sdparm)(8), [lsscsi](/man/lsscsi)(1), [smartctl](/man/smartctl)(8), [hdparm](/man/hdparm)(8)
