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

**sg_raw** sends raw SCSI commands. It provides low-level access.

Direct CDB transmission. Command descriptor blocks.

Read and write data. Transfer phases.

Device testing. Debugging SCSI.

Part of sg3_utils. Linux SCSI tools.

# CAVEATS

Root required. Can damage devices. Know what you're doing.

# HISTORY

**sg_raw** is part of **sg3_utils**, a collection of utilities for SCSI devices on Linux.

# SEE ALSO

[sg_inq](/man/sg_inq)(1), [sginfo](/man/sginfo)(1), [lsscsi](/man/lsscsi)(1)
