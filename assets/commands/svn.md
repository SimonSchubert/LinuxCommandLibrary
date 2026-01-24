# TLDR

**Checkout a repository** to a local directory

```svn checkout [url] [path/to/directory]```

**Update the working copy** to the latest revision

```svn update```

**Add a file** to version control

```svn add [path/to/file]```

**Commit changes** with a message

```svn commit -m "[message]"```

**Show the status** of the working copy

```svn status```

**Show differences** between working copy and repository

```svn diff [path/to/file]```

**View the commit log** for a file or directory

```svn log [path]```

**Revert local changes** to a file

```svn revert [path/to/file]```

# SYNOPSIS

**svn** _subcommand_ [_options_] [_args_]

# PARAMETERS

**checkout** (**co**)
> Check out a working copy from a repository.

**update** (**up**)
> Bring changes from the repository into the working copy.

**add**
> Put files and directories under version control.

**delete** (**del**, **rm**)
> Remove files and directories from version control.

**commit** (**ci**)
> Send changes from your working copy to the repository.

**status** (**st**)
> Print the status of working copy files and directories.

**diff** (**di**)
> Display local modifications or differences between revisions.

**log**
> Display commit log messages.

**revert**
> Undo local modifications to a file or directory.

**merge**
> Apply differences between two sources to a working copy path.

**copy** (**cp**)
> Copy a file or directory in a working copy or repository.

**move** (**mv**)
> Move or rename a file or directory.

**info**
> Display information about a local or remote item.

**blame** (**annotate**)
> Show author and revision information inline for each line.

**-m**, **--message** _msg_
> Specify a log message for the commit.

**-r**, **--revision** _rev_
> Specify a revision number or range (e.g., **-r 100**, **-r 100:200**).

**-c**, **--change** _rev_
> Apply change from revision (syntactic sugar for **-r rev-1:rev**).

**-q**, **--quiet**
> Print nothing, or only summary information.

**-v**, **--verbose**
> Print extra information.

**--depth** _arg_
> Limit operation scope: **empty**, **files**, **immediates**, or **infinity**.

**--username** _user_
> Specify a username for authentication.

**--password** _pass_
> Specify a password for authentication.

**--non-interactive**
> Do no interactive prompting (useful for scripts).

# DESCRIPTION

**svn** is the official command-line client for Apache Subversion, a centralized version control system. It manages files and directories over time, tracking modifications and allowing retrieval of previous versions.

The client communicates with a Subversion repository to perform operations like checking out working copies, committing changes, updating to latest revisions, and merging branches. Subversion supports atomic commits, versioned directories, and efficient binary file handling.

Working copies maintain metadata in **.svn** directories, tracking the base revision and local modifications. The **svn** client uses this metadata to determine what has changed and what needs synchronization with the repository.

# CAVEATS

Unlike Git, Subversion requires network access for most operations since history is stored on the server. The **.svn** directories in every subdirectory can cause issues when copying working copies. Use **svn export** instead of copying if you need a clean directory without version control metadata.

# HISTORY

Subversion was created by **CollabNet** in **2000** as a replacement for CVS, addressing its limitations like atomic commits and versioned directories. The project was led by Karl Fogel, Ben Collins-Sussman, and Jim Blandy. Version 1.0 was released in **February 2004**. Subversion became an **Apache Software Foundation** project in **2010**. While Git has largely supplanted it for open-source development, Subversion remains popular in enterprise environments.

# SEE ALSO

[git](/man/git)(1), [cvs](/man/cvs)(1), [svnadmin](/man/svnadmin)(8), [svnserve](/man/svnserve)(8)
