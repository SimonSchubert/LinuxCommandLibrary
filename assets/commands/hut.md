# TAGLINE

CLI for SourceHut services

# TLDR

**Set up hut's configuration** (prompts for an OAuth2 access token)

```hut init```

**List your Git repositories**

```hut git list```

**Create a new Git repository**

```hut git create [repo-name]```

**List build jobs**

```hut builds list```

**List issue trackers**

```hut todo list```

**Create a paste from a file**

```hut paste create [file]```

# SYNOPSIS

**hut** _service_ _command_ [_options_]

# PARAMETERS

_SERVICE_
> SourceHut service to operate on.

_COMMAND_
> Command within that service (commonly **list**, **create**, **show**, **update**, **delete**).

**builds**
> Manage build jobs on builds.sr.ht.

**git**
> Manage Git repositories on git.sr.ht.

**hg**
> Manage Mercurial repositories on hg.sr.ht.

**lists**
> Manage mailing lists and patchsets on lists.sr.ht.

**meta**
> Manage account settings, SSH/PGP keys, and profile info.

**pages**
> Publish static websites to pages.sr.ht.

**paste**
> Create and share text pastes on paste.sr.ht.

**todo**
> Manage issue trackers and tickets on todo.sr.ht.

**graphql**
> Run a raw GraphQL query against a given service.

**init**
> Set up hut's configuration file with an OAuth2 token.

**export** / **import**
> Back up or restore account data.

**--config** _FILE_
> Use a specific configuration file.

**--instance** _NAME_
> Select which sr.ht instance to use.

**--debug**
> Print the underlying GraphQL requests to stderr.

# DESCRIPTION

**hut** is the official command-line client for SourceHut (sr.ht) services. It provides access to builds, Git and Mercurial repositories, issue trackers, mailing lists, pastes, static site hosting, and account management, all backed by each service's GraphQL API.

Commands follow a **hut** _service_ _command_ pattern, so most operations map directly onto one of the sr.ht services. The **graphql** subcommand also allows running arbitrary GraphQL queries against any service for tasks not otherwise covered.

# CAVEATS

Requires a SourceHut account and an OAuth2 access token, configured via **hut init**. Available services and their subcommands vary by sr.ht instance and hut version; run **hut help** or **hut** _service_ **--help** to see what's supported locally.

# HISTORY

hut is the official CLI for **SourceHut** (sr.ht), a lightweight, privacy-focused software development platform created by **Drew DeVault**. It is written in Go and replaced earlier ad-hoc scripts for scripting SourceHut services from the command line.

# INSTALL

```apt: sudo apt install hut```

```dnf: sudo dnf install hut```

```pacman: sudo pacman -S hut```

```apk: sudo apk add hut```

```zypper: sudo zypper install hut```

```brew: brew install hut```

```nix: nix profile install nixpkgs#hut```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git](/man/git)(1), [gh](/man/gh)(1), [hub](/man/hub)(1)
