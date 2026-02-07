# TAGLINE

Manage and switch between Neovim versions

# TLDR

**Install a Neovim version**

```bob install [stable]```

**Install nightly build**

```bob install nightly```

**Switch to a version**

```bob use [stable]```

**List installed versions**

```bob list```

**List available remote versions**

```bob list-remote```

**Uninstall a version**

```bob uninstall [nightly]```

**Run a specific version** without switching

```bob run [stable] [file.txt]```

**Sync version** from config file

```bob sync```

**Erase all bob data** and installations

```bob erase```

# SYNOPSIS

**bob** _command_ [_version_] [_arguments_]

# DESCRIPTION

**bob** is a cross-platform Neovim version manager that allows easy switching between different Neovim versions from the command line. It can install stable releases, nightly builds, specific versions, or even build from commit hashes.

The tool manages multiple Neovim installations, automatically downloading and setting up the appropriate binaries for your platform.

# SUBCOMMANDS

**install**
> Install a specific Neovim version

**use**
> Switch to a version (auto-installs if needed)

**run**
> Run a specific version with arguments

**uninstall**
> Remove an installed version

**list**
> Show installed and active versions

**list-remote**
> Show available versions for download

**sync**
> Install version from sync file

**erase**
> Remove all bob data and installations

**rollback**
> Revert to previously used version

# VERSION SPECIFIERS

**stable**
> Latest stable release

**nightly**
> Latest nightly build

**latest**
> Most recent version

**v0.9.0**
> Specific version string

**commit-hash**
> Build from specific commit

# PARAMETERS

Configuration can be set via **$BOB_CONFIG** environment variable pointing to a JSON or TOML config file.

# CAVEATS

Requires internet access for downloading versions. GitHub API rate limits may apply; set **GITHUB_TOKEN** environment variable to increase limits. The erase command permanently removes all bob data including downloaded versions.

# HISTORY

Bob was created by **Mordechai Hadad** as a modern, cross-platform solution for managing multiple Neovim installations, similar to how nvm manages Node.js versions or pyenv manages Python versions.

# SEE ALSO

[nvim](/man/nvim)(1), [nvm](/man/nvm)(1), [rustup](/man/rustup)(1)
