# TAGLINE

Chat-REPL alias of the Yana AI native runtime

# TLDR

Install the **Rust binaries** (this name and **yana-rt**) from crates.io

```cargo install yana-rt```

Start the **interactive chat** REPL (same as `yana-rt chat`)

```yana-ai-rt```

Force **local Ollama**, no API key

```yana-ai-rt --provider ollama```

Pick a **cloud provider** and model

```yana-ai-rt --provider anthropic --model [claude-sonnet-4-6]```

Resume a **saved session**

```yana-ai-rt --resume [session-id]```

Set a **system prompt** and print upstream errors

```yana-ai-rt --system "[You are a terse code reviewer]" --verbose```

Run approved shell tools **without** `sandbox-exec.sh`

```yana-ai-rt --no-sandbox```

# SYNOPSIS

**yana-ai-rt** [_options_]

**yana-ai-rt** **-h** | **--help**

**yana-ai-rt** **-V** | **--version**

# DESCRIPTION

**yana-ai-rt** is a second Cargo binary from the **yana-rt** crate. It is built from the same `src/main.rs` as **yana-rt**. When the executable stem is `yana-ai-rt`, the process inserts the **chat** subcommand into argv before clap parses, so `yana-ai-rt --provider ollama` is the same invocation as `yana-rt chat --provider ollama`. Extra positional words after the alias still go through clap as **chat** flags; they are not extra subcommands.

`pip install yana-ai` also installs a console script of this name. That shim prepends **chat** and execs a compiled **yana-rt** binary: **YANA_RT_BIN**, then a native **yana-rt** on PATH (never the pip script itself), then a packaged ELF/Mach-O, then `target/release/yana-rt`. Point **YANA_RT_BIN** at a compiled binary, never at `which yana-rt` after a pip install. The crate is **1.5.1** on crates.io (2026-10-05); the Python package **yana-ai** is versioned separately (**1.5.2** in pyproject.toml).

The REPL talks to a provider from the runtime catalog. With no **--provider**, it uses **ANTHROPIC_API_KEY**, else **OPENAI_API_KEY**, else local Ollama at `127.0.0.1:11434`. A missing key for an explicit cloud provider prints the env var and exits; it does not switch providers. Two tools are available: **read_file** (read-only, sandboxed to the repo root) and **run_command** (always asks a human first, then runs through `core/scripts/sandbox-exec.sh` unless **--no-sandbox**). The process is separate from Claude Code, so PreToolUse hooks never see it.

# PARAMETERS

**-h**, **--help**
> Print clap help for the inserted **chat** command

**-V**, **--version**
> Print the crate version

**--provider** _id_
> Chat provider from the runtime catalog (`anthropic`, `openai`, `ollama`, `kimi`, and others)

**--model** _name_
> Override the provider default. For Ollama, the runtime queries `/api/tags` before a static fallback

**--system** _text_
> System prompt for the session

**--resume** _id_
> Preload history from a saved session

**--verbose**
> Print full upstream error detail

**--no-sandbox**
> Run approved **run_command** calls without `sandbox-exec.sh`. Approval is still required

# ENVIRONMENT

**YANA_RT_BIN**
> Absolute path to a compiled **yana-rt** binary, used by the pip shim

**YANA_RT_WRAPPER_ACTIVE**
> Set by the pip shim to stop recursive re-entry. Do not set by hand

**ANTHROPIC_API_KEY**, **OPENAI_API_KEY**, **MOONSHOT_API_KEY**
> Cloud providers. Kimi uses **MOONSHOT_API_KEY**

# CAVEATS

The pip script is not the Rust binary; without a compiled **yana-rt** it exits **1** and prints install hints. A stale runtime on PATH rejects new flags; upgrade with `cargo install yana-rt --force`. **run_command** matches command strings, not a full shell parse. Chat is invisible to Claude Code hooks. Default Cargo features include **cli**; optional **mcp**, **lsp**, **pty-bridge**, and **discord** are off unless you build with them. npm `bin` entries exist in the repo for local tooling; the product is not published to npm.

# HISTORY

**yana-ai-rt** is the argv[0] chat alias declared next to **yana-rt** in the Yana AI runtime crate (Apache-2.0, **Vũ Văn Tâm**, started **17 May 2026**). crates.io **1.5.1** (2026-10-05) is the same release as **yana-rt**.

# SEE ALSO

[yana-rt](/man/yana-rt)(1), [yana-ai](/man/yana-ai)(1), [trace-audit](/man/trace-audit)(1), [ollama](/man/ollama)(1), [aichat](/man/aichat)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [cargo](/man/cargo)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/yanacuti1121/Yana-AI)```

```[Homepage](https://yana.vutam.link)```

```[Documentation](https://github.com/yanacuti1121/Yana-AI/blob/main/COMMANDS.md)```

<!-- verified: 2026-10-23 -->
