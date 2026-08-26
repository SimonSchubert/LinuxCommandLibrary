# TAGLINE

CLI for the LatticeDB embedded graph, vector, and full-text database

# TLDR

**Create** a new database file

```lattice create [knowledge.lattice]```

**Import** graph data from JSON

```lattice import [knowledge.lattice] --file [graph.json]```

Print **node/edge counts**

```lattice count [knowledge.lattice]```

**Run** a Cypher file

```lattice exec [knowledge.lattice] --file [query.cypher]```

**Check** page checksums

```lattice check [knowledge.lattice]```

**Compact** free pages at the end of the file

```lattice compact [knowledge.lattice]```

Take a **hot backup** without closing the database

```lattice backup [knowledge.lattice]```

# SYNOPSIS

**lattice** _command_ _database_ [_options_]

# COMMANDS

**create** _file_
> Create an empty single-file database.

**import** _file_ **--file** _json_
> Load graph data from JSON.

**exec** _file_ **--file** _query.cypher_
> Run a Cypher query from a file.

**count** _file_
> Print node and edge counts.

**check** _file_
> Validate main-file page checksums. A sibling `-wal` file is reported if present but not fully validated.

**compact** _file_
> Checkpoint and truncate a contiguous free tail. Does not relocate live pages; zero bytes reclaimed is normal.

**backup** _file_
> Hot backup of an open database.

# DESCRIPTION

**lattice** is the command-line client for **LatticeDB**, an embedded, single-file property-graph engine with HNSW vector search and BM25 full-text search. There is no server: one process opens one file. The query language is a Cypher subset with `<=>` for vector distance and `@@` for full-text.

Install via the project's `dist/install.sh` or build with Zig (`zig build` produces `zig-out/bin/lattice`). Language bindings (Python, TypeScript, Go, C) share the same file format.

# CAVEATS

Single-writer: only one process should open a given file for writes. Cypher coverage is incomplete (no `OPTIONAL MATCH` or `CALL` yet). `hash_embed` in examples is a placeholder, not a semantic model. Compact only trims a free tail.

# HISTORY

Written in Zig by Jeff Hajewski as a local-first graph+vector store for RAG and agent memory.

# SEE ALSO

[sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/jeffhajewski/latticedb)```

```[Homepage](https://latticedb.org)```

```[Documentation](https://docs.latticedb.org)```

<!-- verified: 2026-08-26 -->
