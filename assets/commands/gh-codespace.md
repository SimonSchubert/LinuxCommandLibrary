# TAGLINE

manage cloud-hosted development environments

# TLDR

**List codespaces**

```gh codespace list```

**Create a codespace**

```gh codespace create```

**Create for specific repo**

```gh codespace create -r [owner/repo]```

**SSH into codespace**

```gh codespace ssh```

**Stop a codespace**

```gh codespace stop -c [codespace_name]```

**Delete a codespace**

```gh codespace delete -c [codespace_name]```

**Open in VS Code**

```gh codespace code```

# SYNOPSIS

**gh** **codespace** _command_ [_options_]

# SUBCOMMANDS

**list**
> List codespaces.

**create**
> Create a codespace.

**ssh**
> SSH into codespace.

**code**
> Open in VS Code.

**stop**
> Stop a codespace.

**delete**
> Delete a codespace.

**ports**
> Manage ports.

**logs**
> View logs.

# PARAMETERS

**-r**, **--repo** _owner/repo_
> Repository.

**-c**, **--codespace** _name_
> Codespace name.

**-m**, **--machine** _type_
> Machine type.

# DESCRIPTION

**gh codespace** manages GitHub Codespaces, cloud-hosted development environments. Create, connect, and manage codespaces from the CLI.

# INSTALL

```apt: sudo apt install gh```

```dnf: sudo dnf install gh```

```pacman: sudo pacman -S github-cli```

```apk: sudo apk add github-cli```

```zypper: sudo zypper install gh```

```brew: brew install gh```

```nix: nix profile install nixpkgs#gh```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)

# RESOURCES

```[Documentation](https://cli.github.com/manual/gh_codespace)```

```[Source code](https://github.com/cli/cli)```

<!-- verified: 2026-07-15 -->

