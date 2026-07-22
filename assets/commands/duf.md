# TAGLINE

modern disk usage and free space utility

# TLDR

**Show disk usage** for all mounted filesystems

```duf```

**Show only local filesystems**

```duf --only local```

**Show specific mount points**

```duf [/] [/home]```

**Show all filesystems** including special

```duf --all```

**Hide specific filesystem types**

```duf --hide-fs tmpfs,devtmpfs```

**Output as JSON**

```duf --json```

**Sort by usage percentage**

```duf --sort usage```

**Show inodes** instead of disk space

```duf --inodes```

**Choose which columns** to display

```duf --output mountpoint,size,used,avail,usage```

# SYNOPSIS

**duf** [_options_] [_paths_...]

# DESCRIPTION

**duf** (Disk Usage/Free) is a modern replacement for the df command with a colorful, user-friendly terminal interface. It displays disk usage and free space for mounted filesystems in an organized table format.

The tool provides a clear visual representation with color-coded usage bars, making it easy to identify nearly-full filesystems at a glance. It groups filesystems by type (local, network, special) for better organization.

duf automatically handles various filesystem types and units, displaying sizes in human-readable format. It supports multiple output formats including JSON for scripting.

# PARAMETERS

**--all**
> Include pseudo, duplicate, and inaccessible filesystems.

**--only** _devices_ / **--hide** _devices_
> Show only, or hide, specific **device groups**: `local`, `network`, `fuse`, `special`, `loops`, `binds`. Comma-separated.

**--only-fs** _types_ / **--hide-fs** _types_
> Show only, or hide, specific **filesystem types** such as `ext4` or `tmpfs`.

**--only-mp** _paths_ / **--hide-mp** _paths_
> Show only, or hide, specific **mount points**. Wildcards are supported.

**--inodes**
> List inode usage instead of block usage.

**--json**
> Output every device as JSON.

**--output** _fields_
> Choose the columns to display, comma-separated.

**--sort** _field_
> Sort by a column. Defaults to `mountpoint`.

**--style** _style_
> Table style: `unicode` or `ascii`.

**--theme** _theme_
> Colour theme: `dark`, `light`, or `ansi`.

**--width** _n_
> Maximum output width.

**--avail-threshold** _sizes_
> Colouring thresholds (yellow, red) for the available column. Defaults to `10G,1G`.

**--usage-threshold** _fractions_
> Colouring thresholds (yellow, red) for the usage bars, as fractions from 0 to 1. Defaults to `0.5,0.9`.

**--warnings**
> Print warnings to stderr.

# CAVEATS

The grouping flags are easy to mix up. **--only** and **--hide** take *device groups* (`local`, `network`, `fuse`, `special`, `loops`, `binds`), not filesystem types or paths. For filesystem types use **--only-fs**/**--hide-fs**, and for paths **--only-mp**/**--hide-mp**.

duf is a display tool, not a `df` replacement in scripts: the table is meant for humans, and colour and box-drawing characters will corrupt anything that parses it. Use **--json** when the output feeds another program.

By default it omits pseudo-filesystems, so a mount you expect to see may need **--all** to appear. A hung network filesystem can make duf block, exactly as `df` does, since both must stat the mount point.

# HISTORY

**duf** was written by **Christian Muehlhaeuser** in **2020** in Go, one of a wave of tools that took a venerable Unix utility and asked what it would look like if the terminal had colour, Unicode, and a wide screen, which it had not when `df` was written. It caught on quickly, since reading `df` output is a small daily irritation for a great many people and duf's grouped, colour-coded table removes it.

# INSTALL

```apt: sudo apt install duf```

```dnf: sudo dnf install duf```

```pacman: sudo pacman -S duf```

```zypper: sudo zypper install duf```

```brew: brew install duf```

```nix: nix profile install nixpkgs#duf```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[df](/man/df)(1), [du](/man/du)(1), [ncdu](/man/ncdu)(1), [dust](/man/dust)(1), [dua](/man/dua)(1)

# RESOURCES

```[Source code](https://github.com/muesli/duf)```

<!-- verified: 2026-07-14 -->

