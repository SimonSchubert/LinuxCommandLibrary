# TAGLINE

High-level branching model workflow commands

# TLDR

**Initialize git flow**

```git flow init```

**Initialize with default branch names**

```git flow init -d```

**Start feature branch**

```git flow feature start [feature-name]```

**Finish feature**

```git flow feature finish [feature-name]```

**Start release**

```git flow release start [version]```

**Finish release**

```git flow release finish [version]```

**Publish a feature branch to remote**

```git flow feature publish [feature-name]```

**Start a hotfix**

```git flow hotfix start [version]```

**Finish a hotfix**

```git flow hotfix finish [version]```

# SYNOPSIS

**git flow** _subcommand_ [_action_] [_name_]

# PARAMETERS

**init**
> Initialize repository for git-flow.

**feature** _ACTION_ _NAME_
> Manage feature branches.

**release** _ACTION_ _VERSION_
> Manage release branches.

**hotfix** _ACTION_ _NAME_
> Manage hotfix branches.

**support** _ACTION_ _NAME_
> Manage support branches.

**start**
> Begin a new branch.

**finish**
> Complete and merge branch.

**publish**
> Push branch to the remote repository.

**track**
> Track a remote branch locally.

**pull**
> Pull a remote branch (deprecated in favor of track).

**delete**
> Delete a finished branch.

**list**
> List existing branches of a given type.

**-d**
> Use default branch naming conventions during init.

**--help**
> Display help information.

# DESCRIPTION

**git flow** implements Vincent Driessen's branching model, providing high-level commands for managing feature, release, and hotfix branches with consistent naming and merge strategies.

The workflow uses develop as the integration branch and main/master for releases. Features branch from develop, releases prepare for production, and hotfixes go directly to main. This standardizes team branching workflows with clear conventions.

# CAVEATS

Opinionated workflow. May not suit all projects. Requires initialization per repo.

# HISTORY

git flow was created by **Vincent Driessen** in **2010** based on his successful git branching model blog post.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-merge](/man/git-merge)(1), [git-checkout](/man/git-checkout)(1), [git-tag](/man/git-tag)(1)
