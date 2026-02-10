# TAGLINE

copies files to/from MS-DOS filesystems

# TLDR

**Copy file to MS-DOS disk**

```mcopy [file.txt] [a:]```

**Copy from MS-DOS disk**

```mcopy [a:file.txt] [.]```

**Copy multiple files**

```mcopy [*.txt] [a:]```

**Preserve modification time**

```mcopy -m [file] [a:]```

**Overwrite without prompt**

```mcopy -o [file] [a:]```

**Copy recursively**

```mcopy -s [dir/] [a:]```

# SYNOPSIS

**mcopy** [_options_] _source_ _target_

# PARAMETERS

_SOURCE_
> Source file or directory.

_TARGET_
> Target location.

**-m**
> Preserve modification time.

**-o**
> Overwrite without asking.

**-s**
> Recursive copy.

**-n**
> No confirmation.

**--help**
> Display help information.

# DESCRIPTION

**mcopy** copies files to/from MS-DOS filesystems. It's part of the mtools package.

The tool accesses FAT filesystems without mounting. Useful for floppy disks and USB drives.

# CAVEATS

Part of mtools. Requires mtools config. FAT filesystem only.

# HISTORY

mcopy is part of **mtools**, a collection of utilities for accessing MS-DOS disks from Unix.

# SEE ALSO

[mdir](/man/mdir)(1), [mdel](/man/mdel)(1), [mformat](/man/mformat)(1)

