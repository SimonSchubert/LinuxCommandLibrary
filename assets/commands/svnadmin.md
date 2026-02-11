# TAGLINE

Subversion repository administration tool

# TLDR

**Create a new repository**

```svnadmin create [/path/to/repo]```

**Dump repository to file**

```svnadmin dump [/path/to/repo] > [backup.dump]```

**Load dump into repository**

```svnadmin load [/path/to/repo] < [backup.dump]```

**Verify repository integrity**

```svnadmin verify [/path/to/repo]```

**List outstanding transactions**

```svnadmin lstxns [/path/to/repo]```

**Remove a dead transaction**

```svnadmin rmtxns [/path/to/repo] [txn-id]```

**Upgrade repository format**

```svnadmin upgrade [/path/to/repo]```

**Show repository info**

```svnadmin info [/path/to/repo]```

# SYNOPSIS

**svnadmin** _subcommand_ _repos-path_ [_options_] [_args_]

# PARAMETERS

**--revision** _rev_, **-r** _rev_
> Specify revision or revision range.

**--incremental**
> Dump only changes since previous revision.

**--deltas**
> Use deltas in dump output for smaller files.

**--fs-type** _type_
> Filesystem type for new repos: fsfs or bdb.

**--force-uuid**
> Set repository UUID from dump stream.

**--ignore-uuid**
> Ignore UUID in dump stream.

**--quiet**, **-q**
> Suppress normal output.

**--wait**
> Wait for repository lock instead of failing.

**--config-dir** _dir_
> Use alternate config directory.

**--bypass-hooks**
> Skip hook scripts during load.

**--bypass-prop-validation**
> Skip property validation during load.

# SUBCOMMANDS

**create**: Create new empty repository.

**dump**: Output repository contents in portable format.

**load**: Load dump file into repository.

**verify**: Check repository for corruption.

**recover**: Recover repository from crash.

**upgrade**: Upgrade repository to latest format.

**hotcopy**: Make backup copy of repository.

**lstxns**: List outstanding transactions.

**rmtxns**: Remove specified transactions.

**info**: Display repository information.

**setlog**: Set log message for a revision.

**setrevprop**: Set revision property.

**pack**: Optimize repository storage.

**freeze**: Freeze repository for backup.

# DESCRIPTION

**svnadmin** is the administrative tool for Subversion repositories. It provides commands for creating, maintaining, and backing up repositories stored on the local filesystem.

The tool can create repositories with either FSFS (default) or Berkeley DB backends. It supports full and incremental dumps for backup and migration, with optional delta compression for smaller dump files.

Repository maintenance includes integrity verification, crash recovery, format upgrades, and transaction cleanup. The hotcopy command creates consistent backups without stopping repository access.

Unlike the svn client, svnadmin operates only on local repository paths and cannot access repositories over the network.

# CAVEATS

Operates only on local repositories, not URLs. Dump files can be very large for full exports. Berkeley DB backend is deprecated in favor of FSFS. Hook bypass options should be used carefully. Repository locks prevent concurrent administrative operations.

# HISTORY

**svnadmin** has been part of Subversion since its initial release in 2000. Subversion was created by CollabNet as a replacement for CVS. The tool evolved alongside repository format changes, adding support for FSFS (Subversion 1.1), repository packing (1.6), and various performance improvements.

# SEE ALSO

[svn](/man/svn)(1), [svnserve](/man/svnserve)(8), [svnlook](/man/svnlook)(1), [svnsync](/man/svnsync)(1)
