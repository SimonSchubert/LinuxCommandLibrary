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

**Merge with a custom commit message**

```glab mr merge [number] --message "[commit message]"```

**Merge with rebase**

```glab mr merge [number] --rebase```

# SYNOPSIS

**glab** **mr** **merge** [_number_] [_options_]

# PARAMETERS

**--squash**
> Squash commits on merge.

**--rebase**
> Rebase the commits onto the base branch before merging.

**--remove-source-branch**
> Delete source branch after merge.

**--when-pipeline-succeeds**
> Set the merge request to merge when the pipeline succeeds.

**--message** _text_
> Custom merge commit message.

**--sha** _sha_
> Merge when the HEAD of the source branch matches the given SHA. Prevents merging unexpected changes.

**-y**, **--yes**
> Skip confirmation prompt.

# DESCRIPTION

**glab mr merge** merges a GitLab merge request. It supports squash merging, rebasing, automatic source branch deletion, and deferred merging that waits for the CI pipeline to pass before completing.

# SEE ALSO

[glab-mr](/man/glab-mr)(1), [glab-mr-create](/man/glab-mr-create)(1)
