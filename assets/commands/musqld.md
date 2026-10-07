# TAGLINE

Serve musql databases over the Hrana protocol

# TLDR

Serve **one database** (created if missing) on port 8080

```musqld -db [app.musq]```

Require a **bearer token**

```musqld -db [app.musq] -listen :8080 -auth-token "$MUSQLD_AUTH_TOKEN"```

Serve **every** `name.musq` in a directory, chosen by the request host

```musqld -dir [./dbs] -create -listen :8080```

Run the published **container** (database at `/data/app.musq`)

```docker run -p 8080:8080 -e MUSQLD_AUTH_TOKEN=secret -v musql:/data ghcr.io/samyfodil/musql```

# SYNOPSIS

**musqld** [**-db** _file_] [**-dir** _directory_] [**-create**] [**-listen** _addr_] [**-auth-token** _token_] [**-idle-timeout** _duration_]

# DESCRIPTION

**musqld** is the Hrana server for **musql**, an embedded SQL engine with a SQLite-compatible dialect and its own `.musq` segment files. libSQL and Turso clients speak Hrana, so they can point at **musqld** without a new protocol. HTTP, WebSocket, and `libsql://` URLs are accepted. The server implements Hrana 1–3 over HTTP and WebSocket, in JSON and Protobuf.

With **-db**, every request uses that one file. With **-dir**, the first label of the request host selects the file: `http://app.example.com:8080` opens `directory/app.musq`. **-create** makes a database the first time a new name is used. **-db** and **-dir** together are an error.

If neither flag is set, the server opens **musql.musq** in the working directory and creates it if needed. **-listen** defaults to `:8080`.

The engine does not open SQLite files. Convert them with **musql-convert** first, then pass the `.musq` path. The Go driver in the same project registers as `sqlite` and `musql` for in-process use; **musqld** is the separate network server.

Release archives on GitHub include the **musqld** binary. The container image `ghcr.io/samyfodil/musql` is a scratch image whose entrypoint is `/musqld -listen :8080` and whose default arguments are `-db /data/app.musq`.

# PARAMETERS

**-db** _file_

> Serve this one database. The file is created if it is missing. Exclusive with **-dir**.

**-dir** _directory_

> Serve `<name>.musq` files in this directory. The first label of the request host is _name_. Exclusive with **-db**.

**-create**

> With **-dir**, create a database on the first request for a new name.

**-listen** _addr_

> Address to listen on. Default `:8080`.

**-auth-token** _token_

> Require this bearer token. Default is the **MUSQLD_AUTH_TOKEN** environment variable. An empty token accepts any client.

**-idle-timeout** _duration_

> Close an HTTP stream after this long with no request. Default `10s`.

# CONFIGURATION

**MUSQLD_AUTH_TOKEN** is read when **-auth-token** is omitted. The Docker image does not set a token unless you pass that variable or override the command.

There is no configuration file. Storage limits for a connection use SQL on the database (`PRAGMA max_size = ` _bytes_), not a **musqld** flag.

# CAVEATS

An empty token means every client that can reach **-listen** can use the database. Do not publish port 8080 without a token.

**.musq** is not a SQLite file. Opening an unconverted `.db` fails. SQL that **musql** accepts is a separate question from file compatibility: the server stores segments, not SQLite pages.

**-db** and **-dir** cannot be combined. The process logs a fatal error and exits.

`PRAGMA max_page_count` is declined by the engine. Cap size with `PRAGMA max_size`.

The server process stays in the foreground and exits when the listener fails. It is a single Go binary (CGO disabled in the container build).

# HISTORY

**musqld** ships with **musql** ("muscle"), an Apache-2.0 Go project by **samyfodil**. GitHub release **v0.1.1** was published on **6 October 2026**. **v0.2.0** and **v0.2.1** followed on **7 October 2026**. The container build uses Go **1.27**.

# SEE ALSO

[musql-convert](/man/musql-convert)(1), [sqlite3](/man/sqlite3)(1), [postgres](/man/postgres)(1), [redis-server](/man/redis-server)(1), [docker](/man/docker)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/samyfodil/musql)```

```[Documentation](https://github.com/samyfodil/musql/blob/main/README.md)```

<!-- verified: 2026-10-07 -->
