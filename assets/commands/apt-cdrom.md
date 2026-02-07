# TAGLINE

Add CD-ROM or DVD-ROM as an APT package source

# TLDR

**Add** CD-ROM to sources

```sudo apt-cdrom add```

Add without **mounting**

```sudo apt-cdrom add -m```

**Identify** CD-ROM contents

```sudo apt-cdrom ident```

Add with **specific mount point**

```sudo apt-cdrom add -d [/media/cdrom]```

# SYNOPSIS

**apt-cdrom** [_-d mount_] [_-m_] [_-r_] _command_

# DESCRIPTION

**apt-cdrom** adds CD-ROMs or DVD-ROMs to APT's list of available sources. It scans the disc, identifies packages, and adds appropriate entries to /etc/apt/sources.list.

This is useful for offline installations or when using distribution media without internet access.

# PARAMETERS

**add**
> Add disc to sources list

**ident**
> Report disc identity without adding

**-d** _path_
> CD-ROM mount point

**-m**, **--no-mount**
> Don't mount/unmount the disc

**-r**, **--rename**
> Prompt for disc label

**-f**, **--fast**
> Fast copy (assume disc structure)

**-a**, **--thorough**
> Thorough scan for packages

# CONFIGURATION

**/etc/apt/sources.list**
> File where CD-ROM entries are added as package sources.

**/etc/apt/apt.conf**
> APT configuration file where CD-ROM mount point and behavior options can be set.

# CAVEATS

CD-ROM sources are lower priority than network repositories. Physical media can degrade over time. Most modern installations use network sources instead.

# HISTORY

**apt-cdrom** was essential when Linux distributions were primarily distributed on physical media. It remains available but is rarely used since broadband internet became common.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [sources.list](/man/sources.list)(5)
