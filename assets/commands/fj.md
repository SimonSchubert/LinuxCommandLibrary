# TAGLINE

Forgejo CLI for the terminal

# TLDR

**Authenticate** against a Forgejo instance

```fj auth login```

List the instances you are **already logged in to**

```fj auth list```

Show which **account** the current instance sees

```fj whoami```

**Clone** a repository

```fj repo clone [owner]/[repo]```

**Fork** a repository into your own account

```fj repo fork [owner]/[repo]```

Print a repository's **README** without leaving the terminal

```fj repo readme [owner]/[repo]```

**Star** a repository

```fj repo star [owner]/[repo]```

**Search** the issues of the current repository

```fj issue search```

**Open** a new issue

```fj issue create```

**Read** a single issue

```fj issue view [42]```

**Comment** on an issue

```fj issue comment [42]```

**Close** an issue

```fj issue close [42]```

Open a **pull request** from the current branch

```fj pr create```

Check the **CI status** of a pull request

```fj pr status```

**Check out** a pull request branch locally

```fj pr checkout [7]```

**Merge** a pull request

```fj pr merge [7]```

Show a **published release**

```fj release view [v1.2.0]```

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
