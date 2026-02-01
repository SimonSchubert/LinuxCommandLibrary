# TLDR

**Download competition files**

```kaggle competitions download -c [competition-name]```

**Submit to competition**

```kaggle competitions submit -c [competition-name] -f [submission.csv] -m "[message]"```

**Search datasets**

```kaggle datasets list -s "[search-term]"```

**Download a dataset**

```kaggle datasets download -d [owner/dataset-name]```

**List competition leaderboard**

```kaggle competitions leaderboard [competition-name]```

**Download model**

```kaggle models download -m [owner/model-name/framework/variation]```

**Create new dataset**

```kaggle datasets create -p [path/to/dataset]```

**View API credentials**

```kaggle config view```

# SYNOPSIS

**kaggle** _command_ _subcommand_ [_options_]

# COMMANDS

**competitions** list|files|download|submit|submissions|leaderboard
> Manage competition data and submissions.

**datasets** list|files|download|create|version|init|metadata|status
> Browse and manage datasets.

**kernels** list|init|push|pull|output|status
> Manage notebooks (kernels).

**models** list|get|files|download
> Access Kaggle models.

**config** view|set|unset
> Manage configuration.

# PARAMETERS

**-c**, **--competition** _name_
> Competition name.

**-d**, **--dataset** _name_
> Dataset in owner/dataset format.

**-m**, **--message** _text_
> Submission message.

**-f**, **--file** _path_
> File to submit or upload.

**-p**, **--path** _directory_
> Local directory path.

**-o**, **--output** _directory_
> Download output directory.

**--unzip**
> Unzip downloaded files.

**-s**, **--search** _term_
> Search term for listings.

**--sort-by** _field_
> Sort results by field.

# DESCRIPTION

**kaggle** is the CLI for Kaggle, a data science competition platform. It manages competition data, datasets, notebooks, and models.

Authentication requires API credentials from kaggle.com/account. Place **kaggle.json** in **~/.kaggle/** with proper permissions (chmod 600).

Competition workflow: **download** gets data files, work locally, **submit** uploads predictions. **leaderboard** shows standings; **submissions** lists your entries.

Datasets are versioned. **download** gets current version; **create** initializes new dataset; **version** adds updates. **init** generates dataset-metadata.json for new datasets.

Kernels (notebooks) can be pushed to Kaggle for cloud execution. **pull** downloads notebooks; **push** uploads with kernel-metadata.json defining runtime settings.

# CAVEATS

Requires Kaggle account and API key. Some competitions have acceptance terms. Large datasets may take time to download. API rate limits apply. Dataset uploads need metadata file.

# HISTORY

Kaggle was founded by **Anthony Goldbloom** and **Ben Hamner** in **2010** as a platform for predictive modeling competitions. Acquired by **Google** in **2017**. The CLI was added to enable programmatic access to platform resources. Kaggle expanded to include datasets, notebooks, and courses. It hosts one of the largest data science communities with millions of members.

# SEE ALSO

[dvc](/man/dvc)(1), [mlflow](/man/mlflow)(1), [jupyter](/man/jupyter)(1)
