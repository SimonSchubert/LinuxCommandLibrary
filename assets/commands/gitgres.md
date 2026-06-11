# TAGLINE

Store Git objects and refs inside PostgreSQL

# TLDR

**Initialize** a new repository inside the database

```gitgres-backend init "[dbname=gitgres]" [repo_name]```

**Push a local Git repo** into PostgreSQL

```gitgres-backend push "[dbname=gitgres]" [repo_name] [path/to/repo]```

**Clone** the database-backed repo back to disk

```gitgres-backend clone "[dbname=gitgres]" [repo_name] [path/to/dest]```

**List the refs** stored in the database

```gitgres-backend ls-refs "[dbname=gitgres]" [repo_name]```

**Import an existing repo** without compiling the backend

```./import/gitgres-import.sh [path/to/repo] "[dbname=gitgres]" [repo_name]```

# SYNOPSIS

**gitgres-backend** _command_ _connection_string_ _repo_name_ [_path_]

# DESCRIPTION

**gitgres** stores Git objects and refs as rows in **PostgreSQL** tables. A small **libgit2**-based backend (**gitgres-backend**) translates standard Git protocol operations such as **push** and **clone** into SQL, so existing Git clients work against a database instead of a filesystem.

The project's stated goal is to let Git forges (e.g. **Forgejo**, **Gitea**) drop their filesystem storage entirely and rely on the database for repositories, objects, refs, and reflog. The schema includes tables for repositories, objects, refs, and reflog, with helpers for hashing, the object store, and tree and commit parsing.

# COMMANDS

**init** _conn_ _repo_
> Create the database tables (if needed) and register a new repository named _repo_.

**push** _conn_ _repo_ _path_
> Push the on-disk Git repository at _path_ into the database under name _repo_.

**clone** _conn_ _repo_ _path_
> Materialize the database-backed repository _repo_ to a normal on-disk Git repository at _path_.

**ls-refs** _conn_ _repo_
> Print the refs currently stored in the database for _repo_.

# REQUIREMENTS

**PostgreSQL** with the **pgcrypto** extension is required. The backend links against **libgit2**, **libpq**, and **OpenSSL**. The shell-based importer (_./import/gitgres-import.sh_) needs only a working **psql** client and a Git checkout.

# CAVEATS

The project is research-grade: storing repositories in PostgreSQL incurs different I/O and locking patterns than a filesystem. Performance, vacuuming, and replication characteristics differ from traditional Git hosting and should be benchmarked before production use. Backups must include the database dump, not the working tree.

# HISTORY

**gitgres** was created by **Andrew Nesbitt** to explore eliminating filesystem dependencies for Git forges, motivated by the operational simplification of having a single backing store (PostgreSQL) for both metadata and Git data.

# SEE ALSO

[git](/man/git)(1), [psql](/man/psql)(1)
