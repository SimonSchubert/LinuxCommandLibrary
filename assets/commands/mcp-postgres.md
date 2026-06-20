# TAGLINE

MCP server exposing PostgreSQL tools to AI assistants

# TLDR

**Start in stdio mode** for Claude Desktop integration

```mcp-postgres --database-url "[postgres://user:pass@localhost:5432/dbname]" --stdio```

**Start a TCP server** on the default port

```mcp-postgres --database-url "[postgres://user:pass@localhost:5432/dbname]"```

**Start an HTTP/2 server**

```mcp-postgres --database-url "[postgres://user:pass@localhost:5432/dbname]" --http-port [3001]```

**Use restricted access mode** for production databases

```mcp-postgres --database-url "[postgres://user:pass@localhost:5432/dbname]" --access-mode restricted```

**Enable Prometheus metrics**

```mcp-postgres --database-url "[postgres://user:pass@localhost:5432/dbname]" --enable-metrics --metrics-port [9090]```

# SYNOPSIS

**mcp-postgres** **--database-url** _URL_ [_options_]

# PARAMETERS

**-d**, **--database-url** _URL_
> PostgreSQL connection string (required)

**--stdio**
> Run in stdio mode for Claude Desktop and compatible MCP clients

**-H**, **--host** _host_
> TCP server bind address (default: 127.0.0.1)

**-p**, **--port** _port_
> TCP server port (default: 3000)

**--http-port** _port_
> HTTP/2 server port (default: 3001)

**--min-connections** _n_
> Minimum connection pool size (default: 5)

**--max-connections** _n_
> Maximum connection pool size (default: 20)

**--log-level** _level_
> Log verbosity: trace, debug, info, warn, error (default: info)

**--access-mode** _mode_
> Security level: `unrestricted` (all SQL allowed) or `restricted` (safe queries only)

**--enable-metrics**
> Activate Prometheus metrics endpoint

**--metrics-port** _port_
> Prometheus metrics server port (default: 9090)

**--tls-cert** _path_
> PEM certificate file for HTTPS

**--tls-key** _path_
> PEM private key file for HTTPS

**-V**, **--version**
> Show version number

# DESCRIPTION

**mcp-postgres** is a Model Context Protocol (MCP) server that connects AI assistants such as Claude to a PostgreSQL database. It exposes over 135 tools covering query execution, schema inspection, DDL operations, data management, monitoring, and security auditing.

The server supports three transport modes: **stdio** for direct integration with Claude Desktop and compatible MCP clients, **TCP** for network-accessible deployments on port 3000, and **HTTP/2** for web-based clients on port 3001. Connection pooling is managed automatically with configurable minimum and maximum pool sizes.

Install via Cargo with `cargo install mcp-postgres`, or on macOS via Homebrew with `brew tap corporatepiyush/mcp-postgres && brew install mcp-postgres`.

# CAVEATS

The `unrestricted` access mode permits all SQL operations including DDL statements and destructive queries. Use `restricted` mode when connecting to production databases. Ensure the PostgreSQL user has only the minimum required privileges regardless of the access mode setting.

# SEE ALSO

[psql](/man/psql)(1), [pg_dump](/man/pg_dump)(1)

# RESOURCES

```[Source code](https://github.com/corporatepiyush/mcp-pg-rust)```

<!-- verified: 2026-06-20 -->
