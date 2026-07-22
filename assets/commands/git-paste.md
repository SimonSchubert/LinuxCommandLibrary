# TAGLINE

Send commit patches to a pastebin service

# TLDR

**Paste commits** not yet in the upstream branch

```git paste```

**Paste a specific revision range**

```git paste [HEAD~3..HEAD]```

**Paste a single commit**

```git paste -1 [commit]```

# SYNOPSIS

**git** **paste** [_git-format-patch-args_]

# PARAMETERS

_ARGS_
> Any arguments accepted by `git format-patch` (revision range, `-1`, `-n`, etc). Defaults to `@{u}` (commits ahead of the upstream branch) when omitted.

# DESCRIPTION

**git paste** runs `git format-patch --stdout` over the given commits and pipes the resulting diff to **pastebinit**, printing the pastebin URL. Part of git-extras, it is a quick way to share a patch or a small commit series without creating a file first.

Because it delegates to `pastebinit`, the destination pastebin service (and any API key) is whatever `pastebinit` is configured to use, not necessarily GitHub Gist.

# CAVEATS

Requires **pastebinit** to be installed separately; the command aborts with an error if it is missing. Pasted content is sent to a third-party service, so avoid pasting patches containing secrets.

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

[git-format-patch](/man/git-format-patch)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-paste)```

<!-- verified: 2026-07-17 -->
