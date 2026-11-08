# TAGLINE

visualizes package dependencies in a tree format

# TLDR

Print **dependency tree** of a package

```pactree [package]```

Print **reverse** dependencies (what depends on package)

```pactree -r [package]```

List dependencies **one per line**, skip duplicates

```pactree -u [package]```

Include **optional** dependencies with color

```pactree -co [package]```

Limit tree **depth** (1 shows direct dependencies only)

```pactree -d [depth] [package]```

Query a package that is **not installed**

```pactree -s [package]```

Render the tree as a **Graphviz** image

```pactree -g [package] | dot -Tpng -o [deps.png]```

Display **help**

```pactree --help```

# SYNOPSIS

**pactree** [_options_] _package_

# PARAMETERS

**-a, --ascii**
> Use ASCII characters for tree formatting

**-b, --dbpath** _path_
> Use an alternative database location

**-c, --color**
> Colorize output for better readability

**-d, --depth _num_**
> Limit recursion depth. 0 shows only the named package, 1 its direct dependencies

**-g, --graph**
> Generate a Graphviz description. Ignores --color and --linear

**-h, --help**
> Display syntax and command-line options

**-l, --linear**
> Print package names one per line, without tree formatting

**-o, --optional**[=_depth_]
> Include optional dependencies in tree. Defaults to immediate ones (depth 1); a negative value means infinite depth

**-r, --reverse**
> Show reverse dependencies (packages depending on target)

**-s, --sync**
> Query sync databases instead of local

**-u, --unique**
> List each dependency only once. Implies --linear

**-V, --version**
> Display version

**--config _file_**
> Use alternate pacman configuration

**--debug**
> Print log messages produced by libalpm

**--gpgdir _dir_**
> Use an alternate GnuPG directory for verifying database signatures (default: /etc/pacman.d/gnupg)

# DESCRIPTION

**pactree** visualizes package dependencies in a tree format. It queries pacman's database to show what packages a given package depends on, or with the reverse option, what packages depend on it.

The tool is useful for understanding package relationships, identifying orphaned packages, and planning package removal to avoid breaking dependencies.

# CAVEATS

Only shows dependencies for installed packages by default. Use -s flag for sync database queries. Large dependency trees can produce extensive output. Optional dependencies are hidden unless -o is specified.

# HISTORY

**pactree** originally shipped as a utility with pacman itself and now lives in the official **pacman-contrib** package. It provides visual dependency information that pacman's standard query options don't offer in an easy-to-read format.

# INSTALL

```pacman: sudo pacman -S pacman-contrib```

<!-- packages: 2026-11-08 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pactrans](/man/pactrans)(1), [pkgfile](/man/pkgfile)(1), [dot](/man/dot)(1)

# RESOURCES

```[Source code](https://gitlab.archlinux.org/pacman/pacman-contrib)```

```[Documentation](https://man.archlinux.org/man/pactree.8)```

<!-- verified: 2026-11-08 -->
