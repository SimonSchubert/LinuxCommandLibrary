# TAGLINE

provides Git interoperability for Jujutsu

# TLDR

**Clone Git repository**

```jj git clone [url]```

**Fetch from remote**

```jj git fetch```

**Push to remote**

```jj git push```

**Import Git refs**

```jj git import```

**Export to Git refs**

```jj git export```

# SYNOPSIS

**jj git** _subcommand_ [_options_]

# PARAMETERS

**clone** _URL_
> Clone Git repository.

**fetch**
> Fetch from remotes.

**push**
> Push to remote.

**import**
> Import Git refs.

**export**
> Export to Git refs.

**--remote** _NAME_
> Remote name.

**--help**
> Display help information.

# DESCRIPTION

**jj git** provides Git interoperability for Jujutsu. It enables working with Git remotes and converting between formats.

The commands handle cloning, fetching, and pushing to Git servers. Jujutsu stores data in Git format internally.

# CAVEATS

Subcommand of jj. Git backend required. Some Git features differ.

# HISTORY

jj git is part of **Jujutsu**, providing seamless integration with Git repositories and hosting services.

# SEE ALSO

[jj](/man/jj)(1), [jj-git-push](/man/jj-git-push)(1), [jj-git-clone](/man/jj-git-clone)(1), [git](/man/git)(1)
