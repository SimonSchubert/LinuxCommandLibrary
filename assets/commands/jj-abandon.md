# TAGLINE

abandon revisions in Jujutsu

# TLDR

**Abandon the current working-copy** change

```jj abandon```

**Abandon a specific** revision

```jj abandon [revision]```

**Abandon multiple revisions** at once

```jj abandon [rev1] [rev2]```

**Abandon a revset** (e.g. all descendants of main)

```jj abandon "descendants(main)"```

**Abandon without** rebasing descendants

```jj abandon --restore-descendants [revision]```

**Abandon and keep bookmarks** pointing at the parent

```jj abandon --retain-bookmarks [revision]```

# SYNOPSIS

**jj** **abandon** [_options_] [_revsets_...]

# PARAMETERS

_revsets_
> One or more revsets to abandon. Defaults to the working-copy commit (`@`) when omitted.

**--restore-descendants**
> Do not rewrite descendants of the abandoned commits. Their parent pointers stay the same and their contents are preserved.

**--retain-bookmarks**
> Move bookmarks pointing at abandoned commits to the parent revision instead of deleting them.

# DESCRIPTION

**jj abandon** marks revisions as abandoned in Jujutsu. Abandoned commits are hidden from default log output, and any descendants are normally rebased onto the abandoned commit's parent so the visible history remains linear. The change IDs survive until garbage collection, so abandoned work can still be recovered via `jj op log` and `jj op restore`.

If the working-copy commit is abandoned, Jujutsu automatically creates a new empty working-copy commit on the parent so the workspace is never left without a current change.

# CAVEATS

Abandoning does not delete commits immediately. They remain reachable via the operation log until garbage collected. With **--restore-descendants**, descendants keep their original tree but their parent links are not updated to skip the abandoned commit, which can produce duplicated content.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1), [jj-git-push](/man/jj-git-push)(1)
