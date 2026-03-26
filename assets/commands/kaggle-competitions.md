# TAGLINE

manages Kaggle machine learning competitions from the command line

# TLDR

**List competitions**

```kaggle competitions list```

**Download competition files**

```kaggle competitions download -c [competition-name]```

**Submit to competition**

```kaggle competitions submit -c [competition-name] -f [submission.csv] -m "[message]"```

**List competition files**

```kaggle competitions files -c [competition-name]```

**View leaderboard**

```kaggle competitions leaderboard -c [competition-name] -s```

**List past submissions**

```kaggle competitions submissions -c [competition-name]```

**Search competitions** by keyword

```kaggle competitions list -s "[search-term]"```

**Download a specific file** from a competition

```kaggle competitions download -c [competition-name] -f [filename]```

# SYNOPSIS

**kaggle** **competitions** _subcommand_ [_options_]

# PARAMETERS

**list**
> List available competitions. Supports --category, --sort-by, --page, --search, --csv.

**download** **-c** _name_
> Download competition data. Use -f for a specific file, -p for destination path, -o to overwrite.

**submit** **-c** _name_ **-f** _file_ **-m** _message_
> Submit predictions. Both -f and -m are required.

**files** **-c** _name_
> List competition data files.

**submissions** **-c** _name_
> List your past submissions and scores.

**leaderboard** **-c** _name_
> View competition leaderboard. Use -s to show, -d to download as CSV.

# DESCRIPTION

**kaggle competitions** manages Kaggle machine learning competitions from the command line. Part of the Kaggle CLI, it allows downloading datasets, submitting predictions, and checking leaderboard standings without using the web interface.

# SEE ALSO

[kaggle](/man/kaggle)(1), [kaggle-datasets](/man/kaggle-datasets)(1), [kaggle-kernels](/man/kaggle-kernels)(1)

