# TAGLINE

terminal UI for GitHub pull requests across repositories

# TLDR

**Open** the pull-request TUI (requires **gh** auth)

```ghui```

**Cap** how many PRs are fetched

```GHUI_PR_FETCH_LIMIT=100 ghui```

# SYNOPSIS

**ghui**

# DESCRIPTION

**ghui** is a keyboard-driven TUI for reviewing GitHub pull requests across repositories. From one screen you can inspect PR details and diffs, leave diff comments, manage labels, toggle draft state, merge or close, open the PR in a browser or editor, copy metadata, and inspect GitHub Actions runs for the PR's head commit.

It talks to GitHub through the GitHub CLI. **gh** must be installed and authenticated (**gh auth login**) before **ghui** will work. Omarchy lazy-installs **ghui** the first time you type the command.

Config lives in **~/.config/ghui/config.json** (or **GHUI_CONFIG_DIR**). Optional **editorCommand** and **repoPaths** entries let **e** hand the selected PR to nvim, tmux, VS Code, and similar.

# PARAMETERS

There are no subcommands. Behavior is controlled by the TUI, environment variables, and **config.json**.

**GHUI_PR_FETCH_LIMIT**
> Maximum PRs fetched (default 200).

**GHUI_RUN_FETCH_LIMIT**
> Maximum workflow runs fetched per PR (default 20).

**GHUI_CONFIG_DIR**
> Override the directory for **config.json**.

# CAVEATS

Requires a working **gh** login. Fetch limits and GitHub rate limits apply on large accounts. UI details and keybindings change between releases; press **?** / the command palette in-app.

# INSTALL

```nix: nix profile install nixpkgs#ghui```

<!-- packages: 2026-08-29 -->

# SEE ALSO

[gh](/man/gh)(1), [lazygit](/man/lazygit)(1)

# RESOURCES

```[Source code](https://github.com/kitlangton/ghui)```

<!-- verified: 2026-08-29 -->
