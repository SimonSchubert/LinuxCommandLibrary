# TAGLINE

Keyboard-first git diff reviewer with LSP and GitHub comments

# TLDR

Review **HEAD vs the worktree** (staged, unstaged, and untracked)

```diffle```

The same comparison, named as a **shorthand**

```diffle working```

What this branch added **since it left** another branch

```diffle [develop]```

Any **git-diff revspec**, including `worktree` on either side

```diffle [main]..[feat]```

Review **GitHub pull request** 27 (or its URL)

```diffle pr [27]```

The pull request **for this branch**

```diffle pr```

One **commit**, like `git show`

```diffle show [a1b2c3d]```

How one series of commits **became another**, like `git range-diff`

```diffle range-diff [main]..[v1] [main]..[v2]```

Bind on all interfaces and **do not open** a browser

```diffle working -H 0.0.0.0 --no-open```

Keep the server **after the last tab closes**

```diffle working --keep-alive```

Override the **Python language server** for this run

```diffle working --lsp python="pyrefly lsp"```

Start **no language servers**

```diffle working --no-lsp```

Print which language server **each language would get**

```diffle lsp```

Print the **user config** path and JSON

```diffle config show```

Write a **bash completion** script

```diffle completion --shell bash > ~/.local/share/bash-completion/completions/diffle```

Print the **version**

```diffle -v```

# SYNOPSIS

**diffle** [_options_] [_revs_...]

**diffle** **working** [_options_]

**diffle** **show** [_rev_] [_options_]

**diffle** **pr** [_number_|_url_] [_options_]

**diffle** **range-diff** _ranges_... [_options_]

**diffle** **config** _subcommand_ [_args_]

**diffle** **lsp**

**diffle** **completion** **--shell** **bash**|**zsh**|**fish**

# DESCRIPTION

**diffle** reviews a git diff in a local browser UI. It starts an HTTP server (default **127.0.0.1:4966**, or the next free port), opens a tab, and lets you comment on lines, blocks, or whole files with keyboard shortcuts. Closing the last auto-opened tab stops the server and prints the open comments on stdout as a prompt for an agent. **Ctrl+C** always stops it.

The npm package is **@moritzwilksch/diffle** (command **diffle**). The published version is **0.2.4**. The npm package needs **Node.js 24** or newer. A standalone binary install needs no Node: `curl -fsSL https://diffle.app/install.sh | sh` writes to `~/.local/bin`. **pixi global install diffle** and **nix run github:moritzwilksch/diffle** are the same CLI.

Without revisions, **diffle** compares **HEAD..worktree**, like a bare `git diff`. A lone revision compares from the merge base (`diffle main` is `main...HEAD`). `worktree` names the uncommitted tree on either side of a revspec. **pr** needs a GitHub token. A PR from another repository opens in a temporary clone.

Comments live under **\<git-dir\>/diffle/** and never touch the worktree. They follow their text as the code changes and go stale once it leaves the diff. Generated files start collapsed when `.gitattributes` marks them `linguist-generated`. The pull-request icon adds open threads to a **pending** GitHub review; diffle never submits it.

Language servers start for languages in the diff when a matching program is on **PATH**. Symbol navigation needs the new side of the comparison to be the checkout. Language servers run through a shell inside the repository and can read anything the user can.

# COMMANDS

**working**
> Same as `HEAD..worktree`: uncommitted changes, staged and untracked included. Hidden shorthand; listed in help as a revspec shortcut

**show** [_rev_]
> One commit against its first parent, as `git show` shows it (`<rev>^!`). Default **HEAD**

**pr** [_number_|_url_]
> A GitHub pull request as GitHub shows it: merge-base(base, head) vs head. Without an argument, the pull request for this branch

**range-diff** _ranges_...
> How one series of commits became another, as `git range-diff` shows it: `<a>..<b> <c>..<d>`, `<base> <b> <d>`, or `<b>...<d>`

**config show**
> Print the config file path and contents (default subcommand of **config**)

**config add-auto-viewed** _glob_...
> Add picomatch patterns for files that start viewed and collapsed (for example `*.lock`)

**config remove-auto-viewed** _glob_...
> Remove auto-viewed patterns

**config set-context** _n_
> Set context lines around changes (0–10000)

**config set-follow-refs** **on**|**auto**|**off**
> When a review between refs recomputes as those refs move. **on**: reload at once. **auto** (default): wait for Reload when an endpoint names a branch. **off**: offer a Reload button

**config set-lsp** _language_ _command_
> Set the stdio language-server command for one language. An empty command turns that language off

**config unset-lsp** _language_...
> Drop language-server overrides so those languages resolve on PATH again

**lsp**
> Print the language server each known language would get, and what is missing from PATH

**completion** **--shell** _shell_
> Print a standalone completion script for **bash**, **zsh**, or **fish**. The script does not start Node; rerun after upgrading

# PARAMETERS

**-C** _path_
> Run as if started in _path_ (any directory inside a git worktree)

**-p**, **--port** _port_
> Port to listen on. Default **4966**, or the next free one. **0** picks a random port

**-H**, **--host** _host_
> Address to bind. Default **127.0.0.1**. Use **0.0.0.0** to expose on the network

**--allowed-origin** _origin_
> Trusted public HTTP(S) origin behind a reverse proxy, without a path (for example `https://proxy.example`)

**--no-open**
> Do not open a browser

**--keep-alive**
> Keep the server running after all browser tabs close

**--no-watch**
> Do not watch the worktree or refs for changes

**--auto-viewed** _glob_
> Mark matching files viewed for this session (repeatable)

**-U**, **--context** _n_
> Context lines around changes for this session (0–10000). Default from config, **5**

**--lsp** _language=command_
> Language-server command for one language for this run (repeatable). Default: the diff's languages, resolved on PATH

**--no-lsp**
> Do not start any language server

**--timing**
> Print startup phase timings to stderr

**--dev**
> Serve the client through Vite (development). Also on when **DIFFLE_DEV=1**

**-v**, **--version**
> Print the version and exit

**-h**, **--help**
> Print usage

_revs_...
> Git-diff style revisions: `<rev>`, `<a>..<b>`, `<a>...<b>`, or `<a> <b>`. Without them, **HEAD..worktree**

# CONFIGURATION

**$XDG_CONFIG_HOME/diffle/config.json**
> User config (default `~/.config/diffle/config.json`). Machine-wide, not per repository. Mode **0600**. The same settings appear in the UI dialog. **diffle config** reads and writes this file

**autoViewed**
> Picomatch globs for files that start viewed and collapsed. Empty by default

**contextLines**
> Unchanged lines shown around each change (`git -U`). Default **5**

**followRefs**
> **on**, **auto**, or **off**. Default **auto**

**lspCommands**
> Per-language shell commands that start a stdio language server. An empty value turns that language off. Unknown language keys are ignored

**\<git-dir\>/diffle/**
> Per-repository comment store. Does not modify the worktree

# ENVIRONMENT

**GITHUB_TOKEN** / **GH_TOKEN**
> GitHub token for **diffle pr** and exporting threads. If both are unset, a signed-in **gh** token is used. Without a token, everything except GitHub still works

**GITHUB_API_URL**
> GitHub API base URL (for example in Actions, or another GitHub instance)

**XDG_CONFIG_HOME**
> Config directory. Default `~/.config`

**DIFFLE_INSTALL_DIR**
> With `install.sh`, install directory. Default `~/.local/bin`

**DIFFLE_VERSION**
> With `install.sh`, pin a tagged release (for example `v0.1.9`)

**DIFFLE_DEV**
> When **1**, serve the client through Vite, same as **--dev**

**NO_COLOR**
> Disable ANSI colors on stderr

# CAVEATS

The review UI is a local web app, not a terminal TUI. Status goes to stderr so stdout can carry the comment prompt on shutdown.

**diffle pr** and GitHub export need a token. Export works only when the comparison matches the PR's committed diff: unpushed commits and worktree changes rule it out. Stale threads are skipped. Diffle adds threads to a pending review and never submits it.

Language servers run with the user's permissions inside the repository. **--no-lsp** starts none. Symbol navigation is off when the new side is not the checkout.

The npm package requires Node.js **24** or newer. The standalone binary does not. Completions are static: rerun **diffle completion** after an upgrade. Revisions do not complete.

Behind a reverse proxy, strip the path prefix (including WebSocket upgrades at `/diffle/ws`) and pass **--allowed-origin**. A rejected request returns **403** naming the header that failed.

# HISTORY

**diffle** is an Apache-2.0 project by Moritz Wilksch. First tagged releases appeared in **September 2026**. Version **0.2.0** (6 October 2026) made ref comparisons reload on request instead of recomputing them automatically. **0.2.4** was released on **7 October 2026**. The UI is inspired by difit; diffs are rendered with **@pierre/diffs**.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-show](/man/git-show)(1), [git-range-diff](/man/git-range-diff)(1), [git-difftool](/man/git-difftool)(1), [gh](/man/gh)(1), [delta](/man/delta)(1), [difft](/man/difft)(1)

# RESOURCES

```[Source code](https://github.com/moritzwilksch/diffle)```

```[Homepage](https://diffle.app)```

<!-- verified: 2026-10-11 -->
