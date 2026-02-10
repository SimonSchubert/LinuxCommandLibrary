# TAGLINE

controls magnetic tape drive operations, commonly used with LTO and other SCSI

# TLDR

Check **status** of a tape drive

```mt -f [/dev/nst0] status```

**Rewind** tape to beginning

```mt -f [/dev/nst0] rewind```

**Forward space** a number of files

```mt -f [/dev/nst0] fsf [count]```

**Rewind and position** at beginning of specified file

```mt -f [/dev/nst0] asf [count]```

Position tape at **end of data**

```mt -f [/dev/nst0] eod```

**Rewind and eject** tape

```mt -f [/dev/nst0] eject```

Write **EOF mark** at current position

```mt -f [/dev/nst0] eof```

# SYNOPSIS

**mt** [**-f** _device_] _operation_ [_count_]

# PARAMETERS

**-f _device_, -t _device_**
> Specify tape device (e.g., /dev/nst0, /dev/st0)

**-h**
> List available commands

**-v, --version**
> Display version information

# OPERATIONS

**status**
> Print tape drive status and position

**rewind**
> Rewind tape to beginning

**fsf _count_**
> Forward space specified number of files

**bsf _count_**
> Backward space specified number of files

**fsr _count_**
> Forward space specified number of records

**bsr _count_**
> Backward space specified number of records

**asf _count_**
> Rewind and position at beginning of specified file

**eod, seod**
> Space to end of valid data

**weof _count_, eof**
> Write EOF (end-of-file) marks

**eject, offline, rewoffl**
> Rewind and unload/eject tape

**erase**
> Erase entire tape (long operation)

**retension**
> Rewind, wind to end, rewind again (conditions tape)

**seek _block_**
> Seek to specified block number (SCSI)

**tell**
> Print current block number (SCSI)

# DESCRIPTION

**mt** controls magnetic tape drive operations, commonly used with LTO (Linear Tape-Open) and other SCSI tape drives. It provides commands for positioning, rewinding, ejecting, and writing control marks on tape media.

The device is specified with -f option or via the TAPE environment variable. Use /dev/nstX for non-rewinding devices (preserves position after operations) or /dev/stX for auto-rewinding devices.

# CAVEATS

Tape operations can be slow, especially erase and retension. Using the wrong device (st vs nst) can cause unexpected tape rewinding. Some operations are SCSI-specific. Ensure correct device permissions for non-root access.

# HISTORY

**mt** (magnetic tape) has been a standard Unix utility since early Unix systems for controlling tape drives. The Linux version supports additional SCSI tape features beyond traditional operations.

# SEE ALSO

[tar](/man/tar)(1), [dd](/man/dd)(1), [st](/man/st)(4)
