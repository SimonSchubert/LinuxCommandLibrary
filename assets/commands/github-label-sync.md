# TAGLINE

Synchronize GitHub repository labels from a config file

# TLDR

**Sync labels to a repository**

```github-label-sync --labels [labels.json] [owner/repo]```

**Preview changes without applying them**

```github-label-sync --dry-run --labels [labels.json] [owner/repo]```

**Keep labels not listed in the config instead of deleting them**

```github-label-sync --allow-added-labels --labels [labels.json] [owner/repo]```

**Use a specific access token**

```github-label-sync --access-token [token] --labels [labels.json] [owner/repo]```

**Use a labels file hosted at a URL**

```github-label-sync --labels [https://example.com/labels.json] [owner/repo]```

# SYNOPSIS

**github-label-sync** [_options_] _owner/repo_

# PARAMETERS

**-l**, **--labels** _path-or-url_
> Path or URL to the JSON labels configuration file.

**-d**, **--dry-run**
> Calculate the required changes without applying them.

**-a**, **--allow-added-labels**
> Don't delete labels found on the repo that aren't listed in the config.

**-A**, **--access-token** _token_
> GitHub personal access token. Falls back to the `GITHUB_ACCESS_TOKEN` environment variable if omitted.

# DESCRIPTION

**github-label-sync** synchronizes GitHub labels with a JSON configuration file. It ensures consistent labeling across repositories by defining labels declaratively, adding missing labels, updating changed ones, and (by default) removing labels not present in the configuration file.

The labels file is a JSON array of label objects, each with `name`, `color`, and optionally `description` and `aliases` (previous names to rename from, preserving existing issue/PR associations).

# SEE ALSO

[gh-label](/man/gh-label)(1)

# RESOURCES

```[Source code](https://github.com/Financial-Times/github-label-sync)```

<!-- verified: 2026-07-17 -->
