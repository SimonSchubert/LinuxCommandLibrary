# TAGLINE

low-level data copying and conversion tool

# TLDR

Make a **bootable USB** from an ISO and show progress

```sudo dd if=[path/to/file.iso] of=[/dev/usb_drive] status=progress```

**Clone** a drive to another drive with 4 MiB block size

```sudo dd bs=4M conv=fsync if=[/dev/source_drive] of=[/dev/dest_drive]```

Generate a file with **random bytes**

```dd bs=100 count=1 if=/dev/urandom of=[path/to/random_file]```

**Benchmark** disk write performance

```dd bs=1M count=1024 if=/dev/zero of=[path/to/file_1GB]```

Create a **system backup** to an IMG file

```sudo dd if=[/dev/drive_device] of=[path/to/file.img] status=progress```

# SYNOPSIS

**dd** [_if=file_] [_of=file_] [_bs=bytes_] [_count=n_] [_conv=opts_] [_status=level_]

# DESCRIPTION

**dd** converts and copies files at the block level, making it useful for low-level disk operations that bypass filesystem structures. It reads from standard input and writes to standard output by default, but is typically used with if= and of= parameters to specify input and output files or devices.

The tool operates in fixed block sizes (set with bs=), reading and writing data in chunks for efficiency. This block-oriented approach makes dd suitable for creating exact disk images, cloning entire drives, writing bootable USB drives from ISO files, and generating test files of specific sizes.

Common use cases include forensic disk imaging, data backup and restoration, disk benchmarking, and creating files filled with zeros or random data. The status=progress option (added in GNU coreutils 8.24) provides real-time progress information, addressing a long-standing complaint about dd's silence during operation. However, dd provides no safety checks and will overwrite data without confirmation, making it critical to verify the of= parameter before execution.

# PARAMETERS

**if=FILE**
> Read from FILE instead of stdin

**of=FILE**
> Write to FILE instead of stdout

**bs=BYTES**
> Read and write up to BYTES bytes at a time

**ibs=BYTES**
> Read up to BYTES bytes at a time

**obs=BYTES**
> Write BYTES bytes at a time

**count=N**
> Copy only N input blocks

**skip=N**
> Skip N input blocks before copying

**seek=N**
> Skip N output blocks before writing

**conv=CONVS**
> Conversion options: fsync, notrunc, noerror, sync

**status=LEVEL**
> Output level: none, noxfer, progress

**iflag=FLAGS**
> Input flags: direct, dsync, fullblock, etc.

**oflag=FLAGS**
> Output flags: direct, dsync, sync, etc.

# CAVEATS

**Dangerous**: dd will overwrite data without warning. Double-check the **of=** parameter before executing. Using wrong device names can destroy data.

# HISTORY

Part of **GNU Coreutils**. The command name comes from IBM JCL (Job Control Language) where DD stands for "Data Definition". Available since early Unix.

# SEE ALSO

[cp](/man/cp)(1), [dcfldd](/man/dcfldd)(1), [pv](/man/pv)(1)
