# TLDR

**Initialize new repository**

```fossil init [repo.fossil]```

**Clone a repository**

```fossil clone [url] [repo.fossil]```

**Open repository in directory**

```fossil open [repo.fossil]```

**Check status**

```fossil status```

**Add files**

```fossil add [file]```

**Commit changes**

```fossil commit -m "[message]"```

**View timeline**

```fossil timeline```

**Start web UI**

```fossil ui```

# SYNOPSIS

**fossil** _command_ [_options_] [_args_]

# SUBCOMMANDS

**init**
> Create new repository.

**clone**
> Clone a repository.

**open**
> Open repository checkout.

**status**
> Show working copy status.

**add**
> Add files.

**commit**
> Record changes.

**pull**
> Pull from remote.

**push**
> Push to remote.

**sync**
> Sync with remote.

**ui**
> Start web interface.

**timeline**
> Show commit history.

# DESCRIPTION

**fossil** is a distributed version control system with integrated bug tracking, wiki, and web interface. Created for the SQLite project. Stores everything in a single SQLite database file.

# SEE ALSO

[git](/man/git)(1), [hg](/man/hg)(1)

