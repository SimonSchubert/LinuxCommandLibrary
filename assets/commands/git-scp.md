# TAGLINE

Copy files to a remote Git repository via scp

# TLDR

**Copy a single file to a remote**

```git scp [remote] [path/to/file]```

**Copy multiple files to a remote**

```git scp [remote] [file1] [file2]```

**Copy a file to a specific branch on remote**

```git scp [remote] [path/to/file] --branch [branch_name]```

# SYNOPSIS

**git** **scp** _remote_ _files_...

# DESCRIPTION

**git scp** copies files to a Git remote using scp. Part of **git-extras**, it uses the remote's URL from your Git configuration to determine the host and path, then transfers files via scp. To copy files from a remote, use **git rscp** instead.

# SEE ALSO

[git-rscp](/man/git-rscp)(1), [scp](/man/scp)(1), [git-extras](/man/git-extras)(1)
