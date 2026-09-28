# TAGLINE

read-only NTFS explorer that parses a volume or disk image directly

# TLDR

**Open an NTFS partition** in an interactive read-only shell

```sudo impacket-ntfs-read [/dev/sdb1]```

**Browse a raw disk image** of an NTFS volume

```impacket-ntfs-read [path/to/volume.img]```

**Extract a single file** without entering the shell

```sudo impacket-ntfs-read [/dev/sdb1] -extract '[\windows\system32\config\SAM]'```

**Enable debug output** with timestamps

```impacket-ntfs-read [/dev/sdb1] -debug -ts```

# SYNOPSIS

**impacket-ntfs-read** [_-h_] [_-extract_ _pathname_] [_-debug_] [_-ts_] _volume_

# PARAMETERS

_volume_
> NTFS volume to open, e.g. a block device like /dev/sdb1, a raw image file, or \\\\.\\C: on Windows

**-extract** _pathname_
> Extract the given NTFS path (backslash-separated) to the current directory and exit

**-debug**
> Turn debug output on

**-ts**
> Add a timestamp to every logging output

**-h**
> Show help and exit

# SHELL COMMANDS

**ls**
> List files in the current directory

**cd** _path_
> Change the current directory on the volume

**pwd**
> Show the current directory on the volume

**cat** _file_
> Print the contents of a file

**hexdump** _file_
> Hexdump the contents of a file

**get** _file_
> Copy a file from the volume to the local directory

**lcd** _path_
> Change the local directory

**!** _command_
> Run a local shell command

**exit**
> Leave the shell

# DESCRIPTION

**impacket-ntfs-read** (upstream name **ntfs-read.py**) is a small NTFS explorer from the Impacket suite. It opens an NTFS volume or image and parses the MFT and file records itself instead of relying on the operating system's filesystem driver, then offers a mini shell to browse and extract files.

Because it reads the raw structures, it can copy files that Windows keeps locked while running, such as registry hives (SAM, SYSTEM, SECURITY) or NTDS.dit, when run against the live volume with administrator rights. It is also handy for inspecting disk images forensically without mounting them.

# CAVEATS

The tool is strictly read-only and works on local volumes or images only; it has no network or SMB support. Reading a block device on Linux requires root. Paths use backslashes. Compressed and encrypted (EFS) files may not be extracted correctly.

# HISTORY

Part of **Impacket**, originally developed by Alberto Solino at Core Security, later maintained by SecureAuth and now by Fortra. The script is installed as **impacket-ntfs-read** on Kali and Debian-based packages.

# INSTALL

```pacman: sudo pacman -S impacket```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ntfs-read.py](/man/ntfs-read.py)(1), [impacket-secretsdump](/man/impacket-secretsdump)(1), [ntfsls](/man/ntfsls)(8), [ntfscat](/man/ntfscat)(8), [ntfs-3g](/man/ntfs-3g)(8)

# RESOURCES

```[Source code](https://github.com/fortra/impacket)```

<!-- verified: 2026-09-29 -->
