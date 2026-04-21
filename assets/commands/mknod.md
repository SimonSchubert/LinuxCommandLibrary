# TAGLINE

creates block devices, character devices, or FIFOs as special files

# TLDR

Create a **block device** special file

```sudo mknod [path/to/device_file] b [major_device_number] [minor_device_number]```

Create a **character device** special file

```sudo mknod [path/to/device_file] c [major_device_number] [minor_device_number]```

Create a **FIFO** (named pipe)

```sudo mknod [path/to/device_file] p```

Create a device file with **specific permissions**

```sudo mknod -m [0660] [path/to/device_file] c [major] [minor]```

Create a device file with **default SELinux context**

```sudo mknod -Z [path/to/device_file] c [major] [minor]```

# SYNOPSIS

**mknod** [_OPTION_]... _NAME_ _TYPE_ [_MAJOR_ _MINOR_]

# PARAMETERS

**-m**, **--mode**=_MODE_
> Set file permission bits to MODE (symbolic or numeric), not the default a=rw minus umask.

**-Z**
> Set the SELinux security context to the default type.

**--context**[=_CTX_]
> Like -Z, or if CTX is specified set the SELinux or SMACK security context to CTX.

**--help**
> Display help and exit.

**--version**
> Output version information and exit.

**b**
> Create a block (buffered) special file; MAJOR and MINOR are required.

**c**, **u**
> Create a character (unbuffered) special file; MAJOR and MINOR are required.

**p**
> Create a FIFO (named pipe); MAJOR and MINOR must be omitted.

# DESCRIPTION

**mknod** creates block devices, character devices, or FIFOs (named pipes) as special files. Device files provide an interface between user programs and device drivers in the kernel.

Block devices transfer data in fixed-size blocks and support buffering (e.g., hard drives). Character devices transfer data character by character without buffering (e.g., terminals, serial ports). FIFOs enable inter-process communication through a named file.

Major and minor numbers identify the device driver and specific device instance. These numbers can be specified in decimal, octal (prefix 0), or hexadecimal (prefix 0x).

# CAVEATS

Modern Linux systems use udev and devtmpfs for dynamic device node creation, making manual mknod usage rare. Creating device nodes requires root privileges. Incorrect major/minor numbers can cause system instability. The /dev directory is typically mounted as devtmpfs and managed automatically.

# HISTORY

**mknod** is a standard Unix command dating back to early Unix systems. It is part of **GNU coreutils** on Linux. The command provides direct access to the mknod(2) system call for creating special files.

# SEE ALSO

[mkfifo](/man/mkfifo)(1), [stat](/man/stat)(2), [mknod](/man/mknod)(2)
