# TLDR

**Fix** a given NTFS partition

```sudo ntfsfix [/dev/sdXN]```

# SYNOPSIS

**ntfsfix** [_options_] _device_

# PARAMETERS

**-b, --clear-bad-sectors**
> Clear the list of bad sectors

**-d, --clear-dirty**
> Clear the dirty flag on the volume

**-n, --no-action**
> Perform a dry run; don't actually write changes

# DESCRIPTION

**ntfsfix** fixes common NTFS problems that prevent the filesystem from being mounted. It resets the NTFS journal, clears the dirty flag, and repairs some structural issues without performing a full filesystem check.

This tool is useful when Windows was not shut down properly and the NTFS partition is marked as needing a check (dirty). It allows Linux to mount the partition in read-write mode without booting into Windows first.

For comprehensive NTFS repair, Windows' built-in **chkdsk** should be used, as ntfsfix only handles basic issues that prevent mounting.

# CAVEATS

**Not a full repair tool**; use Windows chkdsk for comprehensive repairs. The partition must be unmounted. Does not fix all NTFS corruption—serious issues still require Windows. Part of the ntfs-3g package.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(8), [mount](/man/mount)(8), [fsck](/man/fsck)(8)
