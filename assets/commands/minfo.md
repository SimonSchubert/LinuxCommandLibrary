# TLDR

**Show disk info**

```minfo [a:]```

**Show detailed info**

```minfo -v [a:]```

**Show specific drive**

```minfo [c:]```

# SYNOPSIS

**minfo** [_options_] _drive_

# PARAMETERS

_DRIVE_
> MS-DOS drive letter.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**minfo** displays MS-DOS filesystem information. It shows disk geometry and FAT details.

The tool is part of mtools. It reports boot sector and filesystem parameters.

minfo shows MS-DOS disk info.

# CAVEATS

Part of mtools. FAT filesystem only. Requires mtools configuration.

# HISTORY

minfo is part of **mtools**, providing MS-DOS disk information on Unix systems.

# SEE ALSO

[mdir](/man/mdir)(1), [mcopy](/man/mcopy)(1), [mformat](/man/mformat)(1)

