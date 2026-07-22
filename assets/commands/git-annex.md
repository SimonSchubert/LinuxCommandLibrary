# TAGLINE

manage large files with git, without checking their contents into git

# TLDR

**Initialize** a repository for annex

```git annex init "[laptop]"```

**Add** a large file to the annex

```git annex add [largefile.zip]```

**Download** file content from a remote that has it

```git annex get [file]```

**Drop** the local copy, keeping the file tracked

```git annex drop [file]```

**Show** which repositories hold a file's content

```git annex whereis [file]```

**Copy** content to a remote

```git annex copy [file] --to [origin]```

**Sync** metadata with all remotes

```git annex sync```

**Sync** metadata and file contents

```git annex sync --content```

**Check** that stored content is intact

```git annex fsck```

**Unlock** a file so it can be edited in place

```git annex unlock [file]```

# SYNOPSIS

**git annex** _command_ [_options_] [_files_...]

# PARAMETERS

**init** [_description_]
> Initialize a repository for use with annex, giving it a human-readable description.

**add** _files_
> Add files to the annex, replacing them with pointers to their content.

**get** _files_
> Download content from a remote that has it.

**drop** _files_
> Remove local content, after verifying enough other copies exist.

**copy** _files_ **--to**/**--from** _remote_
> Copy content to or from a remote, leaving the source copy in place.

**move** _files_ **--to**/**--from** _remote_
> Like **copy**, but drop the source copy afterwards.

**sync** [**--content**]
> Synchronize the git metadata with remotes. **--content** also transfers file contents.

**whereis** _files_
> List the repositories known to hold each file's content.

**unlock** _files_, **lock** _files_
> Unlock a file to modify it in place, then lock it again to store the new version.

**fsck**
> Verify that stored content matches its checksums and that enough copies exist.

**numcopies** _n_
> Set how many copies of each file must exist before **drop** will remove one.

**info** [_remote_]
> Show repository or remote statistics, including disk usage.

**initremote** _name_ **type**=_type_
> Set up a special remote such as S3, rsync or a directory.

**--help**
> Display help information.

# DESCRIPTION

**git-annex** lets git manage files whose contents are too large to live in git history. Instead of the file, git tracks a small pointer, while the actual bytes are kept in a separate object store under **.git/annex/objects**. History, branches and merges all work as usual, because from git's point of view the repository only contains small pointer files.

The idea it adds beyond "big files elsewhere" is that a repository does not need to hold every file's content. Each clone can carry whatever subset fits, and git-annex maintains a distributed record, in the **git-annex** branch, of which repositories hold which content. **git annex whereis** answers "where are the actual bytes", and **git annex get** fetches them on demand. This is what makes it workable for archives far larger than any single disk.

Content is addressed by checksum, so identical files are stored once and corruption is detectable. **git annex fsck** verifies checksums and checks the **numcopies** guarantee, which is the mechanism that stops **drop** from removing the last copy of anything.

By default annexed files appear as symlinks into the object store, which keeps them read-only and prevents accidental modification. **git annex unlock** replaces the symlink with a writable copy, and **lock** stores the result as a new version. The newer **v6**/**v7** repository modes and the **adjusted unlocked branch** make unlocked files the normal state, which is friendlier for tools that cannot follow symlinks.

**Special remotes** are the other half of the design: an annex remote does not have to be a git repository at all. S3, Backblaze B2, rsync targets, WebDAV, removable drives and many more can hold content, letting git-annex use them as storage while git itself never talks to them.

# CONFIGURATION

**.git/annex/objects/**
> Local content store, holding files keyed by checksum.

**.git/config**
> Repository and remote configuration, including annex settings.

**git-annex** branch
> An orphan branch tracking location and metadata for all content. Synced between repositories; do not edit it by hand.

**.gitattributes**
> Controls which files are annexed rather than committed to git directly, via the **annex.largefiles** attribute.

# CAVEATS

The learning curve is real. The concepts (keys, backends, special remotes, numcopies, trust levels, the **git-annex** branch, locked versus unlocked files) do not map onto anything else in git, and the repository version history (**v5** through **v10**) means much of the documentation you find online describes behaviour that has since changed.

Locked files are **symlinks**. Editors that replace files on save, build systems that copy trees, and filesystems without symlink support all interact badly with them. Windows support in particular has always lagged, since it lacks proper symlinks.

**git annex drop** refuses to remove content when it cannot verify that **numcopies** copies remain elsewhere, and it trusts its own location log to decide. If that log is stale, because another repository was deleted without being told about it, the record can claim copies exist that do not. **git annex fsck** is what reconciles this, and it is worth running periodically rather than only after trouble.

A plain **git clone** of an annex repository gets the pointers, not the content: the files look present but are broken symlinks until **git annex get** fetches them.

**git annex sync** does not transfer file contents unless you pass **--content**, which surprises people who expect it to behave like **git pull** plus **git push**.

git-annex and **git-lfs** solve overlapping problems differently. LFS is simpler, has direct support from GitHub, GitLab and others, and always fetches content on checkout. git-annex is far more flexible about where content lives and what each clone carries. Migrating between the two is awkward, so the choice is worth making deliberately.

# HISTORY

**git-annex** was written by **Joey Hess** and first released in **2010**. Development of its assistant and web application was funded by a successful **Kickstarter** campaign in **2012**. It is written in **Haskell**, and remains widely used for research data management, notably as the foundation of the **DataLad** project, as well as for personal media archives.

# INSTALL

```apt: sudo apt install git-annex```

```dnf: sudo dnf install git-annex```

```pacman: sudo pacman -S git-annex```

```apk: sudo apk add git-annex```

```zypper: sudo zypper install git-annex```

```brew: brew install git-annex```

```nix: nix profile install nixpkgs#git-annex```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git](/man/git)(1), [git-lfs](/man/git-lfs)(1), [git-clone](/man/git-clone)(1), [rsync](/man/rsync)(1)

# RESOURCES

```[Source code](https://git.joeyh.name/index.cgi/git-annex.git/)```

```[Homepage](https://git-annex.branchable.com/)```

```[Documentation](https://git-annex.branchable.com/git-annex/)```

<!-- verified: 2026-07-16 -->
