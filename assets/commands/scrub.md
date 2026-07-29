# TAGLINE

Securely overwrite files, block devices, or free disk space

# TLDR

Securely **overwrite a file** using the default pattern

```scrub [path/to/file]```

Securely overwrite **multiple files**

```scrub [path/to/file1] [path/to/file2]```

Securely overwrite a **block device** or partition

```sudo scrub [/dev/sdX]```

Overwrite a file with a **single-pass random** pattern

```scrub -p random [path/to/file]```

Overwrite a file using the **DoD 5220.22-M** pattern

```scrub -p dod [path/to/file]```

Overwrite a file using the **Gutmann** pattern

```scrub -p gutmann [path/to/file]```

**Remove** a file after successfully overwriting it

```scrub -r [path/to/file]```

Securely overwrite **free space** under a directory

```scrub -X [path/to/directory]```

# SYNOPSIS

**scrub** [_OPTIONS_] _special-file_ ...

**scrub** [_OPTIONS_] _file_ ...

**scrub** **-X** [_OPTIONS_] _directory_

# PARAMETERS

**-v**, **--version**
> Print scrub version and exit

**-r**, **--remove**
> Remove the file after scrubbing

**-p**, **--pattern** _PATTERN_
> Select overwrite patterns (default **nnsa**). See patterns below

**-b**, **--blocksize** _size_
> I/O block size in bytes (**K**/**M**/**G** suffixes allowed). Default: 4M

**-f**, **--force**
> Scrub even if the target already has a scrub signature

**-S**, **--no-signature**
> Do not write a scrub signature after completion

**-X**, **--freespace**
> Fill _directory_ until the filesystem is full, then scrub those files

**-D**, **--dirent** _newname_
> After scrubbing, overwrite the directory entry name and rename to _newname_

**-s**, **--device-size** _size_
> Override detected device size in bytes (**K**/**M**/**G** allowed)

**-L**, **--no-link**
> If target is a symlink, do not scrub the link target (still remove if **-r**)

**-R**, **--no-hwrand**
> Do not use a hardware RNG even if available

**-t**, **--no-threads**
> Do not generate random data in parallel with I/O

**-n**, **--dry-run**
> Perform checks and reporting without writing to targets

**-h**, **--help**
> Print a summary of options

# DESCRIPTION

**scrub** iteratively writes patterns on files or disk devices to make data recovery more difficult. It operates in three modes:

1. **Block/character device** — the entire device is scrubbed (most effective).
2. **Regular file** — only the file data (and optionally its directory entry name) is overwritten; size is rounded up to the last filesystem block.
3. **Free space** (**-X**) — creates files under an existing directory until the filesystem is full, then scrubs those files.

Default pattern **nnsa** follows NNSA Policy Letter NAP-14.1-C (two random passes, then 0x00 with verify), which is reasonable for modern PRML/EPRML disks. Other standards include **dod**, **bsi**, **gutmann**, **schneier**, **usarmy**, single-pass **random**/**fillzero**/**fillff**, and **custom=**_string_.

# PATTERNS

**nnsa** — 4-pass NNSA: random(x2), 0x00, verify (default)

**dod** — 4-pass DoD 5220.22-M: random, 0x00, 0xff, verify

**bsi** — 9-pass German BSI method

**gutmann** — 35-pass Gutmann sequence

**schneier** — 7-pass Schneier: 0x00, 0xff, random(x5)

**pfitzner7** / **pfitzner33** — 7 or 33 random passes

**usarmy** — US Army AR380-19: 0x00, 0xff, random

**fillzero** / **fillff** / **random** / **random2** — short fixed or random passes

**old** / **fastold** — legacy multi-pass sequences

**custom=**_string_ — one pass with C-style escapes (\xnn, \nnn)

# CAVEATS

Scrubbing through a filesystem is limited by the OS and filesystem type. Journaled, log-structured, copy-on-write, versioned, and network filesystems may retain prior data elsewhere; prefer scrubbing the raw device when possible.

**scrub** cannot reach blocks remapped/spared by the disk controller. For ATA drives, firmware security erase via **hdparm** may be more thorough. Physical destruction remains the only strong guarantee against lab recovery.

Free-space scrubbing (**-X**) only helps for blocks the filesystem reassigns to new files. Always verify device size before scrubbing raw devices — wrong targets destroy data irreversibly.

# HISTORY

**scrub** originated at Lawrence Livermore National Laboratory (UCRL-CODE-2003-006) as a GPL disk/file overwrite utility implementing published media sanitization methods (NNSA, DoD, Gutmann, and others).

# INSTALL

```apt: sudo apt install scrub```

```dnf: sudo dnf install scrub```

```aur: yay -S scrub```

```zypper: sudo zypper install scrub```

```brew: brew install scrub```

```nix: nix profile install nixpkgs#scrub```

<!-- packages: 2026-07-29 -->

# SEE ALSO

[shred](/man/shred)(1), [wipe](/man/wipe)(1), [wipefs](/man/wipefs)(8), [hdparm](/man/hdparm)(8), [dd](/man/dd)(1)

# RESOURCES

```[Source code](https://github.com/chaos/scrub)```

```[Documentation](https://manned.org/scrub)```

<!-- verified: 2026-07-29 -->
