# TAGLINE

cache cleaning utility for pacman, the Arch Linux package manager

# TLDR

**Remove all but the 3 most recent package versions from the cache**

```sudo paccache -r```

**Set the number of package versions to keep**

```sudo paccache -rk [num_versions]```

**Perform a dry run and show candidate packages for deletion**

```paccache -d```

**Remove all cached versions of uninstalled packages**

```sudo paccache -ruk0```

**Move candidate packages to a directory instead of deleting**

```sudo paccache -m [path/to/directory]```

**Dry run with verbose output**

```paccache -dv```

**Keep packages** used within the last 30 days, even beyond the keep count

```sudo paccache -r --min-atime "[30 days ago]"```

**Clean a specific** cache directory

```sudo paccache -r -c [path/to/cache]```

# SYNOPSIS

**paccache** _operation_ [_options_] [_targets_...]

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
> Scan _dir_ for packages. Can be used more than once. Defaults to the value from pacman.conf.

**-a**, **--arch** _arch_
> Scan for _arch_ only (default: all architectures)

**-v**, **--verbose**
> Increase verbosity. Can be specified up to 3 times.

**-q**, **--quiet**
> Minimize output

**-f**, **--force**
> Apply force to mv and rm operations.

**-i** _pkgs_, **--ignore** _pkgs_
> Specify packages to ignore, comma-separated. Use "-" to read from stdin.

**--nocolor**
> Remove color from the output.

**--min-atime** _time_, **--min-mtime** _time_
> Keep packages with an atime/mtime not older than _time_, even if exceeding **--keep**. Accepts date strings such as "30 days ago".

**-z**, **--null**
> Use null delimiters for candidate names (only with -v and -vv).

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**paccache** is a cache cleaning utility for pacman, the Arch Linux package manager. It removes old package versions from the pacman cache directory (/var/cache/pacman/pkg/) while preserving recent versions for potential rollbacks.

By default, it keeps the 3 most recent versions of each package. This helps reclaim disk space while maintaining the ability to downgrade packages if needed. The tool can target all cached packages or only those no longer installed on the system. One of the operations **-d**, **-m** or **-r** is required. pacman-contrib also ships a **paccache.timer** systemd unit for periodic cleaning.

# CAVEATS

Requires appropriate permissions to modify the pacman cache (typically root). After aggressive cleaning, downgrading packages may require re-downloading older versions. Consider keeping at least 1-2 versions for critical packages.

# HISTORY

Part of **pacman-contrib**, a collection of scripts for pacman previously included in the main pacman package. Split into a separate package to keep the core pacman lean. Essential for Arch Linux system maintenance where the cache can grow substantially over time.

# SEE ALSO

[pacman](/man/pacman)(8), [pactree](/man/pactree)(8), [pacdiff](/man/pacdiff)(8)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/pacman/pacman-contrib)```

```[Documentation](https://man.archlinux.org/man/paccache.8.en)```

<!-- verified: 2026-11-09 -->
