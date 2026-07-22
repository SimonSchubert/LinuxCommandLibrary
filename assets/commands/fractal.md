# TAGLINE

Hierarchical agent loops in git worktrees

# TLDR

**Install** the CLI from PyPI

```pip install plasma-fractal```

**Open** the live TUI dashboard for an initialized project

```fractal open```

**Install** bundled agent skills into your agent config

```fractal install```

**Show** top-level help

```fractal --help```

**Open** the dashboard with a light color scheme

```fractal open --light```

# SYNOPSIS

**fractal** [_command_] [_options_]

# DESCRIPTION

**fractal** (Python package **plasma-fractal**) runs hierarchical autonomous agent loops that organize themselves into a tree. Each node iterates toward a goal inside its own **git worktree** and can spawn child nodes for separable subtasks, so the tree grows to fit the problem rather than a fixed plan.

Hard caps (iterations, depth, children, cost, time) bound every loop; an operator can steer or stop work at any time. Run metadata including cost is stored in a local **SQLite** database and can be watched live in a terminal UI (**fractal open**). Agents run in **tmux** sessions.

Supported agent backends include Claude Code (**claude**), Codex (**codex**), Grok Build (**grok**), OpenCode (**opencode**), and Oh My Pi (**omp**), selected per node with **--agent**. Claude and Codex can route through OpenRouter via **--provider=openrouter** when **OPENROUTER_API_KEY** is set.

Nodes are commonly spawned via the **/fractal** agent skill (plugin marketplace or **fractal install**), which walks through node parameters and launches work in tmux. The CLI is also usable directly; run **fractal \<command\> --help** for per-command flags.

# PARAMETERS

**open** [**--light**]
> Open the TUI dashboard from a project root that has been initialized as a fractal. **--light** suits light terminal themes.

**install** [**--link**] [**--project**]
> Copy or symlink fractal and wiki skills into agent skill directories (**~/.claude/skills**, **~/.agents/skills**). **--link** symlinks instead of copying; **--project** limits install to the current project.

Other subcommands manage node lifecycle, runs, and configuration (see **fractal --help** and **fractal \<command\> --help**). Common node parameters when spawning include **name**, **path**, **base** branch, **agent**, **provider**, **model**, **max-iters**, **max-depth**, **max-children**, **timeout**, **max-cost**, and related budget/time limits.

# CAVEATS

Requires a git repository and, for live agent sessions, **tmux** plus the chosen agent CLI on **PATH**. Cost caps and provider routing depend on correct API credentials. **pipx**/**uv tool** installs may need **plasma-wiki** co-installed so the **wiki** helper is available. Node names are restricted (letters, digits, and **_** only in the skill workflow).

# HISTORY

**fractal** is an Apache-2.0 project from Plasma AI for recursive multi-agent worktrees with local observability.

# INSTALL

```dnf: sudo dnf install fractal```

```pacman: sudo pacman -S fractal```

```apk: sudo apk add fractal```

```zypper: sudo zypper install fractal```

```nix: nix profile install nixpkgs#fractal```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tmux](/man/tmux)(1), [git](/man/git)(1), [git-worktree](/man/git-worktree)(1)

# RESOURCES

```[Source code](https://github.com/plasma-ai/fractal)```

```[Documentation](https://docs.plasma.ai/fractal)```

<!-- verified: 2026-07-22 -->
