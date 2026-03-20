# TAGLINE

Generate statistics from Git repositories

# TLDR

**Generate stats for repository**

```gitstats [repo_path] [output_dir]```

**Generate stats for** last 10 commits

```gitstats -c commit_begin='HEAD~10' [repo] [output]```

**Set project name** and max authors

```gitstats -c project_name='[MyProject]' -c max_authors=[20] [repo] [output]```

# SYNOPSIS

**gitstats** [_options_] _repository_ _output_directory_

# PARAMETERS

**-c** _key=value_
> Configuration option. Can be specified multiple times.

### Configuration Keys

**project_name**
> Project name shown on generated pages. Default: basename of repository directory.

**max_authors**
> Maximum number of authors to show in the authors list.

**authors_top**
> How many top authors to show.

**max_domains**
> Maximum number of domains to show in domains by commits.

**max_ext_length**
> Maximum file extension length.

**commit_begin**
> Starting commit for statistics range.

**commit_end**
> Ending commit for statistics range.

**start_date**
> Starting date passed with --since to git.

**processes**
> Number of concurrent processes for extracting data.

**style**
> CSS stylesheet to use.

# DESCRIPTION

**gitstats** generates statistics from Git repositories and creates HTML reports with graphs showing commit activity, author contributions, file counts, and lines of code over time.

The output is a static HTML site that can be viewed in any browser, providing a visual overview of project history and contributor patterns.

# SEE ALSO

[git-log](/man/git-log)(1), [git-summary](/man/git-summary)(1)
