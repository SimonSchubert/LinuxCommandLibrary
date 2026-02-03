# TLDR

**Commit changes**

```fossil ci -m "[message]"```

**Commit with comment editor**

```fossil ci```

**Commit specific files**

```fossil ci [file1] [file2] -m "[message]"```

**Commit with branch**

```fossil ci --branch [branch_name] -m "[message]"```

# SYNOPSIS

**fossil** **ci** [_options_] [_files_...]

# PARAMETERS

**-m**, **--comment** _text_
> Commit message.

**--branch** _name_
> Create new branch.

**--private**
> Make commit private.

**--allow-empty**
> Allow empty commit.

# DESCRIPTION

**fossil ci** is an alias for fossil commit. Records changes to the repository with a commit message.

# SEE ALSO

[fossil-commit](/man/fossil-commit)(1), [fossil-add](/man/fossil-add)(1)

