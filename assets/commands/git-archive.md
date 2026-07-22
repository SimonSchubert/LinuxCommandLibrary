# TAGLINE

create an archive of files from a named tree

# TLDR

**Create** a tar archive of HEAD

```git archive HEAD -o [archive.tar]```

**Create** a zip archive

```git archive --format=zip HEAD -o [archive.zip]```

**Archive** a tag, the usual way to build a release tarball

```git archive --format=tar.gz --prefix=[project-1.0/] [v1.0] -o [project-1.0.tar.gz]```

**Archive** only a subdirectory

```git archive HEAD [path/to/dir] -o [archive.tar]```

**Archive** with a leading directory so it extracts cleanly

```git archive --prefix=[project/] HEAD -o [archive.tar]```

**Pipe** to a compressor of your choice

```git archive HEAD | gzip > [archive.tar.gz]```

**Extract** a tree straight into another directory

```git archive HEAD | tar -x -C [/path/to/dest]```

**List** the supported formats

```git archive --list```

# SYNOPSIS

**git archive** [**--format**=_fmt_] [**--list**] [**--prefix**=_prefix/_] [_extra_] [**-o** _file_] [_options_] _tree-ish_ [_path_...]

# PARAMETERS

**--format** _fmt_
> Archive format: **tar** (the default), **zip**, and, when the matching compressor is available, **tar.gz**, **tgz** and similar. If **-o** is given, the format is inferred from the filename extension.

**-l**, **--list**
> List the available archive formats.

**-o**, **--output** _file_
> Write to _file_ instead of standard output.

**--prefix** _prefix/_
> Prepend _prefix_ to every path in the archive. The trailing slash matters.

**--add-file** _file_
> Add an untracked file to the archive, at the root or under **--prefix**.

**--add-virtual-file** _path_:_content_
> Add a file with the given literal content, without it existing on disk.

**--worktree-attributes**
> Also honour **.gitattributes** from the working tree, not just from the tree being archived.

**--remote** _repo_
> Archive a tree from a remote repository instead of a local one.

**--exec** _cmd_
> Path to **git-upload-archive** on the remote. Used with **--remote**.

**-v**, **--verbose**
> Report progress to standard error.

**-0** .. **-9**
> Compression level. **-0** stores without compressing; **-9** compresses hardest. For **zip** and the compressed tar formats.

**_extra_**
> Options passed through to the archive backend.

# DESCRIPTION

**git archive** writes the contents of a tree into a tar or zip archive, without the **.git** directory or any other version control metadata. It is git's answer to "give me a clean copy of this revision as a file", and the standard way to produce release tarballs.

Because it works from a tree-ish, you can archive any commit, branch or tag without checking it out, and without disturbing your working tree. Trailing path arguments limit the archive to those paths, so a single subdirectory can be extracted from a large repository.

**--prefix** exists because archives that explode their contents into the current directory are considered rude. Passing **--prefix=project-1.0/** gives the archive a single top-level directory, matching what people expect from a downloaded tarball.

The commit ID is stored in the archive: for tar it goes in an extended pax header, and for zip in the file comment, so **git get-tar-commit-id** can recover which revision an archive was built from.

**.gitattributes** influences the result. Paths marked **export-ignore** are omitted, which is how repositories keep CI configuration and test fixtures out of release tarballs, and **export-subst** expands placeholders such as **$Format:%H$** at archive time.

# CAVEATS

**--remote** requires the server to allow it. Many hosts, GitHub among them, disable **git-upload-archive**, so the command fails against them and you must clone or fetch instead.

Only tracked content is archived. Untracked and ignored files never appear, which is usually what you want, but means an archive is not a snapshot of your working directory. **--add-file** is the escape hatch for injecting build artifacts.

Archives are not bit-for-bit reproducible across git versions by default: the embedded commit ID, timestamps and the compressor's own output can all vary. Pin the git and compressor versions if you need reproducible release artifacts.

The distinction between **--format=tar.gz** and piping through **gzip** matters for **-9**: the built-in format accepts a compression level, whereas a pipe needs the level passed to **gzip** itself.

Submodule contents are not included; a submodule appears as an empty directory.

# HISTORY

**git archive** was added in **2006**, replacing the earlier **git-tar-tree** and **git-zip-tree** commands with a single front-end and a pluggable backend. Support for **--add-file** arrived in git **2.28** (**2020**), and **--add-virtual-file** in git **2.34** (**2021**).

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-bundle](/man/git-bundle)(1), [git-checkout](/man/git-checkout)(1), [git-clone](/man/git-clone)(1), [tar](/man/tar)(1), [zip](/man/zip)(1), [gzip](/man/gzip)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-archive)```

<!-- verified: 2026-07-16 -->
