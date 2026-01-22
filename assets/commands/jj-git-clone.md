# TLDR

**Clone repository**

```jj git clone [url]```

**Clone to specific directory**

```jj git clone [url] [directory]```

**Clone with colocated Git**

```jj git clone --colocate [url]```

# SYNOPSIS

**jj git clone** [_options_] _url_ [_directory_]

# PARAMETERS

_URL_
> Git repository URL.

_DIRECTORY_
> Target directory.

**--colocate**
> Create colocated jj/Git repo.

**--help**
> Display help information.

# DESCRIPTION

**jj git clone** clones a Git repository into a Jujutsu workspace. It fetches all branches and creates the jj internal structure.

The colocate option keeps Git and jj data together. This enables using both tools on the same repository.

jj git clone clones Git repos.

# CAVEATS

Subcommand of jj. Creates jj workspace. Colocate for dual Git/jj use.

# HISTORY

jj git clone is part of **Jujutsu**, enabling seamless cloning from any Git hosting service.

# SEE ALSO

[jj](/man/jj)(1), [jj-git](/man/jj-git)(1), [git-clone](/man/git-clone)(1)
