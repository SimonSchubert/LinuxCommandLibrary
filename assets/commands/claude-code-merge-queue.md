# TAGLINE

Local merge queue for parallel Claude Code agents

# TLDR

**Install** as a dev dependency and **initialize** the project

```npm install --save-dev claude-code-merge-queue && npx claude-code-merge-queue init```

**Land** the current lane onto the integration branch through the FIFO queue

```claude-code-merge-queue land```

**Sync** the main checkout after landings (reinstall deps if the lockfile changed)

```claude-code-merge-queue sync```

**Preview** a lane's live working tree on the main checkout

```claude-code-merge-queue preview```

**Promote** the integration branch to production (human-only)

```claude-code-merge-queue promote```

**Run a build** serialized across every lane machine-wide

```claude-code-merge-queue build-lock -- [command]```

# SYNOPSIS

**claude-code-merge-queue** _command_ [_options_]

# DESCRIPTION

**claude-code-merge-queue** is a local, zero-cost merge queue for repositories where multiple Claude Code agents land work in parallel. It serializes rebase-and-push landings, runs a configurable check command before each landing, and coordinates worktree "lanes" so agents do not race on shared resources.

Unlike GitHub's merge queue, it runs entirely on the developer's machine, does not require a pull request, and works on any plan or hosting setup. Configuration lives in **claude-code-merge-queue.config.mjs**. **init** writes that config, optional **CLAUDE.md** instructions, a WorktreeCreate hook, and package scripts.

A pre-push hook can reject direct pushes to the integration branch and force agents through **land**. Emergency bypass uses **CLAUDE_CODE_MERGE_QUEUE_EMERGENCY_PUSH=1**.

# COMMANDS

**init**

> Detect integration branch and check command; write config, hooks, and scripts.

**land**

> Rebase and push the current lane onto the integration branch through a FIFO queue.

**sync**

> Fast-forward the main checkout to match what landed; reinstall dependencies if needed.

**promote**

> Ship the integration branch to production. Intended for humans only, not agents.

**preview** / **preview:restore**

> Mirror a lane's working tree onto the main checkout for inspection without a full build.

**port**

> Print a lane's assigned dev-server port.

**prune**

> Remove already-landed sibling lane worktrees.

**build-lock** -- _cmd_

> Run _cmd_ under a machine-wide lock so builds do not overlap across lanes.

**hook worktree-create**

> Claude Code WorktreeCreate hook that assigns numbered lanes.

# CAVEATS

There is no human review gate — only **checkCommand** passing allows a land. Locks are local to one machine. A slow check command caps throughput because the FIFO lock is held for the whole check. Rebase conflicts abort cleanly; agents must resolve and re-run **land**.

# SEE ALSO

[git](/man/git)(1), [npm](/man/npm)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/funador/claude-code-merge-queue)```

```[Homepage](https://www.npmjs.com/package/claude-code-merge-queue)```

<!-- verified: 2026-07-30 -->
