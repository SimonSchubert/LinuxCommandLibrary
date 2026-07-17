# TAGLINE

Copy files from a remote repository's working directory via rsync

# TLDR

**Copy specific files from a remote** into the current directory

```git rscp [remote] [file]```

**Copy a remote directory**

```git rscp [remote] [directory]```

# SYNOPSIS

**git** **rscp** _remote_ _files_...

# DESCRIPTION

**git rscp** is the reverse direction of git-extras' `git scp`: it copies the given files or directories from a remote's working directory to the current working directory using rsync. It is the same script as `git-scp`, just invoked under a different name, which switches it into "pull" mode instead of scp's default "push and stage" mode.

The destination path is derived from the named remote's configured URL, so the remote must already exist in `git remote`.

# CAVEATS

Part of git-extras package; requires `rsync` and, for SSH remotes, `ssh` to be installed. Unlike `git scp`, files copied this way are not automatically staged.

# SEE ALSO

[git-scp](/man/git-scp)(1), [rsync](/man/rsync)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-scp)```

<!-- verified: 2026-07-17 -->
