# TAGLINE

Display project dependency tree

# TLDR

**Show dependency tree**

```uv tree```

**Show tree with depth limit**

```uv tree --depth [n]```

**Show inverted tree**

```uv tree --invert```

**Show tree for package**

```uv tree --package [name]```

# SYNOPSIS

**uv** **tree** [_options_]

# PARAMETERS

**--depth** _n_
> Limit tree depth.

**--invert**
> Show reverse dependencies.

**--package** _name_
> Show specific package.

**--no-dev**
> Exclude dev dependencies.

# DESCRIPTION

**uv tree** displays the dependency tree for a project. Shows packages and their dependencies in hierarchical format. Useful for understanding and debugging dependency relationships.

# SEE ALSO

[uv](/man/uv)(1), [pipdeptree](/man/pipdeptree)(1)

