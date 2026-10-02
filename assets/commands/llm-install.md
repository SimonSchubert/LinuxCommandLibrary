# TAGLINE

Install Python packages into the same environment as llm

# TLDR

**Install a plugin** from PyPI

```llm install [llm-claude-3]```

**Upgrade** a package already in that environment

```llm install -U [llm]```

**Editable** install of a local plugin

```llm install -e [path/to/plugin]```

**Reinstall** even when the package is already current

```llm install --force-reinstall [llm-claude-3]```

Include **pre-releases**

```llm install --pre [plugin-name]```

**Remove** a package from the llm environment

```llm uninstall [llm-claude-3]```

# SYNOPSIS

**llm install** [_options_] [_packages_...]

**llm uninstall** [**-y**] _packages_...

# PARAMETERS

_packages_
> One or more project names (PyPI) or, with **-e**, a local path. **llm install** with no packages prints help.

**-U**, **--upgrade**
> Upgrade each named package to the latest version pip will accept.

**-e** _PATH_, **--editable** _PATH_
> Install the project at _PATH_ in editable mode.

**--force-reinstall**
> Reinstall even when the package is already up to date.

**--no-cache-dir**
> Do not use pip's download cache.

**--pre**
> Allow pre-release and development versions.

**-y**, **--yes**
> **llm uninstall** only. Skip the confirmation prompt.

**-h**, **--help**
> Help for **llm install** or **llm uninstall**.

# DESCRIPTION

**llm install** runs pip inside the same Python environment that provides the **llm** command. That is how model plugins (for example **llm-claude-3** or **llm-ollama**) become visible to **llm models** and **llm prompt**. Packages installed with a different **pip** or virtualenv are not picked up.

**llm uninstall** removes packages from that same environment. It asks for confirmation unless **-y** is given.

# CAVEATS

Subcommand of **llm**, not a separate binary. A Homebrew or Nix **llm** and a **pip install llm** are different environments; install plugins with the **llm** you actually run. **llm install -U llm** upgrades the tool inside its current environment and can move ahead of the distro package. Package names and versions go to pip, so a typo installs nothing useful and a broad upgrade can change unrelated plugins.

# INSTALL

```brew: brew install llm```

```nix: nix profile install nixpkgs#llm```

<!-- packages: 2026-10-02 -->

# SEE ALSO

[llm](/man/llm)(1), [llm-keys](/man/llm-keys)(1), [llm-models](/man/llm-models)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/simonw/llm)```

```[Homepage](https://llm.datasette.io)```

```[Documentation](https://llm.datasette.io/en/stable/plugins/installing-plugins.html)```

<!-- verified: 2026-10-02 -->
