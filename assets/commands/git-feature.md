# TAGLINE

Create and manage feature branches with standardized workflow

# TLDR

**Create feature branch**

```git feature [feature_name]```

**Finish feature branch**

```git feature finish [feature_name]```

# SYNOPSIS

**git** **feature** [_options_] _name_

# SUBCOMMANDS

**finish**
> Merge and delete feature branch.

# DESCRIPTION

**git feature** provides high-level commands for working with feature branches following a standardized naming convention. As part of the git-extras suite, it simplifies the common workflow of creating, developing, and completing feature work in separate branches.

When creating a feature branch, the command automatically applies a "feature/" prefix to maintain consistent naming across the repository. The finish subcommand handles merging the feature back into the main development branch and cleaning up afterward, encapsulating multiple manual git operations into a single command.

# SEE ALSO

[git-create-branch](/man/git-create-branch)(1), [git-extras](/man/git-extras)(1)
