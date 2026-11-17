# TAGLINE

Check and repair an MS-DOS FAT filesystem

# TLDR

**Check** a filesystem and ask before each repair

```sudo fsck.fat [/dev/sdXY]```

Check and **change nothing**

```sudo fsck.fat -n [/dev/sdXY]```

**Repair** automatically, choosing the least destructive fix

```sudo fsck.fat -a [/dev/sdXY]```

Check, list **path names**, and write nothing

```sudo fsck.fat -nl [/dev/sdXY]```

Repair and **test** clusters for read errors

```sudo fsck.fat -at [/dev/sdXY]```

# SYNOPSIS

**fsck.fat** [_OPTIONS_] _DEVICE_

# PARAMETERS

**-a**
> Repair automatically, picking the least destructive change.

**-A**
> Toggle between the standard FAT variant and the legacy Atari variant.

**-b**
> Read-only check of the boot sector.

**-c** _PAGE_
> Code page for short names. The default is 850.

**-d** _PATH_
> Delete a file. Repeat the option to delete more than one.

**-f**
> Salvage unused cluster chains as files. Without this option, unused clusters are freed, except during **-a**.

**-F** _NUM_
> Which FAT table to use. 0 uses the first uncorrupted table. A non-zero value repairs a corrupt first cluster and copies that table to the others.

**-l**
> List path names as they are processed.

**-n**
> Check only. Do not write.

**-p**
> Same as **-a**.

**-r**
> Ask interactively. This is the default, kept so old scripts still work.

**-S**
> Treat 8.3 names that contain spaces as invalid.

**-t**
> Mark clusters that cannot be read as bad.

**-u** _PATH_
> Try to undelete a file from a contiguous run of free clusters that starts at its start cluster. Repeat the option for more than one file.

**-U**
> Treat lowercase volume and boot labels as invalid. By default lowercase labels are allowed.

**-v**
> Verbose.

**-V**
> Run an extra verification pass.

**--variant** _TYPE_
> **standard** (Microsoft) or **atari**.

**-w**
> Write each repair as soon as it is decided. By default changes stay in memory and are written after every check.

**-y**
> Same as **-a**.

**--help**
> Show help and exit.

# DESCRIPTION

**fsck.fat** verifies a FAT12, FAT16, or FAT32 filesystem and can repair it. It comes from dosfstools. The device should be unmounted.

Two on-disk variants exist: the standard Microsoft layout and a legacy Atari layout. **--variant** selects one. **-A** flips the choice the program would otherwise make.

Changes are held in memory and written once, after the checks finish, unless **-w** is set. A read-only run is **-n**.

Salvaged data is written into the filesystem root as files named **fsck0000.rec**, **fsck0001.rec**, and so on. Entirely empty directories are left in place.

The same program has also been installed under the names dosfsck, fsck.msdos, and fsck.vfat. Those names are not separate tools.

# EXIT STATUS

- **0** — no recoverable errors
- **1** — recoverable errors were found, or the checker hit an internal inconsistency
- **2** — usage error, or the filesystem was not accessed

# CAVEATS

Repair a mounted filesystem only when you mean to, and prefer **-n** first. Automatic repair (**-a**, **-p**, **-y**) can drop directory entries. Recovered chains become files such as **fsck0000.rec** in the root, not their original names.

# INSTALL

```apt: sudo apt install dosfstools```

```dnf: sudo dnf install dosfstools```

```pacman: sudo pacman -S dosfstools```

```apk: sudo apk add dosfstools```

```zypper: sudo zypper install dosfstools```

```brew: brew install dosfstools```

```nix: nix profile install nixpkgs#dosfstools```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[fatlabel](/man/fatlabel)(8), [mkfs.fat](/man/mkfs.fat)(8), [fsck](/man/fsck)(8), [fsck.exfat](/man/fsck.exfat)(8)

# RESOURCES

```[Source code](https://github.com/dosfstools/dosfstools)```

```[Documentation](https://github.com/dosfstools/dosfstools/blob/master/manpages/fsck.fat.8.in)```

<!-- verified: 2026-11-17 -->
