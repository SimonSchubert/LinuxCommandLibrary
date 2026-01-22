# TLDR

**Set user shell to git-shell**

```chsh -s $(which git-shell) [git-user]```

**Run allowed command**

```git-shell -c "git-receive-pack '/repo.git'"```

# SYNOPSIS

**git-shell** [**-c** _command_]

# PARAMETERS

**-c** _COMMAND_
> Execute git command.

**--help**
> Display help information.

# DESCRIPTION

**git-shell** is a restricted login shell for git-only SSH access. When used as a user's shell, it only allows git operations (push, pull, fetch) and blocks shell access.

The shell enables secure git hosting by creating users that can only interact through git protocols. It prevents shell escapes while permitting git operations.

git-shell provides secure restricted access for git servers.

# CAVEATS

Login shell, not a command. Only allows git commands. Used for git server accounts.

# HISTORY

git-shell was created to enable **secure git hosting** by providing a restricted shell that only permits git operations.

# SEE ALSO

[git](/man/git)(1), [ssh](/man/ssh)(1), [chsh](/man/chsh)(1)
