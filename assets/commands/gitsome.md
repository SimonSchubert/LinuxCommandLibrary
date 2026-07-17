# TAGLINE

Enhanced Git/GitHub shell with auto-completion

# TLDR

**Start gitsome shell**

```gitsome```

**View GitHub feed**

```gh feed```

**View trending repos**

```gh trending [python]```

**Search repos**

```gh search-repos [query]```

**View user**

```gh user [username]```

# SYNOPSIS

**gitsome**

# DESCRIPTION

**gitsome** is a supercharged Git/GitHub command line interface. It provides an enhanced shell with GitHub integration, auto-completion, and syntax highlighting.

The tool combines Git commands with GitHub features like viewing feeds, trending repos, and notifications. It offers extensive auto-completion for Git commands and GitHub interactions, all within a customized shell environment.

# CAVEATS

Python tool (installed via `pip3 install gitsome`, requires Python 3.4-3.7). GitHub features need authentication via `gh configure`. The `gh` command it provides is unrelated to GitHub's official `gh` CLI and conflicts with it if both are installed. The project has seen little maintenance since its last release (0.8.0, 2019).

# HISTORY

gitsome was created by **Donne Martin**, built on the xonsh shell, to provide an enhanced command line experience for Git and GitHub users with autocompletion and integrated GitHub feeds.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1), [hub](/man/hub)(1)

# RESOURCES

```[Source code](https://github.com/donnemartin/gitsome)```

<!-- verified: 2026-07-17 -->
