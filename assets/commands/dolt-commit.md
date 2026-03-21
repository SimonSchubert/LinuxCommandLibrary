# TAGLINE

record staged database table changes

# TLDR

**Commit staged changes**

```dolt commit -m "[message]"```

**Commit all changes** including unstaged modified tables

```dolt commit -am "[message]"```

**Amend last commit**

```dolt commit --amend```

**Commit with a specific author**

```dolt commit -m "[message]" --author "[Name <email>]"```

**Create an empty commit** (e.g., for triggering CI)

```dolt commit --allow-empty -m "[message]"```

# SYNOPSIS

**dolt** **commit** [_options_]

# PARAMETERS

**-m**, **--message** _string_
> Commit message.

**-a**, **--all**
> Stage all modified tables and commit.

**--amend**
> Amend the previous commit instead of creating a new one.

**--author** _string_
> Override the commit author (format: "Name <email>").

**--date** _string_
> Override the commit date.

**--allow-empty**
> Allow creating a commit with no changes.

**--force**
> Force the commit, ignoring any warnings.

**-A**, **--ALL**
> Stage all tables (including new and untracked) and commit.

# DESCRIPTION

**dolt commit** records changes to the database repository by creating a new commit with staged table modifications. It captures a snapshot of the current state of all staged tables, preserving the data and schema at that moment in the repository's history.

Each commit requires a message describing the changes, creating an audit trail of database evolution over time. The command mirrors Git's commit workflow but operates on database tables instead of files, enabling version control for data.

Commits can be amended, authored by different users, and can include all modified tables automatically with the -a flag. Use -A (uppercase) to also include new untracked tables. Empty commits are rejected by default to prevent meaningless history entries.

# SEE ALSO

[dolt-add](/man/dolt-add)(1), [dolt-status](/man/dolt-status)(1), [dolt-branch](/man/dolt-branch)(1), [dolt-merge](/man/dolt-merge)(1)
