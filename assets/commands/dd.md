# TAGLINE

Convert and copy files at the block level

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

**Restore** from an IMG backup

```sudo dd if=[path/to/file.img] of=[/dev/drive_device] status=progress```

**Skip** bytes at the start of input (e.g., skip first 512 bytes)

```dd if=[input_file] of=[output_file] bs=512 skip=1```

# SYNOPSIS

**dd** [_OPERAND_]...

# DESCRIPTION

**dd** converts and copies files at the block level, making it useful for low-level disk operations that bypass filesystem structures. It reads from standard input and writes to standard output by default, but is typically used with if= and of= operands to specify input and output files or devices.

The tool operates in fixed block sizes (set with bs=), reading and writing data in chunks for efficiency. This block-oriented approach makes dd suitable for creating exact disk images, cloning entire drives, writing bootable USB drives from ISO files, and generating test files of specific sizes.

Common use cases include forensic disk imaging, data backup and restoration, disk benchmarking, and creating files filled with zeros or random data. The status=progress option (added in GNU coreutils 8.24) provides real-time progress information. Sending a USR1 signal (or INFO signal on BSD) to a running dd process causes it to print I/O statistics to stderr.

# PARAMETERS

**if=**_FILE_
> Read from FILE instead of stdin.

**of=**_FILE_
> Write to FILE instead of stdout.

**bs=**_BYTES_
> Read and write up to BYTES bytes at a time (default: 512). Overrides ibs and obs.

**ibs=**_BYTES_
> Read up to BYTES bytes at a time (default: 512).

**obs=**_BYTES_
> Write BYTES bytes at a time (default: 512).

**count=**_N_
> Copy only N input blocks.

**skip=**_N_
> Skip N ibs-sized blocks at start of input.

**seek=**_N_
> Skip N obs-sized blocks at start of output.

**conv=**_CONVS_
> Comma-separated conversion options: ascii, ebcdic, ibm, block, unblock, lcase, ucase, sparse, swab, sync, excl, nocreat, notrunc, noerror, fdatasync, fsync.

**status=**_LEVEL_
> Output level: none (suppress everything except errors), noxfer (suppress transfer statistics), progress (show periodic transfer statistics).

**iflag=**_FLAGS_
> Comma-separated input flags: append, direct, directory, dsync, sync, fullblock, nonblock, noatime, nocache, noctty, nofollow, count_bytes, skip_bytes.

**oflag=**_FLAGS_
> Comma-separated output flags: append, direct, directory, dsync, sync, nonblock, noatime, nocache, noctty, nofollow, seek_bytes.

# CAVEATS

**Dangerous**: dd will overwrite data without warning. Double-check the **of=** operand before executing. Using wrong device names can destroy entire disks. BYTES may be followed by multiplicative suffixes: c=1, w=2, b=512, kB=1000, K=1024, MB=1000000, M=1048576, and so on for G, T, P, E, Z, Y.

# HISTORY

Part of **GNU Coreutils**. The command name comes from IBM JCL (Job Control Language) where DD stands for "Data Definition". Available since Version 5 AT&T Unix (1974).

# SEE ALSO

[cp](/man/cp)(1), [dcfldd](/man/dcfldd)(1), [pv](/man/pv)(1)
