# TAGLINE

Personal chess database with engine analysis and an MCP coach

# TLDR

**Serve** the web app, API, analysis workers, and `/mcp`

```blunderbase serve --host 0.0.0.0 --port 8765```

Import games from a **Lichess** account

```blunderbase import lichess [username]```

Import a **PGN file** of someone else's games (study only, not statistics)

```blunderbase import pgn [path/to/games.pgn] --not-mine```

Register which username is **yours**

```blunderbase accounts add lichess [username]```

Register a **Stockfish** binary and assign the quick and deep roles

```blunderbase engines add sf-local stockfish --option Threads=4 --role quick --role deep```

Queue and run **deep analysis** for up to 50 pending games

```blunderbase analyze --tier deep --limit 50```

Set or **reset the owner password** (prompted twice, never echoed)

```blunderbase set-password```

Write an integrity-checked **database backup**

```blunderbase db backup [path/to/blunderbase.db]```

Run the **MCP coach** on stdio for a local client

```blunderbase mcp```

Print the **version**

```blunderbase --version```

# SYNOPSIS

**blunderbase** [_--version_] _command_ [_options_]

# PARAMETERS

**serve**
> Run the HTTP API, web app, `/events` socket, `/mcp`, and analysis workers.

**--host** _address_
> Bind address for **serve** (default `BLUNDERBASE_HOST`, usually `127.0.0.1`; the Docker image uses `0.0.0.0`).

**--port** _port_
> Bind port for **serve** (default `BLUNDERBASE_PORT`, `8765`).

**--reload**
> Restart **serve** when source files change (development).

**import** _source_ [_target_]
> Import games. _source_ is `lichess`, `chesscom`, `fics`, or `pgn`. _target_ is the account to sync, or the PGN file to read.

**--username** _name_
> Account to sync instead of the positional target.

**--path** _file_
> PGN file instead of the positional target.

**--since** _cursor_
> Resume from this cursor instead of the stored one. `all` reads the whole archive.

**--max-games** _N_
> Stop after N games.

**--not-mine**
> Store PGN games for study without counting them in statistics.

**accounts list**
> Print every registered account and how many games are attributed to it.

**accounts add** _platform_ _username_
> Register an account and claim games it has already played. _platform_ is `lichess`, `chesscom`, `fics`, or `otb`.

**accounts reconcile**
> Re-run owner attribution over games already stored. Idempotent; does not revise a game whose side is already known.

**runners list**
> List remote engine runners, advertised engines, and backlog.

**runners create** _name_
> Register a runner and print its token and `runner.yaml` once (only a hash is stored).

**runners revoke** _name_
> Delete a runner, its token, and the engines it advertised.

**--slots** _N_
> Engine jobs at once when creating a runner (default 1).

**--server** _url_
> How the runner reaches this server (default `BLUNDERBASE_PUBLIC_URL`).

**engines list**
> List engine binaries on this machine, where they live, and which roles they serve.

**engines add** _name_ _path_
> Register a binary. _path_ may be a file, a command line with arguments, or a name on `PATH`.

**engines remove** _name_
> Delete an engine row and unqueue work only it could run.

**--kind** _{uci,maia}_
> Engine kind for **engines add** (default `uci`).

**--option** _NAME=VALUE_
> UCI option, validated against what the binary declares. Repeatable.

**--role** _{quick,deep,human}_
> Assign a role, taking it from whatever holds it. Repeatable.

**--replace**
> Update an existing engine of that name instead of refusing, and enable it.

**--disabled**
> Register an engine without switching it on.

**analyze**
> Enqueue engine analysis and drain the queue in this process. Safe while the server is up; the queue is rows in the database.

**--game-id** _N_
> Analyse one game instead of every pending game.

**--tier** _{quick,deep}_
> Analysis pass (default `quick`).

**--fen** _fen_
> Analyse one position instead of a game.

**--ply-range** _START:END_
> Half-move window for a deep pass (end exclusive).

**--multipv** _N_
> Lines to keep.

**--nodes** _N_
> Per-position node budget.

**--limit** _N_
> Queue at most N games.

**--queue-only**
> Enqueue without running workers.

**--timeout** _seconds_
> Give up waiting (default 3600).

**mcp**
> Run the MCP coach as its own process. **serve** already mounts `/mcp`; this is for a local client over stdio.

**--transport** _{stdio,http}_
> MCP transport (default `stdio`). `http` needs `BLUNDERBASE_MCP_BEARER_KEY`.

**set-password**
> Set or replace the owner's browser password. Asked twice, never echoed. Signs every open session out when replacing.

**db upgrade**
> Apply pending SQLite migrations. Safe on an older backup; a no-op at the current revision.

**db backup** _output_
> Write an integrity-checked copy of the complete database. **--force** replaces an existing output file.

**db restore** _input_
> Replace the configured database with an integrity-checked backup. Stop every process using that file first. **--force** is required to overwrite.

**db rebuild-cards**
> Recompute the stored card of every analysed game.

**db rebuild-stats**
> Recompute the stored stat summary of every analysed game.

**db rebuild-book**
> Recompute the explorer's precomputed opening book.

**demo create**
> Build an anonymized, separate database for a read-only public demo.

**--version**
> Print the version and exit.

# DESCRIPTION

**blunderbase** is a personal chess database. It imports games from Lichess, Chess.com, FICS, and PGN files, analyses them with UCI engines (typically Stockfish) and optionally Maia, and stores games, evaluations, notes, and statistics in one SQLite file you own.

The same library is used three ways: a web app (board, games list, explorer, statistics), an MCP server so an assistant can read the identical data, and this CLI for import, engines, analysis, backup, and headless setup. Everything is one process on one port (default **8765**). A companion binary, **blunderbase-runner**, runs engines on another machine and dials the server.

Typical deployment is the Docker image `ghcr.io/philphilphil/blunderbase:latest` (ships Stockfish; data in `/data`, database `/data/blunderbase.db`). Prefix CLI commands with `docker exec -it blunderbase` against a running container. Desktop installers exist for macOS and Windows; they bundle the app but ship no engine binary and have no MCP endpoint.

The first visitor to a fresh installation chooses the owner password (at least eight characters). There is no second account. MCP clients use minted keys (`bb_mcp_…`) or `BLUNDERBASE_MCP_BEARER_KEY`, not the browser password.

# CONFIGURATION

Every setting is an environment variable with a `BLUNDERBASE_` prefix. Empty means unset (the default applies). Engine budgets, classification thresholds, Maia rating, auto-sync interval, and the Lichess explorer token live in the database and are edited in the app.

**BLUNDERBASE_DB_PATH**
> SQLite library file. Default `<data dir>/blunderbase.db` (`/data/blunderbase.db` in Docker). Decides which library every CLI command touches.

**BLUNDERBASE_DATA_DIR**
> Uploaded PGN files, downloaded engines, and weights. Default `<root>/data`.

**BLUNDERBASE_HOST** / **BLUNDERBASE_PORT**
> Bind address and port for **serve** (defaults `127.0.0.1` and `8765`).

**BLUNDERBASE_PUBLIC_URL**
> How the installation is reached from outside. Written into `runner.yaml` when creating a runner.

**BLUNDERBASE_RUNTIME_MODE**
> `server` (default), `desktop`, or `demo`. `demo` is read-only: no password, no `/mcp`, writes return 403.

**BLUNDERBASE_MCP_BEARER_KEY**
> Extra token `/mcp` accepts, alongside keys minted on the Assistant page.

**BLUNDERBASE_ANALYSIS_WORKERS**
> Whether this process runs analysis workers (default `true`). Turn off when draining the queue with **blunderbase analyze** on another schedule.

**BLUNDERBASE_ANALYSIS_CONCURRENCY**
> Engine processes at once (default: cores minus two, never below 1).

# CAVEATS

Python 3.12+ for a source install (`uv run blunderbase …`). Docker is the supported server path. Restore replaces the database under the process: stop Blunderbase first; **--force** is required to overwrite. Backups include hashed credentials — store them like a password. The three **db rebuild-*** commands are never required for correctness; **serve** already sweeps stats and the book at start-up. Releases through **v0.9.0** were MIT; later releases are **AGPL-3.0-or-later**.

# HISTORY

Written by **Phil Baum**. Public versions began in **August 2026**; **v1.0.0** was cut on **2026-09-06**. The backend is Python (FastAPI, SQLAlchemy, SQLite WAL); the frontend is React. Licence changed from MIT to AGPL-3.0-or-later in **v0.12.0** (2026-09-05).

# SEE ALSO

[gnuchess](/man/gnuchess)(1), [sqlite3](/man/sqlite3)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/philphilphil/blunderbase)```

```[Homepage](https://blunderbase.org)```

```[Documentation](https://blunderbase.org/manual/)```

<!-- verified: 2026-09-08 -->
