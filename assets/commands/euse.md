# TAGLINE

Gentoo USE flag management utility

# TLDR

List **active global** USE flags

```euse -a -g```

List **active local** USE flags

```euse -a -l```

**Enable** a global USE flag

```sudo euse -E useflag```

**Disable** a global USE flag

```sudo euse -D useflag```

**Remove** a global USE flag

```sudo euse -P useflag```

Show **info** about a USE flag

```euse -i useflag```

# SYNOPSIS

**euse** [_options_] [_useflag_]

# DESCRIPTION

**euse** is a Gentoo utility to enable, disable, and obtain information about USE flags. USE flags control which optional features are compiled into packages during installation, allowing fine-grained control over software capabilities, dependencies, and binary size.

The tool simplifies USE flag management by providing a command-line interface to modify system and package-specific flags without manually editing configuration files. This is central to Gentoo's philosophy of compile-time customization.

# PARAMETERS

**-a, --active**
> Show active USE flags

**-g, --global**
> Operate on global USE flags (make.conf)

**-l, --local**
> Operate on local USE flags (package.use)

**-E, --enable**
> Enable the specified USE flag

**-D, --disable**
> Disable the specified USE flag (adds '-' prefix)

**-P, --prune**
> Remove the specified USE flag from configuration

**-i, --info**
> Show information about a USE flag

# CONFIGURATION

**/etc/portage/make.conf**
> Global USE flags for the entire system set via the USE variable.

**/etc/portage/package.use/**
> Per-package USE flag settings organized in files within this directory.

# CAVEATS

Global USE flags are set in /etc/portage/make.conf. Local USE flags are set in /etc/portage/package.use/. After changing USE flags, affected packages should be rebuilt with emerge --changed-use.

# HISTORY

**euse** is part of **gentoolkit**, a collection of administration scripts for Gentoo Linux.

# SEE ALSO

[emerge](/man/emerge)(1), [equery](/man/equery)(1), [portage](/man/portage)(5)
