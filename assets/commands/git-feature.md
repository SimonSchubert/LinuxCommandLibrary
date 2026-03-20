# TAGLINE

Create and manage feature branches with standardized workflow

# TLDR

**Create feature branch**

```git feature [feature_name]```

**Create feature branch with remote tracking**

```git feature [feature_name] -r [origin]```

**Create feature branch from a specific start point**

```git feature [feature_name] --from [develop]```

**Finish feature branch (merge and delete)**

```git feature finish [feature_name]```

**Finish with squash merge**

```git feature finish --squash [feature_name]```

# SYNOPSIS

**git** **feature** [**-a** _prefix_] [**-s** _separator_] [**-r** [_remote_]] [**--from** _start_point_] _name_...

**git** **feature** **finish** [**--squash**] _name_...

# PARAMETERS

**-a** _PREFIX_, **--alias** _PREFIX_
> Use a custom branch prefix instead of "feature".

**-s** _SEPARATOR_, **--separator** _SEPARATOR_
> Use a custom separator instead of "/".

**-r** [_REMOTE_], **--remote** [_REMOTE_]
> Set up a remote tracking branch (defaults to origin).

**--from** _START_POINT_
> Create the feature branch from a specific commit or branch.

**--squash**
> Perform a squash merge when finishing.

# SUBCOMMANDS

**finish**
> Merge feature branch into the current branch and delete it.

# DESCRIPTION

**git feature** provides high-level commands for working with feature branches following a standardized naming convention. As part of the git-extras suite, it simplifies the common workflow of creating, developing, and completing feature work in separate branches.

When creating a feature branch, the command automatically applies a "feature/" prefix to maintain consistent naming across the repository. The finish subcommand handles merging the feature back into the main development branch and cleaning up afterward, encapsulating multiple manual git operations into a single command.

# SEE ALSO

[git-create-branch](/man/git-create-branch)(1), [git-extras](/man/git-extras)(1), [git-branch](/man/git-branch)(1), [git-flow](/man/git-flow)(1)
