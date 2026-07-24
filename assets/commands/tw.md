# TAGLINE

Twigg CLI for trunk-based version control and stacked commits

# TLDR

**Show** repository status / commit stack

```tw```

**Initialize** Twigg in the current directory

```tw init```

**Clone** a repository

```tw clone [user/repo]```

**Set** your CLI API key

```tw key [tw_key_...]```

**Create a commit** with a title

```tw commit "[title]"```

**Push** the current commit stack to the server

```tw push```

**Pull** submitted commits from the server

```tw pull```

**Short status** (conflicts and working tree)

```tw st```

**Rebase** current commit onto a new parent

```tw rebase [target]```

**Show version**

```tw version```

# SYNOPSIS

**tw** [_command_] [_args_...]

# PARAMETERS

**init**
> Initialize Twigg metadata in the current directory.

**clone** _user/repo_
> Clone a repository from the Twigg server (prompts for a CLI key if needed).

**key** _CLI_KEY_
> Store the authentication key from user settings (**tw_key_...**).

**commit** _title_
> Snapshot tracked files into a new local commit with the given title.

**push**
> Push the current commit and unsubmitted parents until a commit already on the server is reached. May trigger path-based CI.

**pull** [_server_commit_]
> Pull submitted commits, or a specific pending server commit (server id syntax, e.g. **c/7**).

**rebase** [_source_] _target_
> Rebase _source_ (default: current commit **@**) onto _target_. Descendants are rebased automatically. Conflicts produce conflicted commits to resolve with amend rather than aborting mid-stack.

**st**, **status**
> Working-tree and conflict status.

**amend**
> Create a new version of the current commit after editing (including conflict resolution).

**restore**, **load**, **server**, **ci-list**
> Restore a previous commit version; load files without committing; set server repository URL; list CI configs that would run for the current commit. See official docs for full flags.

**-a**
> With the default stack view, show all commit versions / history edges (e.g. rebase lineage).

**version**, **-v**
> Print the CLI version.

# DESCRIPTION

**tw** is the command-line client for **Twigg**, an open-source version control system and software forge (not a Git wrapper) built for closed-team collaboration. The default workflow is trunk-based development with small stacked commits: each change is a short-lived commit reviewed and submitted independently, stacking on parents rather than long feature branches.

The CLI manages a local commit graph with local ids (**#N**) and versions (**vM**), server ids (**c/N**), and a current commit (**@**). Day-to-day flow is edit → **tw commit** → **tw push** for review, **tw pull** to update, and **tw rebase** when restacking. Hierarchical **OWNERS**, integrated code review, and path-filtered CI/CD are first-class on the server side.

Install prebuilt binaries from **twigg.vc** (Linux, macOS Intel/Apple Silicon, Windows) or build with Go: **cd tw && go install** from the monorepo. Hosted service at **https://twigg.vc**; optional Git mirror for interoperability. Source and server components are AGPL-3.0.

# CAVEATS

Not compatible with Git commands in the same working tree model—Twigg is a separate VCS. Authentication uses a generated CLI key, not SSH by default. Conflicted rebases create conflict-bearing commits that block some operations until **amend** resolves them. Self-hosting and local builds need the full monorepo stack (Go, and for servers: node, docker/LXD as applicable). Public repositories were not supported on the hosted forge at first release (GitHub is used as a read-only source mirror for Twigg itself).

# HISTORY

Developed as a from-scratch VCS and forge emphasizing big-tech-style trunk-based stacked workflows. Released as open source under AGPL-3.0 with documentation at **twigg.vc/docs**. Production use reported for the project's own development and partner companies.

# SEE ALSO

[git](/man/git)(1), [jj](/man/jj)(1), [hg](/man/hg)(1)

# RESOURCES

```[Source code](https://github.com/twigg-vc/monorepo)```

```[Homepage](https://twigg.vc)```

```[Documentation](https://twigg.vc/docs/v/2/)```

<!-- verified: 2026-07-24 -->
