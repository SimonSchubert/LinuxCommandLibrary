# TAGLINE

Append an identifier stamp to the last commit message

# TLDR

**Stamp the last commit** with an id and message

```git stamp [Reviewed-by] "[Jane Doe]"```

**Stamp with just an id**

```git stamp [Fixes-123]```

**Replace any previous stamp** with the same id

```git stamp --replace [Reviewed-by] "[Jane Doe]"```

# SYNOPSIS

**git** **stamp** [_-r_ | _--replace_] _id_ [_message_...]

# PARAMETERS

_ID_
> Stamp identifier (e.g. `Reviewed-by`, `Fixes`).

_MESSAGE_
> Optional text appended after the id.

**-r**, **--replace**
> Remove any existing stamp lines with the same id (case-insensitive) before appending the new one.

# DESCRIPTION

**git stamp** amends the most recent commit, appending a new paragraph of the form `<id> <message>` to its message. Part of git-extras, it is a quick way to tag a commit with metadata like `Reviewed-by`, `Tested-by`, or an issue reference without hand-editing the commit message.

With `--replace`, any prior paragraph in the message starting with the same id is stripped before the new stamp is added, so re-running the command updates rather than duplicates the stamp.

# CAVEATS

Amends HEAD, so it rewrites the commit hash; don't use it on a commit that has already been pushed and shared.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-stamp)```

<!-- verified: 2026-07-17 -->
