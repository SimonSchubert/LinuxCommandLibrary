# TAGLINE

lists container registry tags

# TLDR

**List tags** in a repository

```gcrane ls [gcr.io/project/repo]```

**Recursively list** tags and sub-repositories

```gcrane ls -r [gcr.io/project]```

**List in JSON format**

```gcrane ls --json [gcr.io/project/repo]```

# SYNOPSIS

**gcrane** **ls** [_options_] _repository_

# PARAMETERS

**-r**, **--recursive**
> Recurse through sub-repositories.

**--json**
> Output manifest information as JSON.

**-h**, **--help**
> Show help information.

# DESCRIPTION

**gcrane ls** lists tags, manifests, and sub-repositories in Google Container Registry and Artifact Registry. Unlike standard crane ls, it provides richer output including detailed manifest information and recursive repository exploration.

The command can display results in human-readable format or as JSON for scripting. Recursive mode (-r) traverses sub-repositories. gcrane ls is essential for discovering available images, auditing registry contents, and building automation scripts.

# SEE ALSO

[gcrane](/man/gcrane)(1), [crane-ls](/man/crane-ls)(1)

