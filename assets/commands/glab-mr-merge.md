# TAGLINE

Merge a GitLab merge request

# TLDR

**Merge a merge request**

```glab mr merge [number]```

**Merge with squash**

```glab mr merge [number] --squash```

**Merge without deleting branch**

```glab mr merge [number] --remove-source-branch=false```

**Merge when pipeline succeeds**

```glab mr merge [number] --when-pipeline-succeeds```

# SYNOPSIS

**glab** **mr** **merge** [_number_] [_options_]

# PARAMETERS

**--squash**
> Squash commits.

**--remove-source-branch**
> Delete source branch.

**--when-pipeline-succeeds**
> Merge when CI passes.

**--message** _text_
> Merge commit message.

**-y**, **--yes**
> Skip confirmation.

# DESCRIPTION

**glab mr merge** merges a GitLab merge request. It supports squash merging, automatic source branch deletion, and deferred merging that waits for the CI pipeline to pass before completing.

# SEE ALSO

[glab-mr](/man/glab-mr)(1), [glab-mr-create](/man/glab-mr-create)(1)
