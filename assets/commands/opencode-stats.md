# TAGLINE

Show OpenCode usage statistics

# TLDR

**Show** token usage and cost statistics

```opencode stats```

**Show statistics for the last N days**

```opencode stats --days [7]```

**Show the top N models**

```opencode stats --models [5]```

**Limit the number of tools shown**

```opencode stats --tools [10]```

**Show only the current project**

```opencode stats --project ""```

# SYNOPSIS

**opencode stats** [_options_]

# PARAMETERS

**--days** _n_
> Show stats for the last N days (default: all time).

**--tools** _n_
> Number of tools to show (default: all).

**--models** [_n_]
> Show the model usage breakdown, hidden by default. Pass a number to show the top N.

**--project** _name_
> Filter by project (default: all projects). An empty string means the current project.

# DESCRIPTION

**opencode stats** displays token usage and cost statistics for OpenCode sessions. It shows cumulative data about tokens consumed, API calls made, and estimated costs across different AI providers. Useful for monitoring usage and budgeting API expenses.

# SEE ALSO

[opencode](/man/opencode)(1), [opencode-session](/man/opencode-session)(1), [opencode-models](/man/opencode-models)(1)

# RESOURCES

```[Source code](https://github.com/anomalyco/opencode)```

```[Homepage](https://opencode.ai)```

```[Documentation](https://opencode.ai/docs/cli)```

<!-- verified: 2026-11-09 -->
