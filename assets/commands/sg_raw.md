# TAGLINE

Send raw SCSI commands to devices

# TLDR

**Send SCSI command**

```sg_raw [/dev/sg0] [12 00 00 00 24 00]```

**Send with data in**

```sg_raw -r [36] [/dev/sg0] [12 00 00 00 24 00]```

**Send with data out**

```sg_raw -s [size] -i [file] [/dev/sg0] [command]```

**Verbose output**

```sg_raw -v [/dev/sg0] [command]```

**Show binary response**

```sg_raw -b [/dev/sg0] [command]```

# SYNOPSIS

**sg_raw** [_-r len_] [_-s len_] [_-i file_] [_options_] _device_ _cdb_

# PARAMETERS

**-r** _LEN_
> Read LEN bytes.

**-s** _LEN_
> Send LEN bytes.

**-i** _FILE_
> Input file.

**-o** _FILE_
> Output file.

**-v**
> Verbose.

**-b**
> Binary output.

**-t** _SEC_
> Timeout.

# DESCRIPTION

**sg_raw** sends arbitrary SCSI command descriptor blocks (CDBs) to a device and displays the response. It provides the lowest level of access to SCSI devices, allowing direct transmission of any command without interpretation or validation by the utility itself.

The tool supports all SCSI data transfer phases: commands that read data from the device (**-r**), commands that write data to the device (**-s** with **-i**), and commands with no data transfer. Response data can be displayed in hexadecimal, saved to a file, or output in binary format for further processing.

As part of the **sg3_utils** package, sg_raw is primarily used for device testing, debugging SCSI protocol issues, and sending vendor-specific commands that are not covered by the higher-level sg3_utils utilities.

# CAVEATS

Root required. Can damage devices. Know what you're doing.

# HISTORY

**sg_raw** is part of **sg3_utils**, a collection of utilities for SCSI devices on Linux.

# SEE ALSO

[sg_inq](/man/sg_inq)(1), [sginfo](/man/sginfo)(1), [lsscsi](/man/lsscsi)(1)
