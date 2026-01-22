# TLDR

**Clone a repository**

```bk clone [bk://server/repository]```

**Add new files** to version control

```bk new [file1] [file2]```

**Commit changes**

```bk commit -y"[commit message]"```

**Push changes** to remote

```bk push```

**Pull changes** from remote

```bk pull```

**Show change history**

```bk changes```

**Get all user files**

```bk -U get```

**Show repository status**

```bk status```

# SYNOPSIS

**bk** _command_ [_options_] [_arguments_]

# DESCRIPTION

**bk** (BitKeeper) is a distributed version control system that pioneered many concepts later adopted by Git. It features nested repositories (submodules), atomic commits, and efficient handling of large codebases.

BitKeeper provides a simple command-line interface for managing source code history, branching, merging, and collaboration across distributed teams.

# SUBCOMMANDS

**clone**
> Create a copy of a repository

**new**
> Add new files to version control

**commit**
> Record changes to the repository

**push**
> Send changes to a remote repository

**pull**
> Fetch and merge changes from a remote

**changes**
> Show commit history

**status**
> Show working tree status

**diff**
> Show differences between revisions

**get**
> Check out files from repository

**import**
> Import files from non-BitKeeper sources

# PARAMETERS

**-y** _message_
> Commit message (with commit command)

**-U**
> Operate on user files only

**-A**
> Operate on all files including metadata

**-r** _rev_
> Specify revision

# CAVEATS

BitKeeper was proprietary until **2016** when it was released under the Apache 2.0 license. Most projects have migrated to Git. Some commands differ from Git equivalents despite similar functionality.

# HISTORY

BitKeeper was created by **Larry McVoy** in **1998** and became famous as the version control system used for Linux kernel development from **2002 to 2005**. When licensing disputes led to restrictions on free use, Linus Torvalds created **Git** as a replacement. BitKeeper was open-sourced in **2016**.

# SEE ALSO

[git](/man/git)(1), [hg](/man/hg)(1), [svn](/man/svn)(1)
