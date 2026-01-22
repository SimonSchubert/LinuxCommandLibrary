# TLDR

List **all** Toolbx containers and images

```toolbox list```

List only **containers**

```toolbox list -c```

List only **images**

```toolbox list -i```

# SYNOPSIS

**toolbox list** [_options_]

# PARAMETERS

**-c**, **--containers**
> List only containers

**-i**, **--images**
> List only images

# DESCRIPTION

**toolbox list** displays existing Toolbx containers and images. It shows container names, images used, creation times, and running status. This helps manage multiple development environments and identify which containers are available.

The output distinguishes between containers (runnable environments) and images (base templates from which containers are created).

# SEE ALSO

[toolbox](/man/toolbox)(1), [toolbox-create](/man/toolbox-create)(1), [toolbox-rm](/man/toolbox-rm)(1)
