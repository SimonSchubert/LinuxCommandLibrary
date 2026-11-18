# TAGLINE

Private forum in one Go binary and a SQLite file

# TLDR

**Start** on port 8080 with a database in the current directory

```soliloquy```

Listen on **localhost** and name the public URL

```soliloquy -listen [127.0.0.1:8080] -base-url [https://forum.example.com]```

Keep the database **somewhere else**

```soliloquy -db [/var/lib/soliloquy/soliloquy.db] -base-url [https://forum.example.com]```

# SYNOPSIS

**soliloquy** [**-listen** _ADDR_] [**-db** _PATH_] [**-base-url** _URL_] [**-allow-any-origin**]

# DESCRIPTION

**soliloquy** serves a small invite-only forum: threads, nested comments, votes, mentions, Markdown, full-text search, and live updates. It is one Go process and one SQLite file. It does not terminate TLS. Put **caddy** or **nginx** in front of it.

Each release publishes Linux and macOS binaries for amd64 and arm64, and a container image at **ghcr.io/skorokithakis/soliloquy**. A local build is **go build -o soliloquy .** with Go 1.24 or later, and with CGO turned off (CGO then ENABLED, joined with an underscore, set to 0). No C compiler is required.

Flags win over environment variables, which win over the defaults. The listen address defaults to **:8080**, the database to **soliloquy.db** in the current directory, and the public URL to **http://localhost:8080**.

On an empty database the process writes a one-time admin invite URL to the log. Open it to create the first account. Each restart before that account exists mints a new URL and invalidates the previous one. Later members invite people from the "My invites" page.

The forum is private until an admin opens **/admin/settings** and makes it public. Public visitors can read the front page, threads, and search. They cannot post, vote, comment, or receive live updates. Admins can also rename the forum there.

Run one process only. Live updates go through an in-memory hub, so a second instance would not see the first one's events. Login throttling is also in memory and resets on restart.

The database uses WAL mode. Copying the file while the process is running can miss recent writes that are still in the WAL. Use SQLite's **.backup**, or stop the process and copy the file. The license is AGPL-3.0.

# PARAMETERS

**-listen** _ADDR_
> Address passed to the HTTP server, for example **:8080** or **127.0.0.1:8080**. Default: **:8080**. Environment: **SOLILOQUY** then **LISTEN** then **ADDR**, joined with underscores.

**-db** _PATH_
> SQLite file. Default: **soliloquy.db**. Environment: **SOLILOQUY** then **DB** then **PATH**, joined with underscores.

**-base-url** _URL_
> Exact public URL users type, with no trailing slash stored. Used to build invite and password-reset links, and to check the **Origin** header on form posts. Scheme must be **http** or **https**, and the host must be present. Default: **http://localhost:8080**. Environment: **SOLILOQUY** then **BASE** then **URL**, joined with underscores.

**-allow-any-origin**
> Accept POST requests from any **Origin**. This disables CSRF protection. For QA and debugging servers. Environment: the same prefix plus **ALLOW** then **ANY** then **ORIGIN**, joined with underscores. A non-empty value must parse as a boolean.

**-h**
> Print flag help and exit **0**.

# CAVEATS

A wrong **-base-url** makes every form post fail with 403, because the **Origin** check compares against that URL.

The server's read-header timeout is **10** seconds. On SIGINT or SIGTERM it stops accepting and gives in-flight requests, including live event streams, **10** seconds to finish.

Request logs and the first-admin invite go to the standard logger. A failed start exits **1**.

RSS feeds are **/feeds/threads**, **/feeds/comments**, and **/feeds/notifications**. On a private forum each feed needs the member's token from the account page. The notifications feed always needs that token. A read-only JSON API is **/api/threads** and **/api/threads/{id}**, with the same access rules.

Desktop notifications and ntfy pushes are settings on the account page, not command-line flags.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [caddy](/man/caddy)(1), [nginx](/man/nginx)(1)

# RESOURCES

```[Source code](https://github.com/skorokithakis/soliloquy)```

<!-- verified: 2026-11-18 -->
