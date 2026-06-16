# TAGLINE

Forgejo CLI for the terminal

# TLDR

**Log in** to a Forgejo instance

```fj auth login```

**Clone** a repository

```fj repo clone [owner]/[repository]```

**Create** a new issue interactively

```fj issue create```

**Open** an issue in the browser

```fj issue browse [issue_number]```

**Create** a new pull request

```fj pr create```

**Check out** a pull request branch locally

```fj pr checkout [pr_number]```

**List** the releases of a repository

```fj release list```

**Show** the currently logged-in user

```fj whoami```

# SYNOPSIS

**fj** [_global options_] _command_ [_subcommand_] [_options_]

# DESCRIPTION

**fj** is the command-line interface for **Forgejo**, a self-hosted Git forge (a community-driven fork of Gitea). It lets you interact with Forgejo instances without leaving the terminal: authenticate against one or more servers, manage repositories, and work with issues, pull requests, and releases.

Commands are grouped into nouns such as **auth**, **repo**, **issue**, **pr**, and **release**, each with its own subcommands and flags. Once authenticated, fj reads the remote of the current Git repository to determine which instance and project to act on, so most commands can be run from inside a clone without extra arguments.

# PARAMETERS

**auth**

> Manage authentication. Use **fj auth login** to store credentials for an instance and **fj auth logout** to remove them.

**repo**

> Work with repositories, including **clone**, **create**, and **view**.

**issue**

> Create, list, view, and browse issues.

**pr**

> Create, list, check out, and review pull requests.

**release**

> List and manage repository releases.

**whoami**

> Display the user account that is currently logged in.

# CAVEATS

fj is under active development and its command surface still changes between releases. It targets Forgejo's API; some operations may not work against older Forgejo or Gitea servers.

# SEE ALSO

[tea](/man/tea)(1), [gh](/man/gh)(1), [glab](/man/glab)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://codeberg.org/forgejo-contrib/forgejo-cli)```

<!-- verified: 2026-06-16 -->
