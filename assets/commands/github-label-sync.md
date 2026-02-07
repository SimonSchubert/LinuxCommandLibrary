# TAGLINE

Synchronize GitHub repository labels from a config file

# TLDR

**Sync labels to repository**

```github-label-sync --labels [labels.json] [owner/repo]```

**Dry run**

```github-label-sync --dry-run --labels [labels.json] [owner/repo]```

**Allow added labels**

```github-label-sync --allow-added-labels --labels [labels.json] [owner/repo]```

# SYNOPSIS

**github-label-sync** [_options_] _owner/repo_

# PARAMETERS

**-l**, **--labels** _file_
> Labels configuration file.

**-d**, **--dry-run**
> Show what would change.

**-a**, **--allow-added-labels**
> Don't delete unlisted labels.

**-A**, **--access-token** _token_
> GitHub access token.

# DESCRIPTION

**github-label-sync** synchronizes GitHub labels with a JSON configuration file. It ensures consistent labeling across repositories by defining labels declaratively, adding missing labels, updating changed ones, and optionally removing unlisted labels.

# SEE ALSO

[gh-label](/man/gh-label)(1)
