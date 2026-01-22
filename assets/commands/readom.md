# TLDR

**Create an ISO image** from a CD/DVD

```sudo readom dev=/dev/sr0 f=[output.iso]```

**Create an ISO with reduced retries** for faster processing

```sudo readom dev=/dev/sr0 f=[output.iso] retries=8```

**Read from a specific SCSI device**

```sudo readom dev=[1,0,0] f=[output.iso]```

**Display drive capabilities**

```sudo readom dev=/dev/sr0 -prcap```

# SYNOPSIS

**readom** **dev=**_device_ **f=**_file_ [_options_]

# PARAMETERS

**dev=**_device_
> Specify the optical drive device (e.g., /dev/sr0, /dev/cdrom, or SCSI address)

**f=**_file_
> Output filename for the ISO image

**retries=**_n_
> Number of retry attempts for unreadable sectors (default: 128)

**speed=**_n_
> Set read speed

**-prcap**
> Print drive capabilities

**-clone**
> Clone mode for creating exact copy including subchannel data

**-noerror**
> Continue reading despite errors

**-nocorr**
> Disable error correction (for damaged media recovery)

**-c2scan**
> Scan for C2 errors on audio CDs

# DESCRIPTION

**readom** (read optical media) creates ISO images from CDs, DVDs, and Blu-ray discs with built-in error checking and recovery capabilities. It is part of the cdrtools/cdrkit package and is preferred over **dd** for optical media because it understands disc structure and can handle read errors gracefully.

The tool performs sector-by-sector reading with error detection and can retry failed reads automatically. It reports read speed, capacity, and any errors encountered during the process.

For damaged or scratched discs, readom can attempt multiple retries per sector. However, for severely damaged media, specialized recovery tools like **ddrescue** may provide better results.

# CAVEATS

**Root privileges required**: Must run as root to access optical devices directly.

**Unmount before reading**: The disc must be unmounted before running readom. Check with **mount** and unmount with **umount /dev/sr0** if necessary.

High retry counts (default 128) can result in extremely long processing times for damaged discs. Reduce with **retries=8** or similar for faster operation with less recovery effort.

The output is a raw ISO image. Audio CDs require different tools (like **cdparanoia**) for proper extraction.

# SEE ALSO

[wodim](/man/wodim)(1), [cdrecord](/man/cdrecord)(1), [dd](/man/dd)(1), [ddrescue](/man/ddrescue)(1), [cdparanoia](/man/cdparanoia)(1)
