# TAGLINE

Execute Git commands across multiple repositories

# TLDR

**Run a git command on all registered workspaces**

```git bulk -a [git-command]```

**Add a workspace from a directory**

```git bulk --addworkspace [name] [path]```

**Add the current directory as a workspace**

```git bulk --addcurrent [name]```

**List all registered workspaces**

```git bulk --listall```

**Run command on a specific workspace**

```git bulk -w [name] [git-command]```

**Run with confirmation prompt before each repository**

```git bulk -g -a [git-command]```

# SYNOPSIS

**git** **bulk** [_options_] [_git-command_]

# PARAMETERS

**-a**
> Run the git command on all registered workspaces and their repositories.

**-w** _name_
> Run the git command on the specified workspace.

**-g**
> Guarded mode: ask for confirmation before executing on each repository.

**--addworkspace** _name_ _path_
> Register a workspace with a logical name and root directory path. All repositories under the root directory are included. Optionally use **--from** _url-or-file_ to clone repositories directly into the workspace.

**--removeworkspace** _name_
> Remove the registered workspace with the given name.

**--addcurrent** _name_
> Add the current directory as a workspace.

**--purge**
> Remove all defined repository locations.

**--listall**
> List all registered workspaces and their paths.

# DESCRIPTION

**git bulk** is a git-extras utility that enables executing Git commands across multiple repositories simultaneously. It manages workspaces, which are collections of repository paths that can be organized by project, team, or any logical grouping.

The tool eliminates the need to manually navigate to each repository and run the same command repeatedly. Commands like status checks, branch updates, or pull operations can be performed across dozens of repositories in a single invocation.

Workspaces are stored in configuration, allowing you to define repository groups once and reuse them. This is invaluable for developers managing microservices, monorepo-adjacent architectures, or multiple client projects where synchronized operations are common.

# SEE ALSO

[git-extras](/man/git-extras)(1)

