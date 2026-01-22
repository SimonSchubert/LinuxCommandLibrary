# TLDR

**Run** command in container

```toolbox run -c [container_name] [command]```

Run in **distribution** container

```toolbox run -d [distribution] -r [release] [command]```

Run **emacs** in Fedora container

```toolbox run -d fedora -r f[version] emacs```

# SYNOPSIS

**toolbox run** [_OPTIONS_] _COMMAND_ [_ARGS_...]

# PARAMETERS

**-c, --container** _NAME_
> Specify container name

**-d, --distro** _DISTRO_
> Specify distribution

**-r, --release** _RELEASE_
> Specify distribution release version

# DESCRIPTION

**toolbox run** executes a command inside an existing Toolbx container without entering an interactive session. The command runs in the container environment and returns to the host when complete.

This is useful for running individual commands or scripts in a container environment while staying on the host system.

# CAVEATS

Container must exist and be running. Command must be available inside the container. Environment differs from interactive session in some cases.

# SEE ALSO

[toolbox](/man/toolbox)(1), [toolbox-enter](/man/toolbox-enter)(1), [toolbox-create](/man/toolbox-create)(1)
