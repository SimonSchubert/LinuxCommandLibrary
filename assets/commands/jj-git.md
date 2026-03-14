# TAGLINE

provides Git interoperability for Jujutsu

# TLDR

**Clone a Git repository**

```jj git clone [url]```

**Initialize jj in an existing Git repository (colocated)**

```jj git init --colocate```

**Fetch from all remotes**

```jj git fetch```

**Push current branch to remote**

```jj git push```

**Import Git refs into jj**

```jj git import```

**Export jj refs to Git**

```jj git export```

**Add a Git remote**

```jj git remote add [name] [url]```

# SYNOPSIS

**jj git** _subcommand_ [_options_]

# PARAMETERS

**clone** _URL_ [_DESTINATION_]
> Clone a Git repository and create a jj repo.

**init** [_DESTINATION_]
> Create a new Git-backed jj repository.

**fetch**
> Fetch from Git remotes.

**push**
> Push to a Git remote.

**import**
> Import Git refs (branches, tags) into jj's internal state.

**export**
> Export jj refs to Git refs.

**remote** _subcommand_
> Manage Git remotes (add, remove, list, rename).

**--remote** _NAME_
> Specify remote name.

**--branch** _BRANCH_
> Specify branch (for push/fetch).

**--help**
> Display help information.

# DESCRIPTION

**jj git** provides Git interoperability for Jujutsu (jj), a modern version control system. It enables cloning, fetching, pushing, and managing remotes on Git servers.

Jujutsu uses Git as its storage backend, so all explicit Git interop commands live under the **git** subcommand. The **init --colocate** option allows using jj alongside an existing .git directory, keeping both in sync.

# CAVEATS

Subcommand of jj. Requires Git backend. Some Git workflows (e.g., staging area) are handled differently by jj.

# SEE ALSO

[jj](/man/jj)(1), [jj-git-push](/man/jj-git-push)(1), [jj-git-clone](/man/jj-git-clone)(1), [git](/man/git)(1)
