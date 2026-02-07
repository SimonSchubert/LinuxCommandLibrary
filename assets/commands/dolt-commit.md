# TAGLINE

record staged database table changes

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

**dolt commit** records changes to the database repository by creating a new commit with staged table modifications. It captures a snapshot of the current state of all staged tables, preserving the data and schema at that moment in the repository's history.

Each commit requires a message describing the changes, creating an audit trail of database evolution over time. The command mirrors Git's commit workflow but operates on database tables instead of files, enabling version control for data.

Commits can be amended, authored by different users, and can include all modified tables automatically with the -a flag. Empty commits are rejected by default to prevent meaningless history entries.

# SEE ALSO

[dolt-add](/man/dolt-add)(1), [dolt-status](/man/dolt-status)(1)

