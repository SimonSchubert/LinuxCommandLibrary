# TAGLINE

Distributed version control system for tracking code changes

# TLDR

**Clone a repository**

```git clone [https://github.com/owner/repo.git]```

**Stage and commit changes**

```git add . && git commit -m "[message]"```

**Push to remote**

```git push origin [branch]```

**Pull changes**

```git pull```

**Create and switch branch**

```git checkout -b [branch-name]```

# SYNOPSIS

**git** [_options_] _command_ [_args_]

# PARAMETERS

**init**
> Create an empty Git repository or reinitialize an existing one.

**clone** _URL_
> Clone a repository into a new directory.

**add** _FILES_
> Stage files for commit.

**commit**
> Record changes to repository.

**status**
> Show working tree status.

**diff**
> Show changes between commits, the working tree, and the index.

**push**
> Update remote refs and associated objects.

**pull**
> Fetch and merge from remote.

**fetch**
> Download objects and refs from another repository without merging.

**checkout**
> Switch branches or restore working tree files.

**switch**
> Switch branches.

**branch**
> List, create, or delete branches.

**merge**
> Join two or more development histories together.

**rebase**
> Reapply commits on top of another base tip.

**log**
> Show commit history.

**remote**
> Manage the set of tracked repositories.

**-v**, **--version**
> Print the Git suite version.

**-C** _PATH_
> Run as if git was started in _PATH_ instead of the current directory.

**-c** _NAME_=_VALUE_
> Pass a configuration value for the duration of the command.

**-p**, **--paginate**
> Pipe output into a pager (usually `less`).

**--git-dir** _PATH_
> Set the path to the repository's `.git` directory.

**--work-tree** _PATH_
> Set the path to the working tree.

**--help**
> Display help information.

# DESCRIPTION

**git** is a distributed version control system for tracking changes in source code. It enables collaboration through branching, merging, and remote repositories while maintaining complete history.

Git's distributed nature means every clone contains full history. Branches are lightweight, enabling feature development workflows. The staging area provides fine-grained commit control.

# CONFIGURATION

**~/.gitconfig**
> Global user configuration including identity, aliases, and default behaviors.

**.git/config**
> Repository-specific configuration for remotes, branches, and local settings.

**~/.gitignore_global**
> Global ignore patterns applied to all repositories.

# CAVEATS

Learning curve for advanced features. Large binary files need git-lfs. History rewriting affects collaborators.

# HISTORY

Git was created by **Linus Torvalds** in **2005** for Linux kernel development after BitKeeper licensing issues. It has become the standard version control system for most software projects.

# SEE ALSO

[gh](/man/gh)(1), [git-commit](/man/git-commit)(1), [git-push](/man/git-push)(1), [git-log](/man/git-log)(1), [git-branch](/man/git-branch)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git)```

<!-- verified: 2026-07-17 -->
