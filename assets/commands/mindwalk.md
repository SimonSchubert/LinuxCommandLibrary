# TAGLINE

replay coding-agent sessions on a 3D map of your codebase

# TLDR

**Install** and launch (scans Claude Code and Codex session dirs)

```mindwalk```

**Serve** the UI on a fixed port without opening a browser

```mindwalk serve --port [8765] --no-open```

**Open** one session file

```mindwalk open [path/to/session.jsonl]```

**Build** a repository citymap JSON

```mindwalk build [path/to/repo] -o [out.json]```

**Normalize** a session into a trace

```mindwalk trace [session] -o [out.json]```

**Evaluate** a session with a local agent CLI as judge

```mindwalk analyze [session] --judge [claude|codex]```

# SYNOPSIS

**mindwalk** [_command_] [_options_] [_args_]

# DESCRIPTION

**mindwalk** visualizes how a coding agent explored a repository. It reads local Claude Code and Codex session logs, builds a deterministic layout of the repo (a "citymap"), and plays file reads, edits, and searches back as light on a 3D map in the browser.

With no arguments it scans default session directories, serves a local UI on a random port, and opens a browser. Viewing is fully local; optional **mindwalk analyze** (or the Evaluate panel) can send a session summary to your own **claude** or **codex** CLI for judging.

# PARAMETERS

**serve**
> Start the local server (**--port**, **--no-open**, **--claude-dir**, **--codex-dir**)

**open** _session.jsonl_
> Open a specific session (**--no-open** to skip the browser)

**build** _repo_
> Write citymap JSON (**-o** output path)

**trace** _session_
> Write normalized trace JSON

**analyze** _session_
> LLM judge evaluation (**--judge**, **--model**)

# CAVEATS

Session evaluation is opt-in and uses your local agent CLI, which may send a summary of that session to the model behind your account. Reports cache under **~/.mindwalk/reports**.

# SEE ALSO

[claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/cosmtrek/mindwalk)```

<!-- verified: 2026-07-14 -->
