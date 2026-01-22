# TLDR

Print **dependency tree** of a package

```pactree [package]```

Print **reverse** dependencies (what depends on package)

```pactree -r [package]```

List dependencies **one per line**, skip duplicates

```pactree -u [package]```

Include **optional** dependencies with color

```pactree -co [package]```

Limit tree **depth**

```pactree -d [depth] [package]```

Display **help**

```pactree```

# SYNOPSIS

**pactree** [**-c**|**--color**] [**-d** _depth_] [**-o**|**--optional**] [**-r**|**--reverse**] [**-u**|**--unique**] _package_

# PARAMETERS

**-c, --color**
> Colorize output for better readability

**-d, --depth _num_**
> Limit recursion depth

**-o, --optional**
> Include optional dependencies in tree

**-r, --reverse**
> Show reverse dependencies (packages depending on target)

**-s, --sync**
> Query sync databases instead of local

**-u, --unique**
> List each dependency only once, one per line

**--config _file_**
> Use alternate pacman configuration

# DESCRIPTION

**pactree** visualizes package dependencies in a tree format. It queries pacman's database to show what packages a given package depends on, or with the reverse option, what packages depend on it.

The tool is useful for understanding package relationships, identifying orphaned packages, and planning package removal to avoid breaking dependencies.

# CAVEATS

Only shows dependencies for installed packages by default. Use -s flag for sync database queries. Large dependency trees can produce extensive output. Optional dependencies are hidden unless -o is specified.

# HISTORY

**pactree** was originally a standalone script that became part of the official **pacman-contrib** package. It provides visual dependency information that pacman's standard query options don't offer in an easy-to-read format.

# SEE ALSO

[pacman](/man/pacman)(8), [pactrans](/man/pactrans)(1), [pkgfile](/man/pkgfile)(1)
