# TAGLINE

creates temporary development environments

# TLDR

**Enter shell with package**

```nix-shell -p [hello]```

**Enter shell from default.nix**

```nix-shell```

**Enter shell from file**

```nix-shell [shell.nix]```

**Run command in shell**

```nix-shell -p [jq] --run "[jq --version]"```

**Pure shell**

```nix-shell --pure -p [python3]```

**Multiple packages**

```nix-shell -p [python3] [nodejs] [git]```

# SYNOPSIS

**nix-shell** [_options_] [_path_]

# PARAMETERS

_PATH_
> Nix expression file.

**-p** _PACKAGES_
> Packages to include.

**--run** _CMD_
> Command to execute.

**--pure**
> Clear environment.

**-A** _ATTR_
> Use specific attribute.

**--help**
> Display help information.

# DESCRIPTION

**nix-shell** creates temporary development environments. Provides packages without installing.

The tool sets up shell with dependencies. Exits cleanly without system changes.

# CAVEATS

Legacy command. Consider nix develop. Per-invocation environment.

# HISTORY

nix-shell is a core **Nix** command for creating temporary development shells.

# SEE ALSO

[nix-develop](/man/nix-develop)(1), [nix](/man/nix)(1), [direnv](/man/direnv)(1)

