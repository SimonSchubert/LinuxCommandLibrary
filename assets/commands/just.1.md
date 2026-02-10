# TAGLINE

command runner that reads recipes from a justfile

# TLDR

**Run default recipe**

```just```

**Run specific recipe**

```just [recipe]```

**Run recipe with arguments**

```just [recipe] [arg1] [arg2]```

**List available recipes**

```just --list```

**Show recipe source**

```just --show [recipe]```

# SYNOPSIS

**just** [_options_] [_recipe_...] [_arguments_...]

# PARAMETERS

**--list**
> List available recipes.

**--show** _recipe_
> Show recipe source code.

**-f**, **--justfile** _file_
> Use specified justfile.

**--choose**
> Select recipe interactively.

**--dry-run**
> Print commands without executing.

**-q**, **--quiet**
> Suppress output.

# DESCRIPTION

**just** is a command runner that reads recipes from a justfile. It provides a convenient way to save and run project-specific commands. Syntax is inspired by make but focused on running commands rather than building. Recipes can be written in any language.

# SEE ALSO

[make](/man/make)(1), [task](/man/task)(1)

