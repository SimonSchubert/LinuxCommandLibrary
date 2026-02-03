# TLDR

**List installed packages**

```bun list```

**List all packages** including nested dependencies

```bun list --all```

**Output as JSON**

```bun list --json```

# SYNOPSIS

**bun** **list** [_options_]

# PARAMETERS

**--all**
> Show all dependencies including nested.

**--json**
> Output in JSON format.

# DESCRIPTION

**bun list** displays the packages installed in the current project. By default, it shows direct dependencies from package.json. Use **--all** to see the complete dependency tree.

This is similar to **npm list** or **yarn list**.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm-ls](/man/bun-pm-ls)(1), [bun-outdated](/man/bun-outdated)(1)
