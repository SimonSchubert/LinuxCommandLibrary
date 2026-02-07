# TAGLINE

Create, list, and manage tags

# TLDR

**List tags**

```git tag```

**Create lightweight tag**

```git tag [name]```

**Create annotated tag**

```git tag -a [name] -m "[message]"```

**Create signed tag**

```git tag -s [name] -m "[message]"```

**Tag specific commit**

```git tag [name] [commit]```

**Delete tag**

```git tag -d [name]```

**Push tag to remote**

```git push origin [name]```

**List tags matching pattern**

```git tag -l "[v1.*]"```

# SYNOPSIS

**git** **tag** [_options_] [_name_] [_commit_]

# PARAMETERS

**-a**, **--annotate**
> Create annotated tag.

**-m**, **--message** _msg_
> Tag message.

**-s**, **--sign**
> Create signed tag.

**-d**, **--delete**
> Delete tag.

**-f**, **--force**
> Force replace tag.

**-l**, **--list** _pattern_
> List matching tags.

**-n** _num_
> Show lines of annotation.

**--contains** _commit_
> Tags containing commit.

**--sort** _key_
> Sort tags.

# DESCRIPTION

**git tag** creates, lists, deletes, and verifies tag objects. Tags mark specific points in history as important, typically used for release versions.

Lightweight tags are simple pointers to a commit, while annotated tags store extra metadata such as the tagger name, date, and a message. Signed tags add a GPG signature for verification.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-commit](/man/git-commit)(1)
