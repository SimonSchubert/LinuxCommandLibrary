# TAGLINE

Gentoo USE flag management utility

# TLDR

List **active global** USE flags and where they are set

```euse -a -g```

List **active local** USE flags

```euse -a -l```

**Enable** a global USE flag in make.conf

```sudo euse -E [useflag]```

**Disable** a global USE flag

```sudo euse -D [useflag]```

**Remove** all references to a flag, reverting to the profile default

```sudo euse -R [useflag]```

**Enable** a USE flag for a **single package** in package.use

```sudo euse -p [category/package] -E [useflag]```

Show **info** about a USE flag

```euse -i [useflag]```

Show info plus the **installed packages** using a flag

```euse -I [useflag]```

# SYNOPSIS

**euse** _option_ [_suboptions_] [_useflaglist_]

# DESCRIPTION

**euse** is a Gentoo utility to enable, disable, and obtain information about USE flags. USE flags control which optional features are compiled into packages during installation, allowing fine-grained control over software capabilities, dependencies, and binary size.

The tool edits the **USE** variable in **/etc/portage/make.conf**, or **/etc/portage/package.use** when **-p** is given, so you do not have to edit these files by hand. It also reports flag descriptions, whether a flag is global or local, and whether it is enabled in the environment, make.conf, make.defaults, or make.globals.

# PARAMETERS

**-E, --enable**
> Enable the given USE flag(s). Accepts one or more space-separated flags.

**-D, --disable**
> Disable the given USE flag(s) by adding them with a '-' prefix.

**-R, --remove**
> Remove all positive and negative references to the given flags from make.conf and package.use, reverting to the default settings.

**-P, --prune**
> Alias for **--remove**.

**-p, --package** _category/package_
> Used with **-E**, **-D**, and **-R** to apply the change to a specific package only (package.use).

**-a, --active**
> Show all currently active USE flags and where they are activated.

**-i, --info**
> Show the description and status of the given USE flags, or of all flags if none are given.

**-I, --info-installed**
> Like **--info**, but also list currently installed packages that use the flag.

**-g, --global**
> Suboption: show only global USE flags.

**-l, --local**
> Suboption: show only local (package-specific) USE flags.

**-h, --help**
> Display help information.

**-v, -V, --version**
> Display version information.

# CONFIGURATION

**/etc/portage/make.conf**
> Global USE flags for the entire system set via the USE variable.

**/etc/portage/package.use**
> Per-package USE flag settings (a file or a directory of files).

# CAVEATS

If multiple modes are given, only the last one is used. euse may not fully understand cascaded profiles, use.defaults, or the **-*** flag. After changing USE flags, rebuild affected packages with **emerge --update --deep --changed-use @world**.

# HISTORY

**euse** is part of **gentoolkit**, a collection of administration scripts for Gentoo Linux. It was originally written by Arun Bhanu, rewritten by Marius Mauch, and later extended with package.use support by Jared Hancock.

# SEE ALSO

[emerge](/man/emerge)(1), [equery](/man/equery)(1), [eselect](/man/eselect)(1), [portageq](/man/portageq)(1)

# RESOURCES

```[Source code](https://gitweb.gentoo.org/proj/gentoolkit.git/)```

```[Documentation](https://wiki.gentoo.org/wiki/Gentoolkit)```

<!-- verified: 2026-11-23 -->
