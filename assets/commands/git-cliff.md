# TLDR

**Generate changelog**

```git cliff```

**Generate since tag**

```git cliff --tag [v1.0.0]```

**Output to file**

```git cliff -o CHANGELOG.md```

**Preview unreleased**

```git cliff --unreleased```

**Custom config**

```git cliff --config [cliff.toml]```

# SYNOPSIS

**git cliff** [_options_] [_range_]

# PARAMETERS

**-o** _FILE_, **--output** _FILE_
> Output file.

**--tag** _TAG_
> Process commits until tag.

**--unreleased**
> Only process unreleased commits.

**-c** _FILE_, **--config** _FILE_
> Configuration file.

**--prepend** _FILE_
> Prepend to existing file.

**--context**
> Print template context.

**--help**
> Display help information.

# DESCRIPTION

**git cliff** generates changelogs from git history using conventional commit conventions. It parses commit messages to categorize changes and produces formatted output.

The tool is highly configurable through TOML files, supporting custom templates, commit groups, and filtering. It integrates with CI/CD for automated release documentation.

git cliff produces professional changelogs from structured commit messages.

# CAVEATS

Works best with conventional commits. Requires configuration for custom formats. Template customization needs Tera syntax knowledge.

# HISTORY

git cliff was created by **Orhun Parmaksız** as a highly customizable changelog generator, written in Rust for performance.

# SEE ALSO

[git-changelog](/man/git-changelog)(1), [git-log](/man/git-log)(1)
