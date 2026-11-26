# TAGLINE

Map a codebase and review what a change affects

# TLDR

Install the coding-agent **skill**

```genesis agent install --agent claude```

Show whether the skill is **installed**

```genesis agent status```

**Count** the files a map would read

```genesis map size```

**Prepare** a session for the working tree

```genesis map prepare```

Prepare a **review** against a revision

```genesis map prepare --base main```

**Render** the HTML report

```genesis map render --repo . --session [id]```

# SYNOPSIS

**genesis** _command_ [_options_]

# PARAMETERS

**agent install**
> Install the Genesis skill for a coding agent. **--agent** is **claude**, **codex**, or **both**.

**agent status**
> Report whether the skill is installed.

**version**
> Print the version.

**map size**
> Count the source files **prepare** would read, and estimate how long it takes. **--base** and **--head** select a review range. **--include-untracked** counts new files. **--exclude** skips a path from the repository root and may be repeated. **--max-files** is the limit prepare will use.

**map prepare**
> Snapshot the repository and start a session. **--repo** is the git root (default is the current directory). **--base** compares against a revision. Prints a session id.

**map status**
> List tasks in a session.

**map plan**, **map context**, **map query**, **map read**, **map submit**
> Steps a coding agent uses while it reads the snapshot. **map** with no extra command prints help.

**map diff**
> Compare the two versions prepare recorded and list the changes.

**map render**
> Write the HTML view and the summary next to it.

# DESCRIPTION

**genesis** builds a local map of how a repository's code fits together, and a review of what changed between two versions. It does not call a model and it does not run the project's tests. A coding agent does the reading. The command checks that each step the agent writes quotes lines that exist in a frozen snapshot of the repo, and it parses Python itself so a path the agent skips is marked partial.

The usual human entry points are **agent install** and, inside the agent, a request to map the project or review a revision. The map commands are what that skill runs. Output is written under a **.genesis** directory in the project. **render** produces an HTML page and a summary file.

Python projects get the most precise results. Other languages still work: the agent reads them, and Genesis checks the quotes against the source.

# CAVEATS

**prepare** needs a git repository and write access to **.genesis** in that project. The command refuses a "covered" verdict when the cited test does not actually assert anything, and, for Python, a "not reached" verdict when a test calls the changed function directly. Test verdicts come from reading tests, not from running them. The name **genesis** is this tool; other projects use the same word.

# SEE ALSO

[git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/GenesisAgentInfra/genesis)```

```[Documentation](https://github.com/GenesisAgentInfra/genesis/blob/main/docs/usage.md)```

<!-- verified: 2026-11-26 -->
