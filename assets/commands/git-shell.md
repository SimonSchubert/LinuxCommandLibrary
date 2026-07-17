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
> Optional directory of allowed interactive commands. If present, git-shell provides a limited interactive mode listing these commands. A file named `no-interactive-login` in this directory (or anywhere on PATH) fully disables interactive login, printing its contents instead.

# CAVEATS

Login shell, not a command. Only allows git commands. Used for git server accounts.

# HISTORY

git-shell was created to enable **secure git hosting** by providing a restricted shell that only permits git operations.

# SEE ALSO

[git](/man/git)(1), [ssh](/man/ssh)(1), [chsh](/man/chsh)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-shell)```

<!-- verified: 2026-07-17 -->
