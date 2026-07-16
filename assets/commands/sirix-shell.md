# TAGLINE

interactive JSONiq/XQuery shell for SirixDB

# TLDR

**Start** the interactive shell

```sirix-shell```

Store a document via a **query** (example session)

```jn:store('mydb','resource','{"key": "value"}')```

**Read** a stored value

```jn:doc('mydb','resource').key```

# SYNOPSIS

**sirix-shell**

# DESCRIPTION

**sirix-shell** is an interactive REPL for **SirixDB** queries. It accepts multi-line JSONiq/XQuery input; an empty line executes the statement, and Control-D exits. Use it to store and open documents, run temporal and bitemporal queries, and explore revision history without packaging each expression as a one-shot **sirix-cli** invocation.

SirixDB extends JSONiq/XQuery (via Brackit) with functions for opening revisions by number or timestamp, navigating node history, and computing structured diffs between revisions. The shell is built from the **sirix-query** module and can also be produced as a GraalVM native binary for fast startup.

# CAVEATS

Requires a configured SirixDB environment and a Java runtime (or native image). Multi-line entry is terminated by a blank line; accidental empty lines execute incomplete input. For scripted automation, prefer **sirix-cli** over the interactive shell.

# HISTORY

**sirix-shell** is part of the open-source **SirixDB** project, using the Brackit query engine for JSONiq/XQuery.

# SEE ALSO

[sirix-cli](/man/sirix-cli)(1), [java](/man/java)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/sirixdb/sirix)```

```[Homepage](https://sirix.io)```

```[Documentation](https://sirix.io/docs/)```

<!-- verified: 2026-07-16 -->
