# TAGLINE

Generate statistics from Git repositories

# TLDR

**Generate stats for repository**

```gitstats [repo_path] [output_dir]```

**Generate with config**

```gitstats -c [key=value] [repo] [output]```

# SYNOPSIS

**gitstats** [_options_] _repository_ _output_directory_

# PARAMETERS

**-c** _key=value_
> Configuration option.

# DESCRIPTION

**gitstats** generates statistics from Git repositories and creates HTML reports with graphs showing commit activity, author contributions, file counts, and lines of code over time.

The output is a static HTML site that can be viewed in any browser, providing a visual overview of project history and contributor patterns.

# SEE ALSO

[git-log](/man/git-log)(1), [git-summary](/man/git-summary)(1)
