# TAGLINE

TUI for tracking GitHub pull requests from the terminal

# TLDR

**Launch with config file** (defaults to query mode)

```prs```

**Run in query mode** with GitHub search syntax

```prs -q '[type:pr author:@me state:open]'```

**Run in repos mode** with an explicit repo list

```prs -m repos --repos='[owner/repo1,owner/repo2]'```

**Limit number of results**

```prs -q '[type:pr state:open]' -n [30]```

**Use a custom config file**

```prs --config-path [path/to/prs.yml]```

# SYNOPSIS

**prs** [_options_]

# PARAMETERS

**-m**, **--mode** _MODE_
> Operating mode: `query` (search PRs with GitHub search syntax, default) or `repos` (browse a predefined repository list).

**-q**, **--query** _QUERY_
> GitHub search query to run in query mode. Same syntax as github.com's PR search.

**--repos** _LIST_
> Comma-separated list of `owner/repo` entries used in repos mode.

**-n**, **--num** _N_
> Maximum number of PRs to fetch per page.

**--config-path** _FILE_
> Path to the YAML configuration file (default `~/.config/prs/prs.yml`).

**-h**, **--help**
> Show help.

# CONFIGURATION

Configuration sources, in order of precedence: command-line flags → environment variables (`PRS_QUERY`, `PRS_REPOS`, `PRS_MODE`, `PRS_NUM`) → YAML config file.

The YAML file lets you store reusable queries and repo lists so `prs` can be launched with no arguments.

# KEYBOARD SHORTCUTS

**General**

- `q` / `esc` / `ctrl+c` — go back
- `Q` — quit from anywhere
- `?` — open help view

**PR list view**

- `⏎` / `tab` — switch to timeline view
- `ctrl+s` — switch to repo list (repos mode)
- `d` — open PR details
- `ctrl+d` — show PR diff
- `ctrl+v` — show PR details using `gh`
- `ctrl+r` — reload list
- `ctrl+b` — open PR in browser

**Details / timeline**

- `h` / `l` / `←` / `→` — navigate sections
- `J` / `K` / `[` / `]` — move between PRs

# DESCRIPTION

**prs** is a terminal user interface for watching GitHub pull requests without leaving the terminal. Query mode runs arbitrary GitHub PR searches; repos mode cycles through a curated repo list and shows each repo's open PRs. The tool shells out to `gh` for some actions (details, diff view) and uses the GitHub API for listings.

# CAVEATS

Requires authentication via the `gh` CLI or a `GITHUB_TOKEN` in the environment. API rate limits apply when fetching large result sets.

# HISTORY

**prs** was created by **dhth** and is written in **Go**. Source lives at github.com/dhth/prs.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [hub](/man/hub)(1)
