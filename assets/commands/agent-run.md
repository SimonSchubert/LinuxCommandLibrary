# TAGLINE

run a coding agent inside a bwrap sandbox on Linux

# TLDR

**Run** a supported agent in a sandbox

```agent-run [claude]
agent-run [codex]
agent-run [opencode]
agent-run [pi]```

Use an explicit **config** file

```agent-run --config [path/to/config.toml] [claude]```

# SYNOPSIS

**agent-run** [_options_] _agent_ [_agent-args_...]

# DESCRIPTION

**agent-run** launches coding agents (Claude Code, Codex, OpenCode, pi, and others configured by tool name) inside a **bubblewrap** (**bwrap**) sandbox. The host filesystem is mounted read-only; selected paths can be made writable per tool. Configuration is TOML: global defaults plus per-tool **mount**, **env**, **network**, and **inherit_env** settings.

Config is taken from **--config** or the nearest **.agent-run/config.toml** walking up from the current directory. If none is found, defaults allow network and environment inheritance. The binary is a small standalone executable that embeds bwrap and execs it via memfd.

# PARAMETERS

**--config** _path_
> Path to TOML configuration

_agent_
> Tool name matching **tools.<name>** in config (basename of the first argument selects the tool profile)

# CONFIGURATION

Example fragment:

```
[global]
network = true
inherit_env = true
mount = ["~/.cache", ".."]

[tools.claude]
mount = ["~/.claude", "~/.claude.json"]
```

JSON schema for editors: the project's **schema.json**. **RUST_LOG=debug** or **trace** enables diagnostics.

# CAVEATS

Linux only; needs unprivileged user namespaces. Designed to catch agent mistakes, not fully isolate malicious code: the whole host FS is visible read-only, and with network enabled data exfiltration remains possible. Prefer microVMs for stronger isolation.

# SEE ALSO

[bwrap](/man/bwrap)(1), [clawk](/man/clawk)(1)

# RESOURCES

```[Source code](https://github.com/sin-ack/agent-run)```

<!-- verified: 2026-07-14 -->
