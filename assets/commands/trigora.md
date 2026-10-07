# TAGLINE

Durable-execution CLI for TypeScript, Python, and Rust programs

# TLDR

**Create** a project in the current directory

```trigora init```

Start the **local runtime** (default `http://localhost:3477`)

```trigora dev```

**Start** a program and print the execution id

```trigora start [approval]```

Send an **event** to a waiting execution

```trigora send [execution-id] [approved]```

**Inspect** an execution

```trigora executions inspect [execution-id]```

**Deploy** compiled programs to Trigora Cloud

```trigora deploy```

Use Cloud instead of the local runtime

```trigora start [approval] --remote```

# SYNOPSIS

**trigora** _command_ [_options_] [_args_]

# DESCRIPTION

**trigora** is the CLI for **Trigora**, a durable-execution platform for long-lived programs and agents. You write ordinary TypeScript, Python, or Rust. At durable boundaries, Transparent Continuation Checkpointing (TCC) commits the program position and live state; recovery resumes from that continuation instead of replaying history.

The command name is **trigora**. Install with **pip install trigora-cli** (Python **3.10–3.14**; console script wraps a vendored native binary), **cargo install trigora-cli**, or **npm install trigora** (Node **22** launcher). The Python wrapper execs `_vendor/trigora`, or **TRIGORA_BIN** if set, and sets **TRIGORA_LOCAL_BIN** for the local runtime. Crate/package line **1.0.3**. MIT (CLI, SDKs, contracts). TCC Engine is Business Source License 1.1.

`trigora dev` spawns **trigora-local**, which drives **tcc-host-sqlite** and persists continuations in **`.trigora/state.db`**. Dual-target commands (**programs**, **executions**, **start**, **send**, **result**, **cancel**) talk to that local runtime unless **--remote**. **deploy**, **whoami**, and **secrets** always use Trigora Cloud and need **TRIGORA_TOKEN**.

# COMMANDS

**init**
> Scaffold the current directory. **--language** `typescript`|`python`|`rust` (prompts on a TTY; TypeScript if none). **--name**, **--example** / **--no-example**, **-f** / **--force**. Writes `trigora.toml` and `.env.example`

**dev**
> Local HTTP runtime. **--host** (default localhost), **--port** (default **3477**)

**start** _program_
> Start a program. **--input** JSON text or a JSON file (omitted input is `[]`). **--remote**

**send** _execution_ _event_
> Deliver an event. **--payload** JSON text or file. **--remote**

**cancel** _execution_ / **result** _execution_
> Cancel, or fetch the result. **--remote**

**programs** / **executions** / **executions inspect** _id_
> List programs or executions, or show one. **--remote**

**deploy**
> Compile discovered programs and upload them to Cloud. **--program** _name_ limits to one. Needs **TRIGORA_TOKEN**

**whoami**
> Print the Cloud workspace for **TRIGORA_TOKEN**

**secrets list** / **secrets set** _name_ / **secrets delete** _name_
> Cloud project secrets for the name in `trigora.toml`. **set** reads the value from a hidden prompt or stdin, never as an argument

**bench** _program_ / **verify** _program_
> Local healthy-run benchmark, or crash-after-checkpoint recovery checks. **--input**, **--effects**, **--events**, **--out**. **verify --faults** `sample` (default) or `all`. These do not start **dev** and do not target Cloud

# CONFIGURATION

**trigora.toml**
> Project file: `[project]` name and `programs` globs (for example `programs = ["src/**/*.ts"]`). Program id is the named default export

**.env** / **.env.example**
> **TRIGORA_TOKEN** for Cloud. **init** writes a commented example

**TRIGORA_TOKEN**
> Cloud API token (environment or `.env`)

**TRIGORA_BIN** / **TRIGORA_LOCAL_BIN**
> Override the native **trigora** / **trigora-local** binaries (Python launcher)

**.trigora/state.db**
> Local SQLite continuation store used by **trigora-local**

# CAVEATS

Cloud commands need **TRIGORA_TOKEN**. Dual-target commands default to **trigora dev**, not Cloud; pass **--remote**. npm **trigora** and the TypeScript adapter need Node 22. Python-only and Rust-only projects do not start Node. If the Python package's vendored binary is missing, the wrapper exits 1 with "Reinstall trigora-cli."

# HISTORY

**Trigora** is built by **Trigora, Inc.** CLI **1.0.3**. TCC Engine is a separate source-available repository.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [npm](/man/npm)(1), [cargo](/man/cargo)(1), [node](/man/node)(1)

# RESOURCES

```[Source code](https://github.com/trigora-dev/trigora)```

```[Homepage](https://trigora.dev)```

```[Documentation](https://trigora.dev/docs)```

<!-- verified: 2026-10-07 -->
