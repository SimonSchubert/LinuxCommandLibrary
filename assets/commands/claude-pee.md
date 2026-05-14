# TAGLINE

Drop-in wrapper around the claude CLI for scripted interactive sessions

# TLDR

**Run an interactive session** through the wrapper

```claude-pee```

Send a **one-shot prompt** and print the reply

```claude-pee -p "[summarize this file]"```

Request **JSON output** for downstream parsing

```claude-pee -p "[prompt]" --output-format json```

Stream **incremental JSON** events as the model responds

```claude-pee -p "[prompt]" --output-format stream-json```

**Forward extra flags** verbatim to the underlying claude CLI

```claude-pee --model [opus] -p "[prompt]"```

# SYNOPSIS

**claude-pee** [_options_] [**-p** _prompt_]

# DESCRIPTION

**claude-pee** is a Rust front-end that wraps the official **claude** command-line tool. It spawns claude inside a pseudo-terminal (PTY), assigns a fresh **--session-id** (UUIDv4), forwards every other flag unchanged, optionally injects a one-shot prompt with **-p**, and then tails the matching session transcript JSONL file until the assistant's reply is complete.

The wrapper exists so that programmatic scripts and CI pipelines can drive **claude** without being billed against its programmatic-usage credit pool, while still benefitting from the interactive session semantics. Output is collected and printed to stdout in plain text, JSON, or streaming JSON depending on **--output-format**.

A sentinel file combined with claude's Stop hooks signals when the response has finished so the wrapper can exit cleanly instead of polling indefinitely.

# PARAMETERS

**-p** _prompt_
> Inject a one-shot prompt and exit when the reply is complete. Without **-p** the wrapper hands the PTY back to the user for an interactive session.

**--output-format** _FORMAT_
> Select output mode: **text** (default), **json**, or **stream-json**.

**--session-id** _ID_
> Override the auto-generated UUIDv4 used to correlate the underlying claude transcript.

All other flags are forwarded verbatim to **claude**, so options like **--model**, **--add-dir**, or **--allowedTools** behave exactly as documented for the real CLI.

# CAVEATS

Requires the **claude** CLI to be installed and on **$PATH**, plus Rust **1.85+** to build from source via **cargo build --release**. Because the wrapper depends on claude's transcript JSONL layout and Stop hook behavior, future changes to the official client may break it. This is a community project, not an Anthropic product.

# HISTORY

**claude-pee** was published in **2026** as a community response to the cost difference between interactive and programmatic Claude Code usage, debuting on Hacker News and growing from a single-file Rust prototype into a small drop-in shim.

# SEE ALSO

[claude](/man/claude)(1), [jq](/man/jq)(1), [tmux](/man/tmux)(1)
