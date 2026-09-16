# TAGLINE

modifies a Jujutsu revision's metadata without changing its content

# TLDR

**Update the author** of the working-copy commit to the configured user

```jj metaedit --update-author```

Set a **specific author** on the working-copy commit

```jj metaedit --author "[Name] <[user@example.com]>"```

Update the **author timestamp** of a revision to now

```jj metaedit --update-author-timestamp -r [revset]```

Set the author date to a **specific timestamp** (RFC 2822 or RFC 3339)

```jj metaedit --author-timestamp "[2000-01-23T01:23:45-08:00]" -r [revset]```

Set the **change description** without opening an editor

```jj metaedit -m "[message]" -r [revset]```

Generate a **new change ID** (can help resolve some divergences)

```jj metaedit --update-change-id -r [revset]```

**Force a rewrite** so the committer name, email, and timestamp refresh

```jj metaedit --force-rewrite -r [revset]```

Update the author on **several revisions**

```jj metaedit --update-author [revset1] [revset2]```

Set author via **environment variables**

```JJ_USER='[Name]' JJ_EMAIL=[user@example.com] jj metaedit --update-author```

# SYNOPSIS

**jj metaedit** [_options_] [_revsets_...]

# PARAMETERS

_REVSETS_
> Revisions to modify (repeatable; alias **-r**). Defaults to `@` (the working-copy commit).

**--update-change-id**
> Generate a new change ID for the revision.

**-m**, **--message** _MESSAGE_
> Set the change description without opening an editor. Use **jj describe** if you want an editor.

**--update-author-timestamp**
> Set the author timestamp to the current time without changing the author name or email.

**--update-author**
> Set the author name and email to the configured user (`user.name` / `user.email`, or `JJ_USER` / `JJ_EMAIL`). Does not change the author timestamp.

**--author** _AUTHOR_
> Set author name and email from a string such as `Name <user@example.com>`. Retains the author timestamp on non-discardable commits.

**--author-timestamp** _TIMESTAMP_
> Set the author date. Accepts RFC 2822 (`Sun, 23 Jan 2000 01:23:45 PST`) or RFC 3339 (`2000-01-23T01:23:45-08:00`).

**--force-rewrite**
> Rewrite the commit even if no other metadata changed. Always refreshes committer name, email, and timestamp.

**-h**, **--help**
> Print help.

# DESCRIPTION

**jj metaedit** rewrites selected revisions so their metadata (change ID, description, author name/email/timestamp) can change while the file contents stay the same. With no metadata flags and without **--force-rewrite**, nothing is rewritten.

Whenever any metadata *is* updated, the committer name, email, and timestamp are also updated on every rewritten commit (and on rebased descendants). Committer identity comes from `user.name` / `user.email`, the `JJ_USER` and `JJ_EMAIL` environment variables, or `--config user.name` / `--config user.email`.

This is the dedicated metadata tool: **jj describe** is the editor-based way to change only the description. The command was originally prototyped as `jj touch` and renamed to **metaedit** before release.

# CAVEATS

Subcommand of **jj**. Immutable revisions are skipped unless **--ignore-immutable** is passed. A rewrite produces a new commit ID; the change ID stays the same unless **--update-change-id** is used. **--message** never opens an editor. Bare `jj metaedit` with no flags is a no-op.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-describe](/man/jj-describe)(1), [jj-sign](/man/jj-sign)(1), [jj-unsign](/man/jj-unsign)(1), [git-commit](/man/git-commit)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-metaedit)```

<!-- verified: 2026-09-16 -->
