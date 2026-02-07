# TAGLINE

Copy files to or from a remote via scp

# TLDR

**Copy files to remote**

```git scp [remote] [files]```

**Copy from remote**

```git scp -r [remote] [files]```

# SYNOPSIS

**git** **scp** [_options_] _remote_ _files_...

# PARAMETERS

**-r**
> Reverse copy (from remote).

# DESCRIPTION

**git scp** copies files to or from a Git remote using scp. Part of git-extras, it reads the remote's SSH configuration from Git to determine the host and path.

# SEE ALSO

[git-rscp](/man/git-rscp)(1), [scp](/man/scp)(1), [git-extras](/man/git-extras)(1)
