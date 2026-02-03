# TLDR

**Commit staged changes**

```dolt commit -m "[message]"```

**Commit all changes**

```dolt commit -am "[message]"```

**Amend last commit**

```dolt commit --amend```

**Commit with author**

```dolt commit -m "[message]" --author "[Name <email>]"```

# SYNOPSIS

**dolt** **commit** [_options_]

# PARAMETERS

**-m**, **--message** _string_
> Commit message.

**-a**, **--all**
> Stage all modified tables.

**--amend**
> Amend previous commit.

**--author** _string_
> Override author.

**--date** _string_
> Override date.

**--allow-empty**
> Allow empty commit.

# DESCRIPTION

**dolt commit** records changes to the repository. Creates a new commit with staged table changes. Similar to git commit but for database versioning.

# SEE ALSO

[dolt-add](/man/dolt-add)(1), [dolt-status](/man/dolt-status)(1)

