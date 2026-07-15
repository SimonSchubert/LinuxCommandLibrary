# TAGLINE

Unix-style tools with structured XML/JSON output for AI agents

# TLDR

**List** a directory as **XML** (default)

```aict ls [path]```

**List** a directory as **JSON**

```aict ls [path] --json```

**List** with classic **plain** coreutils-style text

```aict ls [path] --plain```

**Search** recursively with structured hits

```aict grep "[pattern]" [path] -r```

**Show** file contents with metadata

```aict cat [file]```

**Diff** two files with typed changes

```aict diff [old] [new]```

**Run** the built-in **MCP** server (stdio)

```aict mcp```

**Show help** for all tools

```aict --help```

# SYNOPSIS

**aict** _tool_ [_args_] [_--xml_|_--json_|_--plain_]

# DESCRIPTION

**aict** reimplements a suite of common Unix utilities so AI agents can consume **labeled structured output** instead of parsing human-oriented plaintext. By default tools emit XML; **--json** and **--plain** switch format. Fields use consistent conventions: absolute paths, Unix epoch timestamps (often with companion age fields), sizes in bytes plus human form, and structured error elements rather than free-form stderr for many failure cases.

Tools span file inspection (**cat**, **head**, **tail**, **file**, **stat**, **wc**), search and compare (**ls**, **find**, **grep**, **diff**), path helpers (**realpath**, **basename**, **dirname**, **pwd**), text processing (**sort**, **uniq**, **cut**, **tr**, **sed**, **awk**), data/archives (**jq**, **tar**), checksums, and system/environment queries (**env**, **system**, **ps**, **df**, **du**). Additional subcommands include **git** helpers, **completions**, **doctor**, and **mcp** for Model Context Protocol exposure over stdio.

aict is intentionally **read-only** (no network for MIME/language enrichment beyond local detection) and is written in Go. Structured output is denser in tokens than terse GNU tools but aims to reduce multi-step agent parse-and-retry loops. **--plain** skips enrichment when only raw content is needed.

# PARAMETERS

_tool_
> One of the built-in tools (e.g. **ls**, **grep**, **cat**, **diff**, **find**, **stat**). See **aict --help** for the full list.

**--xml**
> Emit XML (default for agent-oriented use).

**--json**
> Emit JSON with the same structure as the XML form.

**--plain**
> Emit classic plaintext similar to the original Unix tool, without structured enrichment.

**-r**
> Recursive (where supported, e.g. **grep**).

**mcp**
> Start the MCP server over stdio so agents can call tools as native functions.

**doctor**
> Self-diagnostic for the install and environment.

**completions**
> Shell completion helpers (bash/zsh/fish).

**--help**
> List tools and options.

# ENVIRONMENT

**AICT_XML**
> When set to **1**, prefer XML-oriented behavior globally for aict invocations (as documented by the project for agent environments).

# CAVEATS

Not a drop-in performance replacement for GNU coreutils or **ripgrep**: enrichment (language/MIME detection, absolute paths) adds latency, especially on large trees or big **grep**/**cat** jobs. Some tools are platform-limited (**ps** is Linux-oriented; **system** is Linux/macOS). Prefer real **rg**/**eza** for human interactive speed; use aict when structured agent consumption is the goal.

# SEE ALSO

[ls](/man/ls)(1), [grep](/man/grep)(1), [cat](/man/cat)(1), [find](/man/find)(1), [jq](/man/jq)(1), [diff](/man/diff)(1)

# RESOURCES

```[Source code](https://github.com/synseqack/aict)```

```[Homepage](https://synseqack.github.io/aict/)```

<!-- verified: 2026-07-15 -->
