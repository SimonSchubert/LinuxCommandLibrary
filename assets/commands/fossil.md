# TAGLINE

distributed version control with integrated project management

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

# CONFIGURATION

**_FOSSIL_**
> SQLite database file containing repository, wiki, tickets, and all metadata.

**~/.fossil**
> User settings and global ignore patterns.

# DESCRIPTION

**fossil** is a distributed version control system designed for software projects, combining source control with bug tracking, wiki documentation, and web-based project management in a single tool. Unlike Git, Fossil stores everything in a single SQLite database file.

Created by D. Richard Hipp for managing the SQLite project, Fossil emphasizes simplicity and self-containment. The repository file includes complete project history, tickets, wiki pages, and technical notes. This design makes backups trivial and eliminates synchronization issues between separate systems.

Fossil includes a built-in web interface accessible via **fossil ui**, providing browsing, ticket management, and wiki editing without external tools. The system uses content-addressable storage and cryptographic checksums to ensure data integrity.

The autosync feature keeps repositories synchronized automatically, simplifying distributed development. Fossil's branching model encourages feature branches and includes timeline visualization showing development history graphically.

# CAVEATS

Different workflow from Git requires adjustment. Single repository file can grow large for projects with many binary assets. Less ecosystem support than Git for integrations and tools.

# HISTORY

**Fossil** was created by **D. Richard Hipp** in **2006** to manage the SQLite project. Frustrated with existing version control systems, Hipp designed Fossil to integrate all project management needs into one tool. It has been the primary version control for SQLite and other projects since its inception.

# SEE ALSO

[git](/man/git)(1), [hg](/man/hg)(1)

