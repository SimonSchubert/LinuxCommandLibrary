# TAGLINE

CLI for the Skillscript agent workflow runtime

# TLDR

**Install** runtime, **init** project, open **dashboard**

```npm install -g skillscript-runtime
skillfile init
skillfile dashboard```

**Lint**, **compile**, and **execute** a skill

```skillfile lint [skill]
skillfile compile [skill]
skillfile execute [skill]```

**Approve** a draft skill (secured mode)

```skillfile approve [hello]```

Show **health**, **diagram**, or **replay** a trace

```skillfile health
skillfile diagram [skill]
skillfile replay [trace_id]```

# SYNOPSIS

**skillfile** _command_ [_options_] [_args_]

# DESCRIPTION

**skillfile** is the command-line interface for **Skillscript**, a constrained declarative language and runtime for agent-authored, human-approved automation. Skills look like Make-inspired workflows with variables, connectors, and allowlists—without unrestricted shell or arbitrary package installs.

The runtime (**skillscript-runtime** on npm) executes skills via configured connectors, filesystem and shell allowlists, and optional secured mode with operator signatures. Agents typically author skills over MCP (**http://localhost:7878/rpc** when the dashboard is up); operators review, approve, and run them with **skillfile**.

# PARAMETERS

**init**
> Initialize a local Skillscript project

**dashboard** [**--host**] [**--port**]
> Start the operator UI and MCP endpoint (default port **7878**)

**lint** / **compile** / **execute** _skill_
> Validate, compile, or run a skill

**approve** _skill_
> Approve a draft skill for execution

**diagram** / **fires** / **replay** / **health**
> Visualize, inspect triggers, replay traces, or check runtime health

# CONFIGURATION

Environment controls include **SKILLSCRIPT_SHELL_ALLOWLIST**, **SKILLSCRIPT_FS_ALLOWLIST** (default deny), **SKILLSCRIPT_SECURED_MODE**, and **SKILLSCRIPT_SECRET_*** for runtime-held secrets. Project config examples ship as **skillscript.config.json.example** and **connectors.json.example**.

# CAVEATS

Pre-1.0; language and connector contracts are still stabilizing. Shell and filesystem access are deny-by-default until allowlisted. Bind the dashboard to **0.0.0.0** only with appropriate network protection.

# SEE ALSO

[make](/man/make)(1)

# RESOURCES

```[Source code](https://github.com/sshwarts/skillscript)```

```[Homepage](https://skillscript.ai)```

```[Documentation](https://docs.skillscript.ai/docs)```

<!-- verified: 2026-07-14 -->
