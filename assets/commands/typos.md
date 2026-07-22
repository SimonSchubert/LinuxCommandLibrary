# TAGLINE

Low false-positive source code spell checker

# TLDR

**Check** the current directory for misspellings

```typos```

**Check a specific** file or directory

```typos [path/to/file_or_dir]```

**Automatically fix** detected typos in place

```typos --write-changes```

**Preview** suggested fixes as a unified diff

```typos --diff```

**Output results as JSON** for tooling integration

```typos --format json```

**Include hidden files** and ignored paths

```typos --hidden --no-ignore```

**Use a specific** English locale

```typos --locale en-gb```

**Check** using a custom configuration file

```typos --config [path/to/_typos.toml]```

# SYNOPSIS

**typos** [_OPTIONS_] [_PATH_...]

# PARAMETERS

**-w**, **--write-changes**
> Apply the suggested corrections to files instead of only reporting them.

**--diff**
> Print proposed changes as a unified diff without modifying files.

**--format** _FORMAT_
> Output format: _silent_, _brief_, _long_ (default), _json_.

**--config** _FILE_
> Path to a configuration file (typically _\_typos.toml_).

**--locale** _LOCALE_
> Set the English dialect: _en_, _en-us_, _en-gb_, _en-ca_, _en-au_.

**--exclude** _GLOB_
> Skip paths matching the given gitignore-style pattern.

**--force-exclude**
> Force excluded paths to be skipped even when given explicitly on the command line.

**--hidden**
> Include hidden files and directories.

**--no-ignore**
> Do not respect any ignore files.

**--no-ignore-vcs**
> Do not respect ignore files inside version-control directories.

**--no-ignore-dot**
> Do not respect _.ignore_ files.

**--no-ignore-global**
> Do not respect global ignore files.

**--no-ignore-parent**
> Do not respect ignore files from parent directories.

**--binary**
> Also check binary files as if they were text.

**--no-unicode**
> Restrict identifiers to ASCII.

**--type-list**
> Print all known file types and their globs.

**--type** _TYPE_
> Only check files of the given type (e.g. _rust_, _py_).

**--type-not** _TYPE_
> Exclude files of the given type.

**-V**, **--version**
> Print the version and exit.

**-h**, **--help**
> Print help.

# DESCRIPTION

**typos** is a fast spell checker tailored for source code. It walks the file tree, respects _.gitignore_ rules by default, and flags misspelled words inside identifiers, comments, and strings while keeping false positives low enough to run in pull-request gates.

Detection is driven by a curated dictionary of common code typos rather than a full natural-language dictionary, so it tolerates camelCase, snake_case, abbreviations, and domain-specific jargon. Findings can be printed, written back to disk with **--write-changes**, or emitted as JSON for editors and CI tooling.

The checker also understands per-language conventions through a file-type map, can be tuned for British or American English with **--locale**, and respects per-project overrides defined in **\_typos.toml**, **typos.toml**, **Cargo.toml**, or **pyproject.toml**.

# CONFIGURATION

Project configuration lives in **\_typos.toml** (or a **[tool.typos]** table inside **pyproject.toml** / **Cargo.toml**). Common sections:

```
[default]
locale = "en-us"
extend-ignore-re = ["(?Rm)^.*#\\s*spellchecker:disable-line$"]

[default.extend-words]
mater = "mater"

[default.extend-identifiers]
HashMa = "HashMap"

[type.rust]
extend-glob = ["*.rs"]
check-file = true
```

The **[default.extend-words]** and **[default.extend-identifiers]** tables either remap typos to their correct spelling or mark a word/identifier as valid by mapping it to itself.

# CAVEATS

**typos** is not a general English spell checker: it only flags words from its built-in typo dictionary, so it will miss many real misspellings outside that list. Conversely, project-specific names, acronyms, and non-English words may still trip it up and require entries in **\_typos.toml**. Writing changes with **--write-changes** modifies files in place: review with **--diff** first, especially when the dictionary is unfamiliar.

# HISTORY

**typos** was created by **Ed Page** (crate-ci) and released as an open-source project in **2019**, written in **Rust**. It was designed to be fast and accurate enough to run on every commit in large monorepos, drawing inspiration from earlier code-oriented spell checkers like **misspell** and **scspell** while focusing on a curated, low false-positive corpus.

# INSTALL

```pacman: sudo pacman -S typos```

```apk: sudo apk add typos```

```nix: nix profile install nixpkgs#typos```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[aspell](/man/aspell)(1), [hunspell](/man/hunspell)(1), [codespell](/man/codespell)(1)
