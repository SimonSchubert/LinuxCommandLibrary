# TAGLINE

List installed packages

# TLDR

**List installed packages**

```bun pm ls```

**List all packages** including nested dependencies

```bun pm ls --all```

# SYNOPSIS

**bun** **pm** **ls** [_options_]

# PARAMETERS

**--all**
> Show all dependencies including nested.

# DESCRIPTION

**bun pm ls** lists packages installed in the current project. By default it shows top-level dependencies. Use **--all** to display the full dependency tree including transitive dependencies.

This command is equivalent to **bun list**.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm](/man/bun-pm)(1), [bun-list](/man/bun-list)(1)
