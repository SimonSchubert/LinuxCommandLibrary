# TAGLINE

Epic Games version control system for large binary assets

# TLDR

**Create a repository** on a local Lore Server

```lore repository create lore://127.0.0.1:41337/[my-project]```

**Clone a remote repository**

```lore clone lore://127.0.0.1:41337/[my-project]```

**Show tracked status** without walking the filesystem

```lore status```

**Scan the working tree** and refresh dirty flags

```lore status --scan```

**Stage specific files** (adds, edits, and deletes)

```lore stage [hello.txt] [sample.bin]```

**Commit the staged revision**

```lore commit "[message]"```

**Push commits** to the remote

```lore push```

**Sync** the working tree to the remote latest (or a given revision)

```lore sync```

**Create a branch** from the current revision

```lore branch create [branch-name]```

**Switch** to another branch

```lore branch switch [branch-name]```

**Merge a source branch** into the current branch

```lore branch merge [source-branch] --message "[message]"```

**Rename a file** while keeping its history

```lore stage move [old-path] [new-path]```

# SYNOPSIS

**lore** [_OPTIONS_] [_COMMAND_]

# GLOBAL OPTIONS

**--repository** _path_
> Use _path_ as the repository instead of the current working tree.

**-d**, **--debug**
> Enable debug output.

**-f**, **--force**
> Force the operation if possible.

**--dry-run**
> Report what would change without writing to the local filesystem.

**-P**, **--no-pager**
> Disable pagination.

**--offline**
> Force offline mode (no server round trip).

**--remote** / **--local**
> Prefer remote or local data.

**--identity** _IDENTITY_
> Use the given commit identity.

**--identity-token** _token_
> Use this authentication token instead of one from the secure store.

**--access-token** _token_
> Use this authorization token instead of exchanging one with the authentication service.

**--non-interactive**
> Disable interactive prompts.

**--no-gc**
> Skip automatic incremental garbage collection for this command.

**--cache**
> Cache fragment payloads fetched from remote in the local store.

# COMMANDS

**repository create** _url_
> Create a repository in the current directory, registering it at _url_ (for example `lore://127.0.0.1:41337/my-project`).

**clone** _url_ [_path_]
> Clone a remote repository. Supports **--bare**, **--branch**, **--revision**, **--use-shared-store**, and sparse/dependency-based clones.

**status** [_PATH_...]
> Show the staged revision and files already marked dirty. Pass **--scan** to walk the filesystem and refresh dirty flags.

**stage** _paths_
> Stage changes for commit. A directory path stages only files already marked dirty unless **--scan** is given. Named files are always compared to the current revision.

**dirty** _paths_
> Mark files dirty so they appear in **status** and are picked up by directory **stage**, without reading or staging content.

**unstage** _paths_
> Unstage changes to a file or directory.

**reset** _paths_
> Discard local changes and restore paths to the current (or given) revision. **--purge** also deletes untracked files.

**commit** _MESSAGE_
> Commit the staged revision. Staging and committing work fully offline.

**push** [_branch_]
> Push commits to the remote. Defaults to the current branch.

**sync** [_revision_]
> Synchronize the working tree to a repository state (alias: **synchronize**). Omitting _revision_ syncs to the remote latest.

**diff** [_paths_...]
> Show differences. Defaults compare the current revision to the filesystem; **--source** / **--target** select revisions.

**history** [_LENGTH_]
> List revisions of the repository. **--oneline** prints one line per revision.

**branch create** _branch_
> Create a new lightweight branch at the current revision.

**branch switch** _branch_
> Switch the working tree to another branch.

**branch merge** _branch_
> Merge _branch_ into the current branch. Clean merges commit automatically; conflicts leave a staged merge to resolve or abort.

**branch push** [_branch_]
> Push the named (or current) branch to the remote.

**lock acquire** / **lock release** / **lock status**
> Advisory file locks to signal that a non-mergeable asset is being edited.

**shared-store create** _remote-url_
> Create a shared immutable store so multiple working trees reuse the same on-disk fragments.

**service start** / **service stop**
> Start or stop a background service process for the local repository.

**auth login** / **login**
> Authenticate the CLI against a Lore Server.

**completions** _shell_
> Generate shell completions (`bash`, `zsh`, `fish`, `elvish`, `powershell`).

# DESCRIPTION

**lore** is the command-line client for Lore, an open source version control system from Epic Games. It is a centralized, content-addressed VCS optimized for projects that mix source code with large binary assets. Repository state is stored as Merkle trees and an immutable revision chain; files are chunked into reusable fragments so large binaries deduplicate and transfer incrementally.

Everyday editing — staging, committing, branching, and diffing — runs against the local working tree and does not require a network round trip. A Lore Server is the durability and access-control source of record for clone, push, and sync. Remote URLs use the `lore://` scheme (for example `lore://127.0.0.1:41337/my-project`). Local metadata lives in **.lore/**; the companion server binary is **loreserver**.

Unlike Git, **lore status** does not walk the filesystem by default. Changes made outside Lore stay invisible until they are marked with **lore dirty**, or until **lore status --scan** / **lore stage --scan** reconciles the tree. Directory **stage** only picks up files already marked dirty; passing an explicit file path always compares that file to the current revision.

Branches are lightweight mutable pointers over shared fragment storage, so creating and switching branches does not duplicate underlying data. Workspaces can stay sparse: clones and syncs can fetch only selected files and their declared dependencies.

# CONFIGURATION

**.lore/config.toml**
> Per-repository client settings, created by **lore repository create** and **lore clone**. Records **remote_url**, commit **identity**, **[store]** capacity/eviction, **[file]** write behavior, and optional **[shared_store_to_use]**. If **identity** is unset, commit fails until you pass **--identity** or set the field.

**~/.config/lore/cli.toml**
> User-level CLI settings (Linux; or `$XDG_CONFIG_HOME/lore/cli.toml`). On macOS: `~/Library/Application Support/com.epicgames.lore/cli.toml`. Currently the only field is **pager** (default `less -R`). **--no-pager** overrides it for one command.

A demo install starts **loreserver** with an ephemeral self-signed certificate and a store under the system temp directory, listening on port **41337** (QUIC/gRPC) and **41339** (HTTP). That store is not durable across reboots.

# CAVEATS

Lore is **pre-1.0**: APIs, on-disk formats, and the CLI may change between releases. File locking is advisory — it informs collaborators rather than blocking writes. UEFN (Unreal Editor for Fortnite) projects historically used a proprietary compressor and cannot yet be opened with the open source CLI or desktop client. **lore status** without **--scan** will miss externally edited files. Commits need a configured identity. Pushing to a branch that moved remotely requires **lore sync**, conflict resolution, and another push.

# HISTORY

Lore was developed at **Epic Games** as **Unreal Revision Control**, the built-in VCS for **UEFN**. Epic open-sourced it in **June 2026** under the MIT license. The library, server, and CLI are written in **Rust**; language SDKs exist for C/C++, C#, Go, Python, and JavaScript.

# INSTALL

```aur: yay -S lore-vcs-bin```

<!-- packages: 2026-09-02 -->

# SEE ALSO

[git](/man/git)(1), [jj](/man/jj)(1), [hg](/man/hg)(1), [p4](/man/p4)(1), [svn](/man/svn)(1)

# RESOURCES

```[Source code](https://github.com/EpicGames/lore)```

```[Homepage](https://epicgames.github.io/lore/)```

```[Documentation](https://epicgames.github.io/lore/reference/lore-cli-commands/)```

<!-- verified: 2026-09-02 -->
