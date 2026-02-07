# TAGLINE

Restricted login shell for Git-only SSH access

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

**git-shell** is a restricted login shell that allows only Git operations (push, pull, fetch) over SSH while blocking general shell access. When set as a user's login shell, it prevents interactive login while permitting Git protocol operations.

This is the standard way to create secure Git hosting accounts that can only interact through Git commands.

# CONFIGURATION

**~/git-shell-commands/**
> Optional directory of allowed interactive commands. If present, git-shell provides a limited interactive mode listing these commands.

# CAVEATS

Login shell, not a command. Only allows git commands. Used for git server accounts.

# HISTORY

git-shell was created to enable **secure git hosting** by providing a restricted shell that only permits git operations.

# SEE ALSO

[git](/man/git)(1), [ssh](/man/ssh)(1), [chsh](/man/chsh)(1)
