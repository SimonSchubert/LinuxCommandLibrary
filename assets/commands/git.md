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

**clone** _URL_
> Clone a repository.

**add** _FILES_
> Stage files for commit.

**commit**
> Record changes to repository.

**push**
> Push to remote repository.

**pull**
> Fetch and merge from remote.

**checkout**
> Switch branches or restore files.

**branch**
> List, create, or delete branches.

**merge**
> Merge branches.

**status**
> Show working tree status.

**log**
> Show commit history.

**--help**
> Display help information.

# DESCRIPTION

**git** is a distributed version control system for tracking changes in source code. It enables collaboration through branching, merging, and remote repositories while maintaining complete history.

Git's distributed nature means every clone contains full history. Branches are lightweight, enabling feature development workflows. The staging area provides fine-grained commit control.

git is the dominant version control system for software development worldwide.

# CAVEATS

Learning curve for advanced features. Large binary files need git-lfs. History rewriting affects collaborators.

# HISTORY

Git was created by **Linus Torvalds** in **2005** for Linux kernel development after BitKeeper licensing issues. It has become the standard version control system for most software projects.

# SEE ALSO

[gh](/man/gh)(1), [git-commit](/man/git-commit)(1), [git-push](/man/git-push)(1)
