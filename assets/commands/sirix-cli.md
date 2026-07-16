# TAGLINE

command-line client for SirixDB bitemporal databases

# TLDR

**Create** a JSON database and resource

```sirix-cli -l /tmp/mydb create json -r myresource -d '{"name": "Alice"}'```

**Query** a resource

```sirix-cli -l /tmp/mydb query -r myresource```

Run a **JSONiq** expression ($$ is the document root)

```sirix-cli -l /tmp/mydb query -r myresource '$$.name'```

**Update** and create a new revision

```sirix-cli -l /tmp/mydb update -r myresource '{"team": "engineering"}' -im as-first-child```

Query a **previous revision**

```sirix-cli -l /tmp/mydb query -r myresource -rev 1```

Show **revision history** for a resource

```sirix-cli -l /tmp/mydb resource-history myresource```

# SYNOPSIS

**sirix-cli** **-l** _path_ _COMMAND_ [_ARGS_] [_OPTIONS_]

# PARAMETERS

**-l** _path_
> Local database path (directory)

**create** _type_ **-r** _resource_ **-d** _data_
> Create a database resource (for example **json**) with initial document data

**query** **-r** _resource_ [_expression_]
> Read the resource; optional JSONiq/XQuery expression; **-rev** selects a revision

**update** **-r** _resource_ _data_ **-im** _mode_
> Apply an update that creates a new revision

**resource-history** _resource_
> List revision history for a resource

# DESCRIPTION

**sirix-cli** is the full-featured command-line interface for **SirixDB**, an embeddable, append-only, bitemporal database that stores every commit as a space-efficient snapshot via structural sharing. Unlike tools that overwrite current state, SirixDB keeps full history so any past revision can be opened as quickly as the latest.

The CLI operates on a local database directory (**-l**), creating JSON (or XML) resources, running JSONiq/XQuery queries, applying updates that produce new revisions, and inspecting history. It complements **sirix-shell** (interactive query REPL) and the REST API / MCP server for remote and agent use.

# CAVEATS

SirixDB requires a modern Java runtime (or a GraalVM native build of the CLI). Write concurrency is one writer per resource; readers are snapshot-isolated. Paths and storage layout are managed by SirixDB under the database directory—do not manually edit those files while the database is open.

# HISTORY

**SirixDB** is an open-source bitemporal storage system maintained by Johannes Lichtenberger and contributors; **sirix-cli** is the Kotlin CLI module in the main **sirix** repository.

# SEE ALSO

[sirix-shell](/man/sirix-shell)(1), [java](/man/java)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/sirixdb/sirix)```

```[Homepage](https://sirix.io)```

```[Documentation](https://sirix.io/docs/)```

<!-- verified: 2026-07-16 -->
