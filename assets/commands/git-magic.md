# TAGLINE

Commit changes with an auto-generated commit message

# TLDR

**Commit staged changes** with a generated message

```git magic```

**Stage all changes** (with confirmation) and commit

```git magic -a```

**Commit and push**

```git magic -p```

**Commit and force-push**

```git magic -p -f```

**Prepend a custom title** before the generated message

```git magic -m "[title]"```

**Edit the generated message** before committing

```git magic -e```

# SYNOPSIS

**git** **magic** [_-a_] [_-m_ _msg_] [_-e_] [_-p_] [_-f_]

# PARAMETERS

**-a**
> Stage all changes (after confirmation) before committing.

**-m** _msg_
> Prepend a custom message; the generated summary is appended after it.

**-e**
> Open the editor to review the message instead of committing with `--no-edit`.

**-p**
> Push after committing.

**-f**
> Force-push; only takes effect combined with `-p`.

**-h**
> Display usage information.

# DESCRIPTION

**git magic** is a git-extras command that commits changes using an automatically generated commit message built from `git status --porcelain -uno`, so the message ends up listing the files that changed. By default the commit happens without opening an editor (`--no-edit`).

Passing `-a` shows `git status`, asks for confirmation, then stages everything before committing. `-m` lets you prepend a real message before the auto-generated summary, `-e` opens an editor to adjust the final message, and `-p` (optionally with `-f` for a force-push) pushes immediately after the commit.

# CAVEATS

Must be run inside a git working tree; it changes to the repository's top level automatically. The generated message is just a list of changed files, not a meaningful description, so this is best suited for quick WIP commits rather than history you intend to keep readable.

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

[git-commit](/man/git-commit)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-magic)```

<!-- verified: 2026-07-17 -->
