# TAGLINE

Check out GitHub pull requests

# TLDR

**Check out pull request** into a local `pr/N` branch

```git pr [123]```

**Check out from a specific remote**

```git pr [123] [upstream]```

**Check out from a full pull request URL**

```git pr [https://github.com/owner/repo/pull/123]```

**Check out the PR's merge ref** instead of its head

```git pr --merge [123]```

**Delete all local `pr/*` branches**

```git pr clean```

# SYNOPSIS

**git pr** [_number_ | _url_] [_remote_]

**git pr** **clean**

# PARAMETERS

_NUMBER_
> Pull request number.

_URL_
> Full pull request URL (any host); the remote and number are parsed from it.

_REMOTE_
> Remote name for a numeric PR (default: origin, or `git-extras.pr.remote` if set).

**-m**, **--merge**
> Fetch the PR's merge ref (`refs/pull/N/merge`) instead of its head ref.

**clean**
> Delete every local `pr/*` branch.

# DESCRIPTION

**git pr** checks out GitHub pull requests locally for testing, reviewing, or contributing. It fetches `refs/pull/N/head` (or `refs/pull/N/merge` with `-m`) into a local branch named `pr/N` and sets it up to track that ref, so `git pull` inside it re-fetches the latest revision of the PR.

For GitLab repositories, the equivalent command is `git mr`.

# CAVEATS

Part of git-extras package. GitHub-specific ref layout (`refs/pull/N/head`); won't work against a host that doesn't publish these refs. `git pr clean` removes **all** `pr/*` branches at once, not just one.

# SEE ALSO

[git-mr](/man/git-mr)(1), [gh-pr](/man/gh-pr)(1), [git-checkout](/man/git-checkout)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-pr)```

<!-- verified: 2026-07-17 -->
