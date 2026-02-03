# TLDR

**Clone a repository**

```glab repo clone [owner/repo]```

**Create a new repository**

```glab repo create [name]```

**Fork a repository**

```glab repo fork [owner/repo]```

**View repository details**

```glab repo view [owner/repo]```

**Archive repository**

```glab repo archive [owner/repo]```

**Search for repositories**

```glab repo search [query]```

# SYNOPSIS

**glab** **repo** _command_ [_options_]

# SUBCOMMANDS

**clone**
> Clone a repository.

**create**
> Create new repository.

**fork**
> Fork a repository.

**view**
> View repository details.

**archive**
> Download repository archive.

**search**
> Search for repositories.

**delete**
> Delete a repository.

# PARAMETERS

**--public**
> Create as public repository.

**--private**
> Create as private repository.

**--description** _text_
> Repository description.

**--clone**
> Clone after forking.

# DESCRIPTION

**glab repo** manages GitLab repositories from the command line. Clone, create, fork, and view repositories without leaving the terminal.

# SEE ALSO

[glab](/man/glab)(1), [git-clone](/man/git-clone)(1)

