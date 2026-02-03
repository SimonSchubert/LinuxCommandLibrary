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

**git archive** creates an archive of files from a named tree. Useful for creating release packages without .git directory.

# SEE ALSO

[git-bundle](/man/git-bundle)(1), [tar](/man/tar)(1)

