# TAGLINE

print information about relevant issues, pull requests and notifications

# TLDR

**Show** your status dashboard across subscribed repositories

```gh status```

**Limit** the report to one organization

```gh status --org [orgname]```

**Exclude** repositories from the report

```gh status --exclude [owner/repo],[owner/other-repo]```

# SYNOPSIS

**gh** **status** [_flags_]

# PARAMETERS

**-o**, **--org** _string_
> Report status within an organization.

**-e**, **--exclude** _strings_
> Comma separated list of repositories to exclude, in **owner/name** format.

# DESCRIPTION

**gh status** prints an overview of your GitHub work across the repositories you subscribe to. The output is split into four panes: **Assigned Issues**, **Assigned Pull Requests**, **Review Requests**, and **Mentions**, plus a **Repository Activity** section listing new issues, pull requests and comments.

The point is to answer "what needs my attention" without visiting the web dashboard or running several **gh issue list** and **gh pr list** invocations by hand. Because the report is built from your subscriptions rather than a fixed repository, it works from any directory, including outside a git repository.

**--org** narrows every pane to a single organization, which is the usual way to separate work from personal activity. **--exclude** drops noisy repositories from the results.

# CAVEATS

The report only covers repositories you are subscribed to via **notifications**, so activity in repositories you merely have access to will not appear. Mentions come from your notification stream and are subject to its retention, so older mentions drop off.

Building the report makes several API calls, and on accounts with many subscriptions it can take a few seconds and consume a noticeable share of your rate limit.

# HISTORY

**gh status** was added as a core command in **GitHub CLI 2.7.0** (**March 2022**), contributed by **vilmibm**, who had previously explored the same idea as a **gh** extension.

# SEE ALSO

[gh](/man/gh)(1), [gh-issue](/man/gh-issue)(1), [gh-pr](/man/gh-pr)(1), [gh-search](/man/gh-search)(1)

# RESOURCES

```[Source code](https://github.com/cli/cli)```

```[Homepage](https://cli.github.com/)```

```[Documentation](https://cli.github.com/manual/gh_status)```

<!-- verified: 2026-07-16 -->
