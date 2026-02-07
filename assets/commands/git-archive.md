# TAGLINE

Create archives of repository files without version control metadata

# TLDR

**Create tar archive of HEAD**

```git archive HEAD -o [archive.tar]```

**Create zip archive**

```git archive --format=zip HEAD -o [archive.zip]```

**Archive specific commit**

```git archive [commit] -o [archive.tar]```

**Archive specific directory**

```git archive HEAD [path/to/dir] -o [archive.tar]```

**Archive with prefix**

```git archive --prefix=[project/] HEAD -o [archive.tar]```

**Create and compress**

```git archive HEAD | gzip > [archive.tar.gz]```

# SYNOPSIS

**git** **archive** [_options_] _tree-ish_ [_path_...]

# PARAMETERS

**--format** _format_
> Archive format (tar, zip, tar.gz).

**-o**, **--output** _file_
> Output file.

**--prefix** _prefix_
> Prepend prefix to paths.

**--remote** _repo_
> Archive from remote.

**-l**, **--list**
> List available formats.

# DESCRIPTION

**git archive** creates archive files (tar, zip) containing repository content at a specific commit or branch without including the .git directory and other version control metadata. This is essential for creating clean distribution packages and release artifacts.

The command supports multiple archive formats including tar, zip, and tar.gz through pipes. Archives can be created from any tree-ish reference (commit, branch, tag) and can include specific subdirectories or use path filtering to include only desired files.

Prefix support allows prepending a directory structure to all archived files, useful for creating archives that extract into a specific folder. Remote repository archives can be created without local checkout using the --remote option, though this requires server support.

# SEE ALSO

[git-bundle](/man/git-bundle)(1), [tar](/man/tar)(1)

