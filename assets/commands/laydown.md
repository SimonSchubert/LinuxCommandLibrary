# TLDR

**Create layer**

```laydown create [layer-name]```

**List layers**

```laydown list```

**Apply layer**

```laydown apply [layer-name]```

**Remove layer**

```laydown remove [layer-name]```

# SYNOPSIS

**laydown** _command_ [_options_]

# PARAMETERS

**create** _NAME_
> Create new layer.

**list**
> List all layers.

**apply** _NAME_
> Apply layer.

**remove** _NAME_
> Remove layer.

**--help**
> Display help information.

# DESCRIPTION

**laydown** manages configuration layers. It organizes settings and files in composable layers.

The tool enables modular configuration management. Layers can be applied and removed independently.

laydown manages config layers.

# CAVEATS

Configuration specific. Layer system approach. May vary by implementation.

# HISTORY

laydown provides layered configuration management for organizing complex system setups.

# SEE ALSO

[stow](/man/stow)(1), [chezmoi](/man/chezmoi)(1)
