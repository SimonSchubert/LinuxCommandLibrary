# TAGLINE

initializes a Jujutsu repository with Git backend

# TLDR

**Create a new colocated jj/Git repo (default)**

```jj git init```

**Create a new jj repo at a specific path**

```jj git init [path]```

**Initialize jj using an existing Git repo as the backing store**

```jj git init --git-repo=[path/to/git-repo]```

# SYNOPSIS

**jj** **git** **init** [_options_] [_path_]

# PARAMETERS

**--colocate**
> Create a colocated jj/Git repo. This is the default unless `git.colocate` config is set to false.

**--git-repo** _path_
> Path to an existing Git repository to use as the backing store. Mutually exclusive with --colocate.

# DESCRIPTION

**jj git init** initializes a Jujutsu repository with a Git backend. By default it creates a colocated repo where both `.jj` and `.git` directories exist, allowing both jj and git commands to work on the same repo. IDE Git integration works as-is in colocated mode.

# SEE ALSO

[jj](/man/jj)(1), [jj-git-clone](/man/jj-git-clone)(1), [jj-git-fetch](/man/jj-git-fetch)(1), [git](/man/git)(1)

