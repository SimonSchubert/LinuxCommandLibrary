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

```kaggle competitions leaderboard -c [competition-name]```

# SYNOPSIS

**kaggle** **competitions** _subcommand_ [_options_]

# PARAMETERS

**list**
> List available competitions.

**download** **-c** _name_
> Download competition data.

**submit** **-c** _name_ **-f** _file_
> Submit predictions.

**files** **-c** _name_
> List competition files.

**leaderboard** **-c** _name_
> View competition leaderboard.

# DESCRIPTION

**kaggle competitions** manages Kaggle machine learning competitions from the command line. Part of the Kaggle CLI, it allows downloading datasets, submitting predictions, and checking leaderboard standings without using the web interface.

# SEE ALSO

[kaggle](/man/kaggle)(1), [kaggle-datasets](/man/kaggle-datasets)(1)

