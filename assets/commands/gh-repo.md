# TAGLINE

Manage GitHub repositories from the command line

# TLDR

**Clone a repository**

```gh repo clone [owner]/[repo]```

**Create a new repository**

```gh repo create [name] --public```

**Fork a repository**

```gh repo fork [owner]/[repo]```

**View repository**

```gh repo view```

**List your repositories**

```gh repo list```

# SYNOPSIS

**gh repo** _command_ [_options_]

# PARAMETERS

**clone** _REPO_
> Clone a repository locally.

**create** _NAME_
> Create a new repository.

**fork** _REPO_
> Fork a repository.

**view** _REPO_
> View repository details.

**list**
> List accessible repositories.

**delete** _REPO_
> Delete a repository.

**rename** _NEW-NAME_
> Rename current repository.

**sync**
> Sync fork with upstream.

**--public**
> Make repository public.

**--private**
> Make repository private.

**--help**
> Display help information.

# DESCRIPTION

**gh repo** manages GitHub repositories from the command line. It provides repository creation, cloning, forking, and management without visiting github.com.

The command supports both HTTPS and SSH cloning based on configuration. Repository creation includes options for visibility, description, license, and gitignore templates. Forking creates linked copies for contribution workflows.

# CAVEATS

Delete requires confirmation. Fork operations need network access. Some operations require owner permissions.

# HISTORY

gh repo is a core command in the **GitHub CLI**, handling repository operations that were previously only available through the web interface or API.

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

[gh](/man/gh)(1), [gh-pr](/man/gh-pr)(1), [git-clone](/man/git-clone)(1)

# RESOURCES

```[Documentation](https://cli.github.com/manual/gh_repo)```

```[Source code](https://github.com/cli/cli)```

<!-- verified: 2026-07-15 -->
