# TAGLINE

Terminal UI dashboard for GitHub pull requests and issues

# TLDR

**Open** the dashboard (requires authenticated **gh**)

```gh dash```

**Or run** the standalone binary

```gh-dash```

**Install** as a GitHub CLI extension

```gh extension install dlvhdr/gh-dash```

# SYNOPSIS

**gh-dash** [*options*]

**gh dash** [*options*]

# DESCRIPTION

**gh-dash** (often installed as the **gh** extension **dash**) is a Bubble Tea terminal UI for GitHub. It shows configurable sections of pull requests and issues, supports vim-style keys, PR checkout/diff/comment workflows, and custom actions driven by a YAML config.

It relies on the official **gh** CLI for authentication and GitHub API access. Diff viewing commonly integrates with **delta**. Full configuration and keybinding docs live at https://gh-dash.dev.

# PARAMETERS

Most behavior is interactive inside the TUI. Common entry points:

**gh dash**

> Launch the dashboard via the **gh** extension.

**gh-dash**

> Launch the standalone binary if installed that way.

Configuration is typically under the user's config directory (see docs for **config.yml** path): section queries, keybindings, themes, and custom commands.

Use **--help** on the installed binary for any CLI flags for the current version.

# CAVEATS

Requires a working **gh auth login** session and network access to GitHub. API rate limits apply. Feature set tracks GitHub permissions for the authenticated user/token.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [delta](/man/delta)(1), [lazygit](/man/lazygit)(1)

# RESOURCES

```[Source code](https://github.com/dlvhdr/gh-dash)```

```[Homepage](https://gh-dash.dev)```

```[Documentation](https://gh-dash.dev/getting-started)```

<!-- verified: 2026-07-19 -->
