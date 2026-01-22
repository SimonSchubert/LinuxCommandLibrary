# TLDR

**Read NTFS file**

```ntfs-read.py [/dev/sda1] [/path/to/file]```

**List directory**

```ntfs-read.py [/dev/sda1] -l [/path/to/dir]```

**Extract file**

```ntfs-read.py [/dev/sda1] [/path/to/file] -o [output]```

# SYNOPSIS

**ntfs-read.py** [_options_] _device_ _path_

# PARAMETERS

_DEVICE_
> NTFS partition.

_PATH_
> Path to read.

**-l**
> List directory.

**-o** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**ntfs-read.py** is an Impacket NTFS reader. Reads NTFS without mounting.

The tool provides raw access. Part of Impacket security toolkit.

ntfs-read.py reads NTFS directly.

# CAVEATS

Part of Impacket. Python script. Security research tool.

# HISTORY

ntfs-read.py is part of **Impacket**, providing NTFS access for security research.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(1), [impacket](/man/impacket)(1)

