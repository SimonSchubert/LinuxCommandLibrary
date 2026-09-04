# TAGLINE

Knowledge graph and architecture analysis for any codebase

# TLDR

**Build a graph** of the current project (AST extract, no API key)

```codeknow .```

Index **code only**, skip docs and images

```codeknow . --code-only```

Score **architectural health** (0–100 and a letter grade)

```codeknow debt```

Fail CI when the score is **below a threshold**

```codeknow debt --threshold [60]```

Save a named **architecture baseline**

```codeknow drift snapshot --name [before-refactor]```

**Compare** the current graph to the last baseline

```codeknow drift compare```

Show the **blast radius** of changing a file

```codeknow impact "[src/app.py]"```

List **tests affected** by local git changes (pipe to pytest)

```codeknow test-impact --changed```

Write a **guided onboarding tour** from graph topology

```codeknow onboard```

Open the **keyboard-driven graph navigator**

```codeknow tui```

Print **machine-readable JSON** from any analysis command

```codeknow debt --json```

# SYNOPSIS

**codeknow** [_path_] [_options_]

**codeknow** _command_ [_args_] [_options_]

# PARAMETERS

**-h**, **--help**, **-?**
> Print the full command list and exit.

**-v**, **--version**, **version**
> Print the package version. Help text still labels the binary as **codegraph**.

**--json**
> Emit machine-readable JSON on analysis commands that support it (**debt**, **impact**, **security**, **owners**, **god-nodes**, **diagnose**, and others).

**--graph** _path_
> Path to **graph.json** (default **codegraph-out/graph.json**, or **$CODEGRAPH_OUT/graph.json**).

# COMMANDS

_path_
> A filesystem path as the first argument is treated as **extract** _path_. **codeknow .** is the usual first run.

**extract** _path_
> Headless full extraction: tree-sitter AST parse, optional LLM semantic pass, cluster, and write **codegraph-out/**. **--code-only** skips docs, papers, and images and needs no API key. **--no-cluster** writes raw extraction only. **--no-gitignore** ignores **.gitignore** (still honours **.codegraphignore**). **--force** (or **CODEGRAPH_FORCE=1**) full re-scan. **--out** _DIR_ writes _DIR_**/codegraph-out/**. **--postgres** _DSN_ and **--cargo** add database schema or Cargo crate edges. **--global** merges into the cross-repo graph.

**update** _path_
> Re-extract changed files and update the graph without an LLM. **--force** overwrites even if the rebuild has fewer nodes.

**debt**
> Composite health score 0–100 with letter grade. Sub-metrics: god-node concentration, cross-community coupling, import cycles, community cohesion, dead code. **--threshold** _N_ exits 1 when the score is below _N_. **--score-only** prints just the number.

**drift snapshot**
> Save the current graph as a named baseline (**--name** _NAME_).

**drift compare**
> Detect structural changes against the last (or named) baseline.

**drift history**
> List saved baselines.

**changelog**
> Git-aware architectural changelog. **--since** _2w_, **--between** _b1_ _b2_, **--ref** _REF_, **--output** _PATH_.

**onboard**
> Write **ONBOARDING.md** next to the graph (betweenness + communities, no LLM). **--top** _N_, **--stdout**.

**impact** _node-or-file_
> Blast-radius analysis with risk assessment. **--depth** _N_ (default 3).

**affected** _node_
> Reverse traversal of nodes impacted by a change. **--relation** _R_ (repeatable), **--depth** _N_ (default 2).

**test-impact** [_FILE_...]
> Map files to affected tests (HIGH/MEDIUM/LOW). **--changed** uses git, **--all** lists every mapping. Pipe to **xargs pytest**.

**security**
> Attack-surface analysis: source-to-sink path tracing. **--markdown** for Markdown output.

**owners**
> Git-blame overlay: knowledge silos, bus factor, orphaned communities. **--codeowners** generates a CODEOWNERS file. **--orphan-days** _N_ (default 90).

**refactor-plan** _target_
> Dependency-aware refactor plan with blast radius and a topologically sorted order.

**simulate remove** _node_
> Cascade analysis of deleting a node.

**simulate merge** _A_ _B_
> Simulate merging two modules.

**simulate refactor** _a_ _b_ **--into** _name_
> Simulate extracting nodes into a new module.

**discover**
> Latent connections, bridges, and capability clusters.

**features**
> Identify product features from code structure.

**patterns**
> Match the graph against a set of architecture patterns.

**god-nodes**
> Highest-degree nodes (architectural hubs). **--top** _N_ (default 10).

**explain** _node_
> Plain-language explanation of a node and its neighbors.

**path** _A_ _B_
> Shortest path between two nodes.

**query** _question_
> Natural-language query over the graph (requires an LLM extra). **--dfs**, **--budget** _N_, **--context** _C_ (repeatable).

**tui**
> Keyboard-driven terminal navigator (stdlib + ANSI, no extra packages).

**dashboard**
> Live architecture dashboard at **http://127.0.0.1:8787**. **--port** _N_.

**tree**
> Collapsible HTML dependency tree (**codegraph-out/GRAPH_TREE.html**).

**export** _format_
> **html**, **callflow-html**, **obsidian**, **wiki**, **svg**, **graphml**, **neo4j**, **falkordb**. Neo4j/FalkorDB can **--push** to a live database.

**install** [_platform_]
> Copy the agent skill into a coding-agent config (claude, cursor, gemini, codex, vscode, kilo, kiro, and others). **codeknow-mcp** is a separate entry point from **pip install "codeknow[mcp]"**.

**global add** _graph.json_
> Merge a project graph into **~/.codegraph/global-graph.json**. **global list**, **global remove**, **global path**.

**watch** _path_
> Rebuild the graph when files change (needs the **watch** extra).

# DESCRIPTION

**codeknow** builds a queryable knowledge graph from a source tree. It walks the project with **tree-sitter**, extracts symbols (functions, classes, modules) and relationships (imports, calls, inheritance), and stores them as a **NetworkX** directed graph. Language detection is automatic; the default install covers Python, JavaScript/TypeScript, Go, Rust, Java, C/C++, C#, Ruby, Kotlin, Scala, PHP, Swift, Lua, Zig, PowerShell, Elixir, Objective-C, Julia, Verilog, Fortran, Bash, Groovy, and JSON, with extras for SQL, Terraform, Pascal, OCaml, Common Lisp, and others.

Running **codeknow .** (or **codeknow extract .**) writes **codegraph-out/graph.json**, an interactive **graph.html**, and **GRAPH_REPORT.md**. Core analysis — **debt**, **drift**, **onboard**, **impact**, **test-impact**, **security**, **owners**, **refactor-plan**, **simulate**, **discover** — reads that graph and does not need an API key. **query**, community labeling, and semantic document extraction are optional LLM passes (OpenAI, Anthropic, Gemini, Ollama, and custom OpenAI-compatible endpoints).

The published console script is **codeknow**; the Python package, default output directory, git-hook helpers, and **--help** banner still use the older name **codegraph**.

# CONFIGURATION

**CODEGRAPH_OUT**
> Override the output directory name or path (default **codegraph-out**). Read once at process start; set it before invoking the CLI.

**CODEGRAPH_FORCE**
> Set to **1**/**true**/**yes** to force a full re-scan, same as **--force** on **extract** and **update**.

**.codegraphignore**
> Project ignore file. Honoured even when **--no-gitignore** skips **.gitignore**.

**codegraph-out/**
> Default artifact directory: **graph.json**, **graph.html**, **GRAPH_REPORT.md**, drift baselines, onboarding, and memory/reflections. Analysis commands look here unless **--graph** is given.

**~/.codegraph/**
> Cross-repo global graph (**global-graph.json**) and cloned repos used by **clone** / **global**.

# CAVEATS

Requires **Python 3.10+**. Install from PyPI (**pip install codeknow**); distro packages may not exist.

Most analysis subcommands exit with an error until a graph has been built. **query** and LLM community labeling need an extra and an API key.

Help text, default paths, and the companion MCP binary still say **codegraph** / **codeknow-mcp**. SVG export, Neo4j, FalkorDB, PDF/Office ingest, video transcription, and the file watcher are optional extras, not part of the base wheel.

Very large graphs can skip HTML generation with **--no-viz**. **--code-only** is the CI-friendly path: no LLM, code files only.

# HISTORY

**codeknow** is written in Python by **Alex Salsali** and released under the MIT license. Version **1.0.0** was published on **31 August 2026** (tree-sitter extractors, HTML visualization, simulation and discovery engines). **1.1.0** followed on **1 September 2026** with **debt**, **drift**, **changelog**, **onboard**, **test-impact**, **owners**, **refactor-plan**, **security**, **tui**, and **dashboard**. The library package remains **codegraph**.

# SEE ALSO

[ast-grep](/man/ast-grep)(1), [semgrep](/man/semgrep)(1), [scc](/man/scc)(1), [ctags](/man/ctags)(1), [cscope](/man/cscope)(1)

# RESOURCES

```[Source code](https://github.com/asalsali/codeknow)```

<!-- verified: 2026-09-04 -->
