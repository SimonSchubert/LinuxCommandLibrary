# TAGLINE

Remote Wayland application forwarding over SSH

# TLDR

Run **remote** program locally

```waypipe ssh [user]@[server] [program]```

Open SSH **tunnel**

```waypipe ssh [user]@[server]```

Skip **Vulkan** test

```waypipe --test-skip-vulkan ssh [user]@[server] [program]```

Display **help**

```waypipe -h```

# SYNOPSIS

**waypipe** [_OPTIONS_] ssh _HOST_ [_PROGRAM_]

# PARAMETERS

**--test-skip-vulkan**
> Skip testing for Vulkan support

**-h, --help**
> Display help information

# DESCRIPTION

**waypipe** runs graphical Wayland applications remotely and displays them locally, similar to X11 forwarding but for Wayland compositors. It handles the Wayland protocol over SSH.

The tool creates a transparent tunnel that makes remote applications appear as native local windows.

# CAVEATS

Requires Wayland on both local and remote systems. Performance depends on network latency. Some applications may not work correctly with remote rendering.

# SEE ALSO

[ssh](/man/ssh)(1)
