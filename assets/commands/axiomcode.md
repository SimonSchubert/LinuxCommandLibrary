# TAGLINE

Resolved call-graph CLI for Java, TypeScript, Python, JavaScript, and C#

# TLDR

Install the **engine** and the `axiomcode` command

```npm i -g @axiomcode/code-graph```

Print the installed **version** (needs Node 22.13+)

```axiomcode --version```

**Index** the current repository (the first query also builds the graph)

```axiomcode index```

Index **one language** and a source subtree

```axiomcode index --lang typescript --src src```

How **A reaches B** (every hop of the call chain)

```axiomcode path [main] [Ledger.put]```

**Impact** of changing a declaration, including tests that exercise it

```axiomcode impact [SqlStore.put]```

Impact of **uncommitted edits** (no name)

```axiomcode impact```

Tests those edits reach, plus a **run:** line

```axiomcode tests```

Record where an **unresolved call** lands

```axiomcode link [src/app.ts:42] [SqlStore.put]```

Serve **MCP tools** on stdio

```axiomcode mcp```

# SYNOPSIS

**axiomcode** _command_ [_args_] [_options_]

**axiomcode** **--version**

**axiomcode** **help** [_command_]

# DESCRIPTION

**axiomcode** is the CLI for **AxiomCode Graph**. It parses a repository and builds a call graph with language-aware, deterministic rules: each call is resolved from the receiver's type the way a compiler would, not by matching names in a syntax tree. Queries print numbered places with the enclosing function's code and the relevant line marked.

Public verbs: **impact**, **path**, **tests**, **context**, **link**, **index**, **report**, **graph**. The first query builds `.axiomcode/out/graph.sqlite` if it is missing. Later queries read that graph. After an edit, a background rebuild can start; the current command still answers from the previous graph and marks rows that may be stale. **--fresh** waits for the new graph. **AXIOMCODE_NO_REFRESH=1** or **--no-refresh** never starts a rebuild.

Stable languages: Java, TypeScript, Python. JavaScript and C# are beta. A multi-language repo gets one graph per language. The npm package **@axiomcode/code-graph** installs the `axiomcode` binary (`npm i -g` or `npx -y @axiomcode/code-graph`). Node **22.13+** (it writes the graph with `node:sqlite`) and **python3** are required. Prebuilt engines ship for macOS (arm64, x64), Linux (x64, arm64), and Windows x64; Linux arm64 compiles native parser modules at install time. Version **0.1.11**. License FSL-1.1-Apache-2.0.

The agent plugin (Claude Code, Codex, Copilot, Gemini, Cursor) is optional. Any MCP client can run `axiomcode mcp` (or `npx -y @axiomcode/code-graph mcp`).

# COMMANDS

**impact** [_NAME_]
> Who calls it, what a change reaches, and the tests that exercise it. With no name: the same for declarations your uncommitted edits changed (`your edits:`).

**path** _A_ _B_
> How _A_ reaches _B_, hop by hop. Names are written as in the code: `Owner.method`, `method`, `Type`, or `file.py:123`. `*` as an endpoint means everything that reaches, or is reached by, the other name.

**tests**
> Tests your uncommitted edits reach, and a last `run:` line with the command that runs them.

**context** _TASK_ [**--source**]
> Files and callables a task touches, as a narrative. **--source** includes each step's code.

**link** _FILE:LINE_ _TARGET_
> Record where a call the graph could not resolve lands (`axiomcode-links.tsv`). Impact, path, and tests then walk it as `[asserted]`. Alone, lists links. `link FILE:LINE -` removes one.

**index** [_REPO_] [**--lang** _LANG[,LANG…]_] [**--src** _SUBDIR_] [**--library** _ROOT[,ROOT…]_]
> Build the graph explicitly. _REPO_ defaults to the current directory.

**report** [_REPO_]
> HTML page of end-of-turn assist receipts (`.axiomcode/assists.html`).

**graph** [_REPO_]
> Interactive HTML graph; prints `<repo>/.axiomcode/graph/graph.html`.

**mcp**
> MCP server on stdio (tools **impact**, **path**, **tests**, and related).

**help** [_COMMAND_]
> Dispatcher help, or one command's usage.

# PARAMETERS

**--lang** _LIST_
> Restrict to `java`, `typescript`, `python`, `javascript`, and/or `csharp`.

**--src** _SUBDIR_
> Limit the analysed tree (for example `src`).

**--library** _ROOT[,ROOT…]_
> Dependency or platform roots for resolving calls into libraries.

**--fresh**
> Wait for a refresh in flight and answer from the new graph. **AXIOMCODE_FRESH_WAIT** (seconds, default 0) applies to every query.

**--no-refresh**
> Read-only: do not start a rebuild. Same as **AXIOMCODE_NO_REFRESH=1**.

**--version**
> Print the package version. Only when it is the sole argument.

# CONFIGURATION

**.axiomcode/**
> Per-repository graph, refresh log, and HTML output. Add it to `.gitignore`.

**AXIOMCODE_NO_REFRESH**, **AXIOMCODE_FRESH_WAIT**, **AXIOMCODE_REFRESH_INTERVAL**
> Rebuild policy. Interval is seconds between MCP idle refreshes; **0** turns that timer off.

**AXIOMCODE_ENGINE**
> Checkout root when developing from source (`export AXIOMCODE_ENGINE="$PWD"`).

# CAVEATS

Needs Node 22.13+ and Python 3. Linux arm64 needs build tools (`build-essential`, `python3`) so native parser modules can compile. Windows runs the CLI under Git Bash. Unresolved calls stay explicit rather than guessed; reflection and service loaders can miss edges. A graph built by another engine or `IMPACT_VERSION` is not rebuilt by hooks. First index of a large repo can take minutes.

# SEE ALSO

[graf](/man/graf)(1), [graphify-csharp](/man/graphify-csharp)(1), [ctags](/man/ctags)(1), [cscope](/man/cscope)(1), [ast-grep](/man/ast-grep)(1), [rg](/man/rg)(1), [npm](/man/npm)(1), [node](/man/node)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/AxiomCodeAI/axiomcodegraph)```

```[Homepage](https://axiomcode.ai)```

```[Documentation](https://github.com/AxiomCodeAI/axiomcodegraph/blob/dev/README.md)```

<!-- verified: 2026-10-14 -->
