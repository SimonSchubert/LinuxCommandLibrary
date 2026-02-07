# TAGLINE

Partially check out only specified directories

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

**git sparse-checkout** enables partial repository checkouts, where only specified directories and files are materialized in the working tree. This significantly reduces working directory size for large monorepos.

Cone mode (recommended) restricts patterns to directory-based inclusion, which is faster and simpler than full pattern matching.

# CONFIGURATION

**.git/info/sparse-checkout**
> File containing the sparse-checkout patterns that control which paths are checked out.

# SEE ALSO

[git-read-tree](/man/git-read-tree)(1), [git-checkout](/man/git-checkout)(1)
