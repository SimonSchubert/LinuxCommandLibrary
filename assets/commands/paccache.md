# TAGLINE

cache cleaning utility for pacman, the Arch Linux package manager

# TLDR

Remove all but the **3 most recent** package versions from the pacman cache

```paccache -r```

Set the **number of package versions** to keep

```paccache -rk [num_versions]```

Perform a **dry-run** and show candidate packages for deletion

```paccache -d```

**Move** candidate packages to a directory instead of deleting

```paccache -m [path/to/directory]```

# SYNOPSIS

**paccache** [_options_] [_targets_...]

# PARAMETERS

**-r**, **--remove**
> Remove candidate packages from the cache

**-d**, **--dryrun**
> Perform a dry run, only listing candidates

**-k**, **--keep** _num_
> Keep _num_ versions of each package (default: 3)

**-m**, **--move** _dir_
> Move candidates to _dir_ instead of removing

**-u**, **--uninstalled**
> Target uninstalled packages only

**-c**, **--cachedir** _dir_
> Specify alternate cache directory

**-a**, **--arch** _arch_
> Filter packages by architecture

**-v**, **--verbose**
> Show removed or moved packages

**-q**, **--quiet**
> Minimize output

**-z**, **--null**
> Use null delimiters for output

**-h**, **--help**
> Display help message

# DESCRIPTION

**paccache** is a cache cleaning utility for pacman, the Arch Linux package manager. It removes old package versions from the pacman cache directory (/var/cache/pacman/pkg/) while preserving recent versions for potential rollbacks.

By default, it keeps the 3 most recent versions of each package. This helps reclaim disk space while maintaining the ability to downgrade packages if needed. The tool can target all cached packages or only those no longer installed on the system.

# CAVEATS

Requires appropriate permissions to modify the pacman cache (typically root). After aggressive cleaning, downgrading packages may require re-downloading older versions. Consider keeping at least 1-2 versions for critical packages.

# HISTORY

Part of **pacman-contrib**, a collection of scripts for pacman previously included in the main pacman package. Split into a separate package to keep the core pacman lean. Essential for Arch Linux system maintenance where the cache can grow substantially over time.

# SEE ALSO

[pacman](/man/pacman)(8), [pactree](/man/pactree)(8), [pacdiff](/man/pacdiff)(8)
