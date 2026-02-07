# TAGLINE

Execute Git commands across multiple repositories

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

**git bulk** is a git-extras utility that enables executing Git commands across multiple repositories simultaneously. It manages workspaces, which are collections of repository paths that can be organized by project, team, or any logical grouping.

The tool eliminates the need to manually navigate to each repository and run the same command repeatedly. Commands like status checks, branch updates, or pull operations can be performed across dozens of repositories in a single invocation.

Workspaces are stored in configuration, allowing you to define repository groups once and reuse them. This is invaluable for developers managing microservices, monorepo-adjacent architectures, or multiple client projects where synchronized operations are common.

# SEE ALSO

[git-extras](/man/git-extras)(1)

