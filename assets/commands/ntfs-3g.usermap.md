# TAGLINE

build an NTFS user mapping file between Windows and Linux accounts

# TLDR

**Map the users of the Windows system on a partition** (unmounted, as root)

```sudo ntfs-3g.usermap [/dev/sda1]```

**Include another NTFS partition shared by the same Windows system**

```sudo ntfs-3g.usermap [/dev/sda1] [/dev/sdb1]```

**Install the generated file on the NTFS volume** (after mounting it)

```sudo mkdir -p [/mnt/windows]/.NTFS-3G && sudo mv UserMapping [/mnt/windows]/.NTFS-3G/```

# SYNOPSIS

**ntfs-3g.usermap** _windows-system-device_ [_other-ntfs-device_ ...]

# PARAMETERS

_windows-system-device_
> Device holding the Windows system whose users should be mapped to the current Linux system.

_other-ntfs-device_
> Additional NTFS devices containing files that both Windows and Linux will access.

# DESCRIPTION

**ntfs-3g.usermap** creates the file that maps Windows accounts (SIDs) to Linux users and groups, so that file ownership and permissions are translated correctly when ntfs-3g mounts the volume with permissions enabled.

It scans existing files created on Windows, picks significant ones, and asks interactively which Linux user or group should own each. The answer can be a numeric or symbolic uid/gid, or empty to skip that owner (another file by the same Windows owner may be offered later). Standard Windows accounts such as Administrator or All Users are mapped implicitly.

When there are no more files to ask about, it writes the result to **UserMapping** in the current directory. That file must be placed in the hidden **.NTFS-3G** directory at the root of every NTFS volume to be shared, and the volume remounted for it to take effect.

The tool has no options. Running it without arguments prints a usage summary. Exit status is 0 on success and 1 on error.

# CAVEATS

Must be run as root, and the listed devices must **not** be mounted. Never map a Windows user to Linux root. The mapping file is only read at mount time.

# HISTORY

Written by Jean-Pierre André as a companion to **ntfs-3g.secaudit**. In current ntfs-3g releases it is shipped in ntfsprogs as **ntfsusermap**; some distributions still provide the old **ntfs-3g.usermap** name.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(8), [ntfs-3g.secaudit](/man/ntfs-3g.secaudit)(8)

# RESOURCES

```[Source code](https://github.com/tuxera/ntfs-3g)```

```[Documentation](https://github.com/tuxera/ntfs-3g/wiki)```

<!-- verified: 2026-11-07 -->
