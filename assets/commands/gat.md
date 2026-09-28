# TAGLINE

Version large files alongside Git

# TLDR

**Prepare** a Git repository (once per clone)

```gat init```

Point storage at a **local directory** and make it the default

```gat remote add origin file://[path/to/storage]```

```gat remote default origin```

**Track** a large file, then commit the lock Git actually stores

```gat add [path/to/file]```

```git add gat.lock gat.yaml```

**Upload** the bytes before publishing the commit

```gat push```

In a fresh clone, **restore** working files

```gat init```

```gat pull```

**List** tracked paths

```gat ls-files```

**Preview** working-tree updates

```gat sync --dry-run```

# SYNOPSIS

**gat** [**-o** | **--full-output**] _command_ [_options_]

# PARAMETERS

**-o**, **--full-output**
> Show every row and the full detail. Applies to every subcommand.

**init** [**--example-config**] [**--no-hooks**] [**--no-merge-driver**]
> Create the local cache and install Git hooks plus a semantic merge driver for `gat.lock`. **--example-config** writes a commented `gat.yaml` only when none exists. **--no-hooks** removes Gat's managed hook blocks. Run this in every clone.

**add** [**-f** | **--force**] _path_...
> Hash files, directories, or globs into the local cache and record them in `gat.lock`. Refuses a path Git already tracks. **--force** includes paths ignored by `.gatignore` or Git ignore rules inside the selected scope.

**rm** [**--cached**] _path_...
> Stop tracking paths and delete the working files. **--cached** drops the lock rows and leaves the files on disk.

**mv** [**--force**] _src_ _dst_
> Rename a tracked file or directory, move it on disk, and update `gat.lock`. Name the destination explicitly. **--force** replaces an existing destination file.

**remote add** _name_ _url_
> Add named object storage. URLs may be `file://`, `s3://`, `azblob://`, `gcs://`, or `oss://`, and may contain `${VAR}` references. Adding a remote does not select a default.

**remote default** [_name_]
> Show or choose the default remote. **--unset** clears this scope's choice.

**remote list** | **show** _name_ | **update** _name_ | **remove** _name_
> Inspect or change remotes. **remove** also accepts **rm**. Writes go to the project `gat.yaml` unless **--global** or **--local** is set.

**push** [**--remote** _name_]
> Upload objects required by the current `gat.lock`. **--remote** overrides path routing. History flags upload objects from committed locks.

**fetch** [**--remote** _name_]
> Download objects into `.gat/objects`. Working files stay as they are.

**pull** [**--remote** _name_]
> Fetch missing objects, then materialize the files selected by the current checkout.

**sync** [**--dry-run**] [**--force**] [**--fetch**] [**--repair**] [**--rematerialize**]
> Make the working tree match `gat.lock` from the local cache. **--dry-run** prints the plan. **--force** overwrites locally modified managed files. **--fetch** downloads missing objects first. Hooks run this after checkout, merge, and rebase.

**status** [**--remote** [_name_]]
> Compare the current lock with the staged lock. File bytes are not inspected. **--remote** checks whether required objects are present in storage.

**diff** [_rev1_] [_rev2_]
> Show tracked paths added, removed, or changed between revisions. With no revisions, compare `HEAD` with the working tree.

**ls-files**
> List paths recorded in the current `gat.lock`.

**gc** [**--dry-run**] [**--remote** _name_] [**--unsafe**]
> Delete objects outside the selected history and the current lock. Remote deletion requires **--unsafe**.

**config** _key_ [_value_...]
> Print or set a `gat.yaml` key such as `cache.location`. **--unset** removes the key from the selected scope. **--clear** stores an empty list.

**selection** | **route** | **mount** | **system**
> Manage a saved path selection, send paths to different remotes, import files from another Git repository, or inspect and repair local Gat state.

**--version**
> Print the version.

**--help**
> Display help. **-h** prints the short form.

# CONFIGURATION

**gat.lock**
> Committed map of repository-relative paths to BLAKE3 content IDs. A very large lock can be a `gat.lock/` directory of shards. Git merges it with the driver installed by `gat init`.

**gat.yaml**
> Project settings committed with the repository: remotes, routes, mounts, selections, and keys such as cache location and materialization strategy.

**~/.gat/gat.yaml**
> Global settings for every repository of this user (`gat config --global`, `gat remote add --global`).

**.gat/gat.yaml**
> Settings for this clone only. The `.gat/` directory is not committed.

**.gat/objects**
> Local cache of file bytes, one object per content ID. Identical bytes are stored once.

**.gatignore**
> Gat-only exclude file, using `.gitignore` syntax. `gat add` skips matching paths unless **--force** is passed.

# DESCRIPTION

**gat** versions large files next to a Git repository. Git commits `gat.lock`, a map from each path to a BLAKE3 hash of the file bytes. The bytes themselves live in a local cache (`.gat/objects` by default) and in storage you configure: a directory, S3, Azure Blob, Google Cloud Storage, or Alibaba OSS.

`gat add` hashes the file, writes the lock row, and keeps the working file out of ordinary `git add` through `.git/info/exclude`. Commit `gat.lock` and, when it changed, `gat.yaml`. `gat push` uploads the objects. In another clone, `gat init` then `gat pull` downloads those objects and writes the working files for the checked-out lock.

`gat init` also installs `post-checkout`, `post-merge`, and `post-rewrite` hooks so `gat sync` restores files after checkout, merge, and rebase. Git does not copy those hooks, so each clone runs `gat init` itself. After `git reset --hard` or `git restore`, run `gat sync` directly. `gat fetch` fills the cache and leaves the working tree alone. `gat pull` fetches, then syncs.

A Gat remote is separate from a Git remote. `gat remote add` never selects a default, even for a remote named `origin`. Set one with `gat remote default`, or pass `--remote` on `push`, `fetch`, and `pull`.

# CAVEATS

Requires a Git repository. `gat add` refuses paths Git already tracks, and refuses the repository's own `.git`, `.gat`, `gat.lock`, and `gat.yaml` paths. `gat status` compares lock metadata, so an edited file stays invisible until `gat add`.

Upload with `gat push` before `git push` when other clones need those bytes. A missing default remote makes transfers fail until you set one or pass `--remote`. Remote `gat gc` deletes objects only with `--unsafe`, and it cannot see repositories you did not list.

The published series is still **0.0.x** (v0.0.14 on 2026-09-26). The installer places the binary in `~/.local/bin` and warns when another `gat` is already earlier on `PATH`. `gat --version` identifies this build.

Homebrew, nixpkgs, and the AUR package named `gat` are koki-develop/gat, a separate cat alternative. This program is installed from **https://getgat.dev/** or with `cargo install --locked --bin gat --git https://github.com/getgat-dev/gat gat`.

# HISTORY

**gat** is published by the **getgat-dev** project. The repository was opened in **September 2026**, and releases through that month stayed in the **0.0.x** series. It records large-file versions as BLAKE3 content IDs in `gat.lock` and keeps the bytes in a cache and in object storage. The license is **Apache-2.0**.

# SEE ALSO

[git](/man/git)(1), [git-lfs](/man/git-lfs)(1), [dvc](/man/dvc)(1), [git-annex](/man/git-annex)(1)

# RESOURCES

```[Source code](https://github.com/getgat-dev/gat)```

```[Homepage](https://getgat.dev/)```

```[Documentation](https://github.com/getgat-dev/gat/tree/main/docs)```

<!-- verified: 2026-09-28 -->
