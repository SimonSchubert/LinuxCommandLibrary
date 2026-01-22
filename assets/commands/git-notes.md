# TLDR

**Add note to commit**

```git notes add -m "[note text]"```

**Add note to specific commit**

```git notes add -m "[note]" [commit]```

**Show notes**

```git notes show```

**Edit existing note**

```git notes edit [commit]```

**Remove note**

```git notes remove [commit]```

# SYNOPSIS

**git notes** [_command_] [_options_]

# PARAMETERS

**add**
> Add note to object.

**show**
> Show notes.

**edit**
> Edit existing note.

**remove**
> Remove note.

**list**
> List notes.

**-m** _MSG_
> Note message.

**--ref** _REF_
> Notes ref to use.

**--help**
> Display help information.

# DESCRIPTION

**git notes** adds metadata to commits without modifying them. Notes are stored separately from commit history, allowing annotations, code review comments, or other metadata.

Notes can be organized in namespaces (refs). They're useful for adding information after commits are pushed, as they don't change commit hashes.

git notes enables non-destructive commit annotation.

# CAVEATS

Notes are separate refs. Not pushed by default. May need explicit fetch/push.

# HISTORY

git notes was added to **Git** to allow adding metadata to commits without rewriting history, useful for review systems and annotations.

# SEE ALSO

[git-log](/man/git-log)(1), [git-commit](/man/git-commit)(1)
