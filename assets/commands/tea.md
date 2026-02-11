# TAGLINE

Gitea command-line client

# TLDR

**Log in to a Gitea instance**

```tea login add --url [https://gitea.example.com] --token [your_token]```

**List issues** in the current repository

```tea issues```

**Create a new issue**

```tea issues create --title "[Bug report]" --body "[Description]"```

**List pull requests**

```tea pulls```

**Create a pull request**

```tea pulls create --title "[Feature]" --base [main] --head [feature-branch]```

**Checkout a pull request** locally

```tea pulls checkout [42]```

**List repositories**

```tea repos```

**Clone a repository**

```tea clone [owner/repo]```

# SYNOPSIS

**tea** _command_ [_subcommand_] [_options_]

# COMMANDS

**logins**
> Manage Gitea server authentications (add, list, delete, default)

**logout**
> Remove authentication from a Gitea server

**whoami**
> Display currently authenticated user

**issues**
> Create, list, and manage issues (create, list, edit, close, reopen)

**pulls**, **pr**
> Manage pull requests (create, list, checkout, merge, approve, reject)

**repos**
> Display and manage repositories (list, create, fork, delete, migrate)

**branches**
> Examine and manage branches (list, protect, unprotect)

**labels**
> Manage issue labels (create, list, update, delete)

**milestones**
> Track project milestones (create, list, close, reopen)

**releases**
> Manage releases (create, list, delete, edit, assets)

**organizations**
> Manage organizations (list, create, delete)

**times**
> Track time on issues

**notifications**
> View and manage notifications

**comment**
> Add comments to issues or pull requests

**open**
> Open repository in web browser

**clone**
> Clone a repository

# PARAMETERS

**--login**, **-l** _name_
> Use a specific login configuration

**--repo**, **-r** _owner/repo_
> Specify repository (default: detected from current directory)

**--output**, **-o** _format_
> Output format: simple, table, csv, tsv, yaml, json

**--help**, **-h**
> Show help for command

**--version**, **-v**
> Show version

# DESCRIPTION

**tea** is a command-line client for interacting with Gitea servers. It provides functionality similar to GitHub's **gh** CLI, allowing management of repositories, issues, pull requests, and other entities directly from the terminal.

The tool uses context from the current git repository when available, detecting the remote Gitea server and repository automatically. It works best with an upstream/fork workflow where the local main branch tracks the upstream repository.

Multiple Gitea instances can be configured via **tea logins add**, with one set as default. Configuration is stored in **$XDG_CONFIG_HOME/tea** (typically ~/.config/tea).

Useful commands include **tea pulls checkout** to fetch and switch to a PR branch locally, and **tea open** to quickly open the current repository in a web browser.

# CAVEATS

tea assumes local git state is published to the remote before performing operations. Some commands require appropriate permissions on the Gitea server. The tool is designed specifically for Gitea and may not work with other forges.

# HISTORY

**tea** was developed by the **Gitea** project as the official command-line interface for Gitea servers. Written in **Go**, it uses the Gitea SDK to interact with the Gitea API. The project is hosted on Gitea's own platform at gitea.com/gitea/tea.

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1), [glab](/man/glab)(1), [hub](/man/hub)(1)
