# TAGLINE

Enter Toolbx container interactively

# TLDR

Enter a Toolbx container using default image of a **specific distribution**

```toolbox enter -d [distribution]```

Enter container using default image of a **specific release**

```toolbox enter -r [release]```

Enter container for a **specific Fedora release**

```toolbox enter -d fedora -r f[version]```

# SYNOPSIS

**toolbox enter** [_options_] [_container_]

# PARAMETERS

**-d**, **--distro** _distro_
> Enter container for specified distribution

**-r**, **--release** _release_
> Enter container for specified release version

**container**
> Name of container to enter (default: current)

# DESCRIPTION

**toolbox enter** provides an interactive shell inside a Toolbx container. The container environment seamlessly integrates with the host, sharing the home directory, user identity, and system resources like graphics and networking.

This allows running distribution-specific tools, testing software, or development work in an isolated environment while maintaining access to host files and services.

# CAVEATS

Container must exist; use **toolbox create** first. Changes to home directory persist between sessions. System directories are container-specific and reset if the container is recreated.

# SEE ALSO

[toolbox](/man/toolbox)(1), [toolbox-create](/man/toolbox-create)(1), [toolbox-run](/man/toolbox-run)(1)
