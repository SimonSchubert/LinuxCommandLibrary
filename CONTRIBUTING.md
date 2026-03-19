# Contributing to Linux Command Library

Thanks for your interest in contributing! There are two main ways to help:

## Suggest new commands

Use the [Command Request](../../issues/new?template=command-request.yml) issue template to suggest Linux commands that should be added to the library. Just list the command names — we'll take care of creating the documentation.

## Edit existing content

Command and category content is edited and improved frequently as part of ongoing maintenance. Because of this, direct edits are discouraged as they may conflict with or be overwritten by upcoming changes. If you spot an error or want to suggest an improvement, opening an issue is usually the better route.

That said, direct PRs are possible if you'd like to fix something specific:

- **Commands** — [`assets/commands/`](assets/commands/) contains one `.md` file per command (e.g. `git.md`, `awk.md`)
- **Basics/Categories** — [`assets/basics/`](assets/basics/) contains the category pages (e.g. `git.md`, `oneliners.md`)

### Command markdown format

Each command file uses these sections:

```
# TAGLINE
One-line description

# TLDR
Practical examples with ```code blocks```

# SYNOPSIS
**command** [_options_] [_arguments_]

# PARAMETERS
**-f**, **--flag**
> Description

# DESCRIPTION
What the command does and when to use it

# SEE ALSO
[related-command](/man/related-command)(1)
```

**Required:** TAGLINE, TLDR, SYNOPSIS, DESCRIPTION, SEE ALSO

**Recommended:** PARAMETERS, CAVEATS, HISTORY, CONFIGURATION

Use only these markdown elements: `` ``` ``, `**bold**`, `>` blockquotes, and `#` for section headers.

See [`awk.md`](assets/commands/awk.md) as a reference example.
