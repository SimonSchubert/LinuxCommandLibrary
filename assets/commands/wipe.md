# TAGLINE

Secure file deletion with overwrite patterns

# TLDR

**Securely wipe a file**

```wipe [file]```

**Wipe a file with force** (no confirmation)

```wipe -f [file]```

**Recursively wipe a directory**

```wipe -r [directory]```

**Quick wipe** (4 passes instead of 34)

```wipe -q [file]```

**Quick wipe with custom passes**

```wipe -Q [8] [file]```

**Wipe without removing the file**

```wipe -k [file]```

**Verbose output**

```wipe -v [file]```

# SYNOPSIS

**wipe** [_-rcfsvq_] [_-Q passes_] [_-a_] [_file ..._]

# PARAMETERS

**-f**
> Force; disable confirmation prompts

**-r**
> Recursively wipe directories and contents

**-c**
> Request confirmation for each file (default for regular files)

**-s**
> Silent mode; suppress most output

**-v**
> Verbose mode; show progress

**-q**
> Quick wipe; use 4 passes instead of 34

**-Q** _passes_
> Quick wipe with specified number of passes

**-a**
> Wipe files but abort on errors

**-k**
> Keep files after wiping (don't delete)

# DESCRIPTION

**wipe** securely deletes files by overwriting their contents with special patterns to prevent data recovery. By default, it performs 34 write passes including 8 random patterns, based on research by Peter Gutmann on secure data erasure.

The command overwrites the file, renames it multiple times, truncates it, and finally unlinks it. This multi-step process defeats various data recovery techniques used on magnetic storage.

For faster operation, use **-q** for 4 passes or **-Q** to specify a custom number between 4 and 34.

# CAVEATS

Secure wiping is ineffective on SSDs due to wear-leveling and write amplification; SSDs should use ATA Secure Erase or encryption instead. Journaling file systems (ext3, ext4, XFS) may retain data in journals. RAID systems and copy-on-write file systems (ZFS, Btrfs) may preserve old data in redundant locations.

# HISTORY

wipe implements the Gutmann method for secure deletion, based on Peter Gutmann's **1996** paper on secure data removal from magnetic media. The tool provides a more thorough alternative to **shred** from GNU coreutils.

# SEE ALSO

[shred](/man/shred)(1), [srm](/man/srm)(1), [rm](/man/rm)(1), [dd](/man/dd)(1)
