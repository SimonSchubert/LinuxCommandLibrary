# TAGLINE

initializes a Jujutsu repository with Git backend

# TLDR

**Initialize jj in existing Git repo**

```jj git init --git-repo=.```

**Create new jj repo with Git backend**

```jj git init [path]```

**Colocate with Git repo**

```jj git init --colocate```

# SYNOPSIS

**jj** **git** **init** [_options_] [_path_]

# PARAMETERS

**--git-repo** _path_
> Path to existing Git repository.

**--colocate**
> Create colocated jj/Git repo.

# DESCRIPTION

**jj git init** initializes a Jujutsu repository with Git backend. Can work alongside an existing Git repository, allowing both jj and git commands on the same repo. Creates .jj directory for jj metadata.

# SEE ALSO

[jj](/man/jj)(1), [jj-git-fetch](/man/jj-git-fetch)(1)

