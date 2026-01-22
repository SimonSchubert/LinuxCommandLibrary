# TLDR

**List directory contents**

```ntfsls [/dev/sda1]```

**List specific directory**

```ntfsls [/dev/sda1] -p [/Users]```

**Show all files including hidden**

```ntfsls -a [/dev/sda1]```

**Long listing format**

```ntfsls -l [/dev/sda1]```

# SYNOPSIS

**ntfsls** [_options_] _device_ [_path_]

# PARAMETERS

_DEVICE_
> NTFS partition device.

**-p** _PATH_
> Directory path to list.

**-a**, **--all**
> Show hidden files.

**-l**, **--long**
> Long listing format.

**-F**, **--classify**
> Append file type indicator.

**--help**
> Display help information.

# DESCRIPTION

**ntfsls** lists files on NTFS partitions. Works without mounting.

The tool provides directory listings directly. Similar to ls command.

ntfsls lists NTFS contents.

# CAVEATS

Part of ntfs-3g. Read-only operation. Device must be NTFS formatted.

# HISTORY

ntfsls was created as part of **ntfs-3g** tools for NTFS filesystem inspection.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(1), [ls](/man/ls)(1), [ntfscat](/man/ntfscat)(1)

