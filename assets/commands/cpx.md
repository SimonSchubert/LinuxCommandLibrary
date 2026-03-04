# TAGLINE

Modern fast file copy tool with progress bars

# TLDR

**Copy** a single file

```cpx [source.txt] [dest.txt]```

**Copy** a directory recursively

```cpx -r [source_dir/] [dest_dir/]```

**Copy** with exclusion patterns

```cpx -r -e "node_modules" -e ".git" [project/] [/backup/]```

**Resume** an interrupted transfer

```cpx -r --resume [large_dataset/] [/backup/]```

**Preserve** all file attributes

```cpx -r -p=all [photos/] [/backup/photos/]```

**Parallel** copy with 8 threads

```cpx -r -j 8 [source/] [dest/]```

# SYNOPSIS

**cpx** [_OPTIONS_] _SOURCE_... _DESTINATION_

# PARAMETERS

**-r**, **--recursive**
> Copy directories recursively.

**-j** _N_
> Number of parallel operations (default: 4).

**--resume**
> Resume interrupted transfers with checksum verification.

**-f**, **--force**
> Remove and retry if destination is unavailable.

**-i**, **--interactive**
> Prompt before overwriting.

**-t**, **--target-directory** _DIR_
> Copy all sources into the specified directory.

**-e**, **--exclude** _PATTERN_
> Exclude matching files (glob patterns, comma-separated).

**-s**, **--symbolic-link** [_MODE_]
> Create symlinks instead of copying (auto/absolute/relative).

**-l**, **--link**
> Create hard links instead of copying.

**-P**, **--no-dereference**
> Never follow source symlinks.

**-L**, **--dereference**
> Always follow source symlinks.

**-p**, **--preserve** [_ATTRS_]
> Preserve attributes (default/all/mode/timestamps/ownership/links/xattr).

**-b**, **--backup** [_MODE_]
> Backup existing files (none/simple/numbered/existing).

**--reflink** [_WHEN_]
> Copy-on-write if supported (auto/always/never).

**--parents**
> Preserve full source path structure.

**--no-config**
> Ignore all config files.

# DESCRIPTION

**cpx** is a modern replacement for the traditional **cp** command, built in Rust for performance and safety. It provides parallel file copying (up to 5x faster than standard cp in benchmarks), visual progress bars, the ability to resume interrupted transfers with checksum verification, graceful Ctrl+C handling with resume hints, and gitignore-style exclude patterns.

# CONFIGURATION

Configuration supported at three levels (in priority order): **./cpxconfig.toml** (project-level), **~/.config/cpx/cpxconfig.toml** (user-level), **/etc/cpx/cpxconfig.toml** (system-level). Manage with **cpx config init**, **cpx config show**, and **cpx config path**.

# CAVEATS

Currently only fully supports Linux (kernel 4.5+ recommended). macOS and Windows support is planned but not yet available. The **--resume** feature relies on checksums, which adds overhead for small files. Not a drop-in alias for **cp** in all edge cases.

# HISTORY

**cpx** was created by **Bhuminjay Soni** and publicly introduced around **January 2026**. Written in Rust under the MIT license. The latest version is v0.1.4 (February 2026). Available via Cargo, AUR (as cpx-copy), Nix, and pre-built binaries.

# SEE ALSO

[cp](/man/cp)(1), [rsync](/man/rsync)(1), [mv](/man/mv)(1), [pv](/man/pv)(1)
