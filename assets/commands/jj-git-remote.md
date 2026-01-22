# TLDR

**Add remote**

```jj git remote add [name] [url]```

**List remotes**

```jj git remote list```

**Remove remote**

```jj git remote remove [name]```

**Rename remote**

```jj git remote rename [old] [new]```

# SYNOPSIS

**jj git remote** _subcommand_ [_options_]

# PARAMETERS

**add** _NAME_ _URL_
> Add new remote.

**list**
> List configured remotes.

**remove** _NAME_
> Remove remote.

**rename** _OLD_ _NEW_
> Rename remote.

**--help**
> Display help information.

# DESCRIPTION

**jj git remote** manages Git remotes for Jujutsu repositories. It configures where to fetch and push changes.

The commands mirror Git remote management. Changes are stored in Git format for compatibility.

jj git remote manages remotes.

# CAVEATS

Subcommand of jj. Uses Git remote format. Standard Git hosting works.

# HISTORY

jj git remote is part of **Jujutsu**, providing remote management compatible with Git infrastructure.

# SEE ALSO

[jj](/man/jj)(1), [jj-git](/man/jj-git)(1), [git-remote](/man/git-remote)(1)
