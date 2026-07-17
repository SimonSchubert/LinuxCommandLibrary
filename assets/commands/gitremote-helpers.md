# TAGLINE

Documentation for Git remote helper transport interface

# TLDR

**Documentation reference**

```man gitremote-helpers```

# SYNOPSIS

**git remote-**_transport_ _repository_ [_URL_]

# DESCRIPTION

**gitremote-helpers** is documentation for the remote helper interface in Git. Remote helpers are separate programs that Git invokes to handle transport to remote repositories using protocols or systems it doesn't natively support.

Git communicates with a helper over its standard input/output using a line-based protocol: the helper first responds to a `capabilities` command declaring what it supports (`fetch`, `push`, `import`, `export`, `connect`, `option`, etc.), then handles `list`, `fetch`, and `push` commands as needed. Built-in helpers include `git-remote-http`, `git-remote-https`, and `git-remote-ftp`; third-party helpers exist for systems like Mercurial (`git-remote-hg`) and Bazaar (`git-remote-bzr`).

Git invokes a helper automatically when a remote URL is prefixed with `<transport>::` (e.g. `hg::https://example.com/repo`) or uses a scheme with no built-in transport, by locating an executable named `git-remote-<transport>` on `PATH`.

# CAVEATS

This is protocol documentation, not a runnable command. Helpers are invoked automatically by Git based on the remote URL scheme; you normally don't call `git remote-*` directly. Relevant when implementing custom transport backends.

# HISTORY

The remote helper interface was added to **Git** to enable extensible transport mechanisms, allowing Git to bridge to other version control systems without modifying Git itself.

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-remote-ext](/man/git-remote-ext)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/gitremote-helpers)```

<!-- verified: 2026-07-17 -->
