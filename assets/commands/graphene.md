# TAGLINE

Analytics CLI for Graphene SQL models and markdown dashboards

# TLDR

**Check** the project for diagnostics

```graphene check```

Compile Graphene SQL to **dialect SQL** without running it

```graphene compile "[from flights select count() as total]"```

**Run** an inline query and print a table

```graphene run "[from flights select count() as total]"```

Print query results as **CSV**

```graphene run "[from flights select count() as total]" --format [csv]```

Open a **markdown page**, screenshot it, and print the local URL

```graphene run [index.md]```

Start the **dev server** in the background

```graphene serve --bg```

**Stop** the background server

```graphene stop```

Inspect the connected database **schema**

```graphene schema```

# SYNOPSIS

**graphene** _command_ [_options_] [_arguments_]

# PARAMETERS

**check** [_file_]
> Lint `.gsql` models and markdown pages. With a path, check that file only.

**compile** [_input_]
> Translate Graphene SQL to dialect-specific SQL and print it. Input is a file path, an inline string, or `-` for stdin.

**run** [_input_] [**-c** _chart_] [**--param** _key=value_] [**--format** _table_|_csv_] [**--headless**]
> Run a query, or open a markdown page in a browser and save a screenshot. **--param** may be repeated. **--chart** is a chart/table title or a component id from **list**.

**list** _file_
> Print component ids for charts and tables on a markdown page, for **run -c**.

**schema** [_schema_|_table_]
> List datasets/schemas, or describe a table as a Graphene SQL `table` statement. Not for exploring modeled Graphene SQL.

**serve** [**--bg**]
> Start the local dashboard server. **--bg** detaches it.

**stop**
> Stop the background server started by **serve --bg** or **run** on a page.

**login**
> Log in to Graphene Cloud, or trigger Snowflake auth when Cloud is not configured.

**export** _file_ [**--param** _key=value_] [**-o** _path_]
> Export a **synced Cloud** markdown report as standalone HTML. Does not read local file contents.

**token**, **make-token** [**--ttl** _duration_]
> Create a Graphene Cloud access token for background agents (default TTL **30d**, range **5m**–**366d**).

**evals** [_eval-id_] [**--days** _N_]
> Read Cloud eval history as JSON (admins only).

**reviews** [_session-id_] [**--days** _N_]
> Read completed Cloud session reviews as JSON (admins only).

**install-browser** [**--with-deps**]
> Install the Playwright browser used by **run --headless**. Works outside a Graphene project.

**-v**, **--version**
> Print the CLI version.

# DESCRIPTION

**graphene** is the CLI for **Graphene**, an everything-as-code analytics framework aimed at coding agents. A project is a directory of **`.gsql`** semantic models (tables, joins, dimensions, measures) and **`.md`** dashboard pages. The CLI compiles Graphene SQL to the warehouse dialect, runs queries, checks files, and serves pages locally.

Install the published package **`@graphenedata/cli`** with npm, pnpm, yarn, or bun, then invoke **`graphene`** via that package manager (`npx graphene`, `pnpm graphene`, `npm exec graphene`). Supported warehouses include DuckDB (and MotherDuck), Postgres, Snowflake, BigQuery, ClickHouse, and Amazon Athena. Database clients are optional peer dependencies installed beside the CLI.

**run** on a `.md` file starts the local server if needed, opens the page, writes a PNG screenshot under the project cache, and prints a `http://localhost:...` URL (default port **4000**). Inline queries and stdin (`-`) run in-process and print a table or CSV. Running `.gsql` files directly is no longer supported.

# CONFIGURATION

Graphene reads a **`graphene`** object in the project's **`package.json`**. Restart **serve** after changing it. Secrets belong in an ignored **`.env`** file.

**duckdb**, **motherduck**, **postgres**, **snowflake**, **bigquery**, **clickhouse**, **athena**
> Exactly one connection block. The dialect is inferred from which block is present.

**defaultNamespace**
> Schema/dataset used for unqualified table names. Overridden by **GRAPHENE_DEFAULT_NAMESPACE**. Also accepted as **namespace**.

**port**
> Local server port. Default **4000**, or **GRAPHENE_PORT**.

**envFile**
> `.env` path or list of paths (default `['.env']`).

**ignoredFiles**
> Glob patterns skipped when discovering `.gsql` and `.md` files.

**cloud**
> Graphene Cloud URL (path selects the repo). Enables **login**, **export**, **token**, **evals**, and **reviews**.

**telemetry**, **updateNotifier**
> Set to `false` to opt out. **GRAPHENE_NO_UPDATE_NOTIFIER=1** also disables update notices.

# CAVEATS

Requires **Node.js 20+**. Most commands load project config from the current directory; **install-browser** is the exception.

**export**, **evals**, and **reviews** talk to Graphene Cloud, not local files. **export** writes HTML for the **synced** Cloud copy. **evals** and **reviews** need an admin login or admin **GRAPHENE_TOKEN**.

The software is licensed under the **Elastic License 2.0** for internal use. Distro packages named `graphene` are often unrelated (for example the GraphQL Python library).

# HISTORY

**Graphene** is developed by **Graphene Systems Inc**. The CLI is published on npm as **`@graphenedata/cli`** with the `graphene` binary. Graphene SQL is inspired by **Malloy**, expressed as SQL with modeled joins and measures.

# SEE ALSO

[npm](/man/npm)(1), [duckdb](/man/duckdb)(1), [dbt](/man/dbt)(1), [postgres](/man/postgres)(1)

# RESOURCES

```[Documentation](https://github.com/graphene-data/graphene/blob/main/docs/cli.md)```

```[Homepage](https://graphenedata.com)```

```[Source code](https://github.com/graphene-data/graphene)```

<!-- verified: 2026-10-03 -->
