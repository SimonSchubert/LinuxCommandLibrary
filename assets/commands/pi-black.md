# TAGLINE

Patched Pi coding agent that routes Anthropic OAuth through a Claude Pro/Max subscription

# TLDR

**Install** the standalone binary (Linux/macOS)

```curl -fsSL https://github.com/paoloanzn/pi-black/releases/latest/download/install.sh | sh```

Start an **interactive** session in the current project

```pi-black```

**Log in** with Anthropic OAuth from the TUI (same as upstream Pi)

```/login anthropic```

One-shot **print** mode

```pi-black -p "[List the files in this directory]"```

**Continue** the most recent session

```pi-black -c```

Skip the launcher **update prompt**

```PI_BLACK_NO_UPDATE_CHECK=1 pi-black```

Install as a **Pi package** instead (uses the existing **pi** command, not this binary)

```pi install git:github.com/paoloanzn/pi-black```

# SYNOPSIS

**pi-black** [_options_] [**--**] [_@files_...] [_messages_...]

# PARAMETERS

The standalone launcher **exec**s a patched **pi** binary with the same argv. Flags below are upstream Pi options that **pi-black** forwards unchanged.

**-p**, **--print**
> Print the response and exit (non-interactive). Stdin is merged into the prompt.

**-c**, **--continue**
> Continue the most recent session.

**-r**, **--resume**
> Browse and select a past session.

**--provider** _name_
> Provider (for example **anthropic**).

**--model** _id_
> Model id or **provider/id** (optional **:**_thinking_ suffix).

**--thinking** _level_
> **off**, **minimal**, **low**, **medium**, **high**, **xhigh**, or **max**.

**-t** _list_, **--tools** _list_
> Allowlist tool names. Built-ins include **read**, **write**, **edit**, **bash**, **grep**, **find**, **ls**.

**--no-session**
> Do not save a session file.

**-n** _name_, **--name** _name_
> Session display name at startup.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

**PI_BLACK_NO_UPDATE_CHECK**
> Set to **1** to skip the launcher checksum check against GitHub Releases. **PI_OFFLINE=1** also disables it.

**PI_BLACK_INSTALL_DIR**
> Install location for **install.sh** (default **~/.local/bin**). The runtime unpacks next to the launcher as **pi-black-runtime/**.

**PI_BLACK_RELEASE**
> Pin **install.sh** to a release tag instead of **latest**.

# DESCRIPTION

**pi-black** is an unofficial build of the **Pi** terminal coding agent (**@earendil-works/pi-coding-agent**) that reshapes Anthropic **OAuth** requests so they match **Claude Code 2.1.224** wire conventions. The goal is to spend a Claude **Pro** or **Max** subscription from Pi rather than from Claude Code.

Two install paths exist:

1. **Standalone binary** (this command). `install.sh` downloads a checksum-verified archive for Linux/macOS **x64** or **arm64**, writes **~/.local/bin/pi-black** and **~/.local/bin/pi-black-runtime/**, and may append that directory to PATH. On interactive startup the launcher compares the installed archive digest to the latest GitHub release and offers an update.
2. **Pi package** (recommended upstream). `pi install git:github.com/paoloanzn/pi-black` replaces only the built-in Anthropic provider inside an existing **pi**. API-key requests and non-Anthropic providers pass through. The package **fails closed** unless Pi is **0.84.1**, **0.84.2**, or **0.84.3**.

After Anthropic login (`/login anthropic`), Pi Black reproduces Claude Code request shape for OAuth calls: billing/Agent SDK system-block order, a prompt-dependent **cc_version** suffix, structure-aware **cch** (seeded XXH64), **x-client-request-id**, Claude Code session headers, and optional identity metadata read in memory from **~/.claude.json** (or **CLAUDE_CONFIG_DIR**). Those values are not copied, printed, or persisted.

Otherwise it is Pi: interactive TUI, print/JSON/RPC modes, sessions under **~/.pi/agent/sessions/**, and tools **read** / **write** / **edit** / **bash**. See Pi's own CLI help for the full flag set.

# CAVEATS

Unofficial and **not** affiliated with Anthropic or upstream Pi. Using a Claude subscription this way may violate the provider's terms; users must supply their own credentials and decide whether that is allowed.

The compatibility layer is **version-specific** (Claude Code protocol **2.1.224**; standalone binary based on Pi **0.84.1**). New Pi releases are not accepted until they are revalidated. Checksums cover release assets; they do not make the protocol mapping future-proof.

The agent can edit files and run shell commands. Treat it like any other coding agent: use trusted directories, review tool calls, and prefer containers when untrusted.

Do not confuse this binary with GNU **pi** (digits of π), which occupies the **pi** command name in this library.

# HISTORY

Pi is the minimal coding harness by **Mario Zechner** / Earendil Works (MIT). **Pi Black** (paoloanzn, MIT) pins a Pi commit, applies patches under **patches/**, and publishes both a Pi package and standalone binaries. The package is the maintained install; the binary is a fallback.

# SEE ALSO

[claude](/man/claude)(1), [omp](/man/omp)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [aider](/man/aider)(1), [gemini](/man/gemini)(1)

# RESOURCES

```[Source code](https://github.com/paoloanzn/pi-black)```

```[Documentation](https://pi.dev/docs)```

<!-- verified: 2026-08-28 -->
