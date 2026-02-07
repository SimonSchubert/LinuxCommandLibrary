# TAGLINE

manage modularity streams for packages

# TLDR

View **modularity overview**

```dnf module list```

View modularity of **specific package**

```dnf module list [package_name]```

**Enable** a module stream

```sudo dnf module enable [package_name]:[stream]```

**Install** a specific module version

```dnf module install [package_name]:[stream]```

# SYNOPSIS

**dnf module** _command_ [_module:stream_]

# DESCRIPTION

**dnf module** manages package modularity, allowing multiple versions of software to coexist in repositories. Modules group packages with a specific purpose, and streams represent different versions.

Modularity is used in RHEL 8+ and Fedora for software like Python, Node.js, and PHP where multiple versions need to be available.

# PARAMETERS

**list**
> List available modules

**enable** _module:stream_
> Enable a module stream

**disable** _module_
> Disable a module

**install** _module:stream_
> Install module packages

**remove** _module_
> Remove module packages

**reset** _module_
> Reset module state

# CAVEATS

Only one stream of a module can be active at a time. Enabling a stream doesn't install packages; use install for that. Available on RHEL 8+ and recent Fedora.

# SEE ALSO

[dnf](/man/dnf)(8), [dnf-install](/man/dnf-install)(8)
