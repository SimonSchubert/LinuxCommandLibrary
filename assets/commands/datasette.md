# TAGLINE

tool for exploring and publishing SQLite databases

# TLDR

**Serve a SQLite database**

```datasette [database.db]```

**Serve multiple databases**

```datasette [db1.db] [db2.db]```

**Serve on specific port**

```datasette -p [8080] [database.db]```

**Serve with read-only mode** (default)

```datasette --immutable [database.db]```

**Create database package for deployment**

```datasette package [database.db] -t [myapp:latest]```

**Install a plugin**

```datasette install [datasette-vega]```

**Publish to cloud provider**

```datasette publish [cloudrun] [database.db] --service=[myservice]```

# SYNOPSIS

**datasette** [_options_] _database.db_...

# PARAMETERS

**-p**, **--port** _port_
> Port to serve on (default: 8001).

**-h**, **--host** _host_
> Host to bind to (default: 127.0.0.1).

**--immutable** _db_
> Mark database as immutable (enables caching).

**-m**, **--metadata** _file_
> YAML/JSON metadata file.

**--load-extension** _ext_
> Load SQLite extension.

**-o**, **--open**
> Open browser on startup.

**--cors**
> Enable CORS headers.

**--setting** _key_ _value_
> Set configuration option.

**--secret** _secret_
> Secret key for signing.

**serve**
> Serve databases (default command).

**publish** _target_
> Deploy to cloud (cloudrun, vercel, heroku, fly).

**package**
> Create Docker image.

**install** _plugin_
> Install Datasette plugin.

# DESCRIPTION

**Datasette** is a tool for exploring and publishing SQLite databases as interactive websites and JSON APIs. It instantly creates a browsable interface for any SQLite database with faceted search, SQL querying, and automatic API endpoints.

Every table gets a paginated HTML view, JSON API, and CSV export. Custom SQL queries can be executed through the web interface. Plugins extend functionality with visualization, authentication, and data transformation.

Datasette excels at publishing data: government datasets, research data, logs, and any structured data. The publish command deploys to cloud platforms with a single command.

# CAVEATS

Designed for read-only access by default; write operations require plugins and configuration. Large databases may need optimization for performance. Some SQLite features (full-text search) require building with extensions. Public deployment needs authentication consideration.

# HISTORY

Datasette was created by **Simon Willison** (co-creator of Django) and first released in **2017**. It emerged from his interest in data journalism and making databases accessible. The project pioneered the concept of "small data" publishing and has been used for journalism, government transparency, and data exploration. Datasette won a Mozilla Open Source Award in **2021**.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [csvs-to-sqlite](/man/csvs-to-sqlite)(1), [sqlite-utils](/man/sqlite-utils)(1)
