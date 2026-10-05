# TAGLINE

Interactive Datalog shell for an embedded graph database

# TLDR

Start an **in-memory** console (discarded on exit)

```minigraf```

**Open or create** a database file

```minigraf --file [app.graph]```

Load a **startup script**, then open the prompt

```minigraf --init [rules.datalog] --file [app.graph]```

**Assert facts** from a pipe

```echo '(transact [[:alice :person/name "Alice"] [:bob :person/name "Bob"] [:alice :friend :bob]])' | minigraf --file [app.graph]```

**Query** a relationship

```echo '(query [:find ?name :where [:alice :friend ?f] [?f :person/name ?name]])' | minigraf --file [app.graph]```

Read the database **as of an earlier transaction**

```echo '(query [:find ?age :as-of 1 :where [:alice :person/age ?age]])' | minigraf --file [app.graph]```

# SYNOPSIS

**minigraf** [**--file** _PATH_] [**--init** _PATH_]

# PARAMETERS

**--file** _PATH_
> Open or create a `.graph` file. A write-ahead log is kept beside it as `_PATH_.wal`. Without this flag the database stays in memory.

**--init** _PATH_
> Run each Datalog command in _PATH_ before reading stdin. Errors are printed and the rest of the file still runs. A missing file is reported, then the console still starts.

# COMMANDS

At a terminal the banner includes the crate version and the prompt is `minigraf>`. A form with unmatched parentheses continues on the next line. Blank lines, and lines starting with `#` or `;`, are skipped. **EXIT** (any letter case) or Ctrl-D quits. If stdin is not a terminal, the banner and prompts are omitted and the process exits at end of input.

**(transact** [_time-map_] _facts_**)**: Assert facts. Each fact is `[:entity :attribute value]`. The optional map sets valid time, for example `{:valid-from "2024-01-15" :valid-to "2025-01-01"}`.

**(retract** _facts_**)**: Retract facts.

**(query** `[:find` _vars_ `:where` _patterns_`]`**)**: Run a query. `:as-of` takes a transaction counter or a UTC timestamp. `:valid-at` takes a date, or `:any-valid-time` to ignore validity. Without `:valid-at`, only facts that are currently valid are returned.

**(rule** `[(`_name_ _args_`)` _body_`]`**)**: Register a rule for later queries in this process.

# DESCRIPTION

**minigraf** is the command-line console for Minigraf, a single-file embedded graph database (MIT or Apache-2.0) by Aditya Mukhopadhyay. Data is stored as entity-attribute-value facts and queried with Datalog, including recursive rules and bi-temporal filters: transaction time (when a fact was recorded) and valid time (when it was true).

The published crate includes this binary. From a source checkout, `cargo run --bin minigraf` starts the same program, and `cargo install minigraf` installs it onto `PATH`. Rust, Python, and other language bindings talk to the library API. They are not this shell.

The shell always opens with library defaults. Each committed write on a file is fsynced, a crash replays `_PATH_.wal` on the next open, and a file lock refuses a second opener. Durability and cache knobs exist only on the library `OpenOptions` API.

A successful `transact` or `retract` prints its transaction id. Query results are tab-separated columns, followed by a result count, or the line `No results found.`

# CAVEATS

With no **--file**, nothing is saved.

Rules are process-local. They are not written to the `.graph` file or its log, so the next launch does not reload them. Pass **--init** when a session needs the same rules again.

On the 2.x file format, asserting or retracting two values of the same attribute for one entity inside a single `transact` or `retract` can keep only one of them. Use a separate call per value.

A file-backed fact must serialise to at most 4080 bytes. String values are limited to roughly 3900 to 4000 bytes once entity and attribute names are counted. Larger facts are rejected. In-memory databases have no size limit.

There is no **--help** or **--version**. Arguments other than **--file** and **--init** are ignored. Either flag without a path exits with status 1.

Minigraf is not a server: no network protocol, no clustering. The `wasm32-wasip1` build ignores **--file** and **--init** and is always in memory.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [duckdb](/man/duckdb)(1), [cypher-shell](/man/cypher-shell)(1)

# RESOURCES

```[Source code](https://github.com/project-minigraf/minigraf)```

```[Documentation](https://github.com/project-minigraf/minigraf/wiki/Datalog-Reference)```

<!-- verified: 2026-10-05 -->
