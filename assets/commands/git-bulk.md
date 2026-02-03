# TLDR

**Run command on all repos**

```git bulk --all [command]```

**Add workspace**

```git bulk --addworkspace [name] [path]```

**List workspaces**

```git bulk --listall```

**Run in specific workspace**

```git bulk --workspace [name] [command]```

# SYNOPSIS

**git** **bulk** [_options_] [_command_]

# PARAMETERS

**--all**
> Run on all repositories.

**--addworkspace** _name_ _path_
> Add workspace.

**--workspace** _name_
> Use specific workspace.

**--listall**
> List all workspaces.

# DESCRIPTION

**git bulk** runs Git commands across multiple repositories. Part of git-extras. Useful for managing multiple projects with a single command.

# SEE ALSO

[git-extras](/man/git-extras)(1)

