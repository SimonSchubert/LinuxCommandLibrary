# TAGLINE

Map a codebase's import, call, and data-flow graph

# TLDR

**Launch** the interactive web UI to explore the graph

```bunx codeflowmap serve```

**Scan** a repository and generate a graph and Obsidian vault

```bunx codeflowmap scan [./repo] -o [.codemap]```

**Add semantic annotations** (reads, writes, auth, flows) via an LLM

```bunx codeflowmap annotate -o [.codemap]```

# SYNOPSIS

**codeflowmap** _command_ [_options_]

command := **serve** | **scan** | **annotate**

# DESCRIPTION

**codeflowmap** is a static-analysis tool that maps a codebase by building a deterministic dependency graph with the TypeScript Compiler API, then optionally overlaying semantic annotations produced by an open-weight LLM. It extracts a file-level import graph using exact module resolution (not guesses), a function-level call graph from symbol to symbol, and data-flow annotations covering writes, reads, configuration, and authentication paths.

Results are written to a **.codemap** directory containing **graph.json** (the complete dependency and call graph), a Markdown vault with one file per source file linked by **[[wikilinks]]** for use in Obsidian, and a content-hash-keyed cache of annotations. The **serve** command opens an interactive web UI (default http://localhost:4321) for browsing the graph.

codeflowmap requires the **Bun** runtime (version 1.0 or newer) and is most easily run with **bunx**, which executes it without a separate install step.

# COMMANDS

**serve**
> Launch the interactive web UI for exploring the graph.

**scan**  _path_
> Extract the import and call graphs from a repository and generate the Obsidian vault.

**annotate**
> Add an LLM-generated semantic layer (writes, reads, auth, flows) to a scanned graph.

# PARAMETERS

**-o**  _dir_
> Output directory for generated artifacts (for example **.codemap**).

# CAVEATS

The tool targets TypeScript and JavaScript projects via the TypeScript Compiler API, so it does not analyze other languages. It is early and experimental software, and the **annotate** step depends on an LLM whose output should be reviewed rather than trusted blindly.

# SEE ALSO

[bunx](/man/bunx)(1), [bun](/man/bun)(1), [tsc](/man/tsc)(1)

# RESOURCES

```[Source code](https://github.com/man-consult/code-mapper)```

<!-- verified: 2026-06-22 -->
