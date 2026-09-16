# TAGLINE

CLI for an open plain-text AI memory format (.dai files on disk)

# TLDR

**Install and configure** Claude Code, Cursor, and other MCP clients

```daidocs setup```

Show **what is configured** and how to change each switch

```daidocs setup --status```

**Convert** existing chat history into a store (interactive)

```daidocs convert```

Convert selected Claude Code sessions **non-interactively**

```daidocs convert --source claude --project [name] --pick [1-5] --to [~/DaiDocs] --yes```

List sessions **captured but not yet converted**

```daidocs pending```

List **declared stores**, or find one that moved

```daidocs stores```

```daidocs stores --scan [path/to/code]```

**Back up** a project folder (skip **node_modules** and **.git**)

```daidocs backup [path/to/project] --to [path/to/backups]```

Find (or rewrite) **credentials** already in a store

```daidocs scrub```

```daidocs scrub --apply```

**Ingest** a folder of **.txt** / **.md** / **.jsonl** into a store

```daidocs ingest [path/to/chats] [path/to/store]```

**Ask** a question of a store from the shell

```daidocs ask [path/to/store] "[what did we decide about deploy?]"```

# SYNOPSIS

**daidocs** _command_ [_options_]

**daidocs** **setup** [_options_]

**daidocs** **convert** [_options_]

**daidocs** **pending** [**--route** _project_] [**--to** _folder_]

**daidocs** **stores** [**--scan** _folder_] [**--forget** _id_]

**daidocs** **backup** _folder_ **--to** _destination_ [**--zip**] [**--memory-only**]

**daidocs** **scrub** [_store_] [**--apply**]

**daidocs** **ingest** _folder_ [_store_] [**--observer** _spec_] [**--force**]

**daidocs** **ask** [_store_] _question_ [**--actor** _spec_]

# PARAMETERS

**setup**
> Detect assistants on this machine (Claude Desktop, Claude Code, Cursor, Windsurf, Codex, Cline, Continue, Zed) and write MCP / hook / icon / reading-protocol config, backing up every file it touches.

**--status**
> With **setup**, print each switch, whether it is on, and the command that changes it.

**--ask**
> With **setup**, choose each surface interactively instead of configuring all of them.

**--restore** / **--unregister**
> Put back files **setup** changed, or remove what was installed.

**--observer** _spec_
> Model that writes **.dai** files (for example **openai:gpt-4.1-mini**). Applies to conversion, hooks, MCP, and the CLI until changed.

**--project** _name_ / **--project-type** _type_ / **--store** **here**|**shared**
> Declare the current folder as a project, set its type (**normal**, **locked**, **frozen**, **connected**, **shared**, **confidential**, **temporary**), and choose a per-folder store or the shared **~/DaiDocs** store.

**convert**
> Turn chat history into **.dai** files. Interactive by default. Reads Claude Code sessions under **~/.claude/projects**, **_pending** / **_unconverted** backlog, or a folder of **.txt** / **.md** / **.jsonl**.

**--source** _claude_|_raw_|_folder_
> Limit **convert** to Claude Code history, already-captured unconverted text, or an export folder.

**--pick** _all_|_list_ / **--to** _store_ / **--yes**
> Choose which items, where to write them, and skip prompts.

**pending**
> List captured-but-unconverted sessions, grouped by project.

**--route** _project_
> Convert one project's pending group into that project's store.

**stores**
> List declared stores and any whose folders have gone missing. Ids live in **~/.daidocs/stores.json**.

**backup** _folder_
> Copy a project to a dated destination, skipping **node_modules** and **.git**. **--zip** writes a zip; **--memory-only** copies only **.daidocs**.

**scrub**
> Report credentials already stored in **.dai** files. **--apply** rewrites them out.

**ingest**
> Convert a folder of documents into a store. Calls the observer model (can cost API usage). **--force** re-ingests files that are already present.

**ask**
> Answer a question from a store on the command line. **--actor** _spec_ selects the answering model (can cost API usage).

# DESCRIPTION

**daidocs** is the command-line front end for DaiDocs, an Apache-2.0 plain-text format for assistant memory. Each conversation becomes a **.dai** file with three UTF-8 zones (YAML header, fenced JSON, and text) plus a small derived index. The files live on your disk and can be read with **grep**, **git**, or any editor.

The npm package also installs **daidocs-setup**, **daidocs-server** (stdio MCP), and session hook binaries. **npx daidocs setup** is the documented one-shot install. A Python extra (**pip install daidocs**) exposes the same **daidocs** command and a **Store** reader; the engine itself still needs **Node.js 18+**.

The default shared store is **~/DaiDocs**. Declared project folders keep memory in **.daidocs/store** inside the folder. Session hooks (when installed) convert in the background after about 4,000 new tokens; shorter sessions wait in **_unconverted/** and are still injected into the next session verbatim.

**ingest** and **ask** are the only subcommands that call a model themselves. Conversion through Claude Code hooks is done by the assistant already in the session and needs no extra API key.

# ENVIRONMENT

**DAIDOCS_STORE**
> Default store path. Default: **~/DaiDocs**. When set, the store argument on **ingest**, **ask**, and **scrub** can be omitted.

**DAIDOCS_OBSERVER**
> Override the observer model for one run.

**DAIDOCS_DISABLE**
> Skip the auto-archive hook.

**DAIDOCS_NO_PING**
> Decline the optional one-time anonymous install ping without being asked.

# CAVEATS

**.dai** files are not encrypted: **confidential** only stops other stores from reading them, it does not hide them on disk. **scrub** is not a guarantee that secrets are gone. Agent traces (tool calls, stack dumps) convert poorly. Below roughly 20k tokens of history the store adds little over keeping the raw transcript. **ingest** and **ask** spend tokens on a paid model when you are not on a subscription path that writes the extraction itself.

# HISTORY

DaiDocs launched in **September 2026** as an open format plus a Node reference engine and MCP server, maintained by **Kerneta** under Apache-2.0.

# SEE ALSO

[claude](/man/claude)(1), [grep](/man/grep)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/Kerneta/daidocs)```

```[Homepage](https://daidocs.com)```

```[Documentation](https://github.com/Kerneta/daidocs/blob/main/docs/GUIDE.md)```

<!-- verified: 2026-09-16 -->
