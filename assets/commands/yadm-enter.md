# TAGLINE

Run a sub-shell with yadm Git variables set

# TLDR

**Enter a sub-shell with yadm Git variables set**

```yadm enter```

**Run a specific command in the yadm context**

```yadm enter [command]```

**Run git log within the yadm worktree**

```yadm enter git log --oneline```

# SYNOPSIS

**yadm** **enter** [_command_]

# DESCRIPTION

**yadm enter** opens a sub-shell with **GIT_DIR** and **GIT_WORK_TREE** environment variables set to the yadm repository. Exit the sub-shell the same way you leave your normal shell (usually with "exit"). This is useful for complex git operations on dotfiles, or for integrating with tools that use Git directly such as **tig**, **vim-fugitive**, or **git-cola**.

Optionally, provide a command after "enter" and that command will be run with the yadm Git variables exposed in its environment, instead of invoking a sub-shell.

# SEE ALSO

[yadm](/man/yadm)(1)

