# TAGLINE

Read data from CD/DVD optical discs

# TLDR

**Read** a CD and copy it to an ISO file

```readcd dev=/dev/sr0 f=[path/to/file.iso]```

**List** available SCSI/optical devices

```readcd -scanbus```

**Read** a specific range of sectors

```readcd dev=/dev/sr0 sectors=[0]-[10000] f=[out.bin]```

**Read** at a reduced speed to improve reliability

```readcd dev=/dev/sr0 speed=[4] f=[file.iso]```

**Make a full clone** including sub-channel data and TOC

```readcd dev=/dev/sr0 -clone f=[disc.img]```

# SYNOPSIS

**readcd** [_options_] dev=_device_ f=_file_

# PARAMETERS

**dev=**_device_
> CD/DVD/BluRay device to read from (e.g. /dev/sr0 or SCSI notation like 1,0,0).

**f=**_file_
> Output file for read operations (input file when writing). Use '-' for stdout/stdin.

**sectors=**_range_
> Range of sectors to read, e.g. 150-10000 (the end sector is excluded).

**speed=**_n_
> Read speed as a multiple of single speed (150 KB/s for CD). Lower speeds can improve readability.

**retries=**_n_
> Number of high-level retries for unreadable sectors. Defaults to 128.

**-clone**
> Read the whole disc including all sub-channel data and the full table of contents (saved with a .toc file).

**-fulltoc**
> Retrieve and print the full table of contents in hex.

**-c2scan**
> Scan the disc for C2 (uncorrectable) errors.

**-w**
> Switch to write mode (DVD-RAM only).

**-scanbus**
> List all available SCSI devices.

**-v**
> Increase verbosity, reporting read progress.

# DESCRIPTION

**readcd** reads Compact Disc, DVD, and BluRay media data, typically to create ISO images or raw dumps of physical discs. It can also write data back, but only to DVD-RAM media (with **-w**).

The tool accesses the raw disc data and supports retries, sector ranges, and full cloning (sub-channel data plus TOC), making it suitable for creating exact copies of media.

# CAVEATS

Requires read access to the optical drive device. Some copy-protected discs may not read correctly.

# HISTORY

Part of **cdrtools** (or cdrkit on some distributions), providing CD/DVD burning and reading utilities.

# SEE ALSO

[cdrecord](/man/cdrecord)(1), [dd](/man/dd)(1), [wodim](/man/wodim)(1)
