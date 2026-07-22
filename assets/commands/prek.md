# TAGLINE

Fast pre-commit hook manager written in Rust

# TLDR

**Install** prek hooks into the current Git repository

```prek install```

**Run** all configured hooks against changed files

```prek run```

**Run** all hooks against every tracked file in the repo

```prek run --all-files```

**Run** a specific hook only

```prek run [hook_id]```

**Auto-update** hook revisions to their latest tags

```prek auto-update```

**List** every hook resolved from the configuration

```prek list```

**Convert** a legacy YAML config to native TOML

```prek util yaml-to-toml```

**Uninstall** previously installed Git hooks

```prek uninstall```

# SYNOPSIS

**prek** [_global-options_] _command_ [_command-options_] [_args_]

# PARAMETERS

**install** [**--hook-type** _type_] [**--overwrite**]
> Install Git hooks into _.git/hooks_. Repeat **--hook-type** to install pre-commit, commit-msg, pre-push, etc.

**uninstall** [**--hook-type** _type_]
> Remove previously installed hooks while leaving prek's cache intact.

**run** [**--all-files**] [**--files** _path..._] [**--hook-stage** _stage_] [**--from-ref** _ref_] [**--to-ref** _ref_] [**--last-commit**] [**--show-diff-on-failure**] [**--no-fail-fast**] [_hook-id_]
> Execute hooks. With no arguments, runs against staged files; with **--all-files**, runs against every tracked file.

**auto-update** [**--check**] [**--bleeding-edge**] [**--freeze**] [**--cooldown-days** _N_] [**--repo** _url_]
> Update **rev:** entries in the configuration to the latest released tag. **--check** validates without rewriting.

**list** [**--hook-stage** _stage_]
> Show the resolved list of hooks for the active configuration.

**clean**
> Remove cached hook environments from prek's store.

**gc**
> Garbage-collect unused repos from prek's cache.

**init-templatedir** _directory_
> Populate a Git template directory so newly cloned repos pick up hooks automatically.

**try-repo** _repo_ [**--ref** _ref_]
> Try a hook repository without modifying the project configuration.

**util yaml-to-toml** [_path_]
> Convert _.pre-commit-config.yaml_ into the native _prek.toml_ format.

**util list-builtins**
> List built-in hooks reimplemented in Rust.

**util identify** _file..._
> Print the file types prek associates with the given paths (useful for debugging _types_ filters).

**self update**
> Upgrade the prek binary itself to the latest release.

**-c** _file_, **--config** _file_
> Use _file_ as the configuration instead of auto-discovery.

**-v**, **--verbose**
> Increase log verbosity. Repeat for debug-level output.

**-q**, **--quiet**
> Suppress non-essential output.

**--color** _when_
> _auto_, _always_, or _never_.

**-V**, **--version**
> Print the version and exit.

# DESCRIPTION

**prek** is a Git hook manager designed as a faster, drop-in replacement for **pre-commit**. It reads the same _.pre-commit-config.yaml_ files and supports the same hook ecosystem, while shipping as a single static binary written in **Rust** with no Python runtime dependency.

prek caches hook environments under _~/.cache/prek_ and reuses them across repositories. Several common hooks (file fixers, JSON/YAML validators, etc.) are reimplemented in Rust and run as built-ins, avoiding the cost of spawning interpreters. Toolchain installs for **Python**, **Node.js**, **Bun**, **Go**, **Rust**, and **Ruby** are shared across hooks, and Python environments are managed through **uv**.

In addition to the legacy YAML schema, prek understands a native _prek.toml_ format and provides _prek util yaml-to-toml_ to migrate existing configurations. Workspace mode lets a single config drive hooks across multiple sub-projects in a monorepo, with **--project** and **--skip-project** filters on the command line.

# CONFIGURATION

prek reads the first of these files in the repository root:

```
prek.toml
.prek.toml
.pre-commit-config.yaml
```

Both YAML and TOML configurations declare a list of **repos**, each pinned to a **rev** and exposing one or more **hooks** by **id**. Per-hook keys such as **files**, **exclude**, **types**, **stages**, **language**, **args**, and **additional_dependencies** are accepted unchanged from pre-commit.

User-level overrides live at _~/.config/prek/config.toml_. The **PREK_HOME** environment variable relocates the cache directory; **PREK_NO_COLOR** and **NO_COLOR** disable ANSI output.

# CAVEATS

prek aims for behavioural parity with pre-commit but is not byte-identical: Python virtualenvs are managed by **uv**, not _virtualenv_, which can change resolved package versions. Hooks that rely on system Python being on **PATH** during the hook script may need explicit dependencies. The cache layout under _~/.cache/prek_ is independent of pre-commit's, so both tools can coexist but do not share environments.

# HISTORY

**prek** is authored by **Jian Zeng (j178)** and published as a Rust crate as well as a Python wheel on PyPI for installation via **pip**, **uv**, or **pipx**. It positions itself as a "**pre-commit, reimagined**", reusing the existing hook ecosystem while replacing the runtime. Early adopters include large Python projects such as **CPython**, **Apache Airflow**, and **FastAPI**.

# INSTALL

```zypper: sudo zypper install prek```

```brew: brew install prek```

```nix: nix profile install nixpkgs#prek```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pre-commit](/man/pre-commit)(1), [husky](/man/husky)(1), [lefthook](/man/lefthook)(1), [uv](/man/uv)(1)
