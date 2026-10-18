# TAGLINE

Code-graph engine for Graphicle: extract, query, and export a repository graph

# TLDR

Build a **code-only graph** of the current folder

```graphicle-graph extract . --code-only```

Refresh **code nodes** without calling a model

```graphicle-graph update .```

Show **what depends on** a symbol

```graphicle-graph affected "[retry()]"```

Ask a **scoped graph question**

```graphicle-graph query "[where are failed requests retried?]"```

Trace the **shortest path** between two symbols

```graphicle-graph path "[parse_config]" "[retry()]"```

Explain a **symbol** and its connections

```graphicle-graph explain "[retry()]" --all```

Rebuild when **files change**

```graphicle-graph watch .```

Serve the graph over **MCP stdio**

```graphicle-graph serve```

The same commands through the **graphicle** wrapper

```graphicle graph extract . --code-only```

# SYNOPSIS

**graphicle-graph** _command_ [_options_]

**graphicle-graph** [_path_] [_options_]

# DESCRIPTION

**graphicle-graph** is Graphicle's native Rust graph engine, a port of Graphify 0.9.91. A Graphicle install places it beside **graphicle**; `graphicle graph` forwards remaining arguments unchanged, so `graphicle graph update .` is `graphicle-graph update .`. `graphicle graph` with no extra words prints this program's help.

`extract` walks a folder with tree-sitter (and optional semantic backends), writes **.graphicle/graph.json**, and can cluster and label communities. `--code-only` skips documents and images. `update` refreshes code without an LLM. `watch` rebuilds when files change. Navigation commands (`query`, `path`, `explain`, `affected`, `god-nodes`) read the stored graph; they call no model. `query`, `path`, and `explain` exit **0** with an answer, **3** when a name is ambiguous (candidates are listed), and **4** when nothing matches.

A first argument that is an existing path is treated as `extract`. Piped stdin with no `--jsonl` still uses the native JSON Lines API. Version **0.1.2**. Apache-2.0.

# COMMANDS

**extract** _PATH_ [**--code-only**] [**--force**] [**--no-cluster**] [**--no-dedup**] [**--allow-partial**] [**--allow-dedup-shrink**] [**--timing**] [**--out** _DIR_] [**--output** _DIR_] [**--backend** _NAME_] [**--model** _NAME_] [**--mode** **deep**] [**--max-workers** _N_] [**--token-budget** _N_] [**--exclude** _PATTERN_] [**--no-gitignore**] [**--global**] [**--as** _TAG_]
> Build a graph from code and semantic material. **--code-only** skips documents. **--force** (or **GRAPHICLE_FORCE**) re-extracts. A shrink of a deduplicated graph is refused without **--allow-dedup-shrink**.

**update** [_PATH_] [**--force**] [**--no-cluster**]
> Refresh code without an LLM.

**watch** [_PATH_] [**--debounce** _S_]
> Rebuild when files change.

**check-update** _PATH_
> Report pending semantic updates without applying them.

**query** _QUESTION_ [**--graph** _PATH_] [**--dfs**] [**--context** _C_] [**--budget** _N_] [**--seed** _X_]
> Scoped graph context. **--seed** starts at a node id, label, or file path (repeatable) instead of keyword matches.

**path** _A_ _B_ [**--graph** _PATH_] [**--directed**] [**--undirected**]
> Shortest dependency path in stored edge direction. **--directed** is the default; **--undirected** ignores direction. The two flags are mutually exclusive.

**explain** _SYMBOL_ [**--graph** _PATH_] [**--all**]
> Node, provenance, and connections. Default: the 20 most connected; **--all** lists every connection.

**affected** _SYMBOL_ [**--graph** _PATH_] [**--depth** _N_] [**--relation** _R_]
> Reverse impact: what a change to the symbol touches.

**god-nodes** [**--top** _N_] [**--json**]
> Architecture hubs.

**cluster-only** [_PATH_] / **label** [_PATH_] [**--missing-only**] [**--graph** _PATH_] [**--backend** _NAME_] [**--model** _NAME_]
> Cluster an existing graph, or name communities.

**export** _FORMAT_ [**--graph** _PATH_] [**--output** _PATH_] [**--labels**]
> Write **html**, **callflow-html**, **obsidian**, **wiki**, **svg**, **graphml**, **neo4j**, or **falkordb**.

**serve** [_graph.json_] [**--transport** _NAME_] [**--host** _HOST_] [**--port** _N_]
> MCP over stdio (default) or streamable HTTP.

**hook** **install**|**uninstall**|**status**
> post-commit, post-checkout, and post-merge hooks, plus a graph.json merge driver. `hook install` refuses a `core.hooksPath` outside the repository.

**global** **add**|**remove**|**list**|**path** [**--as** _TAG_]
> Cross-repository graphs.

**merge-graphs** _FILES_ [**--out** _PATH_] [**--previous** _MERGED.json_]
> Merge repository graphs.

**install** [_platform_] / **uninstall** [_platform_] [**--project**] [**--purge**]
> Assistant skill installation. Platforms include **claude**, **codex**, **cursor**, **vscode**, **aider**, **gemini**, and others listed in `--help`.

**--jsonl**
> Native JSON Lines API (also the default when stdin is piped).

**--version**
> Program name and package version.

# CONFIGURATION

**.graphicle/graph.json**
> Default graph file (`GRAPHICLE_OUT` names the output directory; default **.graphicle**). Navigation commands accept **--graph** _PATH_.

**~/.graphicle-graph**
> Global engine folder: provider settings, cloned repositories, grammar packs. A project may also keep **.graphicle-graph/providers.json**.

**.graphiclerc**
> Optional per-project map of file extensions to languages.

**GRAPHICLE_FORCE**
> Same as **--force** when set to `1`, `true`, or `yes`.

**GRAPHICLE_MIN_EVIDENCE**
> Drop call edges below this evidence level when loading a graph (same as **--min-evidence**).

**GRAPHICLE_SOCKET**
> When set, read-only graph commands can be forwarded to a resident `serve --socket` server.

**GRAPHICLE_NO_AUTO_REFRESH=1**
> Do not refresh installed assistant skills that an upgrade left behind.

# CAVEATS

`extract` without **--code-only** may send documents and images to a configured LLM. `query`, `path`, and `explain` refuse an ambiguous name instead of guessing. `GRAPHICLE_OUT` of `.` or a parent of the project is rejected so `uninstall --purge` cannot delete the tree. `serve --socket` is Unix-only. Windows x86-64 is a preview build.

# HISTORY

**graphicle-graph** is the Graphicle graph engine, a native Rust port of Graphify 0.9.91 (Apache-2.0). Graphicle 0.1.2 ships it next to the **graphicle** program. Memory, the loopback app, and session capture live in **graphicle**, not in this engine.

# SEE ALSO

[graphicle](/man/graphicle)(1), [graf](/man/graf)(1), [graphify-csharp](/man/graphify-csharp)(1), [ctags](/man/ctags)(1), [cscope](/man/cscope)(1), [rg](/man/rg)(1)

# RESOURCES

```[Source code](https://github.com/graphicle-ai/graphicle)```

```[Documentation](https://github.com/graphicle-ai/graphicle/blob/main/crates/graphicle-graph/README.md)```

<!-- verified: 2026-10-18 -->
