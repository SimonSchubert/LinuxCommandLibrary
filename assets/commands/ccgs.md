# TAGLINE

Share Claude Code sessions through a git branch

# TLDR

**Publish your local sessions** to the shared branch

```ccgs push```

**Push only a specific session** by id or name

```ccgs push [session_id]```

**Fetch shared sessions** into the local project

```ccgs pull```

**Run without installing** through npx

```npx claude-git-sessions pull```

**Delete a shared session** by name without a prompt

```ccgs delete [name] --yes```

**Share memory facts** with the team

```ccgs memory push```

**Push to a private session set** (branch @ccgs/[name])

```ccgs push -b [my-wip]```

**Resume a pulled session** with Claude Code

```claude --resume [session_id]```

# SYNOPSIS

**ccgs** _command_ [_targets ..._] [_options_]

# DESCRIPTION

**ccgs** (claude-git-sessions) shares **Claude Code** transcripts across a team by storing them on an **orphan git branch** (named @ccgs/_name_, default @ccgs/default) inside an existing repository, with no server or extra infrastructure. Sessions are keyed by their Claude Code session UUID so authors do not collide.

The tool uses low-level git plumbing (**hash-object**, **write-tree**, **commit-tree**, **push**) against a temporary index, so it never touches the working tree or current branch and works even on a dirty repository. Each session is stored as **sessions/**_id_**.jsonl** plus a **.meta.json** sidecar. On **pull** sessions are written under the repository root's project directory in ~/.claude/projects (or **CLAUDE_CONFIG_DIR**) and the cwd field of each transcript is rewritten so that **claude --resume** works from the repository root. The same mechanism stores shared memory facts.

# COMMANDS

**pull** [**--force**] [**--exclude-memory**]
> Fetch sessions (and, by default, shared memory) from the branch into the local project. Local sessions newer than the shared copy are skipped unless --force is given. Prints nothing to pull if the branch does not exist.

**push** [_targets ..._] [**--exclude-memory**]
> Publish local sessions to the branch. Name specific sessions, or push all if no target is given. Creates the orphan branch on first push.

**delete** _id|name_ [**-y**, **--yes**] [**--local**]
> Remove a session by UUID, UUID prefix (4 or more chars) or unique name. Prompts unless --yes; affects only the shared branch unless --local is given.

**memory push** [**--all**]
> Publish memory facts; shares project and reference facts by default, --all also includes user and feedback facts.

**memory pull** [**--all**] [**--force**]
> Fetch shared memory facts and merge them into the local memory directory.

# OPTIONS

**-b**, **--branch** _name_
> Select the session set / branch suffix (default: default).

**--remote** _remote_
> Git remote to use (default: origin).

**-v**, **--version**
> Print the version.

**-h**, **--help**
> Show help.

# CAVEATS

Requires **Node 20+** and **git 2.5+**. Sessions live on a branch that shares no history with the main branch; pushing publishes transcript content to the remote, so treat that remote as you would any shared store of conversation data. Transcripts are pushed verbatim with no secret redaction. Only the repository root's memory directory is synced.

# HISTORY

**ccgs** is an open-source tool written in **TypeScript** by **Ingram Technologies**, distributed on npm as **claude-git-sessions** under the **MIT** license.

# SEE ALSO

[claude](/man/claude)(1), [git](/man/git)(1), [npx](/man/npx)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/ingram-technologies/claude-git-sessions)```

<!-- verified: 2026-11-23 -->
