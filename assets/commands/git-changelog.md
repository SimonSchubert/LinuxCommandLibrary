# TAGLINE

Generate formatted changelogs from commit history

# TLDR

**Generate/update the changelog file** (auto-detected, or History.md)

```git changelog```

**Write the changelog to a specific file**

```git changelog [CHANGELOG.md]```

**Print the changelog to stdout** instead of writing a file

```git changelog --stdout```

**List commits since a start tag**, plainly (no headers)

```git changelog --list --start-tag [v1.0.0]```

**Exclude merge commits**

```git changelog --no-merges```

**Replace the changelog** instead of appending to it

```git changelog --prune-old```

# SYNOPSIS

**git changelog** [_options_] [_file_]

# PARAMETERS

_FILE_
> Output filename; defaults to an auto-detected Change*/History* file, or **History.md**.

**-a**, **--all**
> Include every commit, ignoring **--start-tag**/**--start-commit**/**--final-tag**.

**-l**, **--list**
> Plain list of commits, without section titles/dates.

**-t**, **--tag** _LABEL_
> Label to use as the section title for the most-recent, untagged commits.

**-s**, **--start-tag** _TAG_
> Oldest tag to start the commit range from.

**--start-commit** _COMMIT_
> Like **--start-tag**, but starts from a commit instead of a tag.

**-f**, **--final-tag** _TAG_
> Newest tag to end the commit range at.

**-n**, **--no-merges**
> Exclude merge commits.

**-m**, **--merges-only**
> Include only merge commits, with subject and body.

**-p**, **--prune-old**
> Replace the existing changelog file instead of appending to it.

**-x**, **--stdout**
> Write to standard output instead of a file.

**-h**, **--help**, **?**
> Display help information.

# DESCRIPTION

**git changelog** generates a changelog from git tags (annotated or lightweight) and commit messages. It formats commits into release notes, grouped into sections by tag, suitable for a project's CHANGELOG.

If no tags exist, every commit is included; otherwise only commits since the most recent tag are shown by default (use **--start-tag**/**--final-tag** to target a specific range). An existing Change*/History* file in the current directory is auto-detected and its content appended after the newly generated section, unless **--prune-old** is given.

Commit formatting is controlled via the **changelog.format** (default `  * %s`) and **changelog.mergeformat** git config options.

# CAVEATS

Part of the git-extras package. Quality depends on commit messages. Tag-based grouping requires annotated or lightweight tags to already exist in the repository.

# HISTORY

git changelog is part of **git-extras**, created by **TJ Holowaychuk** to automate changelog generation from repository history.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-log](/man/git-log)(1), [git-tag](/man/git-tag)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-changelog)```

<!-- verified: 2026-07-17 -->
