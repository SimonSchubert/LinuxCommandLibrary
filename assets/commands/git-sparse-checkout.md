# TLDR

**Initialize sparse checkout**

```git sparse-checkout init```

**Set sparse directories**

```git sparse-checkout set [dir1] [dir2]```

**Add to sparse checkout**

```git sparse-checkout add [dir]```

**List sparse patterns**

```git sparse-checkout list```

**Disable sparse checkout**

```git sparse-checkout disable```

**Use cone mode**

```git sparse-checkout init --cone```

# SYNOPSIS

**git** **sparse-checkout** _command_ [_options_]

# SUBCOMMANDS

**init**
> Initialize sparse checkout.

**set**
> Set patterns.

**add**
> Add patterns.

**list**
> List patterns.

**disable**
> Disable sparse checkout.

**reapply**
> Reapply patterns.

# PARAMETERS

**--cone**
> Use cone mode (faster).

**--no-cone**
> Use full pattern mode.

# DESCRIPTION

**git sparse-checkout** enables partial repository checkouts. Only specified directories are checked out, reducing working directory size for large repositories.

# SEE ALSO

[git-read-tree](/man/git-read-tree)(1), [git-checkout](/man/git-checkout)(1)

