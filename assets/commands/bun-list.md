# TAGLINE

List installed packages in a Bun project

# TLDR

**List installed packages** (top-level)

```bun pm ls```

**List all packages** including nested dependencies

```bun pm ls --all```

# SYNOPSIS

**bun** **pm** **ls** [**--all**]

# PARAMETERS

**--all**
> Show the full dependency tree, including transitive dependencies.

# DESCRIPTION

**bun pm ls** (sometimes invoked as **bun list**) prints the packages installed in the current project's **node_modules** directory. By default it shows only the direct dependencies declared in **package.json**; pass **--all** to see the complete resolved dependency tree.

The output includes each package's resolved version and location and is intended for quick auditing of what is installed. For machine-readable output, inspect **bun.lockb** with **bun pm** subcommands.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm-ls](/man/bun-pm-ls)(1), [bun-outdated](/man/bun-outdated)(1)
