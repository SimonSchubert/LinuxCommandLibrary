# TAGLINE

lists container registry tags

# TLDR

**List tags**

```gcrane ls [gcr.io/project/repo]```

**List with full references**

```gcrane ls --full-ref [gcr.io/project/repo]```

**List in JSON format**

```gcrane ls --json [gcr.io/project/repo]```

# SYNOPSIS

**gcrane** **ls** [_options_] _repository_

# PARAMETERS

**--full-ref**
> Show full image references.

**--json**
> Output as JSON.

# DESCRIPTION

**gcrane ls** lists tags, manifests, and sub-repositories in Google Container Registry and Artifact Registry. Unlike standard crane ls, it provides richer output including detailed manifest information and recursive repository exploration.

The command can display results in human-readable format or as JSON for scripting. Full reference mode shows complete image URIs including registry hostname and digest. gcrane ls is essential for discovering available images, auditing registry contents, and building automation scripts.

# SEE ALSO

[gcrane](/man/gcrane)(1), [crane-ls](/man/crane-ls)(1)

