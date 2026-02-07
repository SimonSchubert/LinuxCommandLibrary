# TAGLINE

Display Git objects such as commits, tags, and blobs

# TLDR

**Show last commit**

```git show```

**Show specific commit**

```git show [commit-hash]```

**Show tag**

```git show [v1.0.0]```

**Show file at commit**

```git show [commit]:[file.txt]```

**Show only stats**

```git show --stat```

# SYNOPSIS

**git show** [_options_] _object_

# PARAMETERS

_OBJECT_
> Commit, tag, or tree to show.

**--stat**
> Show diffstat only.

**--name-only**
> Show changed file names.

**--name-status**
> Show names and status.

**--format** _FORMAT_
> Output format.

**-p**, **--patch**
> Show diff (default for commits).

**--help**
> Display help information.

# DESCRIPTION

**git show** displays various types of Git objects. For commits, it shows the commit message and diff. For tags, it shows the tag annotation. For trees and blobs, it shows the contents directly.

The command combines log and diff functionality into a convenient single-object inspector, making it the go-to tool for examining any Git object.

# CAVEATS

Output varies by object type. Large diffs may need paging. Binary files show as binary.

# HISTORY

git show is a core **Git** command for displaying objects, providing a unified interface to inspect various git object types.

# SEE ALSO

[git-log](/man/git-log)(1), [git-diff](/man/git-diff)(1), [git-cat-file](/man/git-cat-file)(1)
