# TAGLINE

copy files between the host and a Multipass instance

# TLDR

Copy a **host file** into an instance home directory

```multipass transfer [local.txt] [instance]:```

Copy a file **from** an instance to the current directory

```multipass transfer [instance]:[remote.txt] .```

Copy a **directory tree**

```multipass transfer -r [path/to/dir] [instance]:[remote/dir]```

Create **missing parent** directories on the destination

```multipass transfer -p [local.txt] [instance]:[new/path/file.txt]```

Read **stdin** into a remote file (source `-`)

```cat [data.bin] | multipass transfer - [instance]:[data.bin]```

Write a remote file to **stdout** (destination `-`)

```multipass transfer [instance]:[log.txt] -```

# SYNOPSIS

**multipass** **transfer** [_-r_] [_-p_] _source_ [_source_...] _destination_

# PARAMETERS

**-r**, **--recursive**
> Copy directories recursively. Symbolic links are not followed.

**-p**, **--parents**
> Create missing parent directories on the destination.

**-v**, **--verbose**
> Increase logging (repeatable, up to `-vvvv`).

_source_
> One or more paths. Prefix with **name:** for a path inside the instance. **`-`** means host stdin.

_destination_
> Prefix with **name:** for an instance path. **`.`** is the instance home when the path is empty after the colon. **`-`** means host stdout.

# DESCRIPTION

**multipass transfer** copies files between the host and a Multipass VM without a **mount**. Instance-relative paths start in the default user's home. Several sources may be given; the last argument is the destination.

Use this when you need a one-off copy. For a live shared folder, **multipass mount** is the better tool.

This is a **multipass** subcommand, not a separate binary.

# CAVEATS

The instance must exist and be running. Recursive mode does not follow symlinks. If the remote parent path is missing, the transfer fails unless **-p** is set. Standard input/output mode is for a single stream, not a directory.

# HISTORY

Part of Canonical **Multipass**, the desktop Ubuntu VM manager.

# INSTALL

```aur: yay -S multipass```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[multipass](/man/multipass)(1), [scp](/man/scp)(1), [rsync](/man/rsync)(1)

# RESOURCES

```[Documentation](https://canonical.com/multipass/docs/latest/reference/command-line-interface/transfer/)```

```[Homepage](https://canonical.com/multipass)```

```[Source code](https://github.com/canonical/multipass)```

<!-- verified: 2026-08-26 -->
