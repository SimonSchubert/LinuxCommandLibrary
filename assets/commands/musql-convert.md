# TAGLINE

Convert between SQLite files and musql segment databases

# TLDR

Import a **SQLite** database into musql's format

```musql-convert import [app.db] [app.musq]```

Import even when **integrity_check** fails

```musql-convert import -force [app.db] [app.musq]```

Export a **.musq** database back to SQLite

```musql-convert export [app.musq] [exported.db]```

Choose the SQLite **page size** on export

```musql-convert export -page-size 4096 [app.musq] [exported.db]```

# SYNOPSIS

**musql-convert import** [**-force**] _in.db_ _out.musq_

**musql-convert export** [**-page-size** _n_] _in.musq_ _out.db_

# DESCRIPTION

**musql-convert** copies a database between the SQLite file format and **musql**'s `.musq` segment format. It is the only program in the musql repository that reads or writes a SQLite file. The SQL engine and **musqld** open `.musq` files only.

**import** reads a SQLite database and writes a musql database. **export** reads a musql database and writes a SQLite file that other SQLite tools can open.

Both directions take exactly two paths. A missing subcommand, the wrong number of paths, or an unknown subcommand prints the usage to stderr and exits **2**. A conversion error is printed as `musql-convert:` plus the message and exits **1**.

From a checkout of the module that contains the converter:

```go install github.com/samyfodil/musql/cmd/musql-convert@latest```

GitHub release archives also include the **musql-convert** binary next to **musqld**.

# PARAMETERS

**import** _in.db_ _out.musq_

> Read a SQLite database and write a musql database.

**-force**

> Import a source that fails `integrity_check`. Without this flag that source is refused.

**export** _in.musq_ _out.db_

> Read a musql database and write a SQLite file.

**-page-size** _n_

> Page size of the SQLite file written by **export**. **0** (the default) keeps the database's own page size.

# CAVEATS

The engine never opens a SQLite file in place. After **import**, applications and **musqld** must use the `.musq` path. A Go program using the musql driver opens it with `sql.Open("sqlite", "app.musq")` or the `musql` driver name. That driver name is the in-process registration, not this command.

SQL compatibility and file compatibility are separate. A database that converts can still use storage behavior that is not SQLite's, including page-count pragmas. `PRAGMA max_page_count` is declined; musql uses `PRAGMA max_size` in bytes.

**-force** writes a database whose source already failed SQLite's integrity check. Check the result before serving it.

The Go flag parser accepts one or two dashes (`-force` and `--force`). The usage line prints the single-dash form.

# HISTORY

**musql-convert** ships with **musql** ("muscle"), an Apache-2.0 project by **samyfodil**. Release **v0.2.1** was published on **7 October 2026**. Building from source needs Go **1.27** or newer, matching the rest of the repository.

# SEE ALSO

[musqld](/man/musqld)(1), [sqlite3](/man/sqlite3)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/samyfodil/musql)```

```[Documentation](https://github.com/samyfodil/musql/blob/main/README.md)```

<!-- verified: 2026-10-07 -->
