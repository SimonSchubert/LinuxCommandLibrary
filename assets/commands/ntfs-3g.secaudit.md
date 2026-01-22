# TLDR

**Audit NTFS security**

```ntfs-3g.secaudit [/dev/sda1]```

**Audit specific file**

```ntfs-3g.secaudit [/dev/sda1] [/path/to/file]```

**Show verbose output**

```ntfs-3g.secaudit -v [/dev/sda1]```

# SYNOPSIS

**ntfs-3g.secaudit** [_options_] _device_ [_path_]

# PARAMETERS

_DEVICE_
> NTFS partition.

_PATH_
> Optional path to audit.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**ntfs-3g.secaudit** audits NTFS security descriptors. Checks permissions and ACLs.

The tool inspects security settings. Part of ntfs-3g utilities.

ntfs-3g.secaudit checks NTFS security.

# CAVEATS

Part of ntfs-3g. Requires device access. Security analysis tool.

# HISTORY

ntfs-3g.secaudit provides **security audit** functionality for NTFS filesystems.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(1), [ntfs-3g.usermap](/man/ntfs-3g.usermap)(1)

